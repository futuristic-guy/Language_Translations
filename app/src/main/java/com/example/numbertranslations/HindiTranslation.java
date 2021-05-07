package com.example.numbertranslations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HindiTranslation extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_translation);


        ArrayList<CardDataType> hindiList = new ArrayList<>();
        hindiList.add(new CardDataType("One","एक",R.raw.hone));
        hindiList.add(new CardDataType("Two","दो",R.raw.hinditwo));
        hindiList.add(new CardDataType("Three","तीन",R.raw.hthree));
        hindiList.add(new CardDataType("Four","चार",R.raw.hindifour));
        hindiList.add(new CardDataType("Five","पांच",R.raw.hindifive));
        hindiList.add(new CardDataType("Six","छह",R.raw.hsix));
        hindiList.add(new CardDataType("Seven","सात",R.raw.hseven));
        hindiList.add(new CardDataType("Eight","आठ",R.raw.height));
        hindiList.add(new CardDataType("Nine","नौ",R.raw.hnine));
        hindiList.add(new CardDataType("Ten","दस",R.raw.hten));

        recyclerView = findViewById(R.id.hindiRecycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new CustomAdapter(hindiList);
        recyclerView.setAdapter(adapter);

    }
}