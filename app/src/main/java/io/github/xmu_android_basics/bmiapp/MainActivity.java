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

        // TODO 实验2 打开 HistoryActivity.class
        startHistoryActivity();
    }

    public void onShareClick(View view) {

        if (! bmiResult.isEmpty()) {
            // TODO 实验1.1
//            sendText(bmiResult);

            // TODO 实验1.2
//            sendTextWithSubject(bmiResult);

            // TODO 实验1.3
//            sendTextAsMail(bmiResult);
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

    private void sendText(String text) {
        // TODO 实验1.1：使用隐式 Intent 发送文本
        // 使用 ACTION_SEND
        // 附加 EXTRA_TEXT
        // 设置 Type 为 "text/plain"
        // 在下面写上你的代码

    }

    private void sendTextWithSubject(String text) {
        // TODO 实验1.2：使用隐式 Intent 发送文本
        // 使用 ACTION_SEND
        // 附加 EXTRA_SUBJECT 和 EXTRA_TEXT
        // 设置 Type 为 "text/plain"
        // 在下面写上你的代码

    }

    private void sendTextAsMail(String text) {
        // TODO 实验1.3：使用隐式 Intent 发送文本
        // 使用 ACTION_SEND
        // 附加 EXTRA_SUBJECT 和 EXTRA_TEXT
        // 可选附加 EXTRA_MAIL, Intent.EXTRA_CC, Intent.EXTRA_BCC
        // 在下面写上你的代码

    }

    private void startHistoryActivity() {
        // TODO 实验2
    }
}
