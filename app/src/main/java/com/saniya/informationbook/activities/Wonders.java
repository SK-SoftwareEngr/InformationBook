package com.saniya.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.saniya.informationbook.R;
import com.saniya.informationbook.adapters.VP2AdapterWonders;

public class Wonders extends AppCompatActivity {
    TabLayout tbWonders;
    ViewPager2 vp2Wonders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        tbWonders = findViewById(R.id.tbWonders);
        vp2Wonders = findViewById(R.id.vp2Wonders);

        VP2AdapterWonders adapter = new VP2AdapterWonders(getSupportFragmentManager(),getLifecycle());
        vp2Wonders.setAdapter(adapter);

        TabLayoutMediator tlMed = new TabLayoutMediator(tbWonders, vp2Wonders, true, true
                , new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Great Wall of China");
                        break;
                    case 1:
                        tab.setText("Petra");
                        break;
                    case 2:
                        tab.setText("Machu Picchu");
                        break;
                    case 3:
                        tab.setText("Colosseum");
                        break;
                    case 4:
                        tab.setText("Christ the Redeemer");
                        break;
                }
            }
        });
        tlMed.attach();
    }
}