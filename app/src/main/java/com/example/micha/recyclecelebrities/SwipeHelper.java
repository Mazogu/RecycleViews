package com.example.micha.recyclecelebrities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.example.micha.recyclecelebrities.data.DatabaseContract;
import com.example.micha.recyclecelebrities.data.DatabaseHandler;
import com.example.micha.recyclecelebrities.model.Celebrity;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static android.support.v7.widget.helper.ItemTouchHelper.DOWN;
import static android.support.v7.widget.helper.ItemTouchHelper.LEFT;
import static android.support.v7.widget.helper.ItemTouchHelper.RIGHT;
import static android.support.v7.widget.helper.ItemTouchHelper.UP;

/**
 * Created by micha on 1/19/2018.
 */

public class SwipeHelper extends ItemTouchHelper.Callback {
    private CustomAdapter adapter;
    private Context context;

    public SwipeHelper(CustomAdapter adapter, Context context) {
        this.adapter = adapter;
        this.context = context;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return makeMovementFlags(UP|DOWN, LEFT|RIGHT);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        final int initialPosition = viewHolder.getAdapterPosition();
        final int nextPosition = target.getAdapterPosition();
        List<Celebrity> list = adapter.getCelebrities();
        Celebrity moveCelebrity = list.get(initialPosition);
        if(initialPosition > nextPosition){
            for(int i = initialPosition; i > nextPosition; i--){
                Collections.swap(list,i,i-1);
            }
        }
        else{
            if(initialPosition < nextPosition){
                for (int i = initialPosition; i < nextPosition ; i++) {
                    Collections.swap(list,i,i++);
                }
            }
        }
        adapter.notifyItemMoved(initialPosition,nextPosition);
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        final int position = viewHolder.getAdapterPosition();
        if (direction == LEFT || direction == RIGHT) {
            Celebrity celebrity = adapter.getCelebrities().get(position);
            adapter.getCelebrities().remove(position);
            celebrity.setFavorite("0");
            DatabaseHandler db = new DatabaseHandler(context);
            db.update(celebrity);
            adapter.notifyItemRemoved(position);
        }
    }
}
