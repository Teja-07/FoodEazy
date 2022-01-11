package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class pizzapage extends AppCompatActivity {
    List<pizzausers> pizzausers;
    RecyclerView recyclerView;
    pizzaadapter pizzaadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_pizzapage);
        pizzausers=new ArrayList<>();
        pizzausers.add(new pizzausers(R.drawable.vegpizza,"120","veg pizza"));
        pizzausers.add(new pizzausers(R.drawable.grilledveg_pizza,"130","veg pizza"));
        pizzausers.add(new pizzausers(R.drawable.garlic_veg_pizza,"140","Garlic Veg Pizza"));
        pizzausers.add(new pizzausers(R.drawable.cheesevegpizza,"150","Cheese veg pizza"));
        pizzausers.add(new pizzausers(R.drawable.thincrustveg_pizza,"170","Thin crust veg pizza"));
        pizzausers.add(new pizzausers(R.drawable.nonvegpizza,"135","non veg pizza"));
        pizzausers.add(new pizzausers(R.drawable.tandoorchicken_pizza,"155","Tandoorchicken pizza"));
        pizzausers.add(new pizzausers(R.drawable.cheesechickenpizza,"190","cheese chicken pizza"));
        pizzausers.add(new pizzausers(R.drawable.tavapizza,"200","Tava pizza"));
        pizzausers.add(new pizzausers(R.drawable.periperi_chickenpizza,"220","Periperi pizza"));
        RecyclerView recyclerView=findViewById(R.id.pizza_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        pizzaadapter pizzaadapter=new pizzaadapter(pizzausers,pizzapage.this);
        recyclerView.setAdapter(pizzaadapter);
    }
}