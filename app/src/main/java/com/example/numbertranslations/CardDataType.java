package com.example.numbertranslations;

import android.net.Uri;

public class CardDataType {

    private String text;
    private String translation;
    private int number;


    public CardDataType(String dataToBeTranslated,String translationOfData,int audioName){
        text = dataToBeTranslated;
        translation = translationOfData;
        number = audioName;
    }

    public String getText() {
        return text;
    }

    public String getTranslation() {
        return translation;
    }

    public int getNumber() {
        return number;
    }
}
