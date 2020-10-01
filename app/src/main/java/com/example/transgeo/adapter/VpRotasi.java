package com.example.transgeo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.transgeo.fragment.rotasi.RotBidangKartesius;
import com.example.transgeo.fragment.rotasi.RotPengertian;

public class VpRotasi extends FragmentStateAdapter {
    public VpRotasi(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public VpRotasi(@NonNull Fragment fragment) {
        super(fragment);
    }

    public VpRotasi(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new RotPengertian();
            case 1:
                return new RotBidangKartesius();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
