package com.minion.gpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class semester extends AppCompatActivity {

    TextView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    String reg,dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);

        sem1 = findViewById(R.id.sem1);
        sem2 = findViewById(R.id.sem2);
        sem3 = findViewById(R.id.sem3);
        sem4 = findViewById(R.id.sem4);
        sem5 = findViewById(R.id.sem5);
        sem6 = findViewById(R.id.sem6);
        sem7 = findViewById(R.id.sem7);
        sem8 = findViewById(R.id.sem8);

        Intent intent = getIntent();
        reg = intent.getStringExtra("reg");
        dept = intent.getStringExtra("dept");

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(semester.this, gpa_calculation.class);
                i.putExtra("reg",reg);
                i.putExtra("dept",dept);
                i.putExtra("sem","1");
                startActivity(i);
            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(semester.this, gpa_calculation.class);
                i.putExtra("reg",reg);
                i.putExtra("dept",dept);
                i.putExtra("sem","2");
                startActivity(i);
            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(semester.this, gpa_calculation.class);
                i.putExtra("reg",reg);
                i.putExtra("dept",dept);
                i.putExtra("sem","3");
                startActivity(i);
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(semester.this, gpa_calculation.class);
                i.putExtra("reg",reg);
                i.putExtra("dept",dept);
                i.putExtra("sem","4");
                startActivity(i);
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(semester.this, gpa_calculation.class);
                i.putExtra("reg",reg);
                i.putExtra("dept",dept);
                i.putExtra("sem","5");
                startActivity(i);
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(semester.this, gpa_calculation.class);
                i.putExtra("reg",reg);
                i.putExtra("dept",dept);
                i.putExtra("sem","6");
                startActivity(i);
            }
        });
        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(semester.this, gpa_calculation.class);
                i.putExtra("reg",reg);
                i.putExtra("dept",dept);
                i.putExtra("sem","7");
                startActivity(i);
            }
        });
        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(semester.this, gpa_calculation.class);
                i.putExtra("reg",reg);
                i.putExtra("dept",dept);
                i.putExtra("sem","8");
                startActivity(i);
            }
        });
    }

}