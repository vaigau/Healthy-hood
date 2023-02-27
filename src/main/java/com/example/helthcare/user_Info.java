package com.example.helthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class user_Info extends AppCompatActivity {
    ImageView app,test,medi,diet1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        app=findViewById(R.id.app);
        test=findViewById(R.id.test);
        medi=findViewById(R.id.medi);
        diet1=findViewById(R.id.diet1);

        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_Info.this,Appointment.class);
                startActivity(intent);
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_Info.this,Testpage.class);
                startActivity(intent);
            }
        });

        medi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_Info.this,prescription.class);
                startActivity(intent);
            }
        });

        diet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_Info.this,dietplan.class);
                startActivity(intent);
            }
        });


    }
}