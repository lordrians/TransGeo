package com.example.transgeo.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.activity.DetailTokohActivity;
import com.example.transgeo.object.Tokoh;

import java.util.ArrayList;

public class TokohAdapterHorizontal extends RecyclerView.Adapter<TokohAdapterHorizontal.MyViewHolder> {
    private ArrayList<Tokoh> tokohArrayList;
    Context context;

    public TokohAdapterHorizontal(ArrayList<Tokoh> tokohArrayList, Context context) {
        this.tokohArrayList = tokohArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_tokoh_horizontal,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tvNama.setText(tokohArrayList.get(position).getNama());
        holder.tvBidang.setText(tokohArrayList.get(position).getBidang());
        holder.tvDeskripsi.setText(tokohArrayList.get(position).getDeksripsi());
        Glide.with(holder.itemView.getContext())
                .load(tokohArrayList.get(position).getPoto())
                .apply(new RequestOptions().override(50,50).centerCrop())
                .into(holder.ivPoto);

    }

    @Override
    public int getItemCount() {
        return tokohArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvNama, tvBidang, tvDeskripsi;
        ImageView ivPoto;
        private LinearLayout llItemTokoh;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.tv_nama_mini_desc_tokoh);
            tvBidang = itemView.findViewById(R.id.tv_bidang_mini_desc_tokoh);
            tvDeskripsi = itemView.findViewById(R.id.tv_desc_mini_desc_tokoh);
            ivPoto = itemView.findViewById(R.id.iv_photo_mini_desc_tokoh);
            llItemTokoh = itemView.findViewById(R.id.ll_item_tokoh_horizontal);

            llItemTokoh.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){

                case R.id.ll_item_tokoh_horizontal:
                    int itemPosition = getAdapterPosition();
                    Tokoh tokoh = tokohArrayList.get(itemPosition);
                    Intent intent = new Intent(view.getContext(), DetailTokohActivity.class);
                    intent.putExtra("tokoh", tokoh);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    view.getContext().startActivity(intent);
            }
        }
    }
}
