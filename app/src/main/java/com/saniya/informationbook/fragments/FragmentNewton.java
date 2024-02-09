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

public class FragmentNewton extends Fragment {
    public static FragmentNewton newInstance() {
        return new FragmentNewton();
    }
    
    ImageView ivNewton;
    ProgressBar pbNewton;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newton,container,false);

        ivNewton = view.findViewById(R.id.ivNewton);
        pbNewton = view.findViewById(R.id.pbNewton);

        Picasso.get().load("https://cdn.mos.cms.futurecdn.net/3buDqF4oZrEByNRVBgYwmm.jpg")
                .into(ivNewton, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbNewton.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbNewton.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
