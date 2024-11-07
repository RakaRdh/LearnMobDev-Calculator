package com.example.cobaapk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class ActivityHome extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_home);
        Button menuKali = (Button) findViewById(R.id.btnKali);
        Button menuBagi = (Button) findViewById(R.id.btnBagi);
        Button menuTambah = (Button) findViewById(R.id.btnTambah);
        Button menuKurang = (Button) findViewById(R.id.btnKurang);
        Button menuModulo = (Button) findViewById(R.id.btnModulo);
        menuKali.setOnClickListener(view -> {
            Intent intentOp = new Intent(ActivityHome.this, ActivityCalculator.class);

            if (menuKali.isPressed()) {
                intentOp.putExtra("type", "1"); // Multiplication
            } else if (menuBagi.isPressed()) {
                intentOp.putExtra("type", "2"); // Division
            } else if (menuTambah.isPressed()) {
                intentOp.putExtra("type", "3"); // Addition
            } else if (menuKurang.isPressed()) {
                intentOp.putExtra("type", "4"); // Subtraction
            } else if (menuModulo.isPressed()) {
                intentOp.putExtra("type", "5"); // Modulo
            }

            startActivity(intentOp);
        });

        }

}

