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

public class FragmentPetra extends Fragment {
    public static FragmentPetra newInstance(){
        return new FragmentPetra();
    }
    
    ImageView ivPetra;
    ProgressBar pbPetra;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_petra,container,false);

        ivPetra = view.findViewById(R.id.ivPetra);
        pbPetra = view.findViewById(R.id.pbPetra);

        Picasso.get().load("https://cdn.odysseytraveller.com/app/uploads/2017/03/iStock-510406434-copy.jpg")
                .into(ivPetra, new Callback() {
                    @Override
                    public void onSuccess(){
                        pbPetra.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbPetra.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
