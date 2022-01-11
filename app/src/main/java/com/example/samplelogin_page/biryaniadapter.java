package com.example.samplelogin_page;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class biryaniadapter extends RecyclerView.Adapter<biryaniadapter.Myviewholder1> {
    List<biryaniusers> biryaniusers;
    Context context;
    LayoutInflater inflater;
    public  biryaniadapter(List<biryaniusers> biryaniusers,Context context)
    {
        this.biryaniusers=biryaniusers;
        this.context=context;
        this.inflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public Myviewholder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View itemView=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_biryanirecyclerview,parent,false);
       return new Myviewholder1(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder1 holder, int position) {
        holder.biryanicost.setText(biryaniusers.get(position).getBiryanicost());
        holder.biryaninames.setText(biryaniusers.get(position).getBiryaninames());
        holder.biryaniimage.setImageResource(biryaniusers.get(position).getBiryaniimage());
        holder.biryanibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,payment_page.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return biryaniusers.size();
    }

    public class Myviewholder1 extends RecyclerView.ViewHolder {
        TextView  biryaninames,biryanicost;;
        ImageView biryaniimage;
        Button biryanibutton;
        public Myviewholder1(@NonNull View itemView) {
            super(itemView);
            biryanicost =itemView.findViewById(R.id.biryanicost);
            biryaninames=itemView.findViewById(R.id.biryaninames);
            biryaniimage=itemView.findViewById(R.id.biryaniimage);
            biryanibutton =itemView.findViewById(R.id.biryanibutton);
        }
    }
}
