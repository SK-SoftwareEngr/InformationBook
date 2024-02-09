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

public class FragmentIstanbul extends Fragment {
    public static FragmentIstanbul newInstance() {
        return new FragmentIstanbul();
    }
    
    ImageView ivIstanbul;
    ProgressBar pbIstanbul;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_istanbul,container,false);

        ivIstanbul = view.findViewById(R.id.ivIstanbul);
        pbIstanbul = view.findViewById(R.id.pbIstanbul);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/53/Bosphorus_Bridge_%28235499411%29.jpeg/1920px-Bosphorus_Bridge_%28235499411%29.jpeg")
                .into(ivIstanbul, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbIstanbul.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbIstanbul.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
