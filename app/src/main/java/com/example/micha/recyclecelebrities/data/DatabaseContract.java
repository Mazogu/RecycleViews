package com.example.micha.recyclecelebrities.data;

import android.provider.BaseColumns;

/**
 * Created by micha on 1/19/2018.
 */

public class DatabaseContract {
    public static final String CREATE_CELEBRITY_TABLE = "CREATE TABLE " + Celebrity.TABLE_NAME + "(" +
            Celebrity.NAME + " TEXT PRIMARY KEY," + Celebrity.AGE + " TEXT," + Celebrity.GENDER + " Text," + Celebrity.FAVORITE +" Text,"
            + Celebrity.IMAGE + " TEXT)";

    public static class Celebrity implements BaseColumns {
        public static final String TABLE_NAME = "Celebrity";
        public static final String NAME = "name";
        public static final String AGE = "age";
        public static final String GENDER = "gender";
        public static final String IMAGE = "image";
        public static final String FAVORITE = "favorite";
    }
}
