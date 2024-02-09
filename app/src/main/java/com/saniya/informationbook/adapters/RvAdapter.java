package com.saniya.informationbook.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.saniya.informationbook.ModelClass;
import com.saniya.informationbook.R;
import com.saniya.informationbook.activities.Countries;
import com.saniya.informationbook.activities.Personalities;
import com.saniya.informationbook.activities.Travel;
import com.saniya.informationbook.activities.Wonders;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.CardViewHolder> {
    private ArrayList<ModelClass> modelList;
    private Context context;

    public RvAdapter(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_design,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ModelClass model = modelList.get(position);
        holder.tv.setText(model.getCategory());
        holder.iv.setImageResource(context.getResources().getIdentifier(model.getImageName(),"drawable",context.getPackageName()));

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position == 0){
                    Intent intent = new Intent(context, Personalities.class);
                    context.startActivity(intent);
                }
                else if(position == 1){
                    Intent intent = new Intent(context, Wonders.class);
                    context.startActivity(intent);
                }
                else if(position == 2){
                    Intent intent = new Intent(context, Travel.class);
                    context.startActivity(intent);
                }
                else if(position == 3){
                    Intent intent = new Intent(context, Countries.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount(){
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv;
        private TextView tv;
        private CardView cv;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            iv = itemView.findViewById(R.id.ivTemplate);
            tv = itemView.findViewById(R.id.tvTemplate);
            cv = itemView.findViewById(R.id.cv);
        }
    }
}
