package com.example.transgeo.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.example.transgeo.R;
import com.example.transgeo.adapter.ViewPagerSoalAdapter;
import com.example.transgeo.dtobject.DtSoalEasy;
import com.example.transgeo.dtobject.DtSoalUjian;
import com.example.transgeo.object.GlobalVar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class SoalActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnNext, btnPrev, btnAkhiriUjian;
    private Dialog popDialogVerif;
    private ViewPager2 vpSoal;
    private View popupView;

    private int jmlSoal;
    private SharedPreferences sharedPreferences;
    private Toolbar toolbar;
    private String pilihanSoal;
    private ViewPagerSoalAdapter SoalAdapter;
    private TabLayout tabLayout ;
    private ArrayList<String> soalKosong = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        btnNext = findViewById(R.id.btn_next_soal);
        btnPrev = findViewById(R.id.btn_prev_soal);
        btnAkhiriUjian = findViewById(R.id.btn_akhiri_ujian);

        popDialogVerif = new Dialog(this);

        vpSoal = findViewById(R.id.vp_soal);

        tabLayout = findViewById(R.id.tl_soal);

        toolbar = findViewById(R.id.tb_soal);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black);
        sharedPreferences = getSharedPreferences(GlobalVar.MYFILE_SP_SOAL,0);

        btnPrev.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnAkhiriUjian.setOnClickListener(this);

        pilPaketSoal();
        connTabLayoutAndVp();


        toolbar.setNavigationOnClickListener(view -> {

            Button btnTidak, btnKeluar;
            DisplayMetrics metrics = getResources().getDisplayMetrics();

            int width = metrics.widthPixels;
            int height = metrics.heightPixels;

            LayoutInflater inflater = this.getLayoutInflater();

            popupView = inflater.inflate(R.layout.popup_verifikasi_keluar,null);
            btnTidak = popupView.findViewById(R.id.btn_popup_verif_tidak);
            btnKeluar = popupView.findViewById(R.id.btn_popup_verif_keluar);

            btnTidak.setOnClickListener(view1 -> {
                popDialogVerif.dismiss();
            });

            btnKeluar.setOnClickListener(view1 -> {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();
                popDialogVerif.dismiss();
                finish();
            });


            popDialogVerif.setContentView(popupView);
            popDialogVerif.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            popDialogVerif.getWindow().setLayout((6*width)/7, (4*height)/5);
            popDialogVerif.show();

        });

    }

    private void connTabLayoutAndVp() {
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, vpSoal, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(String.valueOf(position+1));
            }
        });
        tabLayoutMediator.attach();
    }

    private void pilPaketSoal() {
        pilihanSoal = getIntent().getStringExtra(GlobalVar.PILIHAN_SOAL);
        if (pilihanSoal.equals(GlobalVar.SOAL_UJIAN)){
            SoalAdapter = new ViewPagerSoalAdapter(this, DtSoalUjian.getSoalUjian());
            jmlSoal = DtSoalUjian.getSoalUjian().size();
            storeSharedPreference();
            vpSoal.setOffscreenPageLimit(jmlSoal);
            vpSoal.setAdapter(SoalAdapter);
        } else if (pilihanSoal.equals(GlobalVar.SOAL_EASY)){
            SoalAdapter = new ViewPagerSoalAdapter(this, DtSoalEasy.getSoalUjian());
            jmlSoal = DtSoalUjian.getSoalUjian().size();
            storeSharedPreference();
            vpSoal.setOffscreenPageLimit(jmlSoal);
            vpSoal.setAdapter(SoalAdapter);
        }
    }

    private void storeSharedPreference() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        for (int i = 0; i < jmlSoal; i++){
            editor.putInt(GlobalVar.SOAL_NUM_ + i,-1);
        }
        editor.apply();

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn_prev_soal:
                prev_fragment(view);
                break;

            case R.id.btn_next_soal:
                next_fragment(view);
                break;

            case R.id.btn_akhiri_ujian:
                int jmlJawaban = ViewPagerSoalAdapter.listSoal.size();
                int jawabanUser;
                int jawabanBenar = 0, jawabanSalah = 0;
                for (int i = 0; i < jmlJawaban; i++){
                    jawabanUser = sharedPreferences.getInt(GlobalVar.SOAL_NUM_ + i, 0);
                    if (jawabanUser == 0){
                        jawabanSalah += 1;
                    } else if (jawabanUser == 1){
                        jawabanBenar += 1;
                    } else {
                        jawabanSalah += 1;
                        soalKosong.add(String.valueOf(i+1));

                    }


                }


                ShowPopUp(jawabanBenar, jawabanSalah);
                break;

        }

    }

    @SuppressLint("SetTextI18n")
    private void ShowPopUp( int jawabanBenar, int jawabanSalah) {

        TextView tvJwbKosong;
        Button btnKembali, btnKumpulkan;
        DisplayMetrics metrics = getResources().getDisplayMetrics();

        int width = metrics.widthPixels;
        int height = metrics.heightPixels;

        LayoutInflater inflater = this.getLayoutInflater();

        popupView = inflater.inflate(R.layout.popup_verifikasi_selesai,null);
        tvJwbKosong = popupView.findViewById(R.id.tv_jwb_kosong);
        btnKembali = popupView.findViewById(R.id.btn_popup_kembali);
        btnKumpulkan = popupView.findViewById(R.id.btn_popup_kumpulkan);
        int hasil = jawabanBenar * 100 / jmlSoal;


        btnKembali.setOnClickListener(view -> {
            soalKosong.clear();
            popDialogVerif.dismiss();
        });
        btnKumpulkan.setOnClickListener(view -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.apply();
            Intent intent = new Intent(getApplicationContext(), FinishUjianActivity.class);
            intent.putExtra(GlobalVar.BENAR, jawabanBenar);
            intent.putExtra(GlobalVar.SALAH, jawabanSalah);
            intent.putExtra(GlobalVar.SCORE, hasil);
            startActivity(intent);
            popDialogVerif.dismiss();
            finish();
        });



        popDialogVerif.setContentView(popupView);
        popDialogVerif.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popDialogVerif.getWindow().setLayout((6*width)/7, (4*height)/5);


        if (soalKosong.isEmpty()){
            tvJwbKosong.setVisibility(View.GONE);
        } else {
            tvJwbKosong.setText(getResources().getText(R.string.kamu_belum) + soalKosong.toString());
        }

        popDialogVerif.show();
    }

    private void next_fragment(View view) {
        if (vpSoal.getCurrentItem() != 0){
            vpSoal.setCurrentItem(vpSoal.getCurrentItem()-1);
        }
    }

    private void prev_fragment(View view) {
        if (vpSoal.getCurrentItem() < ViewPagerSoalAdapter.listSoal.size()){
            vpSoal.setCurrentItem(vpSoal.getCurrentItem()+1);
        }
    }
}
