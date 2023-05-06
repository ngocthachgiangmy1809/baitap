package com.utm.customtoastandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_show_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Toast.makeText(this, "Đây là Toast", Toast.LENGTH_LONG).show();
                Toast toast = new Toast(MainActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                View view1 = inflater.inflate(R.layout.layout_custom_toast, (ViewGroup) findViewById(R.id.layout_custom_toast));
                TextView tvMassage = view.findViewById(R.id.tv_massage);
                tvMassage.setText("Đây là Toast");
                toast.setView(view);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }
}