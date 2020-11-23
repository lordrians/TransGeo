package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.example.transgeo.R;
import com.example.transgeo.adapter.TokohAdapterVertical;
import com.example.transgeo.dtobject.dtTokoh;
import com.example.transgeo.object.Tokoh;

import java.util.ArrayList;

public class ListTokohActivity extends AppCompatActivity {
    private RecyclerView rvTokoh;
    private ArrayList<Tokoh> listTokoh = new ArrayList<>();
    private Toolbar toolbar;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tokoh);

        toolbar = findViewById(R.id.tb_list_tokoh);
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back_black));
        setSupportActionBar(toolbar);


        rvTokoh = findViewById(R.id.rv_tokoh_vertical);
        rvTokoh.setHasFixedSize(true);

        listTokoh.addAll(dtTokoh.getData());
        showRvTokoh();
        toolbar.setNavigationOnClickListener(view -> finish());


    }

    private void showRvTokoh() {
        rvTokoh.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        TokohAdapterVertical tokohAdapterVertical = new TokohAdapterVertical(listTokoh, getApplicationContext());
        rvTokoh.setAdapter(tokohAdapterVertical);
    }

}
