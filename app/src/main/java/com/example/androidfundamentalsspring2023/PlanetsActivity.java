package com.example.androidfundamentalsspring2023;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PlanetsActivity extends AppCompatActivity {
    private List<Planet> planets;
    private RecyclerView recyclerViewPlanets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);

        recyclerViewPlanets = findViewById(R.id.recyclerViewPlanets);
        populatePlanets();
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        recyclerViewPlanets.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewPlanets.setAdapter(new PlanetsAdapter(planets));
    }

    // The Plan
    // step 1: add RecyclerView in the xml file - DONE
    // step 2: create the data source (including a new object Planet) - DONE
    // step 3: create xml layout for item - DONE
    // step 4: create the ViewHolder (1:1 with the item) - DONE
    // step 5: create the Adapter and use the ViewHolder - DONE
    // step 6: define the LayoutManager - DONE
    // step 7: combine the info - set Adapter & LayoutManager -

    private void populatePlanets() {
        planets = new ArrayList<>();
        planets.add(new Planet("Earth", "Blue", "https://cdn-icons-png.flaticon.com/512/2240/2240692.png"));
        planets.add(new Planet("Mars", "Red", "https://cdn-icons-png.flaticon.com/512/2530/2530892.png"));
        planets.add(new Planet("Pluto", "Blue", "https://cdn-icons-png.flaticon.com/512/2534/2534297.png"));
        planets.add(new Planet("Saturn", "Blue", "https://cdn-icons-png.flaticon.com/512/1751/1751904.png"));
        planets.add(new Planet("Uranus", "Blue", "https://cdn-icons-png.flaticon.com/512/6989/6989438.png"));
        planets.add(new Planet("Neptune", "Blue", ""));
        planets.add(new Planet("Mercury", "Grey", ""));
        planets.add(new Planet("Jupiter", "Brown", ""));
        planets.add(new Planet("Venus", "Brown and Grey", ""));
    }
}