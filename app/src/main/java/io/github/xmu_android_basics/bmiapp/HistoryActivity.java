package io.github.xmu_android_basics.bmiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity {
    TextView historyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        historyView = (TextView) findViewById(R.id.bmiHistory);

        Intent intent = getIntent();
        String bmiRecord = intent.getStringExtra(Intent.EXTRA_TEXT);
        historyView.setText(bmiRecord);
    }
}
