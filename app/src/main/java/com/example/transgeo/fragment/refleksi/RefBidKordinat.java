package com.example.transgeo.fragment.refleksi;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.adapter.VpRefKordinat;
import com.example.transgeo.object.GlobalVar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/**
 * A simple {@link Fragment} subclass.
 */
public class RefBidKordinat extends Fragment {
    private ViewPager2 vpBidKordinat;
    private TabLayout tabLayout;
    public RefBidKordinat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ref_bid_kordinat, container, false);
        tabLayout = view.findViewById(R.id.tl_ref_bid_kordinat);
        vpBidKordinat = view.findViewById(R.id.vp_ref_bid_kordinat);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        VpRefKordinat vpRefKordinat = new VpRefKordinat(this);
        vpBidKordinat.setAdapter(vpRefKordinat);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, vpBidKordinat, (tab, position) -> {
            if (position == 0){
                tab.setText(R.string.ref_thd_sumbu_kordinat);
            } else if (position == 1){
                tab.setText(R.string.ref_garis_sejajar);
            } else if (position == 2){
                tab.setText(R.string.ref_thd_garis);
            } else {
                tab.setText("");
            }
        });
        tabLayoutMediator.attach();

    }
}
