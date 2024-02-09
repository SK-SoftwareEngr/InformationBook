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

public class FragmentMexicoCity extends Fragment {
    public static FragmentMexicoCity newInstance() {
        return new FragmentMexicoCity();
    }
    
    ImageView ivMex;
    ProgressBar pbMex;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mexico_city,container,false);

        ivMex = view.findViewById(R.id.ivMex);
        pbMex = view.findViewById(R.id.pbMex);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Bellas_Artes_01.jpg/1280px-Bellas_Artes_01.jpg")
                .into(ivMex, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbMex.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbMex.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
