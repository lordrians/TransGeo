package com.example.transgeo.fragment.refleksi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.transgeo.R;
import com.example.transgeo.adapter.ViewPagerCustom;
import com.example.transgeo.adapter.ViewPagerCustom2;
import com.example.transgeo.adapter.VpRefleksiThdGaris;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class RefThdGaris extends Fragment {
    private ViewPager2 vpRefleksiThdGaris;
    private TabLayout tabLayout;


    public RefThdGaris() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_refleksi_thd_garis, container, false);
        tabLayout = view.findViewById(R.id.tl_refleksi_thd_garis);
        vpRefleksiThdGaris = view.findViewById(R.id.vp_refleksi_thd_garis);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        VpRefleksiThdGaris adapter = new VpRefleksiThdGaris(this);
        vpRefleksiThdGaris.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, vpRefleksiThdGaris,(tab, position) -> {
            if (position == 0){
                tab.setText(R.string.bayangan_suatu_titik);
            } else if (position == 1){
                tab.setText(R.string.bayangan_suatu_garis);
            } else if (position == 2){
                tab.setText(R.string.bayangan_suatu_bangun);
            } else {
                tab.setText("");
            }

        });
        tabLayoutMediator.attach();


    }
}