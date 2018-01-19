package com.example.micha.recyclecelebrities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: 1/18/2018 Create overflow menu_items. Handle turning a list into a shared preference object, using putStringArray. Put only favorites in.
        // TODO: 1/18/2018 Do remove from list and remember to call the adapter changed function.  
    }
    // TODO: 1/18/2018 Create necessary Recycle views and handlers.


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.menu_items,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.favorites){
            Intent intent = new Intent(getApplicationContext(),FavoriteActivity.class);
            startActivity(intent);
        }
        return true;
    }
}
