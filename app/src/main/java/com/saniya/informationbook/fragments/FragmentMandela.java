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

public class FragmentMandela extends Fragment {
    public static FragmentMandela newInstance() {
        return new FragmentMandela();
    }
    
    ImageView ivMandela;
    ProgressBar pbMandela;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mandela,container,false);

        ivMandela = view.findViewById(R.id.ivMandela);
        pbMandela = view.findViewById(R.id.pbMandela);

        Picasso.get().load("https://cdn.thecollector.com/wp-content/uploads/2022/09/photo-life-of-nelson-mandela-south-africa-flag.jpg?width=1400&quality=70")
                .into(ivMandela, new Callback() {
                    @Override
                    public void onSuccess(){
                        pbMandela.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbMandela.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
