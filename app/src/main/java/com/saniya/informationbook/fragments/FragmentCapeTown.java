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

public class FragmentCapeTown extends Fragment {
    public static FragmentCapeTown newInstance() {
        return new FragmentCapeTown();
    }
    
    ImageView ivCapeTown;
    ProgressBar pbCapeTown;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cape_town,container,false);

        ivCapeTown = view.findViewById(R.id.ivCapeTown);
        pbCapeTown = view.findViewById(R.id.pbCapeTown);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/0/04/Cape_Town%2C_Waterfront_-_panoramio.jpg")
                .into(ivCapeTown, new Callback() {
                    @Override
                    public void onSuccess() {
                        pbCapeTown.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbCapeTown.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
