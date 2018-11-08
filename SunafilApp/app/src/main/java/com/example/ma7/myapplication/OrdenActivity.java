package com.example.ma7.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ma7.myapplication.Adapter.CustomAdapter;
import com.example.ma7.myapplication.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class OrdenActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    List<Item> items;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordenes);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        initItem();
    }

    private void initItem() {
        items = new ArrayList<>();
        items.add(new Item(0, "00000001-DD", "CASINOS LAS VEGAS S.A.C", "AV. CHIRIMORAS 151 - MADGALENA"));
        items.add(new Item(1, "00000002-DD", "CASINOS ROYAL S.A.C" ,"AV. ANGAMOS - MIRAFLORES"));
        items.add(new Item(1, "00000003-DD", "CASINOS HOLIWOOD S.A.C", "AV.PASEO CASTILLA - SURCO"));

        adapter = new CustomAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }
}
