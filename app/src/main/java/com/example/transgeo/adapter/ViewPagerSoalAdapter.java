package com.example.transgeo.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.object.GlobalVar;
import com.example.transgeo.object.Soal;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ViewPagerSoalAdapter extends RecyclerView.Adapter<ViewPagerSoalAdapter.MyViewHolder> {
    public static ArrayList<Soal> listSoal;

    private Context context;
    private TabLayout tabLayout;
    private SharedPreferences sharedPreferences;
    private View parentLayout;

    public ViewPagerSoalAdapter(Context context, ArrayList<Soal> listSoal) {
        this.context = context;
        this.listSoal = listSoal;
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

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvSoal.setText(listSoal.get(position).getSoal());
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

    }

    @Override
    public int getItemCount() {
        return listSoal.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvSoal;
        ViewPager vpSoal;
        ImageView ivSoal;
        RadioButton rbPgA,rbPgB,rbPgC,rbPgD,rbCheck;
        RadioGroup rgPg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvSoal = itemView.findViewById(R.id.tv_soal);
            rbPgA = itemView.findViewById(R.id.rb_pg_a);
            rbPgB = itemView.findViewById(R.id.rb_pg_b);
            rbPgC = itemView.findViewById(R.id.rb_pg_c);
            rbPgD = itemView.findViewById(R.id.rb_pg_d);
            rgPg = itemView.findViewById(R.id.rg_pilihan_ganda);
            vpSoal = itemView.findViewById(R.id.vp_soal);
            ivSoal = itemView.findViewById(R.id.iv_soal);

            rgPg.setOnCheckedChangeListener((radioGroup, i) -> {

                rbCheck = radioGroup.findViewById(i);
                String JwbUser = rbCheck.getText().toString();

                int select =tabLayout.getSelectedTabPosition();
                TabLayout.Tab se = tabLayout.getTabAt(select);
                se.view.setBackgroundResource(R.drawable.selector_answered_tab_soal);

                if (JwbUser.equals(listSoal.get(getAdapterPosition()).getCorrectAns())){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putInt(GlobalVar.SOAL_NUM_ + getAdapterPosition(), 1);
                    editor.apply();
                } else {
                    SharedPreferences.Editor editor =  sharedPreferences.edit();
                    editor.putInt(GlobalVar.SOAL_NUM_ + getAdapterPosition(), 0);
                    editor.apply();
                }

            });

        }
    }
}
