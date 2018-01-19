package com.example.micha.recyclecelebrities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.micha.recyclecelebrities.data.DatabaseHandler;
import com.example.micha.recyclecelebrities.data.LocalData;
import com.example.micha.recyclecelebrities.model.Celebrity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Celebrity> celebrities;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView view = findViewById(R.id.celebList);
        DatabaseHandler data = new DatabaseHandler(this);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        celebrities = data.getAll();
        adapter = new CustomAdapter(celebrities,this);
        view.setAdapter(adapter);
        view.setLayoutManager(manager);


        // TODO: 1/18/2018 Create overflow menu_items. Handle turning a list into a shared preference object, using putStringArray. Put only favorites in.
        // TODO: 1/18/2018 Do remove from list and remember to call the adapter changed function.  
    }
    // TODO: 1/18/2018 Create necessary Recycle views and handlers.
    // TODO: 1/19/2018 Finish Favorites page. Add Individual Celebrity pages.


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.menu_items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent intent = new Intent(getApplicationContext(), FavoriteActivity.class);
        startActivity(intent);

        return true;
    }

}
