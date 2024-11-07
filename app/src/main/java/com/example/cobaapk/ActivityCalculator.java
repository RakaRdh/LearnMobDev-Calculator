package com.example.cobaapk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import java.util.Objects;

public class ActivityCalculator extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_calculator);

        Intent intentCalc = getIntent();
        String operation = intentCalc.getStringExtra("type");

        final EditText firstNum = (EditText) findViewById(R.id.angkaSatu);
        final EditText secondNum = (EditText) findViewById(R.id.angkaDua);
        Button btnHasil = (Button) findViewById(R.id.btnHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(firstNum.getText().toString());
                int num2 = Integer.parseInt(secondNum.getText().toString());

                if (Objects.equals(operation, "1")){
                    Intent operate = new Intent(ActivityCalculator.this, ActivityResult.class);
                    operate.putExtra("hasil", num1 * num2);
                    operate.putExtra("angka1", num1);
                    operate.putExtra("angka2", num2);
                    Log.d("ActivityHome", "Starting ActivityCalculator with type 1");
                    startActivity(operate);
                } else if(Objects.equals(operation, "2")){
                    Intent operate = new Intent(ActivityCalculator.this, ActivityResult.class);
                    operate.putExtra("hasil", num1 / num2);
                    operate.putExtra("angka1", num1);
                    operate.putExtra("angka2", num2);
                    startActivity(operate);
                }else if(Objects.equals(operation, "3")){
                    Intent operate = new Intent(ActivityCalculator.this, ActivityResult.class);
                    operate.putExtra("hasil", num1 + num2);
                    operate.putExtra("angka1", num1);
                    operate.putExtra("angka2", num2);
                    startActivity(operate);
                }else if(Objects.equals(operation, "4")){
                    Intent operate = new Intent(ActivityCalculator.this, ActivityResult.class);
                    operate.putExtra("hasil", num1 - num2);
                    operate.putExtra("angka1", num1);
                    operate.putExtra("angka2", num2);
                    startActivity(operate);
                }else if(Objects.equals(operation, "5")){
                    Intent operate = new Intent(ActivityCalculator.this, ActivityResult.class);
                    operate.putExtra("hasil", num1 % num2);
                    operate.putExtra("angka1", num1);
                    operate.putExtra("angka2", num2);
                    startActivity(operate);
                }
            }
        });
    }
}
