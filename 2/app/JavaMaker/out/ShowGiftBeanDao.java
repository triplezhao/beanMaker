package com.cyou.mobileshow.db;

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;
import com.cyou.mobileshow.db.ShowGiftBean;

/**
 * create by freemaker
 */
public class ShowGiftBeanDao {
    public static final String TAG = "ShowGiftBeanDao";
    public static final String TABLE_NAME = "ShowGiftBeanTB";
    public SQLiteOpenHelper mOpenHelper;
    
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
    
     public String[] allProjection = new String[]{
     	Columns._ID,
			Columns.gifIos
			Columns.giftIcon
			Columns.giftRule
			Columns.giftType
			Columns.giftPrice
			Columns.giftName
			Columns.giftId
			Columns.gifAndroid
		
		};
    
    
    public ShowGiftBeanDao(Context context) {
        mOpenHelper = DatabaseHelper.getInstance(context);
        L.d(TAG, "In onCreate method, create the provider: " + this
                + ", and DatabaseHelper: " + mOpenHelper);
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
    
    public long insert(ShowGiftBean bean) {
        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        ContentValues values = ShowGiftBean.bean2CV(bean);
        long id = db.insert(TABLE_NAME, null, values);
        db.close();
        return id;
    }

    public void delete(String columnsName,String value) {
        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        String selection = columnsName + " = ?";
        String[] selectionArgs = {value};
        db.delete(TABLE_NAME, selection, selectionArgs);
        db.close();
    }

    public void update(String columnsName,ShowGiftBean bean) {
        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        ContentValues values = ShowGiftBean.bean2CV(bean);
        String selection = columnsName + " = ?";
        String[] selectionArgs = {"id"};

        db.update(TABLE_NAME, values, selection, selectionArgs);
        db.close();
    }

    public ShowGiftBean getShowGiftBeanByKey(String columnsName,String key) {
        ShowGiftBean bean = null;
        SQLiteDatabase db = mOpenHelper.getReadableDatabase();
        String selection = columnsName + " = ?";
        String[] selectionArgs = {key};
        Cursor c = db.query(
                TABLE_NAME, allProjection, selection, selectionArgs, null, null, null);
        if (c != null && c.getCount() > 0) {
            while (c.moveToNext()) {
                bean = ShowGiftBean.cursor2bean(c);
                break;
            }
        }
        if (c != null) {
            c.close();
        }
        db.close();
        return bean;
    }

    public List<ShowGiftBean> getShowGiftBeanList() {
        List<ShowGiftBean> list = new ArrayList<Cache>();
        SQLiteDatabase db = mOpenHelper.getReadableDatabase();
        Cursor c = db.query(
                TABLE_NAME, allProjection, null, null, null, null, null);
        if (c != null && c.getCount() > 0) {
            Cache bean = null;
            while (c.moveToNext()) {
                bean = ShowGiftBean.cursor2bean(c);
                list.add(bean);
            }
        }
        if (c != null) {
            c.close();
        }
        db.close();
        return list;
    }
    
}

