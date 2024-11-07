package com.example.cobaapk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ActivityResult extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_result);

        TextView hasilAngkaSatu = (TextView)findViewById(R.id.hasilAngkaSatu);
        TextView hasilAngkaDua = (TextView)findViewById(R.id.hasilAngkaDua);
        TextView hasilOp = (TextView)findViewById(R.id.hasilOperasi);

        Intent unpack = getIntent();
        int angka1 = unpack.getIntExtra("angka1",0);
        int angka2 = unpack.getIntExtra("angka2",0);
        int hasil = unpack.getIntExtra("hasil",0);

        // Convert integers to strings before setting text
        hasilAngkaSatu.setText(String.valueOf(angka1));
        hasilAngkaDua.setText(String.valueOf(angka2));
        hasilOp.setText(String.valueOf(hasil));
    }
}
