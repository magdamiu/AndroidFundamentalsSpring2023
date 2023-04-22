package com.example.androidfundamentalsspring2023;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanetViewHolder extends RecyclerView.ViewHolder {

    private final TextView textViewPlanetName;
    private final TextView textViewPlanetColor;
    private final ImageView imageViewPlanet;

    public PlanetViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewPlanetName = itemView.findViewById(R.id.textViewPlanetName);
        textViewPlanetColor = itemView.findViewById(R.id.textViewPlanetColor);
        imageViewPlanet = itemView.findViewById(R.id.imageViewPlanet);
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
}
