package io.github.xmu_android_basics.bmiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {
    public static final String BMI_DATE = "BMI_DATE";
    public static final String BMI_WEIGHT = "BMI_WEIGHT";
    public static final String BMI_BMI = "BMI_BMI";

    TextView historyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        historyView = (TextView) findViewById(R.id.bmiHistory);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String bmiDate = bundle.getString(BMI_DATE);
        Double weight = bundle.getDouble(BMI_WEIGHT, 0);
        Double bmi = bundle.getDouble(BMI_BMI, 0);

        historyView.setText(bmiDate + ": " + weight + "kg, BMI: " + bmi);
    }
}
