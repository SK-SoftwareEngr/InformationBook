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

public class FragmentItaly extends Fragment {
    public static FragmentItaly newInstance() {
        return new FragmentItaly();
    }
    
    ImageView ivItaly;
    ProgressBar pbItaly;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_italy,container,false);

        ivItaly = view.findViewById(R.id.ivItaly);
        pbItaly = view.findViewById(R.id.pbItaly);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/en/thumb/0/03/Flag_of_Italy.svg/1280px-Flag_of_Italy.svg.png")
                .into(ivItaly, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbItaly.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbItaly.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
