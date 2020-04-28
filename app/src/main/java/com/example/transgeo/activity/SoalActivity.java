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
import android.os.CountDownTimer;
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
import com.example.transgeo.dtobject.DtSoalHard;
import com.example.transgeo.dtobject.DtSoalMedium;
import com.example.transgeo.dtobject.DtSoalUjian;
import com.example.transgeo.object.GlobalVar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class SoalActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnNext, btnPrev, btnAkhiriUjian;
    private TextView tvTimer;
    private Dialog popDialogVerif;
    private ViewPager2 vpSoal;
    private View popupView;
    private boolean pressedKumpulkan = false;

    private int jmlSoal, hasil, jawabanUser, jawabanBenar =0, jawabanSalah = 0, waktuUjian = 10;
    private SharedPreferences sharedPreferences;
    private Toolbar toolbar;
    private String pilihanSoal;
    private ViewPagerSoalAdapter SoalAdapter;
    private TabLayout tabLayout ;
    private LayoutInflater layoutInflater;
    private ArrayList<String> soalKosong = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        tvTimer = findViewById(R.id.tv_soal_timer);
        btnNext = findViewById(R.id.btn_next_soal);
        btnPrev = findViewById(R.id.btn_prev_soal);
        btnAkhiriUjian = findViewById(R.id.btn_akhiri_ujian);


        popDialogVerif = new Dialog(this);

        vpSoal = findViewById(R.id.vp_soal);

        layoutInflater = this.getLayoutInflater();
        tabLayout = findViewById(R.id.tl_soal);

        toolbar = findViewById(R.id.tb_soal);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black);
        sharedPreferences = getSharedPreferences(GlobalVar.MYFILE_SP_SOAL,0);

        btnPrev.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnAkhiriUjian.setOnClickListener(this);

        pilihanSoal = getIntent().getStringExtra(GlobalVar.PILIHAN_SOAL);

        pilPaketSoal();
        connTabLayoutAndVp();

        if (pilihanSoal.equals(GlobalVar.SOAL_UJIAN)){
            btnAkhiriUjian.setText(R.string.akhiri_ujian);
            new CountDownTimer(waktuUjian * 1000,1000){
                @Override
                public void onTick(long l) {
                    tvTimer.setText(
                            String.format("%02d:%02d:%02d", (l/3600)/1000, (l/1000)%3600/60, (l/1000)%60)
                    );
                }

                @Override
                public void onFinish() {
                    if (popDialogVerif.isShowing()){
                        popDialogVerif.dismiss();
                        timeout();

                    } else {
                        popDialogVerif.dismiss();
                        timeout();
                    }

                    if (!pressedKumpulkan){

                        if (popDialogVerif.isShowing()){
                            popDialogVerif.dismiss();
                            timeout();

                        } else {
                            popDialogVerif.dismiss();
                            timeout();
                        }

                    }

                }
            }.start();
        }


        toolbar.setNavigationOnClickListener(view -> {

            keluar();

        });

    }

    private void keluar() {
        Button btnTidak, btnKeluar;
        DisplayMetrics metrics = getResources().getDisplayMetrics();

        int width = metrics.widthPixels;
        int height = metrics.heightPixels;

        popupView = layoutInflater.inflate(R.layout.popup_verifikasi_keluar,null);
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
    }

    private void timeout() {
        TextView tvJwbKosong, tvVerifPup;
        Button btnKembali, btnKumpulkan;
        DisplayMetrics metrics = getResources().getDisplayMetrics();

        int width = metrics.widthPixels;
        int height = metrics.heightPixels;

        popupView = layoutInflater.inflate(R.layout.popup_verifikasi_selesai,null);
        tvJwbKosong = popupView.findViewById(R.id.tv_jwb_kosong);
        tvVerifPup = popupView.findViewById(R.id.tv_verif_popup_desc);
        btnKembali = popupView.findViewById(R.id.btn_popup_kembali);
        btnKumpulkan = popupView.findViewById(R.id.btn_popup_kumpulkan);

        tvVerifPup.setText(R.string.waktuhabis);
        tvJwbKosong.setVisibility(View.GONE);
        btnKembali.setVisibility(View.GONE);


        btnKumpulkan.setOnClickListener(view -> {
            kumpulkanJawan();
        });

        popDialogVerif.setContentView(popupView);
        popDialogVerif.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popDialogVerif.getWindow().setLayout((6*width)/7, (4*height)/5);
        popDialogVerif.setCancelable(false);
        popDialogVerif.show();
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
                if (pilihanSoal.equals(GlobalVar.SOAL_UJIAN)){
                    ShowPopUp();
                }
                keluar();
                break;

        }

    }

    private void hitungBenarSalah() {
        if (jawabanBenar == 0 && jawabanSalah == 0) {
            for (int i = 0; i < jmlSoal; i++){
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
        }


        hasil = jawabanBenar * 100 / jmlSoal;

    }

    @SuppressLint("SetTextI18n")
    private void ShowPopUp() {

        TextView tvJwbKosong;
        Button btnKembali, btnKumpulkan;
        DisplayMetrics metrics = getResources().getDisplayMetrics();

        int width = metrics.widthPixels;
        int height = metrics.heightPixels;

        popupView = layoutInflater.inflate(R.layout.popup_verifikasi_selesai,null);
        tvJwbKosong = popupView.findViewById(R.id.tv_jwb_kosong);
        btnKembali = popupView.findViewById(R.id.btn_popup_kembali);
        btnKumpulkan = popupView.findViewById(R.id.btn_popup_kumpulkan);


        btnKembali.setOnClickListener(view -> {
            soalKosong.clear();
            popDialogVerif.dismiss();
        });
        btnKumpulkan.setOnClickListener(view -> {
            pressedKumpulkan = true;
            kumpulkanJawan();
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

    private void kumpulkanJawan() {

        hitungBenarSalah();
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
        if (pilihanSoal.equals(GlobalVar.SOAL_UJIAN)){

            SoalAdapter = new ViewPagerSoalAdapter(this, DtSoalUjian.randSoal(), GlobalVar.SOAL_UJIAN);
            jmlSoal = DtSoalUjian.randSoal().size();
            storeSharedPreference();
            vpSoal.setOffscreenPageLimit(jmlSoal);
            vpSoal.setAdapter(SoalAdapter);

        } else if (pilihanSoal.equals(GlobalVar.SOAL_EASY)){

            SoalAdapter = new ViewPagerSoalAdapter(this, DtSoalEasy.randSoal(),GlobalVar.SOAL_EASY);
            jmlSoal = DtSoalEasy.randSoal().size();
            storeSharedPreference();
            vpSoal.setOffscreenPageLimit(jmlSoal);
            vpSoal.setAdapter(SoalAdapter);

        } else if (pilihanSoal.equals(GlobalVar.SOAL_MEDIUM)){

            SoalAdapter = new ViewPagerSoalAdapter(this, DtSoalMedium.randSoal(), GlobalVar.SOAL_MEDIUM);
            jmlSoal = DtSoalMedium.randSoal().size();
            storeSharedPreference();
            vpSoal.setOffscreenPageLimit(jmlSoal);
            vpSoal.setAdapter(SoalAdapter);

        } else if (pilihanSoal.equals(GlobalVar.SOAL_HARD)){

            SoalAdapter = new ViewPagerSoalAdapter(this, DtSoalHard.randSoal(), GlobalVar.SOAL_HARD);
            jmlSoal = DtSoalHard.randSoal().size();
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
