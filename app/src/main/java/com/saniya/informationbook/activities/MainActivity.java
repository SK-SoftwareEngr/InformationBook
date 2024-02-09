package com.saniya.informationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.saniya.informationbook.ModelClass;
import com.saniya.informationbook.R;
import com.saniya.informationbook.adapters.RvAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<ModelClass> arrayList;
    private RvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        arrayList = new ArrayList<>();

        ModelClass mc1 = new ModelClass("personalities","Famous Personalities");
        ModelClass mc2 = new ModelClass("wonders","Wonders of the World");
        ModelClass mc3 = new ModelClass("travel","Travel Destinations");
        ModelClass mc4 = new ModelClass("flags","Countries");

        arrayList.add(mc1);
        arrayList.add(mc2);
        arrayList.add(mc3);
        arrayList.add(mc4);

        adapter = new RvAdapter(arrayList, MainActivity.this);
        rv.setAdapter(adapter);
    }
}