package com.example.numbertranslations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class GujaratiTranslation extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarati_translation);
        ArrayList<CardDataType> gujaratiList = new ArrayList<>();
        gujaratiList.add(new CardDataType("One","એક",R.raw.gone));
        gujaratiList.add(new CardDataType("Two","બે",R.raw.gtwo));
        gujaratiList.add(new CardDataType("Three","ત્રણ",R.raw.gthree));
        gujaratiList.add(new CardDataType("Four","ચાર",R.raw.gfour));
        gujaratiList.add(new CardDataType("Five","પાંચ",R.raw.gfive));
        gujaratiList.add(new CardDataType("Six","છ",R.raw.gsix));
        gujaratiList.add(new CardDataType("Seven","સાત",R.raw.gseven));
        gujaratiList.add(new CardDataType("Eight","આઠ",R.raw.geight));
        gujaratiList.add(new CardDataType("Nine","નવ",R.raw.gnine));
        gujaratiList.add(new CardDataType("Ten","દસ",R.raw.gten));

        recyclerView = findViewById(R.id.gujaratiRecycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new CustomAdapter(gujaratiList);
        recyclerView.setAdapter(adapter);

    }
}