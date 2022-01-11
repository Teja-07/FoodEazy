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

public class shakesadapter extends RecyclerView.Adapter<shakesadapter.Myviewholder6> {
    List<shakesusers> shakesusers;
    Context context;
    LayoutInflater inflater;
    public shakesadapter(List<shakesusers> shakesusers,Context context)
    {
        this.context=context;
        this.shakesusers=shakesusers;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public shakesadapter.Myviewholder6 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview =LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_shakesadapter,parent,false);
        return new Myviewholder6(itemview);

    }

    @Override
    public void onBindViewHolder(@NonNull shakesadapter.Myviewholder6 holder, int position) {
        holder.shakesnames.setText(shakesusers.get(position).getShakesnames());
        holder.shakesimage.setImageResource(shakesusers.get(position).getShakesimage());
        holder.shakescost.setText(shakesusers.get(position).getShakescost());
        holder.shakesbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context,payment_page.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return shakesusers.size();
    }

    public class Myviewholder6 extends RecyclerView.ViewHolder {
        TextView shakesnames,shakescost;
        ImageView shakesimage;
        Button shakesbutton;
        public Myviewholder6(@NonNull View itemView) {
            super(itemView);
            shakescost=itemView.findViewById(R.id.shakescost);
            shakesbutton=itemView.findViewById(R.id.shakesbutton);
            shakesimage=itemView.findViewById(R.id.shakesimage);
            shakesnames=itemView.findViewById(R.id.shakesnames);
        }
    }
}