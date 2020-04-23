package com.example.transgeo.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.transgeo.R;
import com.example.transgeo.fragment.dilatasi.ContohDilatasiFragment;
import com.example.transgeo.fragment.dilatasi.LangkahDilatasiFragment;
import com.example.transgeo.fragment.dilatasi.PengertianDilatasiFragment;
import com.example.transgeo.fragment.dilatasi.SyaratDilatasiFragment;
import com.example.transgeo.fragment.dilatasi.VideoDilatasiFragment;

public class ViewPagerDilatasiAdapter extends FragmentStatePagerAdapter {
    private Context mContext;

    public ViewPagerDilatasiAdapter(@NonNull Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PengertianDilatasiFragment();
            case 1:
                return new SyaratDilatasiFragment();
            case 2:
                return new LangkahDilatasiFragment();
            case 3:
                return new ContohDilatasiFragment();
            case 4:
                return new VideoDilatasiFragment();
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
