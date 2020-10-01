package com.example.transgeo.fragment.rotasi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.transgeo.R;
import com.example.transgeo.adapter.VpRotasiKartesius;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class RotBidangKartesius extends Fragment {
    private ViewPager2 vpBidKartesius;
    private TabLayout tabLayout;

    public RotBidangKartesius() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rot_bidang_kartesius, container, false);
        tabLayout = view.findViewById(R.id.tl_rot_kartesius);
        vpBidKartesius = view.findViewById(R.id.vp_rot_kartesius);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        VpRotasiKartesius adapter = new VpRotasiKartesius(this);
        vpBidKartesius.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, vpBidKartesius, (tab, position) -> {
            if (position == 0){
                tab.setText(R.string.rot_90);
            } else if (position == 1){
                tab.setText(R.string.rot_min_90);
            } else if (position == 2){
                tab.setText(R.string.rot_180);
            } else {
                tab.setText("");
            }
        });
        tabLayoutMediator.attach();

    }
}