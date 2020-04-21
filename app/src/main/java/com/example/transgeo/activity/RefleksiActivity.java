package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.transgeo.R;
import com.example.transgeo.adapter.ViewPagerRefleksiAdapter;
import com.google.android.material.tabs.TabLayout;

public class RefleksiActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refleksi);

        viewPager = findViewById(R.id.vp_refleksi);
        tabLayout = findViewById(R.id.tl_refleksi);

        ViewPagerRefleksiAdapter adapter = new ViewPagerRefleksiAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }

}
