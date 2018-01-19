package com.example.micha.recyclecelebrities.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.micha.recyclecelebrities.model.Celebrity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by micha on 1/19/2018.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    public DatabaseHandler(Context context) {
        super(context, "Celebrity Database", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        List<Celebrity> list = LocalData.getCelebrity();
        Celebrity test = list.get(0);
        Log.d("Who cares", "onCreate: FJIOEJIOFJWIEO:FJIE:FJEIW");
        database.execSQL(DatabaseContract.CREATE_CELEBRITY_TABLE);

        for (Celebrity person : list) {
            ContentValues content = new ContentValues();
            content.put(DatabaseContract.Celebrity.NAME, person.getName());
            content.put(DatabaseContract.Celebrity.AGE, person.getAge());
            content.put(DatabaseContract.Celebrity.GENDER, person.getGender());
            content.put(DatabaseContract.Celebrity.FAVORITE, person.getFavorite());
            content.put(DatabaseContract.Celebrity.IMAGE, person.getImageID());
            database.insert(DatabaseContract.Celebrity.TABLE_NAME, null, content);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void update(Celebrity celebrity) {
        SQLiteDatabase data = getWritableDatabase();
        ContentValues content = new ContentValues();
        content.put(DatabaseContract.Celebrity.FAVORITE, celebrity.getFavorite());
        data.update(DatabaseContract.Celebrity.TABLE_NAME, content, DatabaseContract.Celebrity.NAME + "='"
                + celebrity.getName() + "'", null);
        data.close();
    }

    public List<Celebrity> getFavorites() {
        ArrayList<Celebrity> celebList = new ArrayList<>();
        SQLiteDatabase database = getWritableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + DatabaseContract.Celebrity.TABLE_NAME + " WHERE "
                + DatabaseContract.Celebrity.FAVORITE + "=1", null);

        if (cursor.moveToFirst()) {
            do {
                Celebrity celebrity = new Celebrity(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),cursor.getString(4));
                celebList.add(celebrity);
            } while (cursor.moveToNext());
        }
        database.close();
        return celebList;
    }

    public List<Celebrity> getAll() {
        ArrayList<Celebrity> celebList = new ArrayList<>();
        SQLiteDatabase database = getWritableDatabase();
        Cursor cursor = database.rawQuery("SELECT * FROM " + DatabaseContract.Celebrity.TABLE_NAME , null);

        if (cursor.moveToFirst()) {
            do {
                Celebrity celebrity = new Celebrity(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),cursor.getString(4));
                celebList.add(celebrity);
            } while (cursor.moveToNext());
        }

        Log.d("GET ALL", "getAll: "+celebList.toString());
        database.close();
        return celebList;
    }
}
