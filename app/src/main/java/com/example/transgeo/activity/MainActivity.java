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
import com.example.transgeo.object.Tokoh;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    private RecyclerView rvTokoh;
    private ArrayList<Tokoh> listTokoh = new ArrayList<>();

    private Button btnLihatSemua;
    private ImageButton btnRefleksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTokoh = findViewById(R.id.rv_tokoh_horizontal);

        btnLihatSemua = findViewById(R.id.btn_lihat_semua_tokoh);
        btnRefleksi = findViewById(R.id.btn_refleksi);

        navigationView = findViewById(R.id.nav_drawer);
        drawerLayout = findViewById(R.id.drawer_layout);

        rvTokoh.setHasFixedSize(true);

        listTokoh.addAll(dtTokoh.getData());

        showRvTokoh();
        setUpNavigationView();

        btnLihatSemua.setOnClickListener(this);
        btnRefleksi.setOnClickListener(this);


    }

    private void setUpNavigationView() {
        navigationView.setNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()){

                case R.id.nav_draw_kalkulator:
                    startActivity(new Intent(getApplicationContext(), CalculatorActivity.class));
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

        }
    }
}
