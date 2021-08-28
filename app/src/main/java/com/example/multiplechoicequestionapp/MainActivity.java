package com.example.multiplechoicequestionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button op1, op2, op3, op4;
    TextView TV1, TVQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);

        TV1 = findViewById(R.id.TV1);
        TVQuestion = findViewById(R.id.TVQuestion);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
            }
        });

        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sorry, Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sorry, Try Again", Toast.LENGTH_SHORT).show();
            }
        });

        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sorry, Try Again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}