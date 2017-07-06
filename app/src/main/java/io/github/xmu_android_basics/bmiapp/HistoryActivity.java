package io.github.xmu_android_basics.bmiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {
    public static final String BMI_DATE = "BMI_DATE";
    public static final String BMI_WEIGHT = "BMI_WEIGHT";
    public static final String BMI_BMI = "BMI_BMI";

    TextView historyView;

    static List<String> history = new ArrayList<>();

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

        history.add(bmiDate + ": " + weight + "kg, BMI: " + bmi);

        renderHistory();
    }

    @Override
    protected void onStart() {
        super.onStart();

        // TODO 实验3
    }

    @Override
    protected void onResume() {
        super.onResume();

        // TODO 实验3
    }

    @Override
    protected void onPause() {
        super.onPause();

        // TODO 实验3
    }

    @Override
    protected void onStop() {
        super.onStop();

        // TODO 实验3
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // TODO 实验3
    }

    private void renderHistory() {
        StringBuffer buffer = new StringBuffer();

        for (String bmiRecord : history) {
            buffer.insert(0, bmiRecord + "\n");
        }

        historyView.setText(buffer.toString());
    }
}
