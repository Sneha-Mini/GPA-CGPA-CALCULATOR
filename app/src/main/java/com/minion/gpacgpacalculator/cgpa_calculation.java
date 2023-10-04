package com.minion.gpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class cgpa_calculation extends AppCompatActivity {

    Spinner semCount;
    Integer n=0;
    TextView cgpavalue,calculate;
    String s1="0",s2="0",s3="0",s4="0",s5="0",s6="0",s7="0",s8="0";
    LinearLayout sem1lay,sem2lay,sem3lay,sem4lay,sem5lay,sem6lay,sem7lay,sem8lay;
    EditText sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
    Float sem1val=0.0f, sem2val=0.0f, sem3val=0.0f, sem4val=0.0f,sem5val=0.0f,sem6val=0.0f,sem7val=0.0f,sem8val=0.0f;
    Integer[] semCountarray = {0,1,2,3,4,5,6,7,8};
    List<Integer> s = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa_calculation);

        semCount = findViewById(R.id.semCount);
        cgpavalue = findViewById(R.id.cgpavalue);
        calculate = findViewById(R.id.calculate);


        sem1lay = findViewById(R.id.sem1lay);
        sem2lay = findViewById(R.id.sem2lay);
        sem3lay = findViewById(R.id.sem3lay);
        sem4lay = findViewById(R.id.sem4lay);
        sem5lay = findViewById(R.id.sem5lay);
        sem6lay = findViewById(R.id.sem6lay);
        sem7lay = findViewById(R.id.sem7lay);
        sem8lay = findViewById(R.id.sem8lay);

        sem1 = findViewById(R.id.sem1);
        sem2 = findViewById(R.id.sem2);
        sem3 = findViewById(R.id.sem3);
        sem4 = findViewById(R.id.sem4);
        sem5 = findViewById(R.id.sem5);
        sem6 = findViewById(R.id.sem6);
        sem7 = findViewById(R.id.sem7);
        sem8 = findViewById(R.id.sem8);



        for (int i = 0; i < semCountarray.length; i++) {
            s.add(semCountarray[i]);
        }

        final ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,R.layout.spinnerbg_layout,s);
        adapter.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        semCount.setAdapter(adapter);

        semCount.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                Integer n = (Integer) adapterView.getItemAtPosition(i);
                semcount(n);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

    }

    private void semcount(int n){
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sem1.getText().clear();
                sem2.getText().clear();
                sem3.getText().clear();
                sem4.getText().clear();
                sem5.getText().clear();
                sem6.getText().clear();
                sem7.getText().clear();
                sem8.getText().clear();
                cgpavalue.setText("0.00");

               if(n==0){

                   sem1lay.setVisibility(View.GONE);
                   sem2lay.setVisibility(View.GONE);
                   sem3lay.setVisibility(View.GONE);
                   sem4lay.setVisibility(View.GONE);
                   sem5lay.setVisibility(View.GONE);
                   sem6lay.setVisibility(View.GONE);
                   sem7lay.setVisibility(View.GONE);
                   sem8lay.setVisibility(View.GONE);
                   Toast.makeText(cgpa_calculation.this, "Select Semester", Toast.LENGTH_LONG).show();
                   cgpavalue.setText("0.00");
               }
                if(n==1){

                    sem1lay.setVisibility(View.VISIBLE);
                    sem2lay.setVisibility(View.GONE);
                    sem3lay.setVisibility(View.GONE);
                    sem4lay.setVisibility(View.GONE);
                    sem5lay.setVisibility(View.GONE);
                    sem6lay.setVisibility(View.GONE);
                    sem7lay.setVisibility(View.GONE);
                    sem8lay.setVisibility(View.GONE);

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String s1 = sem1.getText().toString();

                            if(s1.length()==0){
                                sem1.setError( "GPA should not be empty" );
                            }else{
                                sem1val = Float.valueOf(s1);
                                if ( sem1val > 10.00){
                                    sem1.setError( "GPA should be less than or equal to 10" );
                                }else{
                                    Float val = (sem1val)/n;
                                    cgpavalue.setText(String.format("%.2f", val));
                                }
                            }

                        }
                    });


                }
                if(n==2){


                    sem1lay.setVisibility(View.VISIBLE);
                    sem2lay.setVisibility(View.VISIBLE);
                    sem3lay.setVisibility(View.GONE);
                    sem4lay.setVisibility(View.GONE);
                    sem5lay.setVisibility(View.GONE);
                    sem6lay.setVisibility(View.GONE);
                    sem7lay.setVisibility(View.GONE);
                    sem8lay.setVisibility(View.GONE);

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String s1 = sem1.getText().toString();
                            String s2 = sem2.getText().toString();

                            if(s1.length()==0){
                                sem1.setError( "GPA should not be empty" );
                            }else if(s2.length()==0){
                                sem2.setError( "GPA should not be empty" );
                            }else {
                                sem1val = Float.valueOf(s1);
                                sem2val = Float.valueOf(s2);
                                if ( sem1val > 10.00){
                                    sem1.setError( "GPA should be less than or equal to 10" );
                                }else if (sem2val > 10.00){
                                    sem2.setError( "GPA should be less than or equal to 10" );
                                }else{
                                    Float val = (sem1val+sem2val)/n;
                                    cgpavalue.setText(String.format("%.2f", val));
                                }
                            }


                        }
                    });

                }
                if(n==3){

                    sem1lay.setVisibility(View.VISIBLE);
                    sem2lay.setVisibility(View.VISIBLE);
                    sem3lay.setVisibility(View.VISIBLE);
                    sem4lay.setVisibility(View.GONE);
                    sem5lay.setVisibility(View.GONE);
                    sem6lay.setVisibility(View.GONE);
                    sem7lay.setVisibility(View.GONE);
                    sem8lay.setVisibility(View.GONE);

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String s1 = sem1.getText().toString();
                            String s2 = sem2.getText().toString();
                            String s3 = sem3.getText().toString();

                            if(s1.length()==0){
                                sem1.setError( "GPA should not be empty" );
                            }else if(s2.length()==0){
                                sem2.setError( "GPA should not be empty" );
                            }else if(s3.length()==0){
                                sem3.setError( "GPA should not be empty" );
                            }else{
                                sem1val = Float.valueOf(s1);
                                sem2val = Float.valueOf(s2);
                                sem3val = Float.valueOf(s3);

                                if ( sem1val > 10.00){
                                    sem1.setError( "GPA should be less than or equal to 10" );
                                }else if (sem2val > 10.00 ){
                                    sem2.setError( "GPA should be less than or equal to 10" );
                                }else if (sem3val > 10.00){
                                    sem3.setError( "GPA should be less than or equal to 10" );
                                }else{
                                    Float val = (sem1val+sem2val+sem3val)/n;
                                    cgpavalue.setText(String.format("%.2f", val));
                                }
                            }
                        }
                    });


                }
                if(n==4){

                    sem1lay.setVisibility(View.VISIBLE);
                    sem2lay.setVisibility(View.VISIBLE);
                    sem3lay.setVisibility(View.VISIBLE);
                    sem4lay.setVisibility(View.VISIBLE);
                    sem5lay.setVisibility(View.GONE);
                    sem6lay.setVisibility(View.GONE);
                    sem7lay.setVisibility(View.GONE);
                    sem8lay.setVisibility(View.GONE);

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String s1 = sem1.getText().toString();
                            String s2 = sem2.getText().toString();
                            String s3 = sem3.getText().toString();
                            String s4 = sem4.getText().toString();

                            if(s1.length()==0){
                                sem1.setError( "GPA should not be empty" );
                            }else if(s2.length()==0){
                                sem2.setError( "GPA should not be empty" );
                            }else if(s3.length()==0){
                                sem3.setError( "GPA should not be empty" );
                            }else if(s4.length()==0){
                                sem4.setError( "GPA should not be empty" );
                            }else{
                                sem1val = Float.valueOf(s1);
                                sem2val = Float.valueOf(s2);
                                sem3val = Float.valueOf(s3);
                                sem4val = Float.valueOf(s4);
                                if ( sem1val > 10.00){
                                    sem1.setError( "GPA should be less than or equal to 10" );
                                }else if (sem2val > 10.00){
                                    sem2.setError( "GPA should be less than or equal to 10" );
                                }else if (sem3val > 10.00){
                                    sem3.setError( "GPA should be less than or equal to 10" );
                                }else if (sem4val > 10.00){
                                    sem4.setError( "GPA should be less than or equal to 10" );
                                }else{
                                    Float val = (sem1val+sem2val+sem3val+sem4val)/n;
                                    cgpavalue.setText(String.format("%.2f", val));
                                }
                            }
                        }
                    });

                }
                if(n==5){

                    sem1lay.setVisibility(View.VISIBLE);
                    sem2lay.setVisibility(View.VISIBLE);
                    sem3lay.setVisibility(View.VISIBLE);
                    sem4lay.setVisibility(View.VISIBLE);
                    sem5lay.setVisibility(View.VISIBLE);
                    sem6lay.setVisibility(View.GONE);
                    sem7lay.setVisibility(View.GONE);
                    sem8lay.setVisibility(View.GONE);

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String s1 = sem1.getText().toString();
                            String s2 = sem2.getText().toString();
                            String s3 = sem3.getText().toString();
                            String s4 = sem4.getText().toString();
                            String s5 = sem5.getText().toString();

                            if(s1.length()==0){
                                sem1.setError( "GPA should not be empty" );
                            }else if(s2.length()==0){
                                sem2.setError( "GPA should not be empty" );
                            }else if(s3.length()==0){
                                sem3.setError( "GPA should not be empty" );
                            }else if(s4.length()==0){
                                sem4.setError( "GPA should not be empty" );
                            }else if(s5.length()==0){
                                sem5.setError( "GPA should not be empty" );
                            }else{
                                sem1val = Float.valueOf(s1);
                                sem2val = Float.valueOf(s2);
                                sem3val = Float.valueOf(s3);
                                sem4val = Float.valueOf(s4);
                                sem5val = Float.valueOf(s5);

                                if ( sem1val > 10.00){
                                    sem1.setError( "GPA should be less than or equal to 10" );
                                }else if (sem2val > 10.00){
                                    sem2.setError( "GPA should be less than or equal to 10" );
                                }else if (sem3val > 10.00){
                                    sem3.setError( "GPA should be less than or equal to 10" );
                                }else if (sem4val > 10.00){
                                    sem4.setError( "GPA should be less than or equal to 10" );
                                }else if (sem5val > 10.00){
                                    sem5.setError( "GPA should be less than or equal to 10" );
                                }else{
                                    Float val = (sem1val+sem2val+sem3val+sem4val+sem5val)/n;
                                    cgpavalue.setText(String.format("%.2f", val));
                                }
                            }
                        }
                    });

                }
                if(n==6){

                    sem1lay.setVisibility(View.VISIBLE);
                    sem2lay.setVisibility(View.VISIBLE);
                    sem3lay.setVisibility(View.VISIBLE);
                    sem4lay.setVisibility(View.VISIBLE);
                    sem5lay.setVisibility(View.VISIBLE);
                    sem6lay.setVisibility(View.VISIBLE);
                    sem7lay.setVisibility(View.GONE);
                    sem8lay.setVisibility(View.GONE);

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String s1 = sem1.getText().toString();
                            String s2 = sem2.getText().toString();
                            String s3 = sem3.getText().toString();
                            String s4 = sem4.getText().toString();
                            String s5 = sem5.getText().toString();
                            String s6 = sem6.getText().toString();

                            if(s1.length()==0){
                                sem1.setError( "GPA should not be empty" );
                            }else if(s2.length()==0){
                                sem2.setError( "GPA should not be empty" );
                            }else if(s3.length()==0){
                                sem3.setError( "GPA should not be empty" );
                            }else if(s4.length()==0){
                                sem4.setError( "GPA should not be empty" );
                            }else if(s5.length()==0){
                                sem5.setError( "GPA should not be empty" );
                            }else if(s6.length()==0){
                                sem6.setError( "GPA should not be empty" );
                            }else{
                                sem1val = Float.valueOf(s1);
                                sem2val = Float.valueOf(s2);
                                sem3val = Float.valueOf(s3);
                                sem4val = Float.valueOf(s4);
                                sem5val = Float.valueOf(s5);
                                sem6val = Float.valueOf(s6);

                                if ( sem1val > 10.00){
                                    sem1.setError( "GPA should be less than or equal to 10" );
                                }else if (sem2val > 10.00){
                                    sem2.setError( "GPA should be less than or equal to 10" );
                                }else if (sem3val > 10.00){
                                    sem3.setError( "GPA should be less than or equal to 10" );
                                }else if (sem4val > 10.00){
                                    sem4.setError( "GPA should be less than or equal to 10" );
                                }else if (sem5val > 10.00){
                                    sem5.setError( "GPA should be less than or equal to 10" );
                                }else if (sem6val > 10.00){
                                    sem6.setError( "GPA should be less than or equal to 10" );
                                }else{
                                    Float val = (sem1val+sem2val+sem3val+sem4val+sem5val+sem6val)/n;
                                    cgpavalue.setText(String.format("%.2f", val));
                                }
                            }
                        }
                    });

                }
                if(n==7){

                    sem1lay.setVisibility(View.VISIBLE);
                    sem2lay.setVisibility(View.VISIBLE);
                    sem3lay.setVisibility(View.VISIBLE);
                    sem4lay.setVisibility(View.VISIBLE);
                    sem5lay.setVisibility(View.VISIBLE);
                    sem6lay.setVisibility(View.VISIBLE);
                    sem7lay.setVisibility(View.VISIBLE);
                    sem8lay.setVisibility(View.GONE);

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String s1 = sem1.getText().toString();
                            String s2 = sem2.getText().toString();
                            String s3 = sem3.getText().toString();
                            String s4 = sem4.getText().toString();
                            String s5 = sem5.getText().toString();
                            String s6 = sem6.getText().toString();
                            String s7 = sem7.getText().toString();

                            if(s1.length()==0){
                                sem1.setError( "GPA should not be empty" );
                            }else if(s2.length()==0){
                                sem2.setError( "GPA should not be empty" );
                            }else if(s3.length()==0){
                                sem3.setError( "GPA should not be empty" );
                            }else if(s4.length()==0){
                                sem4.setError( "GPA should not be empty" );
                            }else if(s5.length()==0){
                                sem5.setError( "GPA should not be empty" );
                            }else if(s6.length()==0){
                                sem6.setError( "GPA should not be empty" );
                            }else if(s7.length()==0){
                                sem7.setError( "GPA should not be empty" );
                            }else{
                                sem1val = Float.valueOf(s1);
                                sem2val = Float.valueOf(s2);
                                sem3val = Float.valueOf(s3);
                                sem4val = Float.valueOf(s4);
                                sem5val = Float.valueOf(s5);
                                sem6val = Float.valueOf(s6);
                                sem7val = Float.valueOf(s7);


                                if ( sem1val > 10.00){
                                    sem1.setError( "GPA should be less than or equal to 10" );
                                }else if (sem2val > 10.00){
                                    sem2.setError( "GPA should be less than or equal to 10" );
                                }else if (sem3val > 10.00){
                                    sem3.setError( "GPA should be less than or equal to 10" );
                                }else if (sem4val > 10.00){
                                    sem4.setError( "GPA should be less than or equal to 10" );
                                }else if (sem5val > 10.00){
                                    sem5.setError( "GPA should be less than or equal to 10" );
                                }else if (sem6val > 10.00){
                                    sem6.setError( "GPA should be less than or equal to 10" );
                                }else if (sem7val > 10.00){
                                    sem7.setError( "GPA should be less than or equal to 10" );
                                }else{
                                    Float val = (sem1val+sem2val+sem3val+sem4val+sem5val+sem6val+sem7val)/n;
                                    cgpavalue.setText(String.format("%.2f", val));
                                }
                            }
                        }
                    });

                }
                if(n==8){

                    sem1lay.setVisibility(View.VISIBLE);
                    sem2lay.setVisibility(View.VISIBLE);
                    sem3lay.setVisibility(View.VISIBLE);
                    sem4lay.setVisibility(View.VISIBLE);
                    sem5lay.setVisibility(View.VISIBLE);
                    sem6lay.setVisibility(View.VISIBLE);
                    sem7lay.setVisibility(View.VISIBLE);
                    sem8lay.setVisibility(View.VISIBLE);

                    calculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            String s1 = sem1.getText().toString();
                            String s2 = sem2.getText().toString();
                            String s3 = sem3.getText().toString();
                            String s4 = sem4.getText().toString();
                            String s5 = sem5.getText().toString();
                            String s6 = sem6.getText().toString();
                            String s7 = sem7.getText().toString();
                            String s8 = sem8.getText().toString();

                            if(s1.length()==0){
                                sem1.setError( "GPA should not be empty" );
                            }else if(s2.length()==0){
                                sem2.setError( "GPA should not be empty" );
                            }else if(s3.length()==0){
                                sem3.setError( "GPA should not be empty" );
                            }else if(s4.length()==0){
                                sem4.setError( "GPA should not be empty" );
                            }else if(s5.length()==0){
                                sem5.setError( "GPA should not be empty" );
                            }else if(s6.length()==0){
                                sem6.setError( "GPA should not be empty" );
                            }else if(s7.length()==0){
                                sem7.setError( "GPA should not be empty" );
                            }else if(s8.length()==0){
                                sem8.setError( "GPA should not be empty" );
                            }else{
                                sem1val = Float.valueOf(s1);
                                sem2val = Float.valueOf(s2);
                                sem3val = Float.valueOf(s3);
                                sem4val = Float.valueOf(s4);
                                sem5val = Float.valueOf(s5);
                                sem6val = Float.valueOf(s6);
                                sem7val = Float.valueOf(s7);
                                sem8val = Float.valueOf(s8);

                                if ( sem1val > 10.00){
                                    sem1.setError( "GPA should be less than or equal to 10" );
                                }else if (sem2val > 10.00){
                                    sem2.setError( "GPA should be less than or equal to 10" );
                                }else if (sem3val > 10.00){
                                    sem3.setError( "GPA should be less than or equal to 10" );
                                }else if (sem4val > 10.00){
                                    sem4.setError( "GPA should be less than or equal to 10" );
                                }else if (sem5val > 10.00){
                                    sem5.setError( "GPA should be less than or equal to 10" );
                                }else if (sem6val > 10.00){
                                    sem6.setError( "GPA should be less than or equal to 10" );
                                }else if (sem7val > 10.00){
                                    sem7.setError( "GPA should be less than or equal to 10" );
                                }else if (sem8val > 10.00){
                                    sem8.setError( "GPA should be less than or equal to 10" );
                                }else{
                                    Float val = (sem1val+sem2val+sem3val+sem4val+sem5val+sem6val+sem7val+sem8val)/n;
                                    cgpavalue.setText(String.format("%.2f", val));
                                }
                            }
                        }
                    });


                }
            }
        });
    }

}