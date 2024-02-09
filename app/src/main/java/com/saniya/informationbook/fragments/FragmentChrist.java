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

public class FragmentChrist extends Fragment {
    public static FragmentChrist newInstance(){
        return new FragmentChrist();
    }
    
    ImageView ivChrist;
    ProgressBar pbChrist;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_christ,container,false);

        ivChrist = view.findViewById(R.id.ivChrist);
        pbChrist = view.findViewById(R.id.pbChrist);

        Picasso.get().load("https://th.bing.com/th/id/R.d1244d62c4a1d998e1f0ec283a7bc687?rik=b6sT%2bKszFF%2fnMA&riu=http%3a%2f%2fstatic.thousandwonders.net%2fChrist.the.Redeemer.original.2544.jpg&ehk=ClRu6WQFql2u3OcH34GpDzSNAxEs9oUyAUJc7XUTe%2f8%3d&risl=&pid=ImgRaw&r=0")
                .into(ivChrist, new Callback() {
                    @Override
                    public void onSuccess(){
                        pbChrist.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError(Exception e){
                        Toast.makeText(getContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        pbChrist.setVisibility(View.GONE);
                    }
                });

        return view;
    }
}
