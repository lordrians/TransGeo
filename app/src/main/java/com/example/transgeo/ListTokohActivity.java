package com.example.transgeo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.transgeo.adapter.TokohAdapterHorizontal;
import com.example.transgeo.adapter.TokohAdapterVertical;

import java.util.ArrayList;

public class ListTokohActivity extends AppCompatActivity {
    private LinearLayout llBackTokohList;
    private RecyclerView rvTokoh;
    private ArrayList<Tokoh> listTokoh = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tokoh);

        llBackTokohList = findViewById(R.id.ll_back_tokoh_list);
        rvTokoh = findViewById(R.id.rv_tokoh_vertical);
        rvTokoh.setHasFixedSize(true);

        listTokoh.addAll(dtTokoh.getData());
        showRvTokoh();

        llBackTokohList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();

            }
        });

    }

    private void showRvTokoh() {
        rvTokoh.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        TokohAdapterVertical tokohAdapterVertical = new TokohAdapterVertical(listTokoh, getApplicationContext());
        rvTokoh.setAdapter(tokohAdapterVertical);
    }
}
