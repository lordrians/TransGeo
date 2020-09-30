package com.example.transgeo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.transgeo.fragment.refleksi.thd_garis.RefGarisC;
import com.example.transgeo.fragment.refleksi.thd_garis.RefGarisB;
import com.example.transgeo.fragment.refleksi.thd_garis.RefGarisA;

public class VpRefleksiThdGaris extends FragmentStateAdapter {
    public VpRefleksiThdGaris(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public VpRefleksiThdGaris(@NonNull Fragment fragment) {
        super(fragment);
    }

    public VpRefleksiThdGaris(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new RefGarisA();
            case 1:
                return new RefGarisB();
            case 2:
                return new RefGarisC();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
