package com.example.androidfundamentalsspring2023;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.androidfundamentalsspring2023.activities.Activity1;
import com.example.androidfundamentalsspring2023.fragments.BlankFragment;
import com.example.androidfundamentalsspring2023.fragments.NavigationActivity;
import com.example.androidfundamentalsspring2023.recyclerview.PlanetsActivity;
import com.example.androidfundamentalsspring2023.retrofit.GithubActivity;
import com.example.androidfundamentalsspring2023.room.WordsActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    // snake case => constante in Java si res files si valori
    // camila cu o cocoasa => nume de metode si campuri (variabile de context sau clasa)
    // camila cu doua cocoase => nume de clase

    protected static final String URL_ANDROID = "https://www.android.com/";
    private static final String ACTIVITY = "MainActivity";
    private WebView webViewSample;
    private Spinner spinnerPlanets;

    private List<String> dataSourcePlanets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webViewSample = findViewById(R.id.webViewAndroid);
        webViewSample.getSettings().setJavaScriptEnabled(true);
        webViewSample.loadUrl(URL_ANDROID);

        spinnerPlanets = findViewById(R.id.spinnerPlanets);
        spinnerPlanets.setOnItemSelectedListener(this);
        populateSpinner();

        addFragmentInDynamicMode(R.id.placeholderFragments, BlankFragment.newInstance("Dynamic Sample", ""));
    }

    private void addFragmentInDynamicMode(int placeholderId, Fragment fragment) {
        // get the FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // define the transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // replace placeholder with the Fragment
        fragmentTransaction.replace(placeholderId, fragment);

        // commit transaction
        fragmentTransaction.commit();
    }

    // step 1: add the Spinner in the xml - DONE
    // step 2: get the data source (list of strings -> list of planets) - DONE
    // step 3: create the default adapter - DONE
    // step 4: set the adapter to the Spinner

    private void populateSpinner() {
        dataSourcePlanets = getPlanets();
        ArrayAdapter<String> adapterForPlanets = getPlanetsAdapter(dataSourcePlanets);
        spinnerPlanets.setAdapter(adapterForPlanets);
    }

    private List<String> getPlanets() {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Venus");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Pluto");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Mercury");
        return planets;
    }

    private ArrayAdapter<String> getPlanetsAdapter(List<String> planets) {
        return new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planets);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedPlanet = dataSourcePlanets.get(position);
        Log.e(ACTIVITY, selectedPlanet);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void openPlanetsOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, PlanetsActivity.class);
        startActivity(intent);
    }

    public void openActivity1OnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Activity1.class);
        startActivity(intent);
    }

    public void openGithubActivityOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, GithubActivity.class);
        startActivity(intent);
    }

    public void openNavigationDrawerOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, NavigationActivity.class);
        startActivity(intent);
    }

    public void openRoomActivityOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, WordsActivity.class);
        startActivity(intent);
    }
}