package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.transgeo.R;

public class InformasiActivity extends AppCompatActivity {
    private LinearLayout llStandar, llDaftar, llApps, llDev;
    private ImageView ivApps, ivDev;
    private TextView tvStandar, tvDaftar, tvApps, tvDev;
    private int standar = 0, daftar = 0, apps = 0, dev = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        llApps = findViewById(R.id.ll_tentangapps);
        llDaftar = findViewById(R.id.ll_daftarpustaka);
        llDev = findViewById(R.id.ll_tentangdev);
        llStandar = findViewById(R.id.ll_standarisi);

        tvApps = findViewById(R.id.tv_content_apps);
        tvDaftar = findViewById(R.id.tv_content_daftar);
        tvDev = findViewById(R.id.tv_content_dev);
        tvStandar = findViewById(R.id.tv_content_standar);

        ivApps = findViewById(R.id.iv_content_apps);
        ivDev = findViewById(R.id.iv_content_dev);

        llStandar.setOnClickListener(v -> {
            if (standar != 0){
                tvStandar.setVisibility(View.VISIBLE);
                standar = 0;
            } else {
                tvStandar.setVisibility(View.GONE);
                standar = 1;
            }
        });

        llDaftar.setOnClickListener(v -> {
            if (daftar != 0){
                tvDaftar.setVisibility(View.VISIBLE);
                daftar = 0;
            } else {
                tvDaftar.setVisibility(View.GONE);
                daftar = 1;
            }
        });

        llApps.setOnClickListener(v -> {
            if (apps != 0){
                tvApps.setVisibility(View.VISIBLE);
                ivApps.setVisibility(View.VISIBLE);
                apps = 0;
            } else {
                tvApps.setVisibility(View.GONE);
                ivApps.setVisibility(View.GONE);
                apps = 1;
            }
        });

        llDev.setOnClickListener(v -> {
            if (dev != 0){
                tvDev.setVisibility(View.VISIBLE);
                ivDev.setVisibility(View.VISIBLE);
                dev = 0;
            } else {
                tvDev.setVisibility(View.GONE);
                ivDev.setVisibility(View.GONE);
                dev = 1;
            }
        });

    }
}