package com.rosol.rotemdances;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List <Dance> danceList= new ArrayList<>();
    private RecyclerView recyclerView;
    private DanceAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler_view);

        mAdapter= new DanceAdapter(danceList);
        RecyclerView.LayoutManager mLayoutManager= new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        danceDetails();
    }

    private void danceDetails() {
        Dance dance= new Dance("איך אפשר לישון");
        danceList.add(dance);

        mAdapter.notifyDataSetChanged();

    }
}
