package com.example.helthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Appointment extends AppCompatActivity {
    ImageView mukund;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);

        mukund=findViewById(R.id.mukund);

        mukund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Appointment.this,doctormukund.class);
                startActivity(intent);
            }
        });
    }
}