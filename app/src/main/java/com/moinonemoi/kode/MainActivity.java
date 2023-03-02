package com.moinonemoi.kode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recView;
    private ArrayList<Worker> workers = new ArrayList<Worker>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeDate();

        recView = findViewById(R.id.recyclerView);
        WorkerAdapter workerAdapter = new WorkerAdapter(this,workers);
        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(workerAdapter);
    }

    private void initializeDate(){
        workers.add(new Worker(R.drawable.cat,"Иван","analyst","bi"));
    }
}