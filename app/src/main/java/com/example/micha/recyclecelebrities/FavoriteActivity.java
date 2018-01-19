package com.example.micha.recyclecelebrities;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.example.micha.recyclecelebrities.data.DatabaseHandler;
import com.example.micha.recyclecelebrities.data.LocalData;
import com.example.micha.recyclecelebrities.model.Celebrity;

import java.util.ArrayList;
import java.util.List;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        RecyclerView list = findViewById(R.id.favoriteList);
        SharedPreferences shared = getSharedPreferences("myFavorites", MODE_PRIVATE);
        List<Celebrity> start = LocalData.getCelebrity();
        DatabaseHandler data = new DatabaseHandler(this);
        List<Celebrity> favorites = data.getFavorites();

        ItemTouchHelper helper = new ItemTouchHelper();
        CustomAdapter custom = new CustomAdapter(favorites);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        list.setLayoutManager(manager);
        list.setAdapter(custom);

    }
}
