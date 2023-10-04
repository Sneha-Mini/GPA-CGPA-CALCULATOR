package com.minion.gpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class gpa_cgpa_selectionscreen extends AppCompatActivity {

    LinearLayout gpa,cgpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_cgpa_selectionscreen);


        gpa = findViewById(R.id.gpaButton);
        cgpa = findViewById(R.id.cgpaButton);
        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gpa_cgpa_selectionscreen.this, regulation.class);
                startActivity(i);
            }
        });
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(gpa_cgpa_selectionscreen.this, cgpa_calculation.class);
                startActivity(i);
            }
        });

    }
}