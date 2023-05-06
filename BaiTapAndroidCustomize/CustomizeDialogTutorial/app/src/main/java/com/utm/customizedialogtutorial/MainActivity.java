package com.utm.customizedialogtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpenDialogCenter = findViewById((R.id.open_dialog_center));
        Button btnOpenDialogTop = findViewById((R.id.open_dialog_top));

        btnOpenDialogCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeesbackDialog(Gravity.CENTER);
            }
        });

        btnOpenDialogTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeesbackDialog(Gravity.TOP);
            }
        });
    }

    private void openFeesbackDialog(int gravity) {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog_feesback);

        Window window = dialog.getWindow();
        if (window == null) {
            return;
        }

        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windowAttributes = window.getAttributes();
        windowAttributes.gravity = gravity;
        window.setAttributes(windowAttributes);

        if (Gravity.BOTTOM == gravity) {
            dialog.setCancelable(true);
        } else {
            dialog.setCancelable(false);
        }

        EditText edtFeedback = dialog.findViewById(R.id.edt_feedback);
        Button btnKhong = dialog.findViewById(R.id.btn_khong);
        EditText btnGui = dialog.findViewById(R.id.btn_gui);

        btnKhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        btnKhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Gửi nhận xét", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }
}