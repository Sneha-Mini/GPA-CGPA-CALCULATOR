package com.minion.gpacgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class gpa_calculation extends AppCompatActivity {

    Spinner sub1spinner,sub2spinner,sub3spinner,sub4spinner,sub5spinner,sub6spinner,sub7spinner,sub8spinner,sub9spinner,sub10spinner;
    Integer sub1mrk=10,sub2mrk=10,sub3mrk=10,sub4mrk=10,sub5mrk=10,sub6mrk=10,sub7mrk=10,sub8mrk=10,sub9mrk=10,sub10mrk=10;
    TextView gpavalue,calculate,text;
    String reg,dept,sem,condition;
    TextView sub1txt,sub2txt,sub3txt,sub4txt,sub5txt,sub6txt,sub7txt,sub8txt,sub9txt,sub10txt;
    LinearLayout sub1lay,sub2lay,sub3lay,sub4lay,sub5lay,sub6lay,sub7lay,sub8lay,sub9lay,sub10lay,gpacallay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_calculation);

        gpavalue = findViewById(R.id.gpavalue);
        calculate = findViewById(R.id.calculate);
        text = findViewById(R.id.text);
        gpacallay = findViewById(R.id.gpacallay);

        sub1spinner = findViewById(R.id.sub1spinner);
        sub2spinner = findViewById(R.id.sub2spinner);
        sub3spinner = findViewById(R.id.sub3spinner);
        sub4spinner = findViewById(R.id.sub4spinner);
        sub5spinner = findViewById(R.id.sub5spinner);
        sub6spinner = findViewById(R.id.sub6spinner);
        sub7spinner = findViewById(R.id.sub7spinner);
        sub8spinner = findViewById(R.id.sub8spinner);
        sub9spinner = findViewById(R.id.sub9spinner);
        sub10spinner = findViewById(R.id.sub10spinner);

        sub1txt = findViewById(R.id.sub1txt);
        sub2txt = findViewById(R.id.sub2txt);
        sub3txt = findViewById(R.id.sub3txt);
        sub4txt = findViewById(R.id.sub4txt);
        sub5txt = findViewById(R.id.sub5txt);
        sub6txt = findViewById(R.id.sub6txt);
        sub7txt = findViewById(R.id.sub7txt);
        sub8txt = findViewById(R.id.sub8txt);
        sub9txt = findViewById(R.id.sub9txt);
        sub10txt= findViewById(R.id.sub10txt);

        sub1lay = findViewById(R.id.sub1lay);
        sub2lay = findViewById(R.id.sub2lay);
        sub3lay = findViewById(R.id.sub3lay);
        sub4lay = findViewById(R.id.sub4lay);
        sub5lay = findViewById(R.id.sub5lay);
        sub6lay = findViewById(R.id.sub6lay);
        sub7lay = findViewById(R.id.sub7lay);
        sub8lay = findViewById(R.id.sub8lay);
        sub9lay = findViewById(R.id.sub9lay);
        sub10lay= findViewById(R.id.sub10lay);

        Intent intent = getIntent();
        reg = intent.getStringExtra("reg");
        dept = intent.getStringExtra("dept");
        sem = intent.getStringExtra("sem");
        condition = reg+dept+sem;

        /****** REGULATION 2017 ******/

        if((reg.equals("2017") && sem.equals("1"))){
            reg2017();
            text(8,"HS8151 Communicative English","MA8151 Engineering Mathematics - I","PH8151 Engineering Physics","CY8151 Engineering Chemistry","GE8151 Problem Solving and Python Programming ","GE8152 Engineering Graphics","GE8161 Problem Solving and Python Programming Laboratory","BS8161 Physics and Chemistry Laboratory","","");
            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double gpa,c= 25.0;
                    gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                }
            });
        }
        /****** REGULATION 2013 ******/

        if((reg.equals("2013") && sem.equals("1"))){
            reg2013();
            text(9,"HS6151 Technical English – I", "MA6151 Mathematics – I", "PH6151 Engineering Physics – I", "CY6151 Engineering Chemistry – I", "GE6151 Computer Programming", "GE6152 Engineering Graphics", "GE6161 Computer Practices Laboratory", "GE6162 Engineering Practices Laboratory", "GE6163 Physics and Chemistry Laboratory - I","");
            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double gpa,c= 26.0;
                    gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                }
            });
        }
        /****** REGULATION 2021 ******/
        if((reg.equals("2021") && sem.equals("1"))){
            reg2021();
            text(7,"HS3151 Professional English - I", "MA3151 Matrices and Calculus", "PH3151 Engineering Physics", "CY3151 Engineering Chemistry BSC", "GE3151 Problem Solving and Python Programming", "GE3171 Problem Solving and Python Programming Laboratory", "BS3171 Physics and Chemistry Laboratory","","","");
            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double gpa,c= 21.0;
                    gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                }
            });
        }
        if((reg.equals("2021") && !sem.equals("1")) && (reg.equals("2021") && !sem.equals("2"))){

            sub1lay.setVisibility(View.GONE);
            sub2lay.setVisibility(View.GONE);
            sub3lay.setVisibility(View.GONE);
            sub4lay.setVisibility(View.GONE);
            sub5lay.setVisibility(View.GONE);
            sub6lay.setVisibility(View.GONE);
            sub7lay.setVisibility(View.GONE);
            sub8lay.setVisibility(View.GONE);
            sub9lay.setVisibility(View.GONE);
            sub10lay.setVisibility(View.GONE);
            text.setVisibility(View.VISIBLE);
            gpacallay.setVisibility(View.GONE);
        }


        switch(condition) {

            /****** REGULATION 2017 ******/

            case "2017it2":
                reg2017();
                text(9,"HS8251 Technical English","MA8251 Engineering Mathematics - II ","PH8252 Physics for Information Science","BE8255 Basic Electrical, Electronics and Measurement Engineering","IT8201 Information Technology Essentials","CS8251 Programming in C","GE8261 Engineering Practices Laboratory","CS8261 C Programming Laboratory","IT8211 Information Technology Essentials Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017it3":
                reg2017();
                text(9,"MA8351 Discrete Mathematics","CS8351 Digital Principles and System Design","CS8391 Data Structures ","CS8392 Object Oriented Programming","EC8394 Analog and Digital Communication","CS8381 Data Structures Laboratory","CS8383 Object Oriented Programming Laboratory","CS8382 Digital Systems Laboratory","HS8381 Interpersonal Skills/Listening & Speaking","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017it4":
                reg2017();
                text(9,"MA8391 Probability and Statistics","CS8491 Computer Architecture","CS8492 Database Management Systems","CS8451 Design and Analysis of Algorithms","CS8493 Operating Systems","GE8291 Environmental Science and Engineering","CS8481 Database Management Systems Laboratory","CS8461 Operating Systems Laboratory","HS8461 Advanced Reading and Writing","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017it5":
                reg2017();
                text(9,"MA8551 Algebra and Number Theory","CS8591 Computer Networks","EC8691 Microprocessors and Microcontrollers","IT8501 Web Technology","CS8494 Software Engineering","Open Elective I","EC8681 Microprocessors and Microcontrollers Laboratory","CS8581 Networks Laboratory","IT8511 Web Technology Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2017it6":
                reg2017();
                text(10,"IT8601 Computational Intelligence","CS8592 Object Oriented Analysis and Design","IT8602 Mobile Communication","CS8091 Big Data Analytics","CS8092 Computer Graphics and Multimedia","Professional Elective I","CS8662 Mobile Application Development Laboratory","CS8582 Object Oriented Analysis and Design Laboratory","IT8611 Mini Project","HS8581 Professional Communication");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,1,c);
                    }
                });
                break;
            case "2017it7":
                reg2017();
                text(8,"MG8591 Principles of Management","CS8792 Cryptography and Network Security","CS8791 Cloud Computing","Open Elective II","Professional Elective II","Professional Elective III","IT8711 FOSS and Cloud Computing Laboratory","IT8761 Security Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017it8":
                reg2017();
                text(3,"Professional Elective IV","Professional Elective V","IT8811 Project Work","","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 16.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,10,sub4mrk,0,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017cse2":
                reg2017();
                text(8,"HS8251 Technical English","MA8251 Engineering Mathematics - II ","PH8252 Physics for Information Science","BE8255 Basic Electrical, Electronics and Measurement Engineering","GE8291 Environmental Science and Engineering","CS8251 Programming in C","GE8261 Engineering Practices Laboratory","CS8261 C Programming Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017cse3":
                reg2017();
                text(9,"MA8351 Discrete Mathematics","CS8351 Digital Principles and System Design","CS8391 Data Structures","CS8392 Object Oriented Programming","EC8395 Communication Engineering","CS8381 Data Structures Laboratory","CS8383 Object Oriented Programming Laboratory","CS8382 Digital Systems Laboratory","HS8381 Interpersonal Skills/Listening & Speaking","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017cse4":
                reg2017();
                text(9,"MA8402 Probability and Queueing Theory","CS8491 Computer Architecture","CS8492 Database Management Systems","CS8451 Design and Analysis of Algorithms","CS8493 Operating Systems","CS8494 Software Engineering","CS8481 Database Management Systems Laboratory","CS8461 Operating Systems Laboratory","HS8461 Advanced Reading and Writing","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017cse5":
                reg2017();
                text(9,"MA8551 Algebra and Number Theory","CS8591 Computer Networks","EC8691 Microprocessors and Microcontrollers","CS8501 Theory of Computation","CS8592 Object Oriented Analysis and Design","Open Elective I","EC8681 Microprocessors and Microcontrollers Laboratory","CS8582 Object Oriented Analysis and Design Laboratory","CS8581 Networks Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2017cse6":
                reg2017();
                text(10,"CS8651 Internet Programming","CS8691 Artificial Intelligence","CS8601 Mobile Computing","CS8602 Compiler Design","CS8603 Distributed Systems","Professional Elective I","CS8661 Internet Programming Laboratory","CS8662 Mobile Application Development Laboratory","CS8611 Mini Project","HS8581 Professional Communication");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,1,c);
                    }
                });
                break;
            case "2017cse7":
                reg2017();
                text(8,"MG8591 Principles of Management","CS8792 Cryptography and Network Security","CS8791 Cloud Computing","Open Elective II ","Professional Elective III","Open Elective I","CS8711 Cloud Computing Laboratory","IT8761 Security Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017cse8":
                reg2017();
                text(3,"Professional Elective IV","Professional Elective V","CS8811 Project Work","","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 16.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,10,sub4mrk,0,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017mech2":
                reg2017();
                text(8,"HS8251 Technical English","MA8251 Engineering Mathematics - II ","PH8251 Materials Science","BE8253 Basic Electrical, Electronics and Instrumentation Engineering","GE8291 Environmental Science and Engineering","GE8292 Engineering Mechanics","GE8261 Engineering Practices Laboratory","BE8261 Basic Electrical, Electronics and Instrumentation Engineering Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017mech3":
                reg2017();
                text(9,"MA8353 Transforms and Partial Differential Equations","ME8391 Engineering Thermodynamics","CE8394 Fluid Mechanics and Machinery","ME8351 Manufacturing Technology - I","EE8353 Electrical Drives and Controls","ME8361 Manufacturing Technology Laboratory - I","ME8381 Computer Aided Machine Drawing","EE8361 Electrical Engineering Laboratory","HS8381 Interpersonal Skills / Listening & Speaking","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,4,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017mech4":
                reg2017();
                text(9,"MA8452 Statistics and Numerical Methods", "ME8492 Kinematics of Machinery", "ME8451 Manufacturing Technology – II", "ME8491 Engineering Metallurgy", "CE8395 Strength of Materials for Mechanical Engineers", "ME8493 Thermal Engineering- I", "ME8462 Manufacturing Technology Laboratory – II", "CE8381 Strength of Materials and Fluid Mechanics and Machinery Laboratory", "HS8461 Advanced Reading and Writing EEC 1","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017mech5":
                reg2017();
                text(8,"ME8595 Thermal Engineering- II", "ME8593 Design of Machine Elements", "ME8501 Metrology and Measurements", "ME8594 Dynamics of Machines", "Open Elective I", "ME8511 Kinematics and Dynamics Laboratory", "ME8512 Thermal Engineering Laboratory", "ME8513 Metrology and Measurements Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017mech6":
                reg2017();
                text(9,"ME8651 Design of Transmission Systems", "ME8691 Computer Aided Design and Manufacturing", "ME8693 Heat and Mass Transfer", "ME8692 Finite Element Analysis", "ME8694 Hydraulics and Pneumatics", "Professional Elective - I", "ME8681 CAD / CAM Laboratory", "ME8682 Design and Fabrication Project", "HS8581 Professional Communication","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,4,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017mech7":
                reg2017();
                text(9,"ME8792 Power Plant Engineering", "ME8793 Process Planning and Cost Estimation", "ME8791 Mechatronics PC", "Open Elective - II", "Professional Elective – II", "Professional Elective – III", "ME8711 Simulation and Analysis Laboratory", "ME8781 Mechatronics Laboratory", "ME8712 Technical Seminar EEC 1","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017mech8":
                reg2017();
                text(3,"MG8591 Principles of Management","Professional Elective IV","ME8811 Project Work","","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 16.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,10,sub4mrk,0,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017civil2":
                reg2017();
                text(8,"HS8251 Technical English", "MA8251 Engineering Mathematics – II", "PH8201 Physics For Civil Engineering", "BE8251 Basic Electrical and Electronics Engineering", "GE8291 Environmental Science and Engineering", "GE8292 Engineering Mechanics", "GE8261 Engineering Practices Laboratory", "CE8211 Computer Aided Building Drawing","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017civil3":
                reg2017();
                text(9,"MA8353 Transforms and Partial Differential Equations", "CE8301 Strength of Materials I", "CE8302 Fluid Mechanics", "CE8351 Surveying","CE8391 Construction Materials","CE8392 Engineering Geology", "CE8311 Construction Materials Laboratory", "CE8361 Surveying Laboratory","HS8381 Interpersonal Skills / Listening and Speaking","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017civil4":
                reg2017();
                text(9,"MA8491 Numerical Methods", "CE8401 Construction Techniques and Practices", "CE8402 Strength of Materials II", "CE8403 Applied Hydraulic Engineering", "CE8404 Concrete Technology", "CE8491 Soil Mechanics", "CE8481 Strength of Materials Laboratory",  "CE8461 Hydraulic Engineering Laboratory", "HS8461 Advanced Reading and Writing","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017civil5":
                reg2017();
                text(9,"2CE8501 Design of Reinforced Cement Concrete Elements", "CE8502 Structural Analysis I", "EN8491 Water Supply Engineering", "CE8591 Foundation Engineering", "Professional Elective I", "Open Elective I", "CE8511 Soil Mechanics Laboratory", "CE8512 Water and Waste Water Analysis Laboratory", "CE8513 Survey Camp","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2017civil6":
                reg2017();
                text(9,"CE8601 Design of Steel Structural Elements", "CE8602 Structural Analysis II", "CE8603 Irrigation Engineering", "CE8604 Highway Engineering", "EN8592 Wastewater Engineering", "Professional Elective II", "CE8611 Highway Engineering Laboratory", "CE8612 Irrigation and Environmental Engineering Drawing", "HS8581 Professional Communication","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017civil7":
                reg2017();
                text(7,"CE8701 Estimation, Costing and Valuation Engineering", "CE8702 Railways, Airports, Docks and Harbour Engineering", "CE8703 Structural Design and Drawing", "Professional Elective III", "Open Elective II", "CE8711 Creative and Innovative Project", "CE8712 Industrial Training","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 20.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,4,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017civil8":
                reg2017();
                text(3,"Professional Elective IV","Professional Elective V","CE8811 Project Work","","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 16.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,10,sub4mrk,0,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017auto2":
                reg2017();
                text(8,"HS8251 Technical English", "MA8251 Engineering Mathematics - II", "PH8251 Materials Science", "BE8253 Basic Electrical, Electronics and Instrumentation Engineering", "GE8291 Environmental Science and Engineering", "GE8292 Engineering Mechanics", "GE8261 Engineering Practices Laboratory", "BE8261 Basic Electrical, Electronics and Instrumentation Engineering Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017auto3":
                reg2017();
                text(9,"MA8353 Transforms and Partial Differential Equations", "ME8391 Engineering Thermodynamics", "CE8395 Strength of Materials for Mechanical Engineers", "AT8301 Spark Ignition Engines", "ME8392 Manufacturing Technology", "CE8394 Fluid Mechanics and Machinery", "CE8381 Strength of Materials and Fluid Mechanics and Machinery Laboratory", "ME8381 Computer Aided Machine Drawing", "HS8381 Interpersonal Skills/Listening & Speaking","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017auto4":
                reg2017();
                text(8,"MA8452 Statistics and Numerical Methods", "AT8401 Compression Ignition Engines", "ME8491 Engineering Metallurgy", "EC8396 Electronics and Microprocessors", "AT8402 Automotive Chassis", "PR8451 Mechanics of Machines", "AT8411 Automotive Components Laboratory", "EC8382 Electronics and Microprocessors Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017auto5":
                reg2017();
                text(9,"ME8593 Design of Machine Elements", "AT8501 Automotive Transmission", "AT8502 Automotive Electrical and Electronics Systems", "AT8503 Vehicle Design Data Characteristics", "AT8504 Automotive Fuels and Lubricants", "Open Elective - I", "AT8511 Automotive Electrical and Electronics Laboratory", "AT8512 Automotive Fuels and Lubricants Laboratory", "HS8581 Professional Communication","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017auto6":
                reg2017();
                text(8,"GE8077 Total Quality Management", "AT8601 Automotive Engine Components Design", "AT8602 Automotive Chassis Components Design", "AT8603 Two and Three Wheelers", "AT8604 Vehicle Dynamics", "Professional Elective – I", "AT8611 Computer Aided Engine and Chassis Design Laboratory", "AT8612 Two and Three Wheelers Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017auto7":
                reg2017();
                text(8,"AT8701 Engine and Vehicle Management System", "ME8692 Finite Element Analysis", "AT8702 Vehicle Maintenance", "Open Elective - II", "Professional Elective – II", "Professional Elective – III", "AT8711 Engine Performance and Emission Testing Laboratory", "AT8712 Vehicle Maintenance Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017auto8":
                reg2017();
                text(4,"AT8801 Vehicle Body Engineering" ,"Professional Elective IV","Professional Elective V","AT8811 Project Work","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 19.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,10,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017ece2":
                reg2017();
                text(8,"HS8251 Technical English", "MA8251 Engineering Mathematics - II", "PH8253 Physics for Electronics Engineering", "BE8254 Basic Electrical and Instrumentation Engineering", "EC8251 Circuit Analysis", "EC8252 Electronic Devices", "EC8261 Circuits and Devices Laboratory", "GE8261 Engineering Practices Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017ece3":
                reg2017();
                text(9,"MA8352 Linear Algebra and Partial Differential Equations", "EC8393 Fundamentals of Data Structures In C", "EC8351 Electronic Circuits- I", "EC8352 Signals and Systems", "EC8392 Digital Electronics", "EC8391 Control Systems Engineering", "EC8381 Fundamentals of Data Structures in C Laboratory", "EC8361 Analog and Digital Circuits Laboratory", "HS8381 Interpersonal Skills/Listening & Speaking","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017ece4":
                reg2017();
                text(8,"MA8451 Probability and Random Processes", "EC8452 Electronic Circuits II", "EC8491 Communication Theory", "EC8451 Electromagnetic Fields", "EC8453 Linear Integrated Circuits", "GE8291 Environmental Science and Engineering", "EC8461 Circuits Design and Simulation Laboratory", "EC8462 Linear Integrated Circuits Laboratory ","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017ece5":
                reg2017();
                text(9,"EC8501 Digital Communication", "EC8553 Discrete-Time Signal Processing", "EC8552 Computer Architecture and Organization", "EC8551 Communication Networks", "Professional Elective I", "Open Elective I ", "EC8562 Digital Signal Processing Laboratory", "EC8561 Communication Systems Laboratory", "EC8563 Communication Networks Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,3,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2017ece6":
                reg2017();
                text(10,"EC8691 Microprocessors and Microcontrollers", "EC8095 VLSI Design", "EC8652 Wireless Communication", "MG8591 Principles of Management", "EC8651 Transmission Lines and RF Systems", "Professional Elective -II", "EC8681 Microprocessors and Microcontrollers Laboratory", "EC8661 VLSI Design Laboratory", "EC8611 Technical Seminar", "HS8581 Professional Communication");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,1,c);
                    }
                });
                break;
            case "2017ece7":
                reg2017();
                text(8,"EC8701 Antennas and Microwave Engineering", "EC8751 Optical Communication", "EC8791 Embedded and Real Time Systems", "EC8702 Ad hoc and Wireless Sensor Networks", "Professional Elective -III", "Open Elective - II ", "EC8711 Embedded Laboratory ", "EC8761 Advanced Communication Laboratory ","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017ece8":
                reg2017();
                text(3,"Professional Elective IV","Professional Elective V","EC8811 Project Work","","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 16.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,10,sub4mrk,0,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017product2":
                reg2017();
                text(8,"HS8251 Technical English","MA8251 Engineering Mathematics - II ","PH8251 Materials Science", "BE8253 Basic Electrical, Electronics and Instrumentation Engineering","GE8291 Environmental Science and Engineering", "GE8292 Engineering Mechanics ", "GE8261 Engineering Practices Laboratory", "BE8261 Basic Electrical, Electronics and Instrumentation Engineering Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017product3":
                reg2017();
                text(9,"MA8353 Transforms and Partial Differential Equations", "PR8301 Basic Machining Process","PR8302 Thermodynamics and Thermal Engineering", "CE8395 Strength of Materials for Mechanical Engineers", "CE8394 Fluid Mechanics and Machinery", "PR8311 Basic Machining Process Laboratory", "CE8381 Strength of Materials and Fluid Mechanics & Machinery Laboratory", "ME8381 Computer Aided Machine Drawing ","HS8381 Interpersonal Skills/Listening & Speaking","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,4,sub4mrk,3,sub5mrk,4,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017product4":
                reg2017();
                text(8,"MA8452 Statistics and Numerical Methods", "ME8491 Engineering Metallurgy", "PR8491 Computer Integrated Manufacturing", "PR8451 Mechanics of Machines ", "PR8401 Fluid Power Drives and Control", "PR8481 Metallurgy Laboratory", "PR8411 Fluid Power Laboratory", "ME8481 Dynamics Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017product5":
                reg2017();
                text(9,"PR8501 Engineering Metrology and Measurements","MF8791 Metal Forming Technology", "PR8551 Design of Machine Elements and Transmission Systems", "PR8502 Foundry Technology", "PR8592 Welding Technology", "Open Elective - I", "PR8511 Welding and Foundry Laboratory", "PR8561 Metrology Laboratory ", "HS8581 Professional Communication","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,4,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017product6":
                reg2017();
                text(9,"IE8693 Production Planning and Control", "PR8601 Computer Aided Product Design ","PR8602 Metal Cutting and CNC Machines", "ME8095 Design of Jigs, Fixtures and Press Tools", "ME8692 Finite Element Analysis ","Professional Elective I", "PR8611 Metal Forming Lab and Special Machines Laboratory", "PR8612 CNC Machine Laboratory", "ME8682 Design and Fabrication Project","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,1,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2017product7":
                reg2017();
                text(8,"ME8791 Mechatronics","GE8077 Total Quality Management", "ME8098 Quality Control and Reliability Engineering", "Open Elective - II", "Professional Elective II", "Professional Elective III", "MF8761 Computer Aided Simulation and Analysis Laboratory", "PR8711 Microprocessor and Mechatronics Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017product8":
                reg2017();
                text(4,"ME8793 Process Planning and Cost Estimation" ,"Professional Elective IV","Professional Elective V","PR8811 Project Work","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 19.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,10,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017eee2":
                reg2017();
                text(8,"HS8251 Technical English", "MA8251 Engineering Mathematics - II", "PH8253 Physics for Electronics Engineering", "BE8252 Basic Civil and Mechanical Engineering", "EE8251 Circuit Theory", "GE8291 Environmental Science and Engineering", "GE8261 Engineering Practices Laboratory", "EE8261 Electric Circuits Laboratory ","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017eee3":
                reg2017();
                text(8,"MA8353 Transforms and Partial Differential Equations", "EE8351 Digital Logic Circuits", "EE8391 Electromagnetic Theory", "EE8301 Electrical Machines - I", "EC8353 Electron Devices and ", "ME8792 Power Plant Engineering", "EC8311 Electronics Laboratory", "EE8311 Electrical Machines Laboratory - I","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017eee4":
                reg2017();
                text(9,"MA8491 Numerical Methods BS", "EE8401 Electrical Machines - II", "EE8402 Transmission and Distribution", "EE8403 Measurements and Instrumentation", "EE8451 Linear Integrated Circuits and Applications", "IC8451 Control Systems", "EE8411 Electrical Machines Laboratory - II", "EE8461 Linear and Digital Integrated Circuits Laboratory", "EE8412 Technical Seminar","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2017eee5":
                reg2017();
                text(9,"EE8501 Power System Analysis ", "EE8551 Microprocessors and Microcontrollers", "EE8552 Power Electronics", "EE8591 Digital Signal Processing", "CS8392 Object Oriented Programming", "Open Elective I", "EE8511 Control and Instrumentation Laboratory", "HS8581 Professional Communication", "CS8383 Object Oriented Programming Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,1,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2017eee6":
                reg2017();
                text(8,"EE8601 Solid State Drives", "EE8602 Protection and Switchgear", "EE8691 Embedded Systems", "Professional Elective I", "Professional Elective II", "EE8661 Power Electronics and Drives Laboratory", "EE8681 Microprocessors and Microcontrollers Laboratory", "EE8611 Mini Project","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 21.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017eee7":
                reg2017();
                text(8,"EE8701 High Voltage Engineering", "EE8702 Power System Operation and Control", "EE8703 Renewable Energy Systems", "Open Elective II", "Professional Elective III", "Professional Elective IV","EE8711 Power System Simulation Laboratory", "EE8712 Renewable Energy Systems Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2017eee8":
                reg2017();
                text(3,"Professional Elective IV","Professional Elective V","EE8811 Project Work","","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 16.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,10,sub4mrk,0,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;

            /****** REGULATION 2013 ******/

            case "2013it2":
                reg2013();
                text(9,"HS6251 Technical English – II", "MA6251 Mathematics – II", "PH6251 Engineering Physics – II", "CY6251 Engineering Chemistry – II", "CS6201 Digital Principles and System Design", "CS6202 Programming and Data Structures I", "GE6262 Physics and Chemistry Laboratory - II", "IT6211 Digital Laboratory", "IT6212 Programming and Data Structures","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,1,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013it3":
                reg2013();
                text(9,"MA6351 Transforms and Partial Differential Equations", "CS6301 Programming and Data Structures II", "CS6302 Database Management Systems", "CS6303 Computer Architecture", "CS6304 Analog and Digital Communication", "GE6351 Environmental Science and Engineering", "IT6311 Programming and Data Structures Laboratory II", "IT6312 Database Management Systems Laboratory", "IT6313 Digital Communication Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013it4":
                reg2013();
                text(8,"MA6453 Probability and Queuing Theory", "EC6504 Microprocessor and Microcontroller", "CS6402 Design and Analysis of Algorithms", "CS6401 Operating Systems", "CS6403 Software Engineering", "IT6411 Microprocessor and Microcontroller Laboratory", "IT6412 Operating Systems Laboratory", "IT6413 Software Engineering Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013it5":
                reg2013();
                text(9,"CS6551 Computer Networks", "IT6501 Graphics and Multimedia", "CS6502 Object Oriented Analysis and Design", "IT6502 Digital Signal Processing", "IT6503 Web Programming", "EC6801 Wireless Communication", "IT6511 Networks Laboratory", "IT6512 Web Programming Laboratory", "IT6513 Case Tools Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,4,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013it6":
                reg2013();
                text(9,"CS6601 Distributed Systems", "IT6601 Mobile Computing", "CS6659 Artificial Intelligence", "CS6660 Compiler Design", "IT6602 Software Architectures", "Elective I", "IT6611 Mobile Application Development Laboratory", "IT6612 Compiler Laboratory", "GE6674 Communication and Soft Skills - Laboratory Based","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013it7":
                reg2013();
                text(8,"IT6701 Information Management", "CS6701 Cryptography and Network Security", "IT6702 Data Ware Housing and Data Mining", "CS6703 Grid and Cloud Computing", "Elective II", "IT6711 Data Mining Laboratory", "IT6712 Security Laboratory", "IT6713 Grid and Cloud Computing Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 21.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013it8":
                reg2013();
                text(5, "IT6801 Service Oriented Architecture" ,"Elective III", "Elective IV", "Elective V", "IT6811 Project Work","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 18.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,6,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013cse2":
                reg2013();
                text(9,"HS6251 Technical English – II", "MA6251 Mathematics – II", "PH6251 Engineering Physics – II", "CY6251 Engineering Chemistry – II", "CS6201 Digital Principles and System Design", "CS6202 Programming and Data Structures I", "GE6262 Physics and Chemistry Laboratory - II", "CS6211 Digital Laboratory", "CS6212 Programming and Data Structures","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,1,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013cse3":
                reg2013();
                text(8,"MA6351 Transforms and Partial Differential Equations", "CS6301 Programming and Data Structures II", "CS6302 Database Management Systems", "CS6303 Computer Architecture", "CS6304 Analog and Digital Communication", "GE6351 Environmental Science and Engineering", "CS6311 Programming and Data Structures Laboratory II", "CS6312 Database Management Systems Laboratory", "","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013cse4":
                reg2013();
                text(9,"MA6453 Probability and Queueing Theory", "CS6551 Computer Networks", "CS6401 Operating Systems", "CS6402 Design and Analysis of Algorithms", "EC6504 Microprocessor and Microcontroller", "CS6403 Software Engineering", "CS6411 Networks Laboratory", "CS6412 Microprocessor and Microcontroller Laboratory", "CS6413 Operating Systems Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013cse5":
                reg2013();
                text(8,"MA6566 Discrete Mathematics", "CS6501 Internet Programming", "CS6502 Object Oriented Analysis and Design", "CS6503 Theory of Computation", "CS6504 Computer Graphics", "CS6511 Case Tools Laboratory", "CS6512 Internet Programming Laboratory", "CS6513 Computer Graphics Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013cse6":
                reg2013();
                text(9,"CS6601 Distributed Systems", "IT6601 Mobile Computing", "CS6660 Compiler Design", "IT6502 Digital Signal Processing","CS6659 Artificial Intelligence", "Elective I", "CS6611 Mobile Application Development Laboratory", "CS6612 Compiler Laboratory", "GE6674 Communication and Soft Skills - Laboratory Based","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013cse7":
                reg2013();
                text(8,"CS6701 Cryptography and Network Security", "CS6702 Graph Theory and Applications", "CS6703 Grid and Cloud Computing", "CS6704 Resource Management Techniques", "Elective II", "Elective III", "CS6711 Security Laboratory", "CS6712 Grid and Cloud Computing Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013cse8":
                reg2013();
                text(4,"CS6801 Multi – Core Architectures and Programming", "Elective IV", "Elective V", "CS6811 Project Work","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 15.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,6,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013mech2":
                reg2013();
                text(8,"HS6251 Technical English – II", "MA6251 Mathematics – II", "PH6251 Engineering Physics – II", "CY6251 Engineering Chemistry – II", "GE6252 Basic Electrical and Electronics Engineering", "GE6253 Engineering Mechanics", "GE6261 Computer Aided Drafting and Modeling Laboratory", "GE6262 Physics and Chemistry Laboratory - II","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,2,sub8mrk,1,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013mech3":
                reg2013();
                text(9,"MA6351 Transforms and Partial Differential Equations", "CE6306 Strength of Materials", "ME6301 Engineering Thermodynamics", "CE6451 Fluid Mechanics and Machinery", "ME6302 Manufacturing Technology - I", "EE6351 Electrical Drives and Controls", "ME6311 Manufacturing Technology Laboratory - I", "CE6461 Fluid Mechanics and Machinery Laboratory", "EE6365 Electrical Engineering Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013mech4":
                reg2013();
                text(9,"MA6452 Statistics and Numerical Methods", "ME6401 Kinematics of Machinery", "ME6402 Manufacturing Technology– II", "ME6403 Engineering Materials and Metallurgy", "GE6351 Environmental Science and Engineering", "ME6404 Thermal Engineering", "ME6411 Manufacturing Technology Laboratory–II", "ME6412 Thermal Engineering Laboratory - I", "CE6315 Strength of Materials Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013mech5":
                reg2013();
                text(9,"ME6501 Computer Aided Design", "ME6502 Heat and Mass Transfer", "ME6503 Design of Machine Elements", "ME6504 Metrology and Measurements", "ME6505 Dynamics of Machines", "GE6075 Professional Ethics in Engineering", "ME6511 Dynamics Laboratory", "ME6512 Thermal Engineering Laboratory-II", "ME6513 Metrology and Measurements Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013mech6":
                reg2013();
                text(9,"ME6601 Design of Transmission Systems", "MG6851 Principles of Management", "ME6602 Automobile Engineering", "ME6603 Finite Element Analysis", "ME6604 Gas Dynamics and Jet Propulsion", "Elective - I", "ME6611 C.A.D. / C.A.M. Laboratory", "ME6612 Design and Fabrication Project", "GE6674 Communication and Soft Skills- Laboratory Based","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013mech7":
                reg2013();
                text(9,"ME6701 Power Plant Engineering", "ME6702 Mechatronics", "ME6703 Computer Integrated Manufacturing Systems", "GE6757 Total Quality Management", "Elective – II", "Elective – III", "ME6711 Simulation and Analysis Laboratory", "ME6712 Mechatronics Laboratory", "ME6713 Comprehension","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2013mech8":
                reg2013();
                text(4,"MG6863 Engineering Economics", "Elective – IV", "Elective – V", "ME6811 Project Work","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 15.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,6,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013civil2":
                reg2013();
                text(8,"HS6251 Technical English - II", "MA6251 Mathematics – II", "PH6251 Engineering Physics – II", "CY6251 Engineering Chemistry – II", "GE6252 Basic Electrical and Electronics Engineering", "GE6253 Engineering Mechanics", "GE6261 Computer Aided Drafting and Modeling Laboratory", "GE6262 Physics and Chemistry Laboratory - II","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,2,sub8mrk,1,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013civil3":
                reg2013();
                text(8,"MA6351 Transforms and Partial Differential Equations", "GE6351 Environmental Science and Engineering", "CE6301 Engineering Geology", "CE6302 Mechanics of Solids", "CE6303 Mechanics of Fluids", "CE6304 Surveying I", "CE6311 Survey Practical I", "CE6312 Computer Aided Building Drawing","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013civil4":
                reg2013();
                text(9,"MA6459 Numerical Methods", "CE6401 Construction Materials", "CE6402 Strength of Materials", "CE6403 Applied Hydraulic Engineering", "CE6404 Surveying II", "CE6405 Soil Mechanics", "CE6411 Strength of Materials Laboratory", "CE6412 Hydraulic Engineering Laboratory", "CE6413 Survey Practical II","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 27.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,4,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013civil5":
                reg2013();
                text(9,"CE6501 Structural Analysis I", "CE6502 Foundation Engineering", "CE6503 Environmental Engineering I", "CE6504 Highway Engineering", "CE6505 Design of Reinforced Concrete Elements", "CE6506 Construction Techniques, Equipment and Practice", "GE6674 Communication and Soft skills- Laboratory Based", "CE6511 Soil Mechanics Laboratory", "CE6512 Survey Camp","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2013civil6":
                reg2013();
                text(8,"CE6601 Design of Reinforced Concrete & Brick Masonry Structures", "CE6602 Structural Analysis II", "CE6603 Design of Steel Structures", "CE6604 Railways, Airports and Harbour Engineering", "CE6605 Environmental Engineering II", "Elective I", "CE6611 Environmental Engineering Laboratory", "CE6612 Concrete and Highway Engineering Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,4,sub3mrk,4,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013civil7":
                reg2013();
                text(8,"CE6701 Structural Dynamics and Earthquake Engineering", "CE6702 Prestressed Concrete Structures", "CE6703 Water Resources and Irrigation Engineering", "CE6704 Estimation and Quantity Surveying", "Elective II", "Elective III", "CE6711 Computer Aided Design and Drafting Laboratory", "CE6712 Design Project","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013civil8":
                reg2013();
                text(4,"MG6851 Principles of Management", "Elective – IV", "Elective – V", "CE6811 Project Work","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 15.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,6,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013auto2":
                reg2013();
                text(8,"HS6251 Technical English – II", "MA6251 Mathematics – II", "PH6251 Engineering Physics – II", "CY6251 Engineering Chemistry – II", "GE6252 Basic Electrical and Electronics Engineering", "GE6253 Engineering Mechanics", "GE6261 Computer Aided Drafting and Modeling Laboratory", "GE6262 Physics and Chemistry Laboratory - II","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,2,sub8mrk,1,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013auto3":
                reg2013();
                text(9,"MA6351 Transforms and Partial Differential Equations", "ME6301 Engineering Thermodynamics", "CE6451 Fluid Mechanics and Machinery", "AT6301 Automotive Engines", "AT6302 Mechanics of Machines", "ME6352 Manufacturing Technology", "AT6311 Automotive Components Laboratory", "CE6461 Fluid Mechanics and Machinery Laboratory", "ME6465 Manufacturing Technology Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013auto4":
                reg2013();
                text(9,"MA6452 Statistics and Numerical Methods", "AT6401 Applied Thermodynamics and Heat Transfer", "ME6403 Engineering Materials and Metallurgy", "CE6306 Strength of Materials", "EC6464 Electronics and Microprocessors", "AT6402 Automotive Chassis", "PR6412 Computer Aided Machine Drawing Laboratory", "EC6466 Electronics and Microprocessors Laboratory", "CE6315 Strength of Materials Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 27.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013auto5":
                reg2013();
                text(9,"GE6351 Environmental Science and Engineering", "ME6503 Design of Machine Elements", "AT6501 Automotive Transmission", "AT6502 Automotive Electrical and Electronics Systems", "AT6503 Vehicle Design Data Characteristics", "AT6504 Automotive Fuels and Lubricants", "GE6674 Communication and Soft Skills- Laboratory Based", "AT6511 Automotive Electrical and Electronics Laboratory", "AT6512 Automotive Fuels and Lubricants Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013auto6":
                reg2013();
                text(8,"MG6851 Principles of Management", "AT6601 Automotive Engine Components Design", "AT6602 Automotive Chassis Components Design", "AT6603 Two and Three Wheelers", "AT6604 Vehicle Dynamics", "Elective – I", "AT6611 Computer Aided Engine and Chassis Design Laboratory", "AT6612 Two and Three Wheelers Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013auto7":
                reg2013();
                text(8,"AT6701 Engine and Vehicle Management System", "ME6603 Finite Element Analysis", "AT6702 Vehicle Maintenance", "AT6703 Automotive Pollution and Control", "Elective – II", "Elective – III", "AT6711 Engine Performance and Emission Testing Laboratory", "AT6712 Vehicle Maintenance Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013auto8":
                reg2013();
                text(3,"AT6801 Vehicle Body Engineering", "Elective – IV", "AT6811 Project Work","","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 12.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,6,sub4mrk,0,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013product2":
                reg2013();
                text(8,"HS6251 Technical English - II", "MA6251 Mathematics – II", "PH6251 Engineering Physics – II", "CY6251 Engineering Chemistry – II", "GE6252 Basic Electrical and Electronics Engineering", "GE6253 Engineering Mechanics", "GE6261 Computer Aided Drafting and Modeling Laboratory", "GE6262 Physics and Chemistry Laboratory - II","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,2,sub8mrk,1,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013product3":
                reg2013();
                text(9,"MA6351 Transforms and Partial Differential Equations", "PR6301 Basic Machining Process", "PR6302 Basics of Thermodynamics and Thermal Engineering", "PR6303 Engineering Metallurgy", "CE6451 Fluid Mechanics and Machinery", "EE6351 Electrical Drives and Controls", "PR6311 Basic Machining Process Laboratory", "CE6461 Fluid Mechanics and Machinery Laboratory", "EE6365 Electrical Engineering Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,4,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013product4":
                reg2013();
                text(9,"MA6459 Numerical Methods", "CE6306 Strength of Materials", "PR6401 Advanced Machining Process", "PR6402 Theory of Machines", "PR6403 Fluid Power Drives and Control", "ME6008 Welding Technology", "PR6411 Metallurgy Laboratory", "CE6315 Strength of Materials Laboratory", "PR6412 Computer Aided Machine Drawing Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 28.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,4,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013product5":
                reg2013();
                text(9,"GE6351 Environmental Science and Engineering", "PR6501 Engineering Metrology and Measurements", "MF6502 Metal Forming Technology", "PR6502 Engineering Statistics and Quality Control", "PR6503 Machine Elements Design", "PR6504 Foundry Technology", "PR6511 CNC Machine Laboratory", "PR6512 Fluid Power Laboratory", "GE6674 Communication and Soft Skills- Laboratory Based","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 27.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,4,sub4mrk,4,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013product6":
                reg2013();
                text(9,"IE6605 Production Planning and Control", "PR6601 Computer Aided Product Design", "PR6602 Automated Production and Computer Integrated Manufacturing", "PR6603 Design of Jigs, Fixture and Press Tools and Drawing", "Elective I", "Elective II", "PR6611 Metal Forming Lab and Special Machines Laboratory", "PR6612 Metrology and Inspection Laboratory", "PR6613 Welding and Foundry Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,3,sub2mrk,4,sub3mrk,4,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013product7":
                reg2013();
                text(9,"GE6757 Total Quality Management", "ME6702 Mechatronics", "PR6701 Finite Element Analysis in Manufacturing Engineering", "ME6010 Robotics", "Elective III", "Elective IV", "MF6711 Computer Aided Simulation and Analysis Laboratory", "PR6711 Microprocesser and Mechatronics Laboratory", "PR6712 Design and Fabrication Project","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013product8":
                reg2013();
                text(4, "ME6005 Process Planning and Cost Estimation", "Elective – V", "PR6811 Comprehension", "PR6812 Project Work","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 13.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,1,sub4mrk,6,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013ece2":
                reg2013();
                text(8,"HS6251 Technical English – II", "MA6251 Mathematics – II", "PH6251 Engineering Physics – II", "CY6251 Engineering Chemistry – II", "EC6201 Electronic Devices", "EE6201 Circuit Theory", "GE6262 Physics and Chemistry Laboratory - II", "EC6211 Circuits and Devices Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,4,sub7mrk,1,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013ece3":
                reg2013();
                text(8,"MA6351 Transforms and Partial Differential Equations", "EE6352 Electrical Engineering and Instrumentation", "EC6301 Object Oriented Programming and Data Structures", "EC6302 Digital Electronics", "EC6303 Signals and Systems", "EC6304 Electronic Circuits- I", "EC6311 Analog and Digital Circuits Laboratory", "EC6312 OOPS and Data Structures Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013ece4":
                reg2013();
                text(9,"MA6451 Probability and Random Processes", "EC6401 Electronic Circuits II", "EC6402 Communication Theory", "EC6403 Electromagnetic Fields", "EC6404 Linear Integrated Circuits", "EC6405 Control System Engineering", "EC6411 Circuit and Simulation Integrated Laboratory", "EC6412 Linear Integrated Circuit Laboratory", "EE6461 Electrical Engineering and Control System Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,4,sub2mrk,3,sub3mrk,3,sub4mrk,4,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013ece5":
                reg2013();
                text(8,"EC6501 Digital Communication", "EC6502 Principles of Digital Signal Processing", "EC6503 Transmission Lines and Wave Guides", "GE6351 Environmental Science and Engineering", "EC6504 Microprocessor and Microcontroller", "EC6511 Digital Signal Processing Laboratory", "EC6512 Communication System Laboratory", "EC6513 Microprocessor and Microcontroller Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 23.0;
                        gpacalculation(sub1mrk,3,sub2mrk,4,sub3mrk,4,sub4mrk,3,sub5mrk,3,sub6mrk,2,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013ece6":
                reg2013();
                text(9,"MG6851 Principles of Management", "CS6303 Computer Architecture", "CS6551 Computer Networks", "EC6601 VLSI Design", "EC6602 Antenna and Wave propagation", "Elective I", "EC6611 Computer Networks Laboratory", "EC6612 VLSI Design Laboratory", "GE6674 Communication and Soft Skills - Laboratory Based","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013ece7":
                reg2013();
                text(8,"EC6701 RF and Microwave Engineering", "EC6702 Optical Communication and Networks", "EC6703 Embedded and Real Time Systems", "Elective II", "Elective III", "Elective IV", "EC6711 Embedded Laboratory", "EC6712 Optical and Microwave Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013ece8":
                reg2013();
                text(5,"EC6801 Wireless Communication", "EC6802 Wireless Networks", "Elective V", "Elective VI", "EC6811 Project Work","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 18.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,6,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013eee2":
                reg2013();
                text(9,"HS6251 Technical English - II", "MA6251 Mathematics - II", "PH6251 Engineering Physics - II", "CY6251 Engineering Chemistry - II", "GE6251 Basic Civil and Mechanical Engineering", "EE6201 Circuit Theory", "GE6262 Physics and Chemistry Laboratory - II", "GE6263 Computer Programming Laboratory", "EE6211 Electric Circuits Laboratory","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 27.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,1,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013eee3":
                reg2013();
                text(8,"MA6351 Transforms and Partial Differential Equations", "EE6301 Digital Logic Circuits", "EE6302 Electromagnetic Theory", "GE6351 Environmental Science and Engineering", "EC6202 Electronic Devices and Circuits", "EE6303 Linear Integrated Circuits and Applications", "EC6361 Electronics Laboratory", "EE6311 Linear and Digital Integrated Circuits Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,4,sub4mrk,3,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013eee4":
                reg2013();
                text(8,"MA6459 Numerical Methods", "EE6401 Electrical Machines - I", "CS6456 Object Oriented Programming", "EE6402 Transmission and Distribution", "EE6403 Discrete Time Systems and Signal Processing", "EE6404 Measurements and Instrumentation", "CS6461 Object Oriented Programming Laboratory", "EE6411 Electrical Machines Laboratory - I","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013eee5":
                reg2013();
                text(8,"EE6501 Power System Analysis", "EE6502 Microprocessors and Microcontrollers", "ME6701 Power Plant Engineering", "EE6503 Power Electronics", "EE6504 Electrical Machines - II", "IC6501 Control Systems", "EE6511 Control and Instrumentation Laboratory", "GE6674 Communication and Soft Skills- Laboratory Based", "EE6512 Electrical Machines Laboratory - II","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,2,sub10mrk,0,c);
                    }
                });
                break;
            case "2013eee6":
                reg2013();
                text(9,"EC6651 Communication Engineering", "EE6601 Solid State Drives", "EE6602 Embedded Systems", "EE6603 Power System Operation and Control", "EE6604 Design of Electrical Machines", "Elective - I", "EE6611 Power Electronics and Drives Laboratory", "EE6612 Microprocessors and Microcontrollers Laboratory", "EE6613 Presentation Skills and Technical Seminar","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 24.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,1,sub10mrk,0,c);
                    }
                });
                break;
            case "2013eee7":
                reg2013();
                text(8,"EE6701 High Voltage Engineering", "EE6702 Protection and Switchgear", "EE6703 Special Electrical Machines", "MG6851 Principles of Management", "Elective – II", "Elective – III", "EE6711 Power System Simulation Laboratory", "EE6712 Comprehension","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 21.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,3,sub5mrk,3,sub6mrk,3,sub7mrk,2,sub8mrk,1,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2013eee8":
                reg2013();
                text(4,"EE6801 Electric Energy Generation, Utilization and Conservation", "Elective – IV", "Elective – V", "EE6811 Project Work 0","","","","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 15.0;
                        gpacalculation(sub1mrk,3,sub2mrk,3,sub3mrk,3,sub4mrk,6,sub5mrk,0,sub6mrk,0,sub7mrk,0,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;

            /****** REGULATION 2021 ******/

            case "2021it2":
                reg2021();
                text(8,"HS3251 Professional English - II", "MA3251 Statistics and Numerical Methods", "PH3256 Physics for Information Science", "BE3251 Basic Electrical and Electronics Engineering", "GE3251 Engineering Graphics", "CS3251 Programming in C", "GE3271 Engineering Practices Laboratory", "CS3271 Programming in C Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2021cse2":
                reg2021();
                text(8,"HS3251 Professional English - II", "MA3251 Statistics and Numerical Methods", "PH3256 Physics for Information Science", "BE3251 Basic Electrical and Electronics Engineering", "GE3251 Engineering Graphics", "CS3251 Programming in C", "GE3271 Engineering Practices Laboratory", "CS3271 Programming in C Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,3,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2021mech2":
                reg2021();
                text(7,"HS3251 Professional English - II", "MA3251 Statistics and Numerical Methods", "PH3251 Materials Science", "BE3251 Basic Electrical and Electronics Engineering", "GE3251 Engineering Graphics", "GE3271 Engineering Practices Laboratory", "BE3271 Basic Electrical and Electronics Engineering Laboratory","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,2,sub7mrk,2,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2021civil2":
                reg2021();
                text(7,"HS3251 Professional English - II", "MA3251 Statistics and Numerical Methods", "PH3201 Physics for Civil Engineering", "BE3252 Basic Electrical, Electronics and Instrumentation Engineering", "GE3251 Engineering Graphics", "GE3271 Engineering Practices Laboratory", "BE3272 Basic Electrical, Electronics and Instrumentation Engineering Laboratory","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,2,sub7mrk,2,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2021auto2":
                reg2021();
                text(7,"HS3251 Professional English - II", "MA3251 Statistics and Numerical Methods", "PH3251 Materials Science", "BE3251 Basic Electrical and Electronics Engineering", "GE3251 Engineering Graphics", "GE3271 Engineering Practices Laboratory", "BE3271 Basic Electrical and Electronics Engineering Laboratory","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,2,sub7mrk,2,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2021product2":
                reg2021();
                text(7,"HS3251 Professional English - II", "MA3251 Statistics and Numerical Methods", "PH3251 Materials Science", "BE3251 Basic Electrical and Electronics Engineering", "GE3251 Engineering Graphics", "GE3271 Engineering Practices Laboratory", "BE3271 Basic Electrical and Electronics Engineering Laboratory","","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 22.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,2,sub7mrk,2,sub8mrk,0,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2021ece2":
                reg2021();
                text(8,"HS3251 Professional English - II", "MA3251 Statistics and Numerical Methods", "PH3254 Physics for Electronics Engineering", "BE3254 Electrical and Instrumentation Engineering", "GE3251 Engineering Graphics ESC", "EC3251 Circuit Analysis", "GE3271 Engineering Practices Laboratory", "EC3271 Circuits Analysis Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 25.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,2,sub8mrk,1,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;
            case "2021eee2":
                reg2021();
                text(8,"HS3251 Professional English - II", "MA3251 Statistics and Numerical Methods", "PH3202 Physics for Electrical Engineering", "BE3255 Basic Civil and Mechanical Engineering", "GE3251 Engineering Graphics", "EE3251 Electric Circuit Analysis", "GE3271 Engineering Practices Laboratory", "EE3271 Electric Circuits Laboratory","","");
                calculate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double c= 26.0;
                        gpacalculation(sub1mrk,4,sub2mrk,4,sub3mrk,3,sub4mrk,3,sub5mrk,4,sub6mrk,4,sub7mrk,2,sub8mrk,2,sub9mrk,0,sub10mrk,0,c);
                    }
                });
                break;


            default:
                break;
        }


    }

    private void reg2017(){

        String[] gradereg2017 = {"0","A+","A","B+","B","RA","SA","WH"};
        List<String> greg2017 = new ArrayList<String>();
        for (int i = 0; i < gradereg2017.length; i++) {
            greg2017.add(gradereg2017[i]);
        }

        final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter1.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub1spinner.setAdapter(adapter1);

        sub1spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub1grade = adapterView.getItemAtPosition(i).toString();
                if(sub1grade=="0"){
                    sub1mrk=10;
                }else if(sub1grade=="A+"){
                    sub1mrk=9;
                }else if(sub1grade=="A"){
                    sub1mrk=8;
                }else if(sub1grade=="B+"){
                    sub1mrk=7;
                }else if(sub1grade=="B"){
                    sub1mrk=6;
                }else if(sub1grade=="RA" || sub1grade=="SA" || sub1grade=="WH"){
                    sub1mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter2.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub2spinner.setAdapter(adapter2);

        sub2spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub2grade = adapterView.getItemAtPosition(i).toString();
                if(sub2grade=="0"){
                    sub2mrk=10;
                }else if(sub2grade=="A+"){
                    sub2mrk=9;
                }else if(sub2grade=="A"){
                    sub2mrk=8;
                }else if(sub2grade=="B+"){
                    sub2mrk=7;
                }else if(sub2grade=="B"){
                    sub2mrk=6;
                }else if(sub2grade=="RA" || sub2grade=="SA" || sub2grade=="WH"){
                    sub2mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter3.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub3spinner.setAdapter(adapter3);

        sub3spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub3grade = adapterView.getItemAtPosition(i).toString();
                if(sub3grade=="0"){
                    sub3mrk=10;
                }else if(sub3grade=="A+"){
                    sub3mrk=9;
                }else if(sub3grade=="A"){
                    sub3mrk=8;
                }else if(sub3grade=="B+"){
                    sub3mrk=7;
                }else if(sub3grade=="B"){
                    sub3mrk=6;
                }else if(sub3grade=="RA" || sub3grade=="SA" || sub3grade=="WH"){
                    sub3mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter4.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub4spinner.setAdapter(adapter4);

        sub4spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub4grade = adapterView.getItemAtPosition(i).toString();
                if(sub4grade=="0"){
                    sub4mrk=10;
                }else if(sub4grade=="A+"){
                    sub4mrk=9;
                }else if(sub4grade=="A"){
                    sub4mrk=8;
                }else if(sub4grade=="B+"){
                    sub4mrk=7;
                }else if(sub4grade=="B"){
                    sub4mrk=6;
                }else if(sub4grade=="RA" || sub4grade=="SA" || sub4grade=="WH"){
                    sub4mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter5.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub5spinner.setAdapter(adapter5);

        sub5spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub5grade = adapterView.getItemAtPosition(i).toString();
                if(sub5grade=="0"){
                    sub5mrk=10;
                }else if(sub5grade=="A+"){
                    sub5mrk=9;
                }else if(sub5grade=="A"){
                    sub5mrk=8;
                }else if(sub5grade=="B+"){
                    sub5mrk=7;
                }else if(sub5grade=="B"){
                    sub5mrk=6;
                }else if(sub5grade=="RA" || sub5grade=="SA" || sub5grade=="WH"){
                    sub5mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter6.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub6spinner.setAdapter(adapter6);

        sub6spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub6grade = adapterView.getItemAtPosition(i).toString();
                if(sub6grade=="0"){
                    sub6mrk=10;
                }else if(sub6grade=="A+"){
                    sub6mrk=9;
                }else if(sub6grade=="A"){
                    sub6mrk=8;
                }else if(sub6grade=="B+"){
                    sub6mrk=7;
                }else if(sub6grade=="B"){
                    sub6mrk=6;
                }else if(sub6grade=="RA" || sub6grade=="SA" || sub6grade=="WH"){
                    sub6mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter7.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub7spinner.setAdapter(adapter7);

        sub7spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub7grade = adapterView.getItemAtPosition(i).toString();
                if(sub7grade=="0"){
                    sub7mrk=10;
                }else if(sub7grade=="A+"){
                    sub7mrk=9;
                }else if(sub7grade=="A"){
                    sub7mrk=8;
                }else if(sub7grade=="B+"){
                    sub7mrk=7;
                }else if(sub7grade=="B"){
                    sub7mrk=6;
                }else if(sub7grade=="RA" || sub7grade=="SA" || sub7grade=="WH"){
                    sub7mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter8.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub8spinner.setAdapter(adapter8);

        sub8spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub8grade = adapterView.getItemAtPosition(i).toString();
                if(sub8grade=="0"){
                    sub8mrk=10;
                }else if(sub8grade=="A+"){
                    sub8mrk=9;
                }else if(sub8grade=="A"){
                    sub8mrk=8;
                }else if(sub8grade=="B+"){
                    sub8mrk=7;
                }else if(sub8grade=="B"){
                    sub8mrk=6;
                }else if(sub8grade=="RA" || sub8grade=="SA" || sub8grade=="WH"){
                    sub8mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter9.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub9spinner.setAdapter(adapter9);

        sub9spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub9grade = adapterView.getItemAtPosition(i).toString();
                if(sub9grade=="0"){
                    sub9mrk=10;
                }else if(sub9grade=="A+"){
                    sub9mrk=9;
                }else if(sub9grade=="A"){
                    sub9mrk=8;
                }else if(sub9grade=="B+"){
                    sub9mrk=7;
                }else if(sub9grade=="B"){
                    sub9mrk=6;
                }else if(sub9grade=="RA" || sub9grade=="SA" || sub9grade=="WH"){
                    sub9mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2017);
        adapter10.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub10spinner.setAdapter(adapter10);

        sub10spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub10grade = adapterView.getItemAtPosition(i).toString();
                if(sub10grade=="0"){
                    sub10mrk=10;
                }else if(sub10grade=="A+"){
                    sub10mrk=9;
                }else if(sub10grade=="A"){
                    sub10mrk=8;
                }else if(sub10grade=="B+"){
                    sub10mrk=7;
                }else if(sub10grade=="B"){
                    sub10mrk=6;
                }else if(sub10grade=="RA" || sub10grade=="SA" || sub10grade=="WH"){
                    sub10mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    private void reg2021(){
        String[] gradereg2021 = {"0","A+","A","B+","B","C","RA","SA","WH"};
        List<String> greg2021 = new ArrayList<String>();
        for (int i = 0; i < gradereg2021.length; i++) {
            greg2021.add(gradereg2021[i]);
        }
        final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter1.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub1spinner.setAdapter(adapter1);

        sub1spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub1grade = adapterView.getItemAtPosition(i).toString();
                if(sub1grade=="0"){
                    sub1mrk=10;
                }else if(sub1grade=="A+"){
                    sub1mrk=9;
                }else if(sub1grade=="A"){
                    sub1mrk=8;
                }else if(sub1grade=="B+"){
                    sub1mrk=7;
                }else if(sub1grade=="B"){
                    sub1mrk=6;
                }else if(sub1grade=="C"){
                    sub1mrk=5;
                }else if(sub1grade=="RA" || sub1grade=="SA" || sub1grade=="WH"){
                    sub1mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter2.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub2spinner.setAdapter(adapter2);

        sub2spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub2grade = adapterView.getItemAtPosition(i).toString();
                if(sub2grade=="0"){
                    sub2mrk=10;
                }else if(sub2grade=="A+"){
                    sub2mrk=9;
                }else if(sub2grade=="A"){
                    sub2mrk=8;
                }else if(sub2grade=="B+"){
                    sub2mrk=7;
                }else if(sub2grade=="B"){
                    sub2mrk=6;
                }else if(sub2grade=="C"){
                    sub2mrk=5;
                }else if(sub2grade=="RA" || sub2grade=="SA" || sub2grade=="WH"){
                    sub2mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter3.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub3spinner.setAdapter(adapter3);

        sub3spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub3grade = adapterView.getItemAtPosition(i).toString();
                if(sub3grade=="0"){
                    sub3mrk=10;
                }else if(sub3grade=="A+"){
                    sub3mrk=9;
                }else if(sub3grade=="A"){
                    sub3mrk=8;
                }else if(sub3grade=="B+"){
                    sub3mrk=7;
                }else if(sub3grade=="B"){
                    sub3mrk=6;
                }else if(sub3grade=="C"){
                    sub3mrk=5;
                }else if(sub3grade=="RA" || sub3grade=="SA" || sub3grade=="WH"){
                    sub3mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter4.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub4spinner.setAdapter(adapter4);

        sub4spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub4grade = adapterView.getItemAtPosition(i).toString();
                if(sub4grade=="0"){
                    sub4mrk=10;
                }else if(sub4grade=="A+"){
                    sub4mrk=9;
                }else if(sub4grade=="A"){
                    sub4mrk=8;
                }else if(sub4grade=="B+"){
                    sub4mrk=7;
                }else if(sub4grade=="B"){
                    sub4mrk=6;
                }else if(sub4grade=="C"){
                    sub4mrk=5;
                }else if(sub4grade=="RA" || sub4grade=="SA" || sub4grade=="WH"){
                    sub4mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter5.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub5spinner.setAdapter(adapter5);

        sub5spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub5grade = adapterView.getItemAtPosition(i).toString();
                if(sub5grade=="0"){
                    sub5mrk=10;
                }else if(sub5grade=="A+"){
                    sub5mrk=9;
                }else if(sub5grade=="A"){
                    sub5mrk=8;
                }else if(sub5grade=="B+"){
                    sub5mrk=7;
                }else if(sub5grade=="B"){
                    sub5mrk=6;
                }else if(sub5grade=="C"){
                    sub5mrk=5;
                }else if(sub5grade=="RA" || sub5grade=="SA" || sub5grade=="WH"){
                    sub5mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter6.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub6spinner.setAdapter(adapter6);

        sub6spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub6grade = adapterView.getItemAtPosition(i).toString();
                if(sub6grade=="0"){
                    sub6mrk=10;
                }else if(sub6grade=="A+"){
                    sub6mrk=9;
                }else if(sub6grade=="A"){
                    sub6mrk=8;
                }else if(sub6grade=="B+"){
                    sub6mrk=7;
                }else if(sub6grade=="B"){
                    sub6mrk=6;
                }else if(sub6grade=="C"){
                    sub6mrk=5;
                }else if(sub6grade=="RA" || sub6grade=="SA" || sub6grade=="WH"){
                    sub6mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter7.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub7spinner.setAdapter(adapter7);

        sub7spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub7grade = adapterView.getItemAtPosition(i).toString();
                if(sub7grade=="0"){
                    sub7mrk=10;
                }else if(sub7grade=="A+"){
                    sub7mrk=9;
                }else if(sub7grade=="A"){
                    sub7mrk=8;
                }else if(sub7grade=="B+"){
                    sub7mrk=7;
                }else if(sub7grade=="B"){
                    sub7mrk=6;
                }else if(sub7grade=="C"){
                    sub7mrk=5;
                }else if(sub7grade=="RA" || sub7grade=="SA" || sub7grade=="WH"){
                    sub7mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter8.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub8spinner.setAdapter(adapter8);

        sub8spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub8grade = adapterView.getItemAtPosition(i).toString();
                if(sub8grade=="0"){
                    sub8mrk=10;
                }else if(sub8grade=="A+"){
                    sub8mrk=9;
                }else if(sub8grade=="A"){
                    sub8mrk=8;
                }else if(sub8grade=="B+"){
                    sub8mrk=7;
                }else if(sub8grade=="B"){
                    sub8mrk=6;
                }else if(sub8grade=="C"){
                    sub8mrk=5;
                }else if(sub8grade=="RA" || sub8grade=="SA" || sub8grade=="WH"){
                    sub8mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter9.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub9spinner.setAdapter(adapter9);

        sub9spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub9grade = adapterView.getItemAtPosition(i).toString();
                if(sub9grade=="0"){
                    sub9mrk=10;
                }else if(sub9grade=="A+"){
                    sub9mrk=9;
                }else if(sub9grade=="A"){
                    sub9mrk=8;
                }else if(sub9grade=="B+"){
                    sub9mrk=7;
                }else if(sub9grade=="B"){
                    sub9mrk=6;
                }else if(sub9grade=="C"){
                    sub9mrk=5;
                }else if(sub9grade=="RA" || sub9grade=="SA" || sub9grade=="WH"){
                    sub9mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2021);
        adapter10.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub10spinner.setAdapter(adapter10);

        sub10spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub10grade = adapterView.getItemAtPosition(i).toString();
                if(sub10grade=="0"){
                    sub10mrk=10;
                }else if(sub10grade=="A+"){
                    sub10mrk=9;
                }else if(sub10grade=="A"){
                    sub10mrk=8;
                }else if(sub10grade=="B+"){
                    sub10mrk=7;
                }else if(sub10grade=="B"){
                    sub10mrk=6;
                }else if(sub10grade=="C"){
                    sub10mrk=5;
                }else if(sub10grade=="RA" || sub10grade=="SA" || sub10grade=="WH"){
                    sub10mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    private void reg2013(){

        String[] gradereg2013 = {"S","A","B","C","D","E","RA","WH"};
        List<String> greg2013 = new ArrayList<String>();
        for (int i = 0; i < gradereg2013.length; i++) {
            greg2013.add(gradereg2013[i]);
        }
        final ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter1.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub1spinner.setAdapter(adapter1);

        sub1spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub1grade = adapterView.getItemAtPosition(i).toString();
                if(sub1grade=="S"){
                    sub1mrk=10;
                }else if(sub1grade=="A"){
                    sub1mrk=9;
                }else if(sub1grade=="B"){
                    sub1mrk=8;
                }else if(sub1grade=="C"){
                    sub1mrk=7;
                }else if(sub1grade=="D"){
                    sub1mrk=6;
                }else if(sub1grade=="E"){
                    sub1mrk=5;
                }else if(sub1grade=="RA" ||sub1grade=="WH"){
                    sub1mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter2.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub2spinner.setAdapter(adapter2);

        sub2spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub2grade = adapterView.getItemAtPosition(i).toString();
                if(sub2grade=="S"){
                    sub2mrk=10;
                }else if(sub2grade=="A"){
                    sub2mrk=9;
                }else if(sub2grade=="B"){
                    sub2mrk=8;
                }else if(sub2grade=="C"){
                    sub2mrk=7;
                }else if(sub2grade=="D"){
                    sub2mrk=6;
                }else if(sub2grade=="E"){
                    sub2mrk=5;
                }else if(sub2grade=="RA" || sub2grade=="WH"){
                    sub2mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter3.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub3spinner.setAdapter(adapter3);

        sub3spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub3grade = adapterView.getItemAtPosition(i).toString();
                if(sub3grade=="S"){
                    sub3mrk=10;
                }else if(sub3grade=="A"){
                    sub3mrk=9;
                }else if(sub3grade=="B"){
                    sub3mrk=8;
                }else if(sub3grade=="C"){
                    sub3mrk=7;
                }else if(sub3grade=="D"){
                    sub3mrk=6;
                }else if(sub3grade=="E"){
                    sub3mrk=5;
                }else if(sub3grade=="RA" || sub3grade=="WH"){
                    sub3mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter4.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub4spinner.setAdapter(adapter4);

        sub4spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub4grade = adapterView.getItemAtPosition(i).toString();
                if(sub4grade=="S"){
                    sub4mrk=10;
                }else if(sub4grade=="A"){
                    sub4mrk=9;
                }else if(sub4grade=="B"){
                    sub4mrk=8;
                }else if(sub4grade=="C"){
                    sub4mrk=7;
                }else if(sub4grade=="D"){
                    sub4mrk=6;
                }else if(sub4grade=="E"){
                    sub4mrk=5;
                }else if(sub4grade=="RA" || sub4grade=="WH"){
                    sub4mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter5.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub5spinner.setAdapter(adapter5);

        sub5spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub5grade = adapterView.getItemAtPosition(i).toString();
                if(sub5grade=="S"){
                    sub5mrk=10;
                }else if(sub5grade=="A"){
                    sub5mrk=9;
                }else if(sub5grade=="B"){
                    sub5mrk=8;
                }else if(sub5grade=="C"){
                    sub5mrk=7;
                }else if(sub5grade=="D"){
                    sub5mrk=6;
                }else if(sub5grade=="E"){
                    sub5mrk=5;
                }else if(sub5grade=="RA" || sub5grade=="WH"){
                    sub5mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        final ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter6.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub6spinner.setAdapter(adapter6);

        sub6spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub6grade = adapterView.getItemAtPosition(i).toString();
                if(sub6grade=="S"){
                    sub6mrk=10;
                }else if(sub6grade=="A"){
                    sub6mrk=9;
                }else if(sub6grade=="B"){
                    sub6mrk=8;
                }else if(sub6grade=="C"){
                    sub6mrk=7;
                }else if(sub6grade=="D"){
                    sub6mrk=6;
                }else if(sub6grade=="E"){
                    sub6mrk=5;
                }else if(sub6grade=="RA" || sub6grade=="WH"){
                    sub6mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter7.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub7spinner.setAdapter(adapter7);

        sub7spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub7grade = adapterView.getItemAtPosition(i).toString();
                if(sub7grade=="S"){
                    sub7mrk=10;
                }else if(sub7grade=="A"){
                    sub7mrk=9;
                }else if(sub7grade=="B"){
                    sub7mrk=8;
                }else if(sub7grade=="C"){
                    sub7mrk=7;
                }else if(sub7grade=="D"){
                    sub7mrk=6;
                }else if(sub7grade=="E"){
                    sub7mrk=5;
                }else if(sub7grade=="RA" || sub7grade=="WH"){
                    sub7mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter8.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub8spinner.setAdapter(adapter8);

        sub8spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub8grade = adapterView.getItemAtPosition(i).toString();
                if(sub8grade=="S"){
                    sub8mrk=10;
                }else if(sub8grade=="A"){
                    sub8mrk=9;
                }else if(sub8grade=="B"){
                    sub8mrk=8;
                }else if(sub8grade=="C"){
                    sub8mrk=7;
                }else if(sub8grade=="D"){
                    sub8mrk=6;
                }else if(sub8grade=="E"){
                    sub8mrk=5;
                }else if(sub8grade=="RA" || sub8grade=="WH"){
                    sub8mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter9.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub9spinner.setAdapter(adapter9);

        sub9spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub9grade = adapterView.getItemAtPosition(i).toString();
                if(sub9grade=="S"){
                    sub9mrk=10;
                }else if(sub9grade=="A"){
                    sub9mrk=9;
                }else if(sub9grade=="B"){
                    sub9mrk=8;
                }else if(sub9grade=="C"){
                    sub9mrk=7;
                }else if(sub9grade=="D"){
                    sub9mrk=6;
                }else if(sub9grade=="E"){
                    sub9mrk=5;
                }else if(sub9grade=="RA" || sub9grade=="WH"){
                    sub9mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
        final ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this,R.layout.spinnerbg_layout,greg2013);
        adapter10.setDropDownViewResource(R.layout.spinnerbg_dropdown);
        sub10spinner.setAdapter(adapter10);

        sub10spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View selectedItemView, int i, long id) {
                String sub10grade = adapterView.getItemAtPosition(i).toString();
                if(sub10grade=="S"){
                    sub10mrk=10;
                }else if(sub10grade=="A"){
                    sub10mrk=9;
                }else if(sub10grade=="B"){
                    sub10mrk=8;
                }else if(sub10grade=="C"){
                    sub10mrk=7;
                }else if(sub10grade=="D"){
                    sub10mrk=6;
                }else if(sub10grade=="E"){
                    sub10mrk=5;
                }else if(sub10grade=="RA" || sub10grade=="WH"){
                    sub10mrk=0;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    private void text(int n , String subject1 ,String subject2 , String subject3 , String subject4 , String subject5 , String subject6 , String subject7 , String subject8 , String subject9 , String subject10 ){
        if(n==3){

            sub1lay.setVisibility(View.VISIBLE);
            sub2lay.setVisibility(View.VISIBLE);
            sub3lay.setVisibility(View.VISIBLE);
            sub4lay.setVisibility(View.GONE);
            sub5lay.setVisibility(View.GONE);
            sub6lay.setVisibility(View.GONE);
            sub7lay.setVisibility(View.GONE);
            sub8lay.setVisibility(View.GONE);
            sub9lay.setVisibility(View.GONE);
            sub10lay.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
            gpacallay.setVisibility(View.VISIBLE);

            sub1txt.setText(subject1);
            sub2txt.setText(subject2);
            sub3txt.setText(subject3);

        }else if (n==4){

            sub1lay.setVisibility(View.VISIBLE);
            sub2lay.setVisibility(View.VISIBLE);
            sub3lay.setVisibility(View.VISIBLE);
            sub4lay.setVisibility(View.VISIBLE);
            sub5lay.setVisibility(View.GONE);
            sub6lay.setVisibility(View.GONE);
            sub7lay.setVisibility(View.GONE);
            sub8lay.setVisibility(View.GONE);
            sub9lay.setVisibility(View.GONE);
            sub10lay.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
            gpacallay.setVisibility(View.VISIBLE);

            sub1txt.setText(subject1);
            sub2txt.setText(subject2);
            sub3txt.setText(subject3);
            sub4txt.setText(subject4);

        }else if (n==5){

            sub1lay.setVisibility(View.VISIBLE);
            sub2lay.setVisibility(View.VISIBLE);
            sub3lay.setVisibility(View.VISIBLE);
            sub4lay.setVisibility(View.VISIBLE);
            sub5lay.setVisibility(View.VISIBLE);
            sub6lay.setVisibility(View.GONE);
            sub7lay.setVisibility(View.GONE);
            sub8lay.setVisibility(View.GONE);
            sub9lay.setVisibility(View.GONE);
            sub10lay.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
            gpacallay.setVisibility(View.VISIBLE);

            sub1txt.setText(subject1);
            sub2txt.setText(subject2);
            sub3txt.setText(subject3);
            sub4txt.setText(subject4);
            sub5txt.setText(subject5);

        }else if (n==6){

            sub1lay.setVisibility(View.VISIBLE);
            sub2lay.setVisibility(View.VISIBLE);
            sub3lay.setVisibility(View.VISIBLE);
            sub4lay.setVisibility(View.VISIBLE);
            sub5lay.setVisibility(View.VISIBLE);
            sub6lay.setVisibility(View.VISIBLE);
            sub7lay.setVisibility(View.GONE);
            sub8lay.setVisibility(View.GONE);
            sub9lay.setVisibility(View.GONE);
            sub10lay.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
            gpacallay.setVisibility(View.VISIBLE);

            sub1txt.setText(subject1);
            sub2txt.setText(subject2);
            sub3txt.setText(subject3);
            sub4txt.setText(subject4);
            sub5txt.setText(subject5);
            sub6txt.setText(subject6);

        }else if (n==7){

            sub1lay.setVisibility(View.VISIBLE);
            sub2lay.setVisibility(View.VISIBLE);
            sub3lay.setVisibility(View.VISIBLE);
            sub4lay.setVisibility(View.VISIBLE);
            sub5lay.setVisibility(View.VISIBLE);
            sub6lay.setVisibility(View.VISIBLE);
            sub7lay.setVisibility(View.VISIBLE);
            sub8lay.setVisibility(View.GONE);
            sub9lay.setVisibility(View.GONE);
            sub10lay.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
            gpacallay.setVisibility(View.VISIBLE);

            sub1txt.setText(subject1);
            sub2txt.setText(subject2);
            sub3txt.setText(subject3);
            sub4txt.setText(subject4);
            sub5txt.setText(subject5);
            sub6txt.setText(subject6);
            sub7txt.setText(subject7);

        }else if (n==8){

            sub1lay.setVisibility(View.VISIBLE);
            sub2lay.setVisibility(View.VISIBLE);
            sub3lay.setVisibility(View.VISIBLE);
            sub4lay.setVisibility(View.VISIBLE);
            sub5lay.setVisibility(View.VISIBLE);
            sub6lay.setVisibility(View.VISIBLE);
            sub7lay.setVisibility(View.VISIBLE);
            sub8lay.setVisibility(View.VISIBLE);
            sub9lay.setVisibility(View.GONE);
            sub10lay.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
            gpacallay.setVisibility(View.VISIBLE);

            sub1txt.setText(subject1);
            sub2txt.setText(subject2);
            sub3txt.setText(subject3);
            sub4txt.setText(subject4);
            sub5txt.setText(subject5);
            sub6txt.setText(subject6);
            sub7txt.setText(subject7);
            sub8txt.setText(subject8);

        }else if (n==9){

            sub1lay.setVisibility(View.VISIBLE);
            sub2lay.setVisibility(View.VISIBLE);
            sub3lay.setVisibility(View.VISIBLE);
            sub4lay.setVisibility(View.VISIBLE);
            sub5lay.setVisibility(View.VISIBLE);
            sub6lay.setVisibility(View.VISIBLE);
            sub7lay.setVisibility(View.VISIBLE);
            sub8lay.setVisibility(View.VISIBLE);
            sub9lay.setVisibility(View.VISIBLE);
            sub10lay.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
            gpacallay.setVisibility(View.VISIBLE);

            sub1txt.setText(subject1);
            sub2txt.setText(subject2);
            sub3txt.setText(subject3);
            sub4txt.setText(subject4);
            sub5txt.setText(subject5);
            sub6txt.setText(subject6);
            sub7txt.setText(subject7);
            sub8txt.setText(subject8);
            sub9txt.setText(subject9);

        }else if (n==10){

            sub1lay.setVisibility(View.VISIBLE);
            sub2lay.setVisibility(View.VISIBLE);
            sub3lay.setVisibility(View.VISIBLE);
            sub4lay.setVisibility(View.VISIBLE);
            sub5lay.setVisibility(View.VISIBLE);
            sub6lay.setVisibility(View.VISIBLE);
            sub7lay.setVisibility(View.VISIBLE);
            sub8lay.setVisibility(View.VISIBLE);
            sub9lay.setVisibility(View.VISIBLE);
            sub10lay.setVisibility(View.VISIBLE);
            text.setVisibility(View.GONE);
            gpacallay.setVisibility(View.VISIBLE);

            sub1txt.setText(subject1);
            sub2txt.setText(subject2);
            sub3txt.setText(subject3);
            sub4txt.setText(subject4);
            sub5txt.setText(subject5);
            sub6txt.setText(subject6);
            sub7txt.setText(subject7);
            sub8txt.setText(subject8);
            sub9txt.setText(subject9);
            sub10txt.setText(subject10);

        }

    }

    private void gpacalculation(int sub1mrk, int c1, int sub2mrk, int c2, int sub3mrk, int c3, int sub4mrk , int c4 , int sub5mrk, int c5 ,int sub6mrk ,int c6, int sub7mrk , int c7 , int sub8mrk, int c8 , int sub9mrk, int c9 , int sub10mrk, int c10 , double c){
        double gpa;
        gpa =  ((sub1mrk*c1)+(sub2mrk*c2)+(sub3mrk*c3)+(sub4mrk*c4)+(sub5mrk*c5)+(sub6mrk*c6)+(sub7mrk*c7)+(sub8mrk*c8)+(sub9mrk*c9)+(sub10mrk*c10))/c;
        gpavalue.setText(String.format("%.2f",gpa));
    }
}