package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class shakespage extends AppCompatActivity {
    List<shakesusers> shakesusers;
    RecyclerView recyclerView;
    shakesadapter shakesadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_shakespage);
        shakesusers=new ArrayList<>();
        shakesusers.add(new shakesusers(R.drawable.banana_shake,"Banana Shake","100"));
        shakesusers.add(new shakesusers(R.drawable.chocolate_shake,"Chocolate Shake","140"));
        shakesusers.add(new shakesusers(R.drawable.crispyorea_milkshake,"Crispy Orea Milkshake","150"));
        shakesusers.add(new shakesusers(R.drawable.milk_shake,"Milk shake","90"));
        shakesusers.add(new shakesusers(R.drawable.peanutbutter_shake,"Peanut Butter Shake","110"));
        shakesusers.add(new shakesusers(R.drawable.strawberry_shake,"Strawberry Shake","125"));
        shakesusers.add(new shakesusers(R.drawable.vanilla_shake,"Vanilla Shake","110"));
        shakesusers.add(new shakesusers(R.drawable.protein_shake,"Protein Shake","130"));
        RecyclerView recyclerView=findViewById(R.id.shakes_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        shakesadapter shakesadapter=new shakesadapter(shakesusers,shakespage.this);
        recyclerView.setAdapter(shakesadapter);
    }
}