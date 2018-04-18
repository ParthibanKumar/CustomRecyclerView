package com.example.saran.customadapterrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String[] name = {"parthi", "sharan", "ravi"};
    String[] email = {"parthi@gmail.com", "sharan@gmail.com", "ravi@gmail.com"};
    String[] gender = {"M", "M", "F"};
    int[] logo = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground};

    ArrayList<ListModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        for(int i=0;i<name.length;i++)
        {
            ListModel listModel = new ListModel(name[i], email[i], gender[i]);
            arrayList.add(listModel);
        }
        adapter=new CustomAdapter(this,arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
