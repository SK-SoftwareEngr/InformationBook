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

public class FragmentQuaid extends Fragment {
    public static FragmentQuaid newInstance() {
        return new FragmentQuaid();
    }
    
    ImageView ivQuaid;
    ProgressBar pbQuaid;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quaid,container,false);

        ivQuaid = view.findViewById(R.id.ivQuaid);
        pbQuaid = view.findViewById(R.id.pbQuaid);

        Picasso.get().load("https://i.brecorder.com/wp-content/uploads/2017/12/quaid-e-azam-1024.jpg")
                .into(ivQuaid, new Callback() {
                    @Override
                    public void onSuccess(){
                        pbQuaid.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbQuaid.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
