package com.example.transgeo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.transgeo.R;
import com.example.transgeo.adapter.TokohAdapterHorizontal;
import com.example.transgeo.dtobject.dtTokoh;
import com.example.transgeo.object.GlobalVar;
import com.example.transgeo.object.Tokoh;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    private RecyclerView rvTokoh;
    private ArrayList<Tokoh> listTokoh = new ArrayList<>();

    private Button btnLihatSemua;
    private ImageButton btnRefleksi, btnRotasi, btnDilatasi, btnTranslasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTokoh = findViewById(R.id.rv_tokoh_horizontal);
        toolbar = findViewById(R.id.tb_main_activity);
        btnLihatSemua = findViewById(R.id.btn_lihat_semua_tokoh);
        btnRefleksi = findViewById(R.id.btn_refleksi);
        btnRotasi = findViewById(R.id.btn_rotasi);
        btnDilatasi = findViewById(R.id.btn_dilatasi);
        btnTranslasi = findViewById(R.id.btn_translasi);

        navigationView = findViewById(R.id.nav_drawer);
        drawerLayout = findViewById(R.id.drawer_layout);

        rvTokoh.setHasFixedSize(true);

        listTokoh.addAll(dtTokoh.getData());

        showRvTokoh();
        setUpNavigationView();

        btnLihatSemua.setOnClickListener(this);
        btnRefleksi.setOnClickListener(this);
        btnRotasi.setOnClickListener(this);
        btnDilatasi.setOnClickListener(this);
        btnTranslasi.setOnClickListener(this);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

    }

    private void setUpNavigationView() {
        navigationView.setNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()){

                case R.id.nav_draw_kalkulator:
                    startActivity(new Intent(getApplicationContext(), CalculatorActivity.class));
                    drawerLayout.closeDrawer(GravityCompat.START);
                    return false;

                case R.id.nav_draw_ujian:
                    Intent intent = new Intent(getApplicationContext(), SoalActivity.class);
                    intent.putExtra(GlobalVar.PILIHAN_SOAL, GlobalVar.SOAL_UJIAN);
                    startActivity(intent);
                    drawerLayout.closeDrawer(GravityCompat.START);
                    return false;

            }
            return false;
        });
    }


    private void showRvTokoh() {
        rvTokoh.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        TokohAdapterHorizontal tokohAdapterHorizontal = new TokohAdapterHorizontal(listTokoh, getApplicationContext());
        rvTokoh.setAdapter(tokohAdapterHorizontal);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_lihat_semua_tokoh:
                startActivity(new Intent(getApplicationContext(),ListTokohActivity.class));
                break;
            case R.id.btn_refleksi:
                startActivity(new Intent(getApplicationContext(),RefleksiActivity.class));
                break;
            case R.id.btn_rotasi:
                startActivity(new Intent(getApplicationContext(),RotasiActivity.class));
                break;
            case R.id.btn_dilatasi:
                startActivity(new Intent(getApplicationContext(),DilatasiActivity.class));
                break;
            case R.id.btn_translasi:
                startActivity(new Intent(getApplicationContext(),TranslasiActivity.class));
                break;

        }
    }
}
