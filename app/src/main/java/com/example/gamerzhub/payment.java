package com.example.gamerzhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class payment extends AppCompatActivity {

    EditText etFirst,etLast,etCardNumber,etCvv,month,year;
    Button btnCancel,btnPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        init();








                btnPay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String firstName=etFirst.getText().toString().trim();
                        String lastName=etLast.getText().toString().trim();
                        String cardNumber=etCardNumber.getText().toString().trim();
                        String cvv=etCvv.getText().toString().trim();
                        String mon=month.getText().toString().trim();
                        String yea=year.getText().toString().trim();

                        if (firstName.isEmpty()|| lastName.isEmpty() || cardNumber.isEmpty() || cvv.isEmpty() ||mon.isEmpty() || yea.isEmpty()) {
                            etFirst.setError("Please enter your first name");

                            etLast.setError("Please enter your last name");

                            etCardNumber.setError("Please enter your card number");

                            etCvv.setError("Please enter your Cvv no.");

                            month.setError("Please enter your card month");

                            year.setError("Please enter your card year");

                        }
                        else {

                            Toast.makeText(payment.this, "Your order has been confirmed", Toast.LENGTH_SHORT).show();
                            Intent moveTomain = new Intent(payment.this, confirmOrder.class);
                            moveTomain.putExtra("fname", firstName);
                            moveTomain.putExtra("lname", lastName);
                            moveTomain.putExtra("cnum", cardNumber);
                            moveTomain.putExtra("cv", cvv);
                            moveTomain.putExtra("month", mon);
                            moveTomain.putExtra("year", yea);
                            startActivity(moveTomain);
                        }



                    }
                });


            btnCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(payment.this, "Payment not confirmed", Toast.LENGTH_SHORT).show();
                    Intent moveTomain = new Intent(payment.this, NavigationDrawer.class);
                    startActivity(moveTomain);
                }
            });
        }

    private void init()
    {
        etFirst=findViewById(R.id.etFirst);
        etLast=findViewById(R.id.etLast);
        etCardNumber=findViewById(R.id.etCardNumber);
        etCvv=findViewById(R.id.etCvv);
        month=findViewById(R.id.month);
        year=findViewById(R.id.year);
        btnCancel=findViewById(R.id.btnCancel);
        btnPay=findViewById(R.id.btnPay);

    }

}