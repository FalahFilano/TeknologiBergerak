package com.filano.tekber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class StandingsActivity extends AppCompatActivity {

    ArrayList<StandingsRow> itemList;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private StandingsAdapter standingsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standings);

        itemList = new ArrayList<>();
        generateItemList();

        recyclerView = findViewById(R.id.rvStanding);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        standingsAdapter = new StandingsAdapter(itemList);
        recyclerView.setAdapter(standingsAdapter);
    }

    public void generateItemList() {
        itemList.add(new StandingsRow(1, "China", 132, 92, 65));
        itemList.add(new StandingsRow(2, "Japan", 75, 56, 74));
        itemList.add(new StandingsRow(3, "South Korea", 49, 58, 43));
        itemList.add(new StandingsRow(4, "Indonesia", 31, 24, 25));
        itemList.add(new StandingsRow(5, "Uzbekistan", 21, 24, 22));
    }
}