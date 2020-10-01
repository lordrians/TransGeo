package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.transgeo.R;
import com.example.transgeo.adapter.ViewPagerRotasiAdapter;
import com.example.transgeo.adapter.VpRotasi;
import com.example.transgeo.dtobject.DtMateri;
import com.example.transgeo.object.GlobalVar;
import com.example.transgeo.object.Materi;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class RotasiActivity extends AppCompatActivity {

    private ViewPager2 vpRotasi;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private SharedPreferences sharedPreferences;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotasi);

        vpRotasi = findViewById(R.id.vp_rotasi);
        tabLayout = findViewById(R.id.tl_rotasi);
        toolbar = findViewById(R.id.tb_rotasi);

        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(view -> finish());

        VpRotasi adapter = new VpRotasi(this);
        vpRotasi.setAdapter(adapter);
        sharedPreferences = getSharedPreferences(GlobalVar.MFILE_SHARED_PREF, MODE_PRIVATE);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, vpRotasi, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText(R.string.pengertian);
                case 1:
                    tab.setText(R.string.rotasi_kartesius);
            }
//
//            if (position == 0){
//                tab.setText(R.string.pengertian);
//            } else if (position == 1){
//                tab.setText(R.string.translasi_notasi);
//            } else if (position == 2){
//                tab.setText(R.string.translasi_kordinat);
//            } else if (position == 3){
//                tab.setText(R.string.translasi_berurutan);
        });
        tabLayoutMediator.attach();
        vpRotasi.setUserInputEnabled(false);

        if (!sharedPreferences.contains(GlobalVar.P_ISI_ROT)){
            setDataMateri();
            Toast.makeText(getApplicationContext(), "Data baru ", Toast.LENGTH_LONG ).show();
            if (!sharedPreferences.contains(GlobalVar.ID_VIDEO_ROT)){
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
        arrayList = DtMateri.getDataRotasi();

        SharedPreferences.Editor editor =  sharedPreferences.edit();
        editor.putString(GlobalVar.P_ISI_ROT, arrayList.get(0).getIsiMateri());
        editor.putString(GlobalVar.P_PHOTO_ROT, arrayList.get(0).getPhoto());
        editor.putString(GlobalVar.S_ISI_ROT, arrayList.get(1).getIsiMateri());
        editor.putString(GlobalVar.S_PHOTO_ROT, arrayList.get(1).getPhoto());
        editor.putString(GlobalVar.L_ISI_ROT, arrayList.get(2).getIsiMateri());
        editor.putString(GlobalVar.L_PHOTO_ROT, arrayList.get(2).getPhoto());
        editor.putString(GlobalVar.C_ISI_ROT, arrayList.get(3).getIsiMateri());
        editor.putString(GlobalVar.C_PHOTO_ROT, arrayList.get(3).getPhoto());
        editor.commit();
    }
}
