package com.cyou.mobileshow.db;

import android.content.UriMatcher;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * create by freemaker
 */
public class ShowGiftBeanProvider extends BaseProvider {
    public static final String AUTHORITY = "com.cyou.mobileshow.db.ShowGiftBeanProvider";
    public static final String TABLE_PATH = "ShowGiftBeanTB";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(Uri.parse("content://" + AUTHORITY), TABLE_PATH);
    
    public static class Columns implements BaseColumns{
			public static final String gifIos = "gifIos";
			public static final String giftIcon = "giftIcon";
			public static final String giftRule = "giftRule";
			public static final String giftType = "giftType";
			public static final String giftPrice = "giftPrice";
			public static final String giftName = "giftName";
			public static final String giftId = "giftId";
			public static final String gifAndroid = "gifAndroid";
    }
    
    /**
     * Use this static method to create the table
     * It will be called by {@link DatabaseHelper} during first launch time to create DB.
     * @param db
     */
    public static void createTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_PATH + "(" + Columns._ID + " integer primary key autoincrement, "
	                + Columns.gifIos + " text, "
	                + Columns.giftIcon + " text, "
	                + Columns.giftRule + " text, "
	                + Columns.giftType + " text, "
	                + Columns.giftPrice + " text, "
	                + Columns.giftName + " text, "
	                + Columns.giftId + " text, "
	                + Columns.gifAndroid + " text "
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

