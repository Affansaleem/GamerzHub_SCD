package com.example.gamerzhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cart extends AppCompatActivity {

    Button btnProceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        btnProceed=findViewById(R.id.btnProceed);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pay=new Intent(cart.this,payment.class);
                startActivity(pay);
            }
        });

    }
}