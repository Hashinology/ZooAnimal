package com.example.hashi.zooanimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hashi.zooanimal.beans.Animal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    List<Animal> animals = new ArrayList<>();
    private RecyclerView recyclerView;
    private AnimalsAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(this);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new AnimalsAdapter(animals);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        populateMovieDetails();
        mAdapter.notifyDataSetChanged();

    }


    private void populateMovieDetails() {
        animals.add(new Animal("Cheetah", "Dangerous, Safes"));
        animals.add(new Animal("Lions", "Dangerous, Safes"));
        animals.add(new Animal("Hores", "Dangerous, Safes"));
        animals.add(new Animal("Monkeys", "Dangerous, Safes"));
        animals.add(new Animal("Cats", "Dangerous, Safes"));

    }


}
