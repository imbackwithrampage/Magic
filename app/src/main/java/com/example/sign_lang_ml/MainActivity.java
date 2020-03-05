package com.example.sign_lang_ml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recognition Button
        btn = findViewById(R.id.recognition);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RecognitionActivity.class);
                startActivity(intent);
            }
        });


        // Training Button
        btn = findViewById(R.id.training);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TrainingActivity.class);
                startActivity(intent);
            }
        });


        // Speech-To-Text Button
        btn = findViewById(R.id.speechtotext);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpeechToTextActivity.class);
                startActivity(intent);
            }
        });


        // Learning Button
        btn = findViewById(R.id.learning);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LearningActivity.class);
                startActivity(intent);
            }
        });

    }
}
