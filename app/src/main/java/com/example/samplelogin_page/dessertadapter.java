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

public class dessertadapter extends RecyclerView.Adapter<dessertadapter.Myviewholder4> {
    List<dessertusers> dessertusers;
    Context context;
    LayoutInflater inflater;
    public  dessertadapter(List<dessertusers> dessertusers,Context context)
    {
        this.context=context;
        this.dessertusers=dessertusers;
        this.inflater=LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public Myviewholder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview=LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_dessertadapter,parent,false);
        return new Myviewholder4(itemview);

    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder4 holder, int position) {
        holder.dessertnames.setText(dessertusers.get(position).getDessertnames());
        holder.dessertimage.setImageResource(dessertusers.get(position).getDessertimage());
        holder.dessertcost.setText(dessertusers.get(position).getDessertcost());
        holder.dessertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,payment_page.class));

            }
        });

    }

    @Override
    public int getItemCount() {
        return dessertusers.size();
    }

    public class Myviewholder4 extends RecyclerView.ViewHolder {
        TextView dessertnames,dessertcost;
        Button dessertbutton;
        ImageView dessertimage;
        public Myviewholder4(@NonNull View itemView) {
            super(itemView);
            dessertnames=itemView.findViewById(R.id.dessertnames);
            dessertimage=itemView.findViewById(R.id.dessertimage);
            dessertbutton=itemView.findViewById(R.id.dessertbutton);
            dessertcost=itemView.findViewById(R.id.dessertcost);

        }
    }
}