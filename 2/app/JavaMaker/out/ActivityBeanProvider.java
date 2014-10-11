package com.frame.rrbang.db;

import android.content.UriMatcher;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * create by freemaker
 */
public class ActivityBeanProvider extends BaseProvider {
    public static final String AUTHORITY = "com.frame.rrbang.db.ActivityBeanProvider";
    public static final String TABLE_PATH = "ActivityBeanTB";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(Uri.parse("content://" + AUTHORITY), TABLE_PATH);
    
    public static class Columns implements BaseColumns{
			public static final String OrderState = "OrderState";
			public static final String TransportUid = "TransportUid";
			public static final String CharityTotal = "CharityTotal";
			public static final String Type = "Type";
			public static final String Fbpics = "Fbpics";
			public static final String Order = "Order";
			public static final String Share = "Share";
			public static final String Fbpic = "Fbpic";
			public static final String Forward = "Forward";
			public static final String Diploma = "Diploma";
			public static final String Uname = "Uname";
			public static final String Fbtitle = "Fbtitle";
			public static final String Pics = "Pics";
			public static final String Feedback = "Feedback";
			public static final String Scale = "Scale";
			public static final String Pic = "Pic";
			public static final String Content = "Content";
			public static final String Desc = "Desc";
			public static final String ActivityState = "ActivityState";
			public static final String Top = "Top";
			public static final String Begtime = "Begtime";
			public static final String OrderId = "OrderId";
			public static final String City = "City";
			public static final String Title = "Title";
			public static final String State = "State";
			public static final String Transport = "Transport";
			public static final String Ctime = "Ctime";
			public static final String Id = "Id";
			public static final String Diplomadesc = "Diplomadesc";
			public static final String Endtime = "Endtime";
			public static final String Uid = "Uid";
			public static final String Expand = "Expand";
    }
    
    /**
     * Use this static method to create the table
     * It will be called by {@link DatabaseHelper} during first launch time to create DB.
     * @param db
     */
    public static void createTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_PATH + "(" + Columns._ID + " integer primary key autoincrement, "
	                + Columns.OrderState + " text, "
	                + Columns.TransportUid + " text, "
	                + Columns.CharityTotal + " text, "
	                + Columns.Type + " text, "
	                + Columns.Fbpics + " text, "
	                + Columns.Order + " text, "
	                + Columns.Share + " text, "
	                + Columns.Fbpic + " text, "
	                + Columns.Forward + " text, "
	                + Columns.Diploma + " text, "
	                + Columns.Uname + " text, "
	                + Columns.Fbtitle + " text, "
	                + Columns.Pics + " text, "
	                + Columns.Feedback + " text, "
	                + Columns.Scale + " text, "
	                + Columns.Pic + " text, "
	                + Columns.Content + " text, "
	                + Columns.Desc + " text, "
	                + Columns.ActivityState + " text, "
	                + Columns.Top + " text, "
	                + Columns.Begtime + " text, "
	                + Columns.OrderId + " text, "
	                + Columns.City + " text, "
	                + Columns.Title + " text, "
	                + Columns.State + " text, "
	                + Columns.Transport + " text, "
	                + Columns.Ctime + " text, "
	                + Columns.Id + " text, "
	                + Columns.Diplomadesc + " text, "
	                + Columns.Endtime + " text, "
	                + Columns.Uid + " text, "
	                + Columns.Expand + " text "
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

