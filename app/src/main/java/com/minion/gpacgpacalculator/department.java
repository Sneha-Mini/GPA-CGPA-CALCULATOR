package com.minion.gpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class department extends AppCompatActivity {

    TextView it,cse,mech,civil,auto,ece,eee,product;
    String reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        it = findViewById(R.id.it);
        cse = findViewById(R.id.cse);
        mech = findViewById(R.id.mech);
        civil = findViewById(R.id.civil);
        auto = findViewById(R.id.auto);
        ece = findViewById(R.id.ece);
        eee = findViewById(R.id.eee);
        product = findViewById(R.id.product);
        Intent intent = getIntent();
        reg = intent.getStringExtra("reg");
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(department.this, semester.class);
                i.putExtra("reg",reg);
                i.putExtra("dept","it");
                startActivity(i);
            }
        });
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(department.this, semester.class);
                i.putExtra("reg",reg);
                i.putExtra("dept","cse");
                startActivity(i);
            }
        });
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(department.this, semester.class);
                i.putExtra("reg",reg);
                i.putExtra("dept","mech");
                startActivity(i);
            }
        });
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(department.this, semester.class);
                i.putExtra("reg",reg);
                i.putExtra("dept","civil");
                startActivity(i);
            }
        });
        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(department.this, semester.class);
                i.putExtra("reg",reg);
                i.putExtra("dept","auto");
                startActivity(i);
            }
        });
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(department.this, semester.class);
                i.putExtra("reg",reg);
                i.putExtra("dept","ece");
                startActivity(i);
            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(department.this, semester.class);
                i.putExtra("reg",reg);
                i.putExtra("dept","eee");
                startActivity(i);
            }
        });
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(department.this, semester.class);
                i.putExtra("reg",reg);
                i.putExtra("dept","product");
                startActivity(i);
            }
        });


    }
}