package com.saniya.informationbook.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.saniya.informationbook.R;
import com.saniya.informationbook.adapters.VP2AdapterPersonalities;

public class Personalities extends AppCompatActivity {
    TabLayout tbPersonalities;
    ViewPager2 vp2Personalities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalities);

        tbPersonalities = findViewById(R.id.tbPersonalities);
        vp2Personalities = findViewById(R.id.vp2Personalities);

        VP2AdapterPersonalities ad = new VP2AdapterPersonalities(getSupportFragmentManager(),getLifecycle());
        vp2Personalities.setAdapter(ad);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tbPersonalities, vp2Personalities, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0){
                    tab.setText("Quaid-e-Azam");
                }
                else if(position == 1){
                    tab.setText("Nelson Mandela");
                }
                else if(position == 2){
                    tab.setText("Leonardo da Vinci");
                }
                else if(position == 3){
                    tab.setText("Isaac Newton");
                }
            }
        });
        tabLayoutMediator.attach();
    }
}