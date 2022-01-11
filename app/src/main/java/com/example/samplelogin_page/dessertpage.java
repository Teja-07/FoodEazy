package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class dessertpage extends AppCompatActivity {
    List<dessertusers> dessertusers;
    RecyclerView recyclerView;
    dessertadapter dessertadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dessertpage);
        dessertusers=new ArrayList<>();
        dessertusers.add(new dessertusers("Vanilla Icecream","40",R.drawable.vinella_icecream));
        dessertusers.add(new dessertusers("ButterScotch","55",R.drawable.butterscoach_icecream));
        dessertusers.add(new dessertusers("Chocolate Icecream","70",R.drawable.chocolate_icecream));
        dessertusers.add(new dessertusers("Choconut Icecream","85",R.drawable.choconut));
        dessertusers.add(new dessertusers("Coconut Icecream","60",R.drawable.coconut_icecream));
        dessertusers.add(new dessertusers("Orea Icecream","100",R.drawable.orea_icecream));
        dessertusers.add(new dessertusers("Strawberry Icecream","90",R.drawable.strawberry_icecream));
        dessertusers.add(new dessertusers("Vegan Icecream","80",R.drawable.vegan_icecream));
        dessertusers.add(new dessertusers("Coldstone Icecream","130",R.drawable.coldstone_creamery));
        dessertusers.add(new dessertusers("Dryfruit Icecream","95",R.drawable.dryfruitcream));

        RecyclerView recyclerView=findViewById(R.id.dessert_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        dessertadapter dessertadapter=new dessertadapter(dessertusers,dessertpage.this);
        recyclerView.setAdapter(dessertadapter);

    }
}