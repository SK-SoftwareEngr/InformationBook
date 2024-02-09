package com.saniya.informationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.saniya.informationbook.R;
import com.saniya.informationbook.adapters.VP2AdapterCountries;

public class Countries extends AppCompatActivity {

    TabLayout tbCountries;
    ViewPager2 vp2Countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tbCountries = findViewById(R.id.tbCountries);
        vp2Countries = findViewById(R.id.vp2Countries);

        VP2AdapterCountries vpAD = new VP2AdapterCountries(getSupportFragmentManager(),getLifecycle());
        vp2Countries.setAdapter(vpAD);

        TabLayoutMediator tlMed = new TabLayoutMediator(tbCountries, vp2Countries, true, true
                , new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("United Kingdom");
                        break;
                    case 1:
                        tab.setText("United States");
                        break;
                    case 2:
                        tab.setText("France");
                        break;
                    case 3:
                        tab.setText("Italy");
                        break;
                    case 4:
                        tab.setText("Pakistan");
                        break;
                }
            }
        });
        tlMed.attach();
    }
}