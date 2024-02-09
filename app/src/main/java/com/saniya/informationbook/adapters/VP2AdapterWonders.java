package com.saniya.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.saniya.informationbook.fragments.FragmentChrist;
import com.saniya.informationbook.fragments.FragmentColosseum;
import com.saniya.informationbook.fragments.FragmentMachuPicchu;
import com.saniya.informationbook.fragments.FragmentPetra;
import com.saniya.informationbook.fragments.FragmentWall;

public class VP2AdapterWonders extends FragmentStateAdapter {
    public VP2AdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentWall.newInstance();
                break;
            case 1:
                fragment = FragmentPetra.newInstance();
                break;
            case 2:
                fragment = FragmentMachuPicchu.newInstance();
                break;
            case 3:
                fragment = FragmentColosseum.newInstance();
                break;
            case 4:
                fragment = FragmentChrist.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount(){
        return 5;
    }
}
