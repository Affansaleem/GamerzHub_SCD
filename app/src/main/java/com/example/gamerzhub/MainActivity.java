package com.example.gamerzhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvGamerz,tvSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGamerz=findViewById(R.id.tvGamerz);
        tvSub=findViewById(R.id.tvSub);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,SignUppage.class);
                startActivity(i);
                finish();
            }
        },5000);
        Animation myAnimation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation);
        tvGamerz.startAnimation(myAnimation);
        tvSub.startAnimation(myAnimation);
    }
}