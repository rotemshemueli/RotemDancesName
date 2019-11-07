package com.rosol.rotemdances;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Dance> danceList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DanceAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new DanceAdapter(danceList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        danceDetails();
    }

    private void danceDetails() {
        Dance dance = new Dance("איך אפשר לישון");
        danceList.add(dance);

        dance = new Dance("אני מנגן");
        danceList.add(dance);

        dance = new Dance("בוא נחזור הביתה בשלום");
        danceList.add(dance);

        dance = new Dance("הרועה הבודד");
        danceList.add(dance);

        dance = new Dance("ילדה ומטריה");
        danceList.add(dance);

        dance = new Dance("יעל");
        danceList.add(dance);

        dance = new Dance("כמה טוב בבית");
        danceList.add(dance);

        dance = new Dance("כשיש לך חבר");
        danceList.add(dance);

        dance = new Dance("לדבר עם חיות");
        danceList.add(dance);

        dance = new Dance("לונה פארק");
        danceList.add(dance);

        dance = new Dance("מה נועלים");
        danceList.add(dance);

        dance = new Dance("מתנות בהזדמנות");
        danceList.add(dance);

        dance = new Dance("שיר אהבה ממוחשב");
        danceList.add(dance);

        dance = new Dance("שלום היא מילה שימושית");
        danceList.add(dance);

        dance = new Dance("תנו לחיות לחיות");
        danceList.add(dance);

        mAdapter.notifyDataSetChanged();

    }
}
