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

public class FragmentFrance extends Fragment {
    public static FragmentFrance newInstance() {
        return new FragmentFrance();
    }
    
    ImageView ivFrance;
    ProgressBar pbFrance;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_france,container,false);

        ivFrance = view.findViewById(R.id.ivFrance);
        pbFrance = view.findViewById(R.id.pbFrance);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/c/c3/Flag_of_France.svg/1280px-Flag_of_France.svg.png")
                .into(ivFrance, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbFrance.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbFrance.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
