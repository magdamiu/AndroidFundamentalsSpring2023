package com.example.androidfundamentalsspring2023.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidfundamentalsspring2023.R;

public class PlanetViewHolder extends RecyclerView.ViewHolder {

    private final TextView textViewPlanetName;
    private final TextView textViewPlanetColor;
    private final ImageView imageViewPlanet;
    private final LinearLayout itemPlanet;

    public PlanetViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewPlanetName = itemView.findViewById(R.id.textViewPlanetName);
        textViewPlanetColor = itemView.findViewById(R.id.textViewPlanetColor);
        imageViewPlanet = itemView.findViewById(R.id.imageViewPlanet);
        itemPlanet = itemView.findViewById(R.id.itemPlanet);
    }

    public TextView getTextViewPlanetName() {
        return textViewPlanetName;
    }

    public TextView getTextViewPlanetColor() {
        return textViewPlanetColor;
    }

    public ImageView getImageViewPlanet() {
        return imageViewPlanet;
    }

    public LinearLayout getItemPlanet() {
        return itemPlanet;
    }
}
