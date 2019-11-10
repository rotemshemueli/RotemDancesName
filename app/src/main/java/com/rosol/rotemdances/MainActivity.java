package com.rosol.rotemdances;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements DanceAdapter.OnClickListenerItem {

    private List<Dance> danceList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DanceAdapter mAdapter;
    public TextView mDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        mDetails=findViewById(R.id.details);

        mAdapter = new DanceAdapter(danceList,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
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

    public void openWebPage(String url){
        Uri webPage= Uri.parse(url);
        Intent intent=new Intent(Intent.ACTION_VIEW,webPage);
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }

    @Override
    public void onItemClick(int position) {
        Dance dance= danceList.get(position);
        switch (dance.getDanceTitle()){
            case "איך אפשר לישון":
                openWebPage("https://www.youtube.com/watch?v=hbNURSR7mjQ");
                break;
            case "אני מנגן":
                openWebPage("https://www.youtube.com/watch?v=tUlU1qeo2TM");
                break;
            case "בוא נחזור הביתה בשלום":
                openWebPage("https://www.youtube.com/watch?v=2_XZL07OsJ8");
                break;
            case "הרועה הבודד":
                openWebPage("https://www.youtube.com/watch?v=fnQn0l4RabM");
                break;
            case "ילדה ומטריה":
                openWebPage("https://www.youtube.com/watch?v=jjxP47gqaJY");
                break;
            case "יעל":
                openWebPage("https://www.youtube.com/watch?v=UDvXgslbeiA");
                break;
            case "כמה טוב בבית":
                openWebPage("https://www.youtube.com/watch?v=VEkwbACEIZU");
                break;
            case "כשיש לך חבר":
                openWebPage("https://www.youtube.com/watch?v=tSujXKcXQ5g");
                break;
            case "לדבר עם חיות":
                openWebPage("https://www.youtube.com/watch?v=NT8JHM5dGnE");
                break;
            case "לונה פארק":
                openWebPage("https://www.youtube.com/watch?v=V_UyTklDzqw");
                break;
            case "מה נועלים":
                openWebPage("https://www.youtube.com/watch?v=JtO0nMBc7D8");
                break;
            case "מתנות בהזדמנות":
                openWebPage("https://www.youtube.com/watch?v=0hcoda06hZ4");
                break;
            case "שיר אהבה ממוחשב":
                openWebPage("https://www.youtube.com/watch?v=klndbBKIYSI");
                break;
            case "שלום היא מילה שימושית":
                openWebPage("https://www.youtube.com/watch?v=L157twUKmmc");
                break;
            case "תנו לחיות לחיות":
                openWebPage("https://www.youtube.com/watch?v=-TKkovM5mIs");
                break;






        }

    }
}
