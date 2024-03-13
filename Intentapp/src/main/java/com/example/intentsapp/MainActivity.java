package com.example.intentsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button intent1Button = findViewById(R.id.intent1_button);
        Button intent2Button = findViewById(R.id.intent2_button);
        Button intent3Button = findViewById(R.id.intent3_button);

        intent1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });

        intent2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(android.net.Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });

        intent3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"recipient@example.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subiectul emailului");
                intent.putExtra(Intent.EXTRA_TEXT, "Mesajul emailului.");
                startActivity(intent);
            }
        });
    }
}
