package io.github.tuckingfypos.themenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<JuiceCard> mListOne;
    RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create and populate an ArrayList of Juice Cards
        mListOne = new ArrayList<JuiceCard>();
        mListOne.add(new JuiceCard("Strawberry", "Jam Monster", "$22", "available", "100ml", "3", "Strawberry Jam + Buttered Toast"));
        mListOne.add(new JuiceCard("Blackberry", "Jam Monster", "$22", "available", "100ml", "3", "Blackberry Jam + Buttered Toast"));
        mListOne.add(new JuiceCard("Blueberry", "Jam Monster", "$22", "available", "100ml", "3", "Blueberry Jam + Buttered Toast"));

        //cast R.id as RecyclerView mRecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.view1);

        //TODO: build mListOne into view adapter
        mAdapter = new CustomRecyclerViewAdapter(mListOne);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mRecyclerView.setAdapter(mAdapter);
    }
}

