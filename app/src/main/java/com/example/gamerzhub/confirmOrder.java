package com.example.gamerzhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class confirmOrder extends AppCompatActivity {

    TextView tvName,tvCard,tvCvv,tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);
        tvName=findViewById(R.id.tvName);
        tvCard=findViewById(R.id.tvCard);
        tvCvv=findViewById(R.id.tvCvv);
        tvResult=findViewById(R.id.tvResult);

        Intent i=getIntent();
        String firstname=i.getStringExtra("fname");
        String lastname=i.getStringExtra("lname");
        tvName.setText("Name: "+firstname + lastname);
        String cardnum=i.getStringExtra("cnum");
        String cvv=i.getStringExtra("cv");
        tvCard.setText("Card Number: "+cardnum);
        tvCvv.setText("Cvv: "+cvv);
        tvResult.setText("Order Status: "+"ORDER CONFIRMED");



    }
}