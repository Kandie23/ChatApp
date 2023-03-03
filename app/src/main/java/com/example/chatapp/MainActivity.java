package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    // Adapterview:
    RecyclerView recyclerView;

    // Data Source
    ChatModel[] myListData;

    //Adapter

    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        myListData = new ChatModel[]{

                new ChatModel("John Doe",R.drawable.profile1, "Hi"),
                new ChatModel("Sensa", R.drawable.profile2, "vipi pakule"),
                new ChatModel("Amon", R.drawable.profile3, "fpl link"),
                new ChatModel("Trizah", R.drawable.profile4, "sasa babe"),
                new ChatModel("Kipchii", R.drawable.profile5, "boss tokea eldi"),
                new ChatModel("Wendy", R.drawable.profile6, "Birthday Mkuu"),
                new ChatModel("Alistar", R.drawable.profile7, "Ikubambe king"),
                new ChatModel("Kiptui", R.drawable.profle8, "Ikubambe sana"),
                new ChatModel("KIbe", R.drawable.profile9, "Niko nax sahii"),
                new ChatModel("Brayo", R.drawable.profile10, "Ni brayo bro"),
                new ChatModel("Daudi", R.drawable.profile11, "Yes!")








        };


        adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

    }
}