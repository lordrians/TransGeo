package com.example.transgeo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.transgeo.adapter.TokohAdapterHorizontal;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout llLihatSemuaTokoh;
    private RecyclerView rvTokoh;
    private ArrayList<Tokoh> listTokoh = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llLihatSemuaTokoh = findViewById(R.id.ll_lihat_semua_tokoh);
        rvTokoh = findViewById(R.id.rv_tokoh_horizontal);

        rvTokoh.setHasFixedSize(true);

        listTokoh.addAll(dtTokoh.getData());
        showRvTokoh();

        llLihatSemuaTokoh.setOnClickListener(this);


    }

    private void showRvTokoh() {
        rvTokoh.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        TokohAdapterHorizontal tokohAdapterHorizontal = new TokohAdapterHorizontal(listTokoh, getApplicationContext());
        rvTokoh.setAdapter(tokohAdapterHorizontal);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_lihat_semua_tokoh:
                Intent intent = new Intent(getApplicationContext(), ListTokohActivity.class);
                startActivity(intent);
        }
    }
}
