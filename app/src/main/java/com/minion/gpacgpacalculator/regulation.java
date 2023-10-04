package com.minion.gpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class regulation extends AppCompatActivity {

    TextView reg21,reg17,reg13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulation);

        reg21 = findViewById(R.id.reg21);
        reg17 = findViewById(R.id.reg17);
        reg13 = findViewById(R.id.reg13);
        reg21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(regulation.this, department.class);
                i.putExtra("reg","2021");
                startActivity(i);
            }
        });
        reg17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(regulation.this, department.class);
                i.putExtra("reg","2017");
                startActivity(i);
            }
        });
        reg13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(regulation.this, department.class);
                i.putExtra("reg","2013");
                startActivity(i);
            }
        });
    }
}