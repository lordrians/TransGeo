package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.example.transgeo.R;
import com.example.transgeo.object.GlobalVar;

public class FinishUjianActivity extends AppCompatActivity {
    private TextView tvScore, tvBenar, tvSalah;
    private int score, benar, salah;
    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(
                R.layout.activity_finish_ujian);

        tvBenar = findViewById(R.id.tv_finish_benar);
        tvSalah = findViewById(R.id.tv_finish_salah);
        tvScore = findViewById(R.id.tv_finish_score);
        toolbar = findViewById(R.id.tb_finish);

        setSupportActionBar(toolbar);

        score = getIntent().getIntExtra(GlobalVar.SCORE,0);
        benar = getIntent().getIntExtra(GlobalVar.BENAR,0);
        salah = getIntent().getIntExtra(GlobalVar.SALAH,0);

        tvBenar.setText(String.valueOf(benar));
        tvSalah.setText(String.valueOf(salah));
        tvScore.setText(String.valueOf(score));

        toolbar.setNavigationOnClickListener(view -> {
            finish();
        });

    }

}
