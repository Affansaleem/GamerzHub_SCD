package com.example.gamerzhub;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class realSignUp extends AppCompatActivity {

    EditText etEmail,etNumber,etPass;
    Button btnSign;
    TextView tvHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_sign_up);
        init();

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=etEmail.getText().toString().trim();
                String number=etEmail.getText().toString().trim();
                String password=etEmail.getText().toString().trim();
                if (email.isEmpty())
                {
                    etEmail.setError("Please enter email");
//                    Toast.makeText(realSignUp.this, "Please enter email", Toast.LENGTH_SHORT).show();
                }
                if (number.isEmpty())
                {
                    etNumber.setError("Please enter number");
//                    Toast.makeText(realSignUp.this, "Please enter number", Toast.LENGTH_SHORT).show();
                }
                if (password.isEmpty())
                {
                    etPass.setError("Please enter password");
//                    Toast.makeText(realSignUp.this, "Please enter password", Toast.LENGTH_SHORT).show();

                }
                else {
                    // Make database entries here
                    Intent i=new Intent(realSignUp.this,SignUppage.class);
                    startActivity(i);
                    finish();

                }
            }
        });



    }
    private void init()
    {
        etEmail=findViewById(R.id.etEmail);
        etNumber=findViewById(R.id.etNumber);
        etPass=findViewById(R.id.etPass);
        btnSign=findViewById(R.id.btnSign);
        tvHelp=findViewById(R.id.tvHelp);

    }
}