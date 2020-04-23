package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.transgeo.R;
import com.example.transgeo.adapter.ViewPagerDilatasiAdapter;
import com.example.transgeo.dtobject.DtMateri;
import com.example.transgeo.object.GlobalVar;
import com.example.transgeo.object.Materi;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class DilatasiActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilatasi);

        viewPager = findViewById(R.id.vp_dilatasi);
        tabLayout = findViewById(R.id.tl_dilatasi);

        ViewPagerDilatasiAdapter adapter = new ViewPagerDilatasiAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        sharedPreferences = getSharedPreferences(GlobalVar.MFILE_SHARED_PREF, MODE_PRIVATE);
        tabLayout.setupWithViewPager(viewPager);

        if (!sharedPreferences.contains(GlobalVar.P_ISI_DIL)){
            setDataMateri();
            Toast.makeText(getApplicationContext(), "Data baru ", Toast.LENGTH_LONG ).show();
            if (!sharedPreferences.contains(GlobalVar.ID_VIDEO_DIL)){
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
        arrayList = DtMateri.getDataDilatasi();

        SharedPreferences.Editor editor =  sharedPreferences.edit();
        editor.putString(GlobalVar.P_ISI_DIL, arrayList.get(0).getIsiMateri());
        editor.putString(GlobalVar.P_PHOTO_DIL, arrayList.get(0).getPhoto());
        editor.putString(GlobalVar.S_ISI_DIL, arrayList.get(1).getIsiMateri());
        editor.putString(GlobalVar.S_PHOTO_DIL, arrayList.get(1).getPhoto());
        editor.putString(GlobalVar.L_ISI_DIL, arrayList.get(2).getIsiMateri());
        editor.putString(GlobalVar.L_PHOTO_DIL, arrayList.get(2).getPhoto());
        editor.putString(GlobalVar.C_ISI_DIL, arrayList.get(3).getIsiMateri());
        editor.putString(GlobalVar.C_PHOTO_DIL, arrayList.get(3).getPhoto());
        editor.commit();
    }
}
