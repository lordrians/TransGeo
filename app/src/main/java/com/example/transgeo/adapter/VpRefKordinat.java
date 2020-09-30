package com.example.transgeo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.transgeo.fragment.refleksi.bidang_kordinat.RefKordinatA;
import com.example.transgeo.fragment.refleksi.bidang_kordinat.RefKordinatB;
import com.example.transgeo.fragment.refleksi.bidang_kordinat.RefKordinatC;

public class VpRefKordinat extends FragmentStateAdapter {
    public VpRefKordinat(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public VpRefKordinat(@NonNull Fragment fragment) {
        super(fragment);
    }

    public VpRefKordinat(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new RefKordinatA();
            case 1:
                return new RefKordinatB();
            case 2:
                return new RefKordinatC();

        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
