package com.example.transgeo.fragment.rotasi;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.transgeo.R;
import com.example.transgeo.object.GlobalVar;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContohRotasiFragment extends Fragment {
    private ImageView ivContoh;
    private TextView tvContoh;

    public ContohRotasiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contoh_rotasi, container, false);
        ivContoh = view.findViewById(R.id.iv_rot_contoh);
        tvContoh = view.findViewById(R.id.tv_rot_contoh);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SharedPreferences sharedPreferences = getContext().getSharedPreferences(GlobalVar.MFILE_SHARED_PREF, 0);
        tvContoh.setText(sharedPreferences.getString(GlobalVar.C_ISI_ROT,""));
        Glide.with(getContext())
                .load(sharedPreferences.getString(GlobalVar.C_PHOTO_ROT,""))
                .apply(new RequestOptions().centerCrop())
                .into(ivContoh);

    }
}
