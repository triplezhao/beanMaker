package com.frame.rrbang.db;

import android.content.UriMatcher;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * create by freemaker
 */
public class LoadImgBeanProvider extends BaseProvider {
    public static final String AUTHORITY = "com.frame.rrbang.db.LoadImgBeanProvider";
    public static final String TABLE_PATH = "LoadImgBeanTB";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(Uri.parse("content://" + AUTHORITY), TABLE_PATH);
    
    public static class Columns implements BaseColumns{
			public static final String Name = "Name";
			public static final String Url = "Url";
			public static final String Order = "Order";
			public static final String Ctime = "Ctime";
			public static final String Id = "Id";
			public static final String Pic = "Pic";
    }
    
    /**
     * Use this static method to create the table
     * It will be called by {@link DatabaseHelper} during first launch time to create DB.
     * @param db
     */
    public static void createTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_PATH + "(" + Columns._ID + " integer primary key autoincrement, "
	                + Columns.Name + " text, "
	                + Columns.Url + " text, "
	                + Columns.Order + " text, "
	                + Columns.Ctime + " text, "
	                + Columns.Id + " text, "
	                + Columns.Pic + " text "
                + ");");
    }
    
    private static final UriMatcher sURLMatcher = new UriMatcher(UriMatcher.NO_MATCH);
    static {
        sURLMatcher.addURI(AUTHORITY, TABLE_PATH, BaseProvider.ITEMS);
        sURLMatcher.addURI(AUTHORITY, TABLE_PATH + "/#", BaseProvider.ITEMS_ID);
    }
    
    @Override
    public String getAuthority() {
        return AUTHORITY;
    }

    @Override
    public String getTablePath() {
        return TABLE_PATH;
    }

    @Override
    public UriMatcher getUriMatcher() {
        return sURLMatcher;
    }
    
     @Override
    public Uri getContentUri() {
        return CONTENT_URI;
    }
    
}

