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

public class FragmentWall extends Fragment {
    public static FragmentWall newInstance(){
        return new FragmentWall();
    }
    
    ImageView ivWall;
    ProgressBar pbWall;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wall,container,false);

        ivWall = view.findViewById(R.id.ivWall);
        pbWall = view.findViewById(R.id.pbWall);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/The_Great_Wall_of_China_at_Jinshanling-edit.jpg/1280px-The_Great_Wall_of_China_at_Jinshanling-edit.jpg")
                .into(ivWall, new Callback() {
                    @Override
                    public void onSuccess(){
                        pbWall.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e){
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbWall.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
