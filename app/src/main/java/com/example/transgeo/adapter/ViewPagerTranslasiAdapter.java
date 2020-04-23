package com.example.transgeo.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.transgeo.R;
import com.example.transgeo.fragment.translasi.ContohTranslasiFragment;
import com.example.transgeo.fragment.translasi.LangkahTranslasiFragment;
import com.example.transgeo.fragment.translasi.PengertianTranslasiFragment;
import com.example.transgeo.fragment.translasi.SyaratTranslasiFragment;
import com.example.transgeo.fragment.translasi.VideoTranslasiFragment;

public class ViewPagerTranslasiAdapter extends FragmentStatePagerAdapter {
    private Context mContext;

    public ViewPagerTranslasiAdapter(@NonNull Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PengertianTranslasiFragment();
            case 1:
                return new SyaratTranslasiFragment();
            case 2:
                return new LangkahTranslasiFragment();
            case 3:
                return new ContohTranslasiFragment();
            case 4:
                return new VideoTranslasiFragment();
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
                return mContext.getString(R.string.syarat);
            case 2:
                return mContext.getString(R.string.langkah);
            case 3:
                return mContext.getString(R.string.contoh);
            case 4:
                return mContext.getString(R.string.video);
        }
        return null;

    }
}
