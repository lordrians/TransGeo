package com.example.transgeo.fragment.refleksi;

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
public class SyaratRefleksiFragment extends Fragment {
    ImageView ivSyarat;
    TextView tvSyarat;

    public SyaratRefleksiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_syarat_refleksi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivSyarat = view.findViewById(R.id.iv_ref_syarat);
        tvSyarat = view.findViewById(R.id.tv_ref_syarat);

        SharedPreferences sharedPreferences = getContext().getSharedPreferences(GlobalVar.MFILE_SHARED_PREF, 0);
        tvSyarat.setText(sharedPreferences.getString(GlobalVar.S_ISI_REF,""));
        Glide.with(getContext())
                .load(sharedPreferences.getString(GlobalVar.S_PHOTO_REF,""))
                .apply(new RequestOptions().centerCrop())
                .into(ivSyarat);
    }
}
