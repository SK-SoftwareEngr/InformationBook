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

public class FragmentDaVinci extends Fragment {
    public static FragmentDaVinci newInstance() {
        return new FragmentDaVinci();
    }
    
    ImageView ivDaVinci;
    ProgressBar pbDaVinci;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_davinci,container,false);

        ivDaVinci = view.findViewById(R.id.ivDaVinci);
        pbDaVinci = view.findViewById(R.id.pbDaVinci);

        Picasso.get().load("https://www.theartstory.org/images20/hero/profile/da_vinci_leonardo.jpg?1")
                .into(ivDaVinci, new Callback() {
                    @Override
                    public void onSuccess(){
                        pbDaVinci.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbDaVinci.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
