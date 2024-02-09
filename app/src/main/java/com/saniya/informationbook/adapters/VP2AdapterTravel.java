package com.saniya.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.saniya.informationbook.fragments.FragmentCapeTown;
import com.saniya.informationbook.fragments.FragmentIstanbul;
import com.saniya.informationbook.fragments.FragmentMexicoCity;
import com.saniya.informationbook.fragments.FragmentTaipei;


public class VP2AdapterTravel extends FragmentStateAdapter {
    public VP2AdapterTravel(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentIstanbul.newInstance();
                break;
            case 1:
                fragment = FragmentMexicoCity.newInstance();
                break;
            case 2:
                fragment = FragmentTaipei.newInstance();
                break;
            case 3:
                fragment = FragmentCapeTown.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
