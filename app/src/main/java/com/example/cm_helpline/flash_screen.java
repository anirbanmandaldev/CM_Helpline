package com.example.cm_helpline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.HandlerKt;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;

public class flash_screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              Intent intent = new Intent(flash_screen.this, MainActivity.class);
              startActivity(intent);
              finish();
          }
      },3000);
    }
}