package com.example.micha.recyclecelebrities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.micha.recyclecelebrities.data.DatabaseHandler;
import com.example.micha.recyclecelebrities.model.Celebrity;

import java.util.List;

/**
 * Created by micha on 1/18/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CelebrityHolder> {

    List<Celebrity> celebrities;
    Context context;

    public CustomAdapter(List<Celebrity> celebrities){
        this.celebrities = celebrities;
    }

    public CustomAdapter(List<Celebrity> celebrities, Context context){
        this.celebrities = celebrities;
        this.context = context;
    }

    @Override
    public CelebrityHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        return new CelebrityHolder(view);
    }



    @Override
    public void onBindViewHolder(final CelebrityHolder holder, final int position) {
        holder.celebName.setText(celebrities.get(position).getName());
        holder.celebAge.setText(celebrities.get(position).getAge());
        holder.celebGender.setText(celebrities.get(position).getGender());
        holder.thumbnail.setImageResource(Integer.parseInt(celebrities.get(position).getImageID()));
        switch (celebrities.get(position).getFavorite()){
            case "0":
                holder.button.setImageResource(R.drawable.heart_empty);
                break;
            case "1":
                holder.button.setImageResource(R.drawable.heart_full);
                break;
        }
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Celebrity currentCeleb = celebrities.get(position);
                DatabaseHandler data = new DatabaseHandler(context);
                switch (currentCeleb.getFavorite()){
                    case "0":
                        currentCeleb.setFavorite("1");
                        data.update(currentCeleb);
                        holder.button.setImageResource(R.drawable.heart_full);
                        break;
                    case "1":
                        currentCeleb.setFavorite("0");
                        data.update(currentCeleb);
                        holder.button.setImageResource(R.drawable.heart_empty);
                        break;
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return celebrities.size();
    }

    public class CelebrityHolder extends RecyclerView.ViewHolder{
        private final TextView celebName,celebAge,celebGender;
        private final ImageButton button;
        private final ImageView thumbnail;

        public CelebrityHolder(View itemView) {
            super(itemView);
            celebName = itemView.findViewById(R.id.celebName);
            celebAge = itemView.findViewById(R.id.celebAge);
            celebGender = itemView.findViewById(R.id.celebGender);
            button = itemView.findViewById(R.id.favbtn);
            thumbnail = itemView.findViewById(R.id.celebImage);
        }

    }

}
