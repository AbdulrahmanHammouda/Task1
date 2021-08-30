package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        TextView nameDisplay = findViewById(R.id.textView2);
        TextView emailDisplay = findViewById(R.id.textView3);
        TextView passwordDisplay = findViewById(R.id.textView4);
        TextView phoneNumberDisplay = findViewById(R.id.textView5);


       nameDisplay.setText(getIntent().getStringExtra("personName"));
       emailDisplay.setText(getIntent().getStringExtra("personEmail"));
       passwordDisplay.setText(getIntent().getStringExtra("personPassword"));
       phoneNumberDisplay.setText(getIntent().getStringExtra("personNumber"));


    }
}