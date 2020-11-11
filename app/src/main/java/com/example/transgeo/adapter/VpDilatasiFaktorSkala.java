package com.example.transgeo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.transgeo.fragment.dilatasi.faktor_skala.DilBidangKordinat;
import com.example.transgeo.fragment.dilatasi.faktor_skala.DilPusatS;
import com.example.transgeo.fragment.dilatasi.faktor_skala.DilSkalaNegatif;
import com.example.transgeo.fragment.dilatasi.faktor_skala.DilSkalaPositif;

public class VpDilatasiFaktorSkala extends FragmentStateAdapter {
    public VpDilatasiFaktorSkala(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public VpDilatasiFaktorSkala(@NonNull Fragment fragment) {
        super(fragment);
    }

    public VpDilatasiFaktorSkala(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new DilSkalaPositif();
            case 1:
                return new DilSkalaNegatif();
            case 2:
                return new DilBidangKordinat();
            case 3:
                return new DilPusatS();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
