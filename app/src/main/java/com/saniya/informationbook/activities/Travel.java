package com.saniya.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.saniya.informationbook.R;
import com.saniya.informationbook.adapters.VP2AdapterTravel;

public class Travel extends AppCompatActivity {
    TabLayout tbTravel;
    ViewPager2 vp2Travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        tbTravel = findViewById(R.id.tbTravel);
        vp2Travel = findViewById(R.id.vp2Travel);

        VP2AdapterTravel ad = new VP2AdapterTravel(getSupportFragmentManager(),getLifecycle());
        vp2Travel.setAdapter(ad);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tbTravel, vp2Travel, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0){
                    tab.setText("Istanbul");
                }
                else if(position == 1){
                    tab.setText("Mexico City");
                }
                else if(position == 2){
                    tab.setText("Taipei");
                }
                else if(position == 3){
                    tab.setText("Cape Town");
                }
            }
        });
        tabLayoutMediator.attach();
    }
}