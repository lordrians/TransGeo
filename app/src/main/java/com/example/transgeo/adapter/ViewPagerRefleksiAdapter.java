package com.example.transgeo.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.transgeo.R;
import com.example.transgeo.fragment.refleksi.ContohRefleksiFragment;
import com.example.transgeo.fragment.refleksi.RefBidKordinat;
import com.example.transgeo.fragment.refleksi.RefPengertian;
import com.example.transgeo.fragment.refleksi.SyaratRefleksiFragment;
import com.example.transgeo.fragment.refleksi.VideoRefleksiFragment;

public class ViewPagerRefleksiAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    public ViewPagerRefleksiAdapter(@NonNull Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RefPengertian();
            case 1:
                return new SyaratRefleksiFragment();
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
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.pengertian);
            case 1:
                return mContext.getString(R.string.refleksi_thd_garis);
            case 2:
                return mContext.getString(R.string.refleksi_pd_bidangkordinat);
            case 3:
                return mContext.getString(R.string.contoh);
            case 4:
                return mContext.getString(R.string.video);
        }
        return null;
    }
}
