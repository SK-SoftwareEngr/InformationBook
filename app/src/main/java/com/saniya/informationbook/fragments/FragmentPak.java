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

public class FragmentPak extends Fragment {
    public static FragmentPak newInstance() {
        return new FragmentPak();
    }
    
    ImageView ivPak;
    ProgressBar pbPak;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pak,container,false);

        ivPak = view.findViewById(R.id.ivQuaid);
        pbPak = view.findViewById(R.id.pbQuaid);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Flag_of_Pakistan.svg/1280px-Flag_of_Pakistan.svg.png")
                .into(ivPak, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbPak.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbPak.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
