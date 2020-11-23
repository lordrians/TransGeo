package com.example.transgeo.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.object.GlobalVar;
import com.example.transgeo.object.Soal;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ViewPagerSoalAdapter extends RecyclerView.Adapter<ViewPagerSoalAdapter.MyViewHolder> {
    public static ArrayList<Soal> listSoal;

    private Context context;
    private TabLayout tabLayout;
    private SharedPreferences sharedPreferences;
    private View parentLayout;
    private String PaketSoal;

    public ViewPagerSoalAdapter(Context context, ArrayList<Soal> listSoal, String PaketSoal) {
        this.context = context;
        this.listSoal = listSoal;
        this.PaketSoal = PaketSoal;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_soal, parent, false);
        View parentLayout = parent.getRootView();
        tabLayout = parentLayout.findViewById(R.id.tl_soal);

        sharedPreferences = context.getSharedPreferences(GlobalVar.MYFILE_SP_SOAL, 0);

        return new MyViewHolder(view);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.wvSoal.getSettings().setJavaScriptEnabled(true);
        holder.wvSoal.loadUrl(listSoal.get(position).getSoal());
//        holder.tvSoal.setText(listSoal.get(position).getSoal());
        holder.rbPgA.setText(listSoal.get(position).getPgA());
        holder.rbPgB.setText(listSoal.get(position).getPgB());
        holder.rbPgC.setText(listSoal.get(position).getPgC());
        holder.rbPgD.setText(listSoal.get(position).getPgD());

        if (!listSoal.get(position).getPhotoSoal().isEmpty()){
            holder.ivSoal.setVisibility(View.VISIBLE);
            Glide.with(context)
                    .load(listSoal.get(position).getPhotoSoal())
                    .apply(new RequestOptions().fitCenter())
                    .into(holder.ivSoal);
        } else {
            holder.ivSoal.setVisibility(View.GONE);
        }

        if (PaketSoal.equals(GlobalVar.SOAL_UJIAN)){
            holder.rgPg.setOnCheckedChangeListener((radioGroup, i) -> {
                RadioButton rbCheck = radioGroup.findViewById(i);
                String JwbUser = rbCheck.getText().toString();

                int select = tabLayout.getSelectedTabPosition();
                TabLayout.Tab se = tabLayout.getTabAt(select);
                se.view.setBackgroundResource(R.drawable.selector_bg_nosoal);

                if (JwbUser.equals(listSoal.get(position).getCorrectAns())){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt(GlobalVar.SOAL_NUM_ + position, 1);
                    editor.apply();
                } else {
                    SharedPreferences.Editor editor =  sharedPreferences.edit();
                    editor.putInt(GlobalVar.SOAL_NUM_ + position, 0);
                    editor.apply();
                }

//                if (PaketSoal.equals(GlobalVar.SOAL_UJIAN)){
//                    if (JwbUser.equals(listSoal.get(position).getCorrectAns())){
//                        SharedPreferences.Editor editor = sharedPreferences.edit();
//                        editor.putInt(GlobalVar.SOAL_NUM_ + position, 1);
//                        editor.apply();
//                    } else {
//                        SharedPreferences.Editor editor =  sharedPreferences.edit();
//                        editor.putInt(GlobalVar.SOAL_NUM_ + position, 0);
//                        editor.apply();
//                    }
//                } else {
//                    if (JwbUser.equals(listSoal.get(position).getCorrectAns())){
//                        SharedPreferences.Editor editor = sharedPreferences.edit();
//                        editor.putInt(GlobalVar.SOAL_NUM_ + position, 1);
//                        editor.apply();
//                        Toast.makeText(context, R.string.jawabanbenar, Toast.LENGTH_SHORT).show();
//                    } else {
//                        SharedPreferences.Editor editor =  sharedPreferences.edit();
//                        editor.putInt(GlobalVar.SOAL_NUM_ + position, 0);
//                        editor.apply();
//                        Toast.makeText(context, R.string.jawabansalah, Toast.LENGTH_SHORT).show();
//                    }
//                }
            });
        } else {
            holder.rgPg.setVisibility(View.GONE);
            holder.btnLihatJawaban.setVisibility(View.VISIBLE);
            holder.btnLihatJawaban.setOnClickListener(v -> {
                if (holder.wvJwb.getVisibility() != View.VISIBLE){
                    holder.wvJwb.setVisibility(View.VISIBLE);
                    holder.wvJwb.getSettings().setJavaScriptEnabled(true);
                    holder.wvJwb.loadUrl(listSoal.get(position).getJawaban());
                } else {
                    holder.wvJwb.setVisibility(View.GONE);
                }

            });

        }



    }


    @Override
    public int getItemCount() {
        return listSoal.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvSoal;
        ViewPager2 vpSoal;
        PhotoView ivSoal;
        RadioButton rbPgA,rbPgB,rbPgC,rbPgD;
        RadioGroup rgPg;
        WebView wvSoal, wvJwb;
        Button btnLihatJawaban;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

//            tvSoal = itemView.findViewById(R.id.tv_soal);
            wvSoal = itemView.findViewById(R.id.wv_soal);
            rbPgA = itemView.findViewById(R.id.rb_pg_a);
            rbPgB = itemView.findViewById(R.id.rb_pg_b);
            rbPgC = itemView.findViewById(R.id.rb_pg_c);
            rbPgD = itemView.findViewById(R.id.rb_pg_d);
            rgPg = itemView.findViewById(R.id.rg_pilihan_ganda);
            vpSoal = itemView.findViewById(R.id.vp_soal);
            ivSoal = itemView.findViewById(R.id.iv_soal);
            btnLihatJawaban = itemView.findViewById(R.id.item_btn_lihatjawaban);
            wvJwb = itemView.findViewById(R.id.wv_jawaban);


        }
    }
}
