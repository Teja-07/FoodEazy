package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Biryanipage extends AppCompatActivity {
    List<biryaniusers> biryaniusers;
    RecyclerView recyclerView;
    biryaniadapter biryaniadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_biryanipage);
        biryaniusers=new ArrayList<>();
        biryaniusers.add(new biryaniusers(R.drawable.veg_biri_logo,"Veg Biryani","120/-"));
        biryaniusers.add(new biryaniusers(R.drawable.bir_logo,"Chicken Biryani","150/-"));
        biryaniusers.add(new biryaniusers(R.drawable.gunturdum_biryani,"Guntur  Biryani","170/-"));
        biryaniusers.add(new biryaniusers(R.drawable.hyddum_biryani,"Hyd Dum Biryani","200/-"));
        biryaniusers.add(new biryaniusers(R.drawable.mushroom_biryani,"Mushroom Biryani","180/-"));
        biryaniusers.add(new biryaniusers(R.drawable.mutton_biryani,"Mutton Biryani","120/-"));
        biryaniusers.add(new biryaniusers(R.drawable.natukodi_biryani,"NatuKodi Biryani","220/-"));
        biryaniusers.add(new biryaniusers(R.drawable.paneer_biryani,"Paneer Biryani","150/-"));


        RecyclerView recyclerView=findViewById(R.id.recylerview_biryani);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        biryaniadapter biryaniadapter=new biryaniadapter(biryaniusers,Biryanipage.this);
        recyclerView.setAdapter(biryaniadapter);

    }
}