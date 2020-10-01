package com.example.transgeo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.transgeo.fragment.rotasi.bid_kartesius.Rotasi180;
import com.example.transgeo.fragment.rotasi.bid_kartesius.Rotasi90;
import com.example.transgeo.fragment.rotasi.bid_kartesius.RotasiMin90;

public class VpRotasiKartesius extends FragmentStateAdapter {
    public VpRotasiKartesius(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public VpRotasiKartesius(@NonNull Fragment fragment) {
        super(fragment);
    }

    public VpRotasiKartesius(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Rotasi90();
            case 1:
                return new RotasiMin90();
            case 2:
                return new Rotasi180();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
