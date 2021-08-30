package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.button);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        openSecodnActivity();
    }

    private void openSecodnActivity(){
        TextView name = findViewById(R.id.editTextTextPersonName3);
        TextView email = findViewById(R.id.editTextTextEmailAddress);
        TextView password = findViewById(R.id.editTextTextPassword);
        TextView phoneNumber = findViewById(R.id.editTextPersonPhone);
        Intent intent = new Intent(this,secondActivity.class);



        intent.putExtra("personName",name.getText().toString());
        intent.putExtra("personEmail",email.getText().toString());
        intent.putExtra("personNumber",phoneNumber.getText().toString());
        intent.putExtra("personPassword",password.getText().toString());

        startActivity(intent);
    }
}