package com.makeman.p2;

import android.content.UriMatcher;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * create by freemaker
 */
public class YourBeanProvider extends BaseProvider {
    public static final String AUTHORITY = "com.mobile17173.game.YourBeanProvider";
    public static final String TABLE_PATH = "YourBean";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(Uri.parse("content://" + AUTHORITY), TABLE_PATH);
    
    public static class Columns implements BaseColumns{
			public static final String endtime = "endtime";
			public static final String scale = "scale";
			public static final String orderexpand = "orderexpand";
			public static final String aid = "aid";
			public static final String type = "type";
			public static final String orderaddr = "orderaddr";
			public static final String ordercontacts = "ordercontacts";
			public static final String feedback = "feedback";
			public static final String orderfeedback = "orderfeedback";
			public static final String title = "title";
			public static final String order = "order";
			public static final String transport = "transport";
			public static final String forward = "forward";
			public static final String expand = "expand";
			public static final String fbpic = "fbpic";
			public static final String begtime = "begtime";
			public static final String top = "top";
			public static final String fbpics = "fbpics";
			public static final String uname = "uname";
			public static final String orderctime = "orderctime";
			public static final String orderphone = "orderphone";
			public static final String fbtitle = "fbtitle";
			public static final String pic = "pic";
			public static final String content = "content";
			public static final String diploma = "diploma";
			public static final String orderexpress = "orderexpress";
			public static final String orderstateex = "orderstateex";
			public static final String orderid = "orderid";
			public static final String diplomadesc = "diplomadesc";
    }
    
    /**
     * Use this static method to create the table
     * It will be called by {@link DatabaseHelper} during first launch time to create DB.
     * @param db
     */
    public static void createTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_PATH + "(" + Columns._ID + " integer primary key autoincrement, "
	                + Columns.endtime + " text, "
	                + Columns.scale + " text, "
	                + Columns.orderexpand + " text, "
	                + Columns.aid + " text, "
	                + Columns.type + " text, "
	                + Columns.orderaddr + " text, "
	                + Columns.ordercontacts + " text, "
	                + Columns.feedback + " text, "
	                + Columns.orderfeedback + " text, "
	                + Columns.title + " text, "
	                + Columns.order + " text, "
	                + Columns.transport + " text, "
	                + Columns.forward + " text, "
	                + Columns.expand + " text, "
	                + Columns.fbpic + " text, "
	                + Columns.begtime + " text, "
	                + Columns.top + " text, "
	                + Columns.fbpics + " text, "
	                + Columns.uname + " text, "
	                + Columns.orderctime + " text, "
	                + Columns.orderphone + " text, "
	                + Columns.fbtitle + " text, "
	                + Columns.pic + " text, "
	                + Columns.content + " text, "
	                + Columns.diploma + " text, "
	                + Columns.orderexpress + " text, "
	                + Columns.orderstateex + " text, "
	                + Columns.orderid + " text, "
	                + Columns.diplomadesc + " text "
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

