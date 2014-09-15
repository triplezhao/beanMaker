package com2;

import android.content.UriMatcher;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * create by freemaker
 */
public class TestBeanProvider extends BaseProvider {
    public static final String AUTHORITY = "com.mobile17173.game.TestBean";
    public static final String TABLE_PATH = "TestBean";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(Uri.parse("content://" + AUTHORITY), TABLE_PATH);
    
    public static class Columns implements BaseColumns{
			public static final String jinbi = "jinbi";
			public static final String icon = "icon";
			public static final String masterLevel = "masterLevel";
			public static final String masterId = "masterId";
			public static final String status = "status";
			public static final String fanLevel = "fanLevel";
			public static final String fanOffset = "fanOffset";
			public static final String nextFanLevel = "nextFanLevel";
			public static final String masterNick = "masterNick";
			public static final String sign = "sign";
			public static final String receiveFlag = "receiveFlag";
			public static final String cover = "cover";
			public static final String nextMasterLevel = "nextMasterLevel";
			public static final String userId = "userId";
			public static final String masterNo = "masterNo";
			public static final String liveLimit = "liveLimit";
			public static final String domain = "domain";
			public static final String userName = "userName";
			public static final String jindou = "jindou";
			public static final String masterOffset = "masterOffset";
    }
    
    /**
     * Use this static method to create the table
     * It will be called by {@link DatabaseHelper} during first launch time to create DB.
     * @param db
     */
    public static void createTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_PATH + "(" + Columns._ID + " integer primary key autoincrement, "
	                + Columns.jinbi + " text, "
	                + Columns.icon + " text, "
	                + Columns.masterLevel + " text, "
	                + Columns.masterId + " text, "
	                + Columns.status + " text, "
	                + Columns.fanLevel + " text, "
	                + Columns.fanOffset + " text, "
	                + Columns.nextFanLevel + " text, "
	                + Columns.masterNick + " text, "
	                + Columns.sign + " text, "
	                + Columns.receiveFlag + " text, "
	                + Columns.cover + " text, "
	                + Columns.nextMasterLevel + " text, "
	                + Columns.userId + " text, "
	                + Columns.masterNo + " text, "
	                + Columns.liveLimit + " text, "
	                + Columns.domain + " text, "
	                + Columns.userName + " text, "
	                + Columns.jindou + " text, "
	                + Columns.masterOffset + " text "
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

