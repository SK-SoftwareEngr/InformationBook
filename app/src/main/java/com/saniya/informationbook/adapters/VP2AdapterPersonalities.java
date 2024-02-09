package com.saniya.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.saniya.informationbook.fragments.FragmentDaVinci;
import com.saniya.informationbook.fragments.FragmentMandela;
import com.saniya.informationbook.fragments.FragmentNewton;
import com.saniya.informationbook.fragments.FragmentQuaid;

public class VP2AdapterPersonalities extends FragmentStateAdapter {
    public VP2AdapterPersonalities(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = FragmentQuaid.newInstance();
                break;
            case 1:
                fragment = FragmentMandela.newInstance();
                break;
            case 2:
                fragment = FragmentDaVinci.newInstance();
                break;
            case 3:
                fragment = FragmentNewton.newInstance();
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
