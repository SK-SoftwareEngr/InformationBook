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

public class FragmentColosseum extends Fragment {
    public static FragmentColosseum newInstance(){
        return new FragmentColosseum();
    }
    
    ImageView ivColosseum;
    ProgressBar pbColosseum;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_colosseum,container,false);

        ivColosseum = view.findViewById(R.id.ivColosseum);
        pbColosseum = view.findViewById(R.id.pbColosseum);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Colosseo_2020.jpg/1280px-Colosseo_2020.jpg")
                .into(ivColosseum, new Callback() {
                    @Override
                    public void onSuccess(){
                        pbColosseum.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbColosseum.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
