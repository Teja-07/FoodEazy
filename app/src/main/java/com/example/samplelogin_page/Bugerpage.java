package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Bugerpage extends AppCompatActivity {
    List<burgerusers> burgerusers;
    RecyclerView recyclerView;
  burgeradapter burgeradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_bugerpage);
        burgerusers=new ArrayList<>();
        burgerusers.add(new burgerusers(R.drawable.veg_burger,"120","Veg Burger"));
        burgerusers.add(new burgerusers(R.drawable.ultimate_veg_burger,"140","Ulitmate Veg Burger"));
        burgerusers.add(new burgerusers(R.drawable.vegan_burger,"145","Vegan Burger"));
        burgerusers.add(new burgerusers(R.drawable.nonveg_burger,"150","Non Veg Burger"));
        burgerusers.add(new burgerusers(R.drawable.doublenonveg_burger,"160","Double Non Veg Burger"));
        burgerusers.add(new burgerusers(R.drawable.grilled_non_veg_burger,"155","Grilled Non Veg Burger"));
        burgerusers.add(new burgerusers(R.drawable.hamburger,"170","HamBurger"));
        burgerusers.add(new burgerusers(R.drawable.turkish_chicken_burger,"220","Turkish chicken Burger"));
        burgerusers.add(new burgerusers(R.drawable.classic_chicken_burger,"200","Class chicken Burger"));
        RecyclerView recyclerView=findViewById(R.id.burger_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        burgeradapter burgeradapter=new burgeradapter(burgerusers,Bugerpage.this);
        recyclerView.setAdapter(burgeradapter);


    }
}