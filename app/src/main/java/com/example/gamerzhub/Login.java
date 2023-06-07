package com.example.gamerzhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    EditText etEmailAddress,etPassword;
    Button btnLogined;
    TextView tvHelped;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        btnLogined.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=etEmailAddress.getText().toString().trim();

                String password=etPassword.getText().toString().trim();

                if (email.isEmpty())
                {
                    etEmailAddress.setError("Email is empty");
                }
                if (password.isEmpty())
                {
                    etPassword.setError("Enter password");
                }
                else {

                    Intent i=new Intent(Login.this,NavigationDrawer.class);
                    startActivity(i);
                    finish();

                }
            }
        });


    }
    private void init()
    {
        etEmailAddress=findViewById(R.id.etEmailAddress);
        etPassword=findViewById(R.id.etPassword);
        tvHelped=findViewById(R.id.tvHelped);
        btnLogined=findViewById(R.id.btnLogined);
    }
}