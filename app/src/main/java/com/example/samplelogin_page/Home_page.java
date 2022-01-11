package com.example.samplelogin_page;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class Home_page extends AppCompatActivity {
    CardView biryani,burgercardview,pizzacardview,dessert,startercardviewhomepage,shakescardhomepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home_page);
        biryani=(CardView) findViewById(R.id.biryanicardview);
        burgercardview=(CardView)findViewById(R.id.burgercardview);
        pizzacardview=(CardView) findViewById(R.id.pizzacardview);
        startercardviewhomepage=(CardView) findViewById(R.id.startercardviewhomepage);
        shakescardhomepage=(CardView) findViewById(R.id.shakescardhomepage);
        dessert=(CardView) findViewById(R.id.dessert);
        biryani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home_page.this,Biryanipage.class);
                startActivity(intent);
            }
        });
        burgercardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home_page.this,Bugerpage.class);
                startActivity(intent);
            }
        });
        pizzacardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home_page.this,pizzapage.class);
                startActivity(intent);
            }
        });
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home_page.this,dessertpage.class);
                startActivity(intent);
            }
        });
        startercardviewhomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home_page.this,starterspage.class);
                startActivity(intent);
            }
        });
        shakescardhomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Home_page.this,shakespage.class);
                startActivity(intent);
            }
        });


    }
}