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

public class FragmentUS extends Fragment {
    public static FragmentUS newInstance() {
        return new FragmentUS();
    }
    
    ImageView ivUS;
    ProgressBar pbUS;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_us,container,false);

        ivUS = view.findViewById(R.id.ivUS);
        pbUS = view.findViewById(R.id.pbUS);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Flag_of_the_United_States_%28DoS_ECA_Color_Standard%29.svg/1920px-Flag_of_the_United_States_%28DoS_ECA_Color_Standard%29.svg.png")
                .into(ivUS, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbUS.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbUS.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
