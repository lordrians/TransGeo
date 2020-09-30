package com.example.transgeo.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.transgeo.fragment.refleksi.ContohRefleksiFragment;
import com.example.transgeo.fragment.refleksi.RefBidKordinat;
import com.example.transgeo.fragment.refleksi.RefPengertian;
import com.example.transgeo.fragment.refleksi.RefThdGaris;
import com.example.transgeo.fragment.refleksi.VideoRefleksiFragment;

public class ViewPagerCustom extends FragmentStateAdapter {
    public ViewPagerCustom(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPagerCustom(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerCustom(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new RefPengertian();
            case 1:
                return new RefThdGaris();
            case 2:
                return new RefBidKordinat();
            case 3:
                return new ContohRefleksiFragment();
            case 4:
                return new VideoRefleksiFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 5;
    }







}
