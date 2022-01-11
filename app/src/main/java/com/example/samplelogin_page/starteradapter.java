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

public class starteradapter extends RecyclerView.Adapter<starteradapter.Myviewholder5> {
    List<starterusers> starterusers;
    Context context;
    LayoutInflater inflater;
    public starteradapter(List<starterusers> starterusers,Context context)
    {
        this.context=context;
        this.starterusers=starterusers;
        this.inflater=LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public Myviewholder5 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_starteradapter,parent,false);
        return new Myviewholder5(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder5 holder, int position) {
        holder.starternames.setText(starterusers.get(position).getStarternames());
        holder.starterimage.setImageResource(starterusers.get(position).getStarterimage());
        holder.startercost.setText(starterusers.get(position).getStartercost());
        holder.starterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,payment_page.class));

            }
        });

    }

    @Override
    public int getItemCount() {
        return starterusers.size();
    }

    public class Myviewholder5 extends RecyclerView.ViewHolder {
        TextView starternames,startercost;
        ImageView starterimage;
        Button starterbutton;
        public Myviewholder5(@NonNull View itemView) {
            super(itemView);
            starterbutton=itemView.findViewById(R.id.starterbutton);
            startercost=itemView.findViewById(R.id.startercost);
            starterimage=itemView.findViewById(R.id.starterimage);
            starternames=itemView.findViewById(R.id.starternames);
        }
    }
}