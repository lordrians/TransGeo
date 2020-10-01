package com.example.transgeo.fragment.dilatasi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.transgeo.R;
import com.example.transgeo.adapter.VpDilatasiFaktorSkala;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DilFaktorSkala extends Fragment {
    private ViewPager2 vpFaktorSkala;
    private TabLayout tabLayout;

    public DilFaktorSkala() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dil_faktor_skala, container, false);
        vpFaktorSkala = view.findViewById(R.id.vp_dil_faktor_skala);
        tabLayout = view.findViewById(R.id.tl_dil_faktor_skala);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        VpDilatasiFaktorSkala adapter = new VpDilatasiFaktorSkala(this);
        vpFaktorSkala.setAdapter(adapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, vpFaktorSkala, (tab, position) -> {
            if (position == 0){
                tab.setText(R.string.dil_positif);
            } else if (position == 1){
                tab.setText(R.string.dil_negatif);
            } else {
                tab.setText("");
            }
        });
        tabLayoutMediator.attach();

    }
}