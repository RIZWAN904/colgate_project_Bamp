package com.example.bamp;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bamp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  ActivityMainBinding mainactivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mainactivity = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainactivity.getRoot());

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,LoginPage.class);

                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(mainactivity.imageView,"logo_image");
                pairs[1] = new Pair<View,String>(mainactivity.textView,"logo_text");

                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(intent,activityOptions.toBundle());

            }
        },2000);





    }
}