package com.example.transgeo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.transgeo.fragment.translasi.TranDuaBerurutan;
import com.example.transgeo.fragment.translasi.TranKordinatBayangan;
import com.example.transgeo.fragment.translasi.TranNotPasanganBil;
import com.example.transgeo.fragment.translasi.TranPengertian;

public class VpTranslasi extends FragmentStateAdapter {
    public VpTranslasi(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public VpTranslasi(@NonNull Fragment fragment) {
        super(fragment);
    }

    public VpTranslasi(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new TranPengertian();
            case 1:
                return new TranNotPasanganBil();
            case 2:
                return new TranKordinatBayangan();
            case 3:
                return new TranDuaBerurutan();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
