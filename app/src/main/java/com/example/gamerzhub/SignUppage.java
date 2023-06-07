package com.example.gamerzhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUppage extends AppCompatActivity {

    Button tvSignUp,tvLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_uppage);
        init();
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup=new Intent(SignUppage.this,realSignUp.class);
                startActivity(signup);

            }
        });
        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(SignUppage.this,Login.class);
                startActivity(login);

            }
        });



    }
    private void init()
    {
        tvSignUp=findViewById(R.id.tvSignUp);
        tvLogin=findViewById(R.id.tvLogin);

    }
}