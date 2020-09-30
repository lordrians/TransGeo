package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.transgeo.R;
import com.example.transgeo.adapter.VpRefleksi;
import com.example.transgeo.dtobject.DtMateri;
import com.example.transgeo.object.GlobalVar;
import com.example.transgeo.object.Materi;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class RefleksiActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewPager2 vpRefleksi;
    private TabLayout tabLayout;
    private SharedPreferences sharedPreferences;
    private Toolbar toolbar;
    

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refleksi);

        vpRefleksi = findViewById(R.id.vp_refleksi);
        tabLayout = findViewById(R.id.tl_refleksi);
        toolbar = findViewById(R.id.tb_refleksi);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(view -> finish());

//        ViewPagerRefleksiAdapter adapter = new ViewPagerRefleksiAdapter(this, getSupportFragmentManager());
        VpRefleksi vpRefleksiAdapter = new VpRefleksi(this);
        vpRefleksi.setAdapter(vpRefleksiAdapter);
        sharedPreferences = getSharedPreferences(GlobalVar.MFILE_SHARED_PREF, MODE_PRIVATE);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, vpRefleksi,(tab, position) -> {
            if (position == 0){
                tab.setText(R.string.pengertian);
            } else if (position == 1){
                tab.setText(R.string.refleksi_thd_garis);
            } else if (position == 2){
                tab.setText(R.string.refleksi_pd_bidangkordinat);
            } else {
                tab.setText("");
            }

        });

//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//
////                ContextCompat.getColor(getApplicationContext(), R.color.colorAccent)
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
////                tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorPrimaryDark));
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
        tabLayoutMediator.attach();
        vpRefleksi.setUserInputEnabled(false);
//        new TabLayoutMediator(tabLayout, vpCustom, (tab, position) -> {
//            switch (position) {
//                case 0:
//                    tab.setText(R.string.pengertian);
//                    Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
//                case 1:
//                    Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
//                    tab.setText(R.string.refleksi_thd_garis);
//                case 2:
//                    Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
//                    tab.setText(R.string.refleksi_pd_bidangkordinat);
//                case 3:
//                    Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
//                    tab.setText(R.string.contoh);
//                case 4:
//                    Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
//                    tab.setText(R.string.video);
//            }
//        }).attach();
//        tabLayout.setupWithViewPager(viewPager);

        if (!sharedPreferences.contains(GlobalVar.P_ISI_REF)){
            setDataMateri();
            Toast.makeText(getApplicationContext(), "Data baru ", Toast.LENGTH_LONG ).show();
            if (!sharedPreferences.contains(GlobalVar.ID_VIDEO_REF)){
                sendIdYoutube();
                Toast.makeText(getApplicationContext(), "Data Vidio baru ", Toast.LENGTH_LONG ).show();
            }


        } else {
            Toast.makeText(getApplicationContext(), "data belum Terisi", Toast.LENGTH_LONG ).show();
        }

    }

    private void sendIdYoutube() {
        ArrayList<Materi> materis;
        materis = DtMateri.getVideo();
        SharedPreferences.Editor edit =  sharedPreferences.edit();
        edit.putString(GlobalVar.ID_VIDEO_REF, materis.get(0).getVideo());
        edit.putString(GlobalVar.ID_VIDEO_ROT, materis.get(1).getVideo());
        edit.putString(GlobalVar.ID_VIDEO_TRANS, materis.get(2).getVideo());
        edit.putString(GlobalVar.ID_VIDEO_DIL, materis.get(3).getVideo());
        edit.commit();

    }

    private void setDataMateri() {
        ArrayList<Materi> arrayList;
        arrayList = DtMateri.getDataRefleksi();

        SharedPreferences.Editor editor =  sharedPreferences.edit();
//        editor.putString(GlobalVar.P_ISI_REF, arrayList.get(0).getIsiMateri());
        editor.putString(GlobalVar.P_PHOTO_REF, arrayList.get(0).getPhoto());
        editor.putString(GlobalVar.S_ISI_REF, arrayList.get(1).getIsiMateri());
        editor.putString(GlobalVar.S_PHOTO_REF, arrayList.get(1).getPhoto());
        editor.putString(GlobalVar.L_ISI_REF, arrayList.get(2).getIsiMateri());
        editor.putString(GlobalVar.L_PHOTO_REF, arrayList.get(2).getPhoto());
        editor.putString(GlobalVar.C_ISI_REF, arrayList.get(3).getIsiMateri());
        editor.putString(GlobalVar.C_PHOTO_REF, arrayList.get(3).getPhoto());
        editor.commit();
    }

}
