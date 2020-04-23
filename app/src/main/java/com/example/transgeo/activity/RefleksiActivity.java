package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.transgeo.R;
import com.example.transgeo.adapter.ViewPagerRefleksiAdapter;
import com.example.transgeo.dtobject.DtMateri;
import com.example.transgeo.object.GlobalVar;
import com.example.transgeo.object.Materi;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class RefleksiActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private SharedPreferences sharedPreferences;
    private ArrayList<Materi> arrayList;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refleksi);

        viewPager = findViewById(R.id.vp_refleksi);
        tabLayout = findViewById(R.id.tl_refleksi);

        ViewPagerRefleksiAdapter adapter = new ViewPagerRefleksiAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        sharedPreferences = getSharedPreferences(GlobalVar.MFILE_SHARED_PREF, MODE_PRIVATE);
        tabLayout.setupWithViewPager(viewPager);

        if (!sharedPreferences.contains(GlobalVar.P_ISI_REF)){
            setData();

            Toast.makeText(getApplicationContext(), "Data baru ", Toast.LENGTH_LONG ).show();

//            dt3 = sharedPreferences.getString("asd","");
//
//            Toast.makeText(getApplicationContext(), dt3, Toast.LENGTH_LONG ).show();
        } else {
            Toast.makeText(getApplicationContext(), "data belum Terisi", Toast.LENGTH_LONG ).show();
        }

    }

    private void setData() {
        arrayList = DtMateri.getDataRefleksi();



        SharedPreferences.Editor editor =  sharedPreferences.edit();
        editor.putString(GlobalVar.P_ISI_REF, arrayList.get(0).getIsiMateri());
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
