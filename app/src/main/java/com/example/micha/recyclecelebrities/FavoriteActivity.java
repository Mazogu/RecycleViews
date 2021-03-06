package com.example.micha.recyclecelebrities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.MenuItem;

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
        CustomAdapter custom = new CustomAdapter(favorites);
        SwipeHelper swiping = new SwipeHelper(custom,this);
        ItemTouchHelper itemtouch = new ItemTouchHelper(swiping);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        list.setLayoutManager(manager);
        list.setAdapter(custom);
        itemtouch.attachToRecyclerView(list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        return true;
    }
}
