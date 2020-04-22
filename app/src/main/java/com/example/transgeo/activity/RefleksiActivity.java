package com.example.transgeo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.example.transgeo.R;
import com.example.transgeo.adapter.ViewPagerRefleksiAdapter;
import com.example.transgeo.dtobject.DtMateri;
import com.example.transgeo.object.Materi;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class RefleksiActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    SharedPreferences sharedPreferences, preferences ;
    private ArrayList<Materi> arrayList;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refleksi);

        viewPager = findViewById(R.id.vp_refleksi);
        tabLayout = findViewById(R.id.tl_refleksi);

        ViewPagerRefleksiAdapter adapter = new ViewPagerRefleksiAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        sharedPreferences = getSharedPreferences("myThing", MODE_PRIVATE);
        tabLayout.setupWithViewPager(viewPager);

        if (!sharedPreferences.contains("pIsiRefleksi")){
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
        editor.putString("pIsiRefleksi", arrayList.get(0).getIsiMateri());
        editor.putString("pPhotoRefleksi", arrayList.get(0).getPhoto());
        editor.putString("sIsiRefleksi", arrayList.get(1).getIsiMateri());
        editor.putString("sPhotoRefleksi", arrayList.get(1).getPhoto());
        editor.putString("lIsiRefleksi", arrayList.get(2).getIsiMateri());
        editor.putString("lPhotoRefleksi", arrayList.get(2).getPhoto());
        editor.putString("cIsiRefleksi", arrayList.get(3).getIsiMateri());
        editor.putString("cPhotoRefleksi", arrayList.get(3).getPhoto());
        editor.commit();
    }

}
