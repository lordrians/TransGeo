package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.object.Tokoh;

public class DetailTokohActivity extends AppCompatActivity  {
    TextView  tvNamaMid, tvBidang, tvDesc;
    ImageView ivPoto;
    LinearLayout llBackText;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tokoh);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_arrow_back_black));
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvNamaMid = findViewById(R.id.tv_nama_mid_detail_tokoh);
        tvBidang = findViewById(R.id.tv_bidang_detail_tokoh);
        tvDesc = findViewById(R.id.tv_desc_detail_tokoh);
        ivPoto = findViewById(R.id.iv_poto_detail_tokoh);
        
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        getDataParcel();

    }

    private void getDataParcel() {
        Intent intent = getIntent();
        Tokoh tokoh = intent.getParcelableExtra("tokoh");

        toolbar.setTitle(Html.fromHtml("<u>"+tokoh.getNama()+"</u>",Html.FROM_HTML_MODE_LEGACY));
        tvNamaMid.setText(tokoh.getNama());
        tvBidang.setText(tokoh.getBidang());
        tvDesc.setText(tokoh.getDeksripsi());
        Glide.with(getApplicationContext())
                .load(tokoh.getPoto())
                .apply(new RequestOptions().centerCrop())
                .into(ivPoto);
    }

}
