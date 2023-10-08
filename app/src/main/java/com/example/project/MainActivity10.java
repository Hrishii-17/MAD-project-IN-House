package com.example.project;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity10 extends AppCompatActivity {
    TimePicker timePicker;
    DatePicker datePicker;
    TextView textView1,textView2;
    EditText address;

    int hour,minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        timePicker=(TimePicker) findViewById(R.id.TimePicker);
        timePicker.setIs24HourView(true);

        datePicker =(DatePicker) findViewById(R.id.DatePicker);
        address =(EditText) findViewById(R.id.address);

        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }





    }
    private TimePickerDialog.OnTimeSetListener mTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minuteofHour) {
            hour=hourOfDay;
            minute=minuteofHour;

            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:aa");
            Date date = new Date();
            String strDate = timeFormat.format(date);

            Toast.makeText(getBaseContext(),"You have selected"+strDate,Toast.LENGTH_SHORT).show();

        }
    };

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onClick11(View view){
            Toast.makeText(getBaseContext(),"Date selected:"+(datePicker.getMonth()+1)+"/"+datePicker.getDayOfMonth()+"/"+datePicker.getYear()+"\n"+"Timeseleced:" +timePicker.getHour() +   ":"+timePicker.getMinute(),Toast.LENGTH_SHORT).show();



    }

    public void onPayment(View view){
        Intent i = new Intent(this,MainActivity5.class);
        startActivity(i);
    }





}