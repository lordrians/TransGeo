package com.example.transgeo.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.transgeo.R;
import com.example.transgeo.fragment.rotasi.ContohRotasiFragment;
import com.example.transgeo.fragment.rotasi.LangkahRotasiFragment;
import com.example.transgeo.fragment.rotasi.PengertianRotasiFragment;
import com.example.transgeo.fragment.rotasi.SyaratRotasiFragment;
import com.example.transgeo.fragment.rotasi.VideoRotasiFragment;

public class ViewPagerRotasiAdapter extends FragmentStatePagerAdapter {
    private Context mContext;

    public ViewPagerRotasiAdapter(@NonNull Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PengertianRotasiFragment();
            case 1:
                return new SyaratRotasiFragment();
            case 2:
                return new LangkahRotasiFragment();
            case 3:
                return new ContohRotasiFragment();
            case 4:
                return new VideoRotasiFragment();
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
