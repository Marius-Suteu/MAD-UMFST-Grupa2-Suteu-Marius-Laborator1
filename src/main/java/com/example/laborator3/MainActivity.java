package com.example.laborator3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.buttonMessage);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });

        textView = findViewById(R.id.textView);
        Button buttonCounter = findViewById(R.id.buttonCounter);

        buttonCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCounter();
            }
        });
    }

    private void showToast() {
        Toast.makeText(getApplicationContext(), "Butonul a fost apasat.", Toast.LENGTH_LONG).show();
    }

    private void incrementCounter() {
        counter++;
        textView.setText(String.valueOf(counter));
    }
}
