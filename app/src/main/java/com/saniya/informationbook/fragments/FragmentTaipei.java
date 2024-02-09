package com.saniya.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.saniya.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentTaipei extends Fragment {
    public static FragmentTaipei newInstance() {
        return new FragmentTaipei();
    }
    
    ImageView ivTaipei;
    ProgressBar pbTaipei;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_taipei,container,false);

        ivTaipei = view.findViewById(R.id.ivTaipei);
        pbTaipei = view.findViewById(R.id.pbTaipei);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/7/77/New_World_Building_and_Partyworld_Zhonghua_New_Hall_20160225_night.jpg")
                .into(ivTaipei, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbTaipei.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbTaipei.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
