package com.example.numbertranslations;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    ArrayList<CardDataType>  cardList;
    CustomAdapter(ArrayList<CardDataType> list){
        cardList = list;
    }

    public static  class CustomViewHolder extends RecyclerView.ViewHolder{

        private TextView textData,textTranslation;
        private ImageButton playButton;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            textData = itemView.findViewById(R.id.textView);
            textTranslation = itemView.findViewById(R.id.translation);
            playButton = itemView.findViewById(R.id.imageButton2);
        }


    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards,parent,false);
        CustomViewHolder viewHolder = new CustomViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        CardDataType cardObj = cardList.get(position);
        holder.textData.setText(cardObj.getText());
        holder.textTranslation.setText(cardObj.getTranslation());

        holder.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MediaPlayer m = MediaPlayer.create(v.getContext(),cardObj.getNumber());
                m.start();
                holder.playButton.setImageResource(R.drawable.pause);

                m.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        holder.playButton.setImageResource(R.drawable.play);
                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }


}
