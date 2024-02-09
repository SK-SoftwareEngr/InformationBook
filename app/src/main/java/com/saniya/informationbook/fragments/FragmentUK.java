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
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Callback;

public class FragmentUK extends Fragment {
    public static FragmentUK newInstance() {
        return new FragmentUK();
    }
    
    ImageView ivUK;
    ProgressBar pbUK;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_uk,container,false);

        ivUK = view.findViewById(R.id.ivUK);
        pbUK = view.findViewById(R.id.pbUK);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/1200px-Flag_of_the_United_Kingdom_%281-2%29.svg.png")
                .into(ivUK, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbUK.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbUK.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
