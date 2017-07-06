package io.github.xmu_android_basics.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    EditText weightWidget;
    EditText heightWidget;
    TextView resultWidget;

    String bmiResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightWidget = (EditText) findViewById(R.id.input_weight);
        heightWidget = (EditText) findViewById(R.id.input_height);
        resultWidget = (TextView) findViewById(R.id.output_result);
    }

    public void onComputeClick(View view) {
        String weightInput = weightWidget.getText().toString();
        String heightInput = heightWidget.getText().toString();

        if (weightInput.isEmpty()) {
            return;
        }

        if (heightInput.isEmpty()) {
            return;
        }

        double bmi = computeBmi(Double.valueOf(weightInput), Double.valueOf(heightInput));

        bmiResult = generateResult(Double.valueOf(weightInput), bmi);

        resultWidget.setText(bmiResult);
    }

    public void onShareClick(View view) {

        if (! bmiResult.isEmpty()) {
            // TODO
        }

    }

    private double computeBmi(Double weight, Double height) {
        return weight / (height * height);
    }

    private String whatDateisToday() {
        return SimpleDateFormat.getDateTimeInstance().format(new Date());
    }

    private String generateResult(Double weight, Double bmi) {
        return whatDateisToday() + "，体重是：" + weight + "，BMI 指数是：" + bmi;
    }
}
