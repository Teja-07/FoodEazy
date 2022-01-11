package com.example.samplelogin_page;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class pizzaadapter extends RecyclerView.Adapter<pizzaadapter.Myviewholder3> {
    List<pizzausers> pizzausers;
    Context context;
    LayoutInflater inflater;
    public  pizzaadapter(List<pizzausers> pizzausers,Context context)
    {
        this.context=context;
        this.pizzausers=pizzausers;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public pizzaadapter.Myviewholder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemview=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_pizzaadapter,parent,false);
       return new Myviewholder3(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull pizzaadapter.Myviewholder3 holder, int position) {
        holder.pizzanames.setText(pizzausers.get(position).getPizzanames());
        holder.pizzacost.setText(pizzausers.get(position).getPizzacost());
        holder.pizzaimage.setImageResource(pizzausers.get(position).getPizzaimage());
        holder.pizzabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,payment_page.class));

            }
        });

    }

    @Override
    public int getItemCount() {
        return pizzausers.size();
    }

    public class Myviewholder3 extends RecyclerView.ViewHolder {
        TextView pizzanames,pizzacost;
        ImageView  pizzaimage;
        Button pizzabutton;
        public Myviewholder3(@NonNull View itemView) {
            super(itemView);
            pizzaimage=itemView.findViewById(R.id.pizzaimage);
            pizzabutton=itemView.findViewById(R.id.pizzabutton);
            pizzacost=itemView.findViewById(R.id.pizzacost);
            pizzanames=itemView.findViewById(R.id.pizzanames);
        }
    }
}
