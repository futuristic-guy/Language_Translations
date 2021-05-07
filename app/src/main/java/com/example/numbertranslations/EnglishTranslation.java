package com.example.numbertranslations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class EnglishTranslation extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_translation);
        ArrayList<CardDataType> englishList = new ArrayList<>();
        englishList.add(new CardDataType("One","One",R.raw.one));
        englishList.add(new CardDataType("Two","Two",R.raw.two));
        englishList.add(new CardDataType("Three","Three",R.raw.three));
        englishList.add(new CardDataType("Four","Four",R.raw.four));
        englishList.add(new CardDataType("Five","Five",R.raw.five));
        englishList.add(new CardDataType("Six","Six",R.raw.six));
        englishList.add(new CardDataType("Seven","Seven",R.raw.seven));
        englishList.add(new CardDataType("Eight","Eight",R.raw.eight));
        englishList.add(new CardDataType("Nine","Nine",R.raw.nine));
        englishList.add(new CardDataType("Ten","Ten",R.raw.ten));

        recyclerView = findViewById(R.id.englishRecycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new CustomAdapter(englishList);
        recyclerView.setAdapter(adapter);

    }
}