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

import java.awt.font.TextAttribute;
import java.util.List;

public class burgeradapter extends RecyclerView.Adapter<burgeradapter.Myviewholder2> {
    List<burgerusers> burgerusers;
    Context context;
    LayoutInflater inflater;
    public burgeradapter(List<burgerusers> burgerusers,Context context) {
        this.burgerusers=burgerusers;
        this.context=context;
        this.inflater=LayoutInflater.from(context);

    }


    @NonNull
    @Override
    public burgeradapter.Myviewholder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_burgeradapter,parent,false);
       return new Myviewholder2(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder2 holder, int position) {
        holder.burgernames.setText(burgerusers.get(position).getBurgernames());
        holder.burgercost.setText(burgerusers.get(position).getBurgercost());
        holder.burgerimage.setImageResource(burgerusers.get(position).getBurgerimage());
        holder.burgerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,payment_page.class));

            }
        });

    }

    @Override
    public int getItemCount() {
        return burgerusers.size();
    }

    public class Myviewholder2 extends RecyclerView.ViewHolder {
        TextView burgernames,burgercost;
        ImageView burgerimage;
        Button burgerbutton;
        public Myviewholder2(@NonNull View itemView) {
            super(itemView);
            burgercost=itemView.findViewById(R.id.burgercost);
            burgernames=itemView.findViewById(R.id.burgernames);
            burgerimage=itemView.findViewById(R.id.burgerimage);
            burgerbutton=itemView.findViewById(R.id.burgerbutton);


        }
    }
}
