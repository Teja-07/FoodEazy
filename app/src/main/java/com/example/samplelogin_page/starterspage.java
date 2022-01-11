package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class starterspage extends AppCompatActivity {
    List<starterusers> starterusers;
    RecyclerView recyclerView;
    starteradapter starteradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_starterspage);
        starterusers=new ArrayList<>();
        starterusers.add(new starterusers(R.drawable.cheese_frenfhfries,"Cheese French Fries","120"));
        starterusers.add(new starterusers(R.drawable.chichken_barbecue,"Chicken Barbecue","130"));
        starterusers.add(new starterusers(R.drawable.chichken_manchurian,"Chicken Manchuria","110"));
        starterusers.add(new starterusers(R.drawable.chichken_noodles,"Chicken Noodles","90"));
        starterusers.add(new starterusers(R.drawable.chicken_roll,"Chicken Roll","110"));
        starterusers.add(new starterusers(R.drawable.chilly_chicken_manchuria,"Chilly Chicken Manchuria","140"));
        starterusers.add(new starterusers(R.drawable.chicken_frankie,"Chicken Frankie","95"));
        starterusers.add(new starterusers(R.drawable.crispy_bbq,"crispy Barbecue","170"));
        starterusers.add(new starterusers(R.drawable.crispy_frenchfries,"Crispy French Fries","145"));
        starterusers.add(new starterusers(R.drawable.egg_noodles,"Egg Noodles","130"));
        starterusers.add(new starterusers(R.drawable.ginger_noodles,"Ginger Noodles","120"));
        starterusers.add(new starterusers(R.drawable.gobi_manchuria,"Gobi Mnachuria","140"));
        starterusers.add(new starterusers(R.drawable.hakka_noodles,"Hakka Noodles","120"));
        starterusers.add(new starterusers(R.drawable.juiceceg_manchurian,"Juice Veg Manchuria","110"));
        starterusers.add(new starterusers(R.drawable.prawn_noodles,"Prawn Noodles","180"));
        starterusers.add(new starterusers(R.drawable.spicefrench_fries,"Spice French Noodles","170"));
        starterusers.add(new starterusers(R.drawable.veg_frankie,"Veg Frankie","80"));
        starterusers.add(new starterusers(R.drawable.veg_manchurian,"Veg Manchuria","70"));
        starterusers.add(new starterusers(R.drawable.veg_noodles,"Veg Noodles","90"));
        starterusers.add(new starterusers(R.drawable.veg_roll,"Veg roll","100"));





        RecyclerView recyclerView=findViewById(R.id.starter_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        starteradapter starteradapter=new starteradapter(starterusers,starterspage.this);
        recyclerView.setAdapter(starteradapter);

    }
}