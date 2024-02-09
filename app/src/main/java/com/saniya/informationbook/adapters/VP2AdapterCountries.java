package com.saniya.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.saniya.informationbook.fragments.FragmentFrance;
import com.saniya.informationbook.fragments.FragmentItaly;
import com.saniya.informationbook.fragments.FragmentPak;
import com.saniya.informationbook.fragments.FragmentUK;
import com.saniya.informationbook.fragments.FragmentUS;

public class VP2AdapterCountries extends FragmentStateAdapter {
    public VP2AdapterCountries(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentUK.newInstance();
                break;
            case 1:
                fragment = FragmentUS.newInstance();
                break;
            case 2:
                fragment = FragmentFrance.newInstance();
                break;
            case 3:
                fragment = FragmentItaly.newInstance();
                break;
            case 4:
                fragment = FragmentPak.newInstance();
                break;
            default:
                return null;
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
