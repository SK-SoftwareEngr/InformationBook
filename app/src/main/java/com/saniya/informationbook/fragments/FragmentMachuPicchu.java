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

public class FragmentMachuPicchu extends Fragment {
    public static FragmentMachuPicchu newInstance() {
        return new FragmentMachuPicchu();
    }
    
    ImageView ivMachu;
    ProgressBar pbMachu;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_machu_picchu,container,false);

        ivMachu = view.findViewById(R.id.ivMachu);
        pbMachu = view.findViewById(R.id.pbMachu);

        Picasso.get().load("https://th.bing.com/th/id/R.26f406c571d464e72d2ecca07898641a?rik=rQrz7DUZD72R9Q&pid=ImgRaw&r=0")
                .into(ivMachu, new Callback() {
                    @Override
                    public void onSuccess(){
                        pbMachu.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbMachu.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
