package com.utm.customprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar1 = findViewById(R.id.progress_bar_1);
        ProgressBar progressBar2 = findViewById(R.id.progress_bar_2);
        ProgressBar progressBar3 = findViewById(R.id.progress_bar_3);
        ProgressBar progressBar4 = findViewById(R.id.progress_bar_4);
        ProgressBar progressBar5 = findViewById(R.id.progress_bar_5);
        ProgressBar progressBar6 = findViewById(R.id.progress_bar_6);
        ProgressBar progressBar7 = findViewById(R.id.progress_bar_7);
        ProgressBar progressBar8 = findViewById(R.id.progress_bar_8);
        ProgressBar progressBar9 = findViewById(R.id.progress_bar_9);
        ProgressBar progressBar10 = findViewById(R.id.progress_bar_10);
        ProgressBar progressBar11 = findViewById(R.id.progress_bar_11);
        ProgressBar progressBar12 = findViewById(R.id.progress_bar_12);

        progressBar1.setIndeterminateDrawable(getResources().getDrawable(R.drawable.rotatingplane));
        progressBar2.setIndeterminateDrawable(getResources().getDrawable(R.drawable.doublebounce));
        progressBar3.setIndeterminateDrawable(getResources().getDrawable(R.drawable.wave));
        progressBar4.setIndeterminateDrawable(getResources().getDrawable(R.drawable.wanderingcubes));
        progressBar5.setIndeterminateDrawable(getResources().getDrawable(R.drawable.pulse));
        progressBar6.setIndeterminateDrawable(getResources().getDrawable(R.drawable.chasingdots));
        progressBar7.setIndeterminateDrawable(getResources().getDrawable(R.drawable.threebounce));
        progressBar8.setIndeterminateDrawable(getResources().getDrawable(R.drawable.circle));
        progressBar9.setIndeterminateDrawable(getResources().getDrawable(R.drawable.cubegrid));
        progressBar10.setIndeterminateDrawable(getResources().getDrawable(R.drawable.fadingcircle));
        progressBar11.setIndeterminateDrawable(getResources().getDrawable(R.drawable.foldingcube));
        progressBar12.setIndeterminateDrawable(getResources().getDrawable(R.drawable.rotatingcircle));

    }
}