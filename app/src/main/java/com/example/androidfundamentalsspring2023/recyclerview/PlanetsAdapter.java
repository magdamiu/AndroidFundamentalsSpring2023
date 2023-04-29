package com.example.androidfundamentalsspring2023.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidfundamentalsspring2023.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlanetsAdapter extends RecyclerView.Adapter<PlanetViewHolder> {

    private List<Planet> planets;

    public PlanetsAdapter(List<Planet> planetsList) {
        planets = planetsList;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.planet_item, parent, false);
        return new PlanetViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        Planet currentPlanet = planets.get(position);
        holder.getTextViewPlanetName().setText(currentPlanet.getName());
        holder.getTextViewPlanetColor().setText(currentPlanet.getColor());
        holder.getItemPlanet().setBackgroundResource(R.color.white);
        if (currentPlanet.getUrlImage() != null & currentPlanet.getUrlImage().length() > 0) {
            Picasso.get().load(currentPlanet.getUrlImage())
                    .placeholder(R.drawable.android)
                    .error(R.drawable.close)
                    .into(holder.getImageViewPlanet());
        }
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }
}
