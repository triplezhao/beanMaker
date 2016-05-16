package ${daopackage};

import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;
import ${package}.${className};

/**
 * create by freemaker
 */
public class ${className}Dao {
    public static final String TAG = "${className}Dao";
    public static final String TABLE_NAME = "${className}TB";
    public SQLiteOpenHelper mOpenHelper;
    
    public static class Columns implements BaseColumns{
		<#list properties as pro>
			public static final ${pro.proType} ${pro.proName} = "${pro.proName}";
		</#list>
    }
    
     public String[] allProjection = new String[]{
     				Columns._ID,
     	<#list properties as pro>
			 <#if pro_has_next>
	                Columns.${pro.proName},
					</#if>
					<#if !pro_has_next>
	                Columns.${pro.proName}
	                </#if>
		</#list>
		
		};
    
    
    public ${className}Dao(Context context) {
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
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(" + Columns._ID + " integer primary key autoincrement, "
                <#list properties as pro>
	                <#if pro_has_next>
	                + Columns.${pro.proName} + " text, "
					</#if>
					<#if !pro_has_next>
	                + Columns.${pro.proName} + " text "
	                </#if>
				</#list>
                + ");");
    }
    
    public long insert(${className} bean) {
        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        ContentValues values = ${className}.bean2CV(bean);
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

    public void update(String columnsName,${className} bean) {
        SQLiteDatabase db = mOpenHelper.getWritableDatabase();
        ContentValues values = ${className}.bean2CV(bean);
        String selection = columnsName + " = ?";
        String[] selectionArgs = {"id"};

        db.update(TABLE_NAME, values, selection, selectionArgs);
        db.close();
    }

    public ${className} get${className}ByKey(String columnsName,String key) {
        ${className} bean = null;
        SQLiteDatabase db = mOpenHelper.getReadableDatabase();
        String selection = columnsName + " = ?";
        String[] selectionArgs = {key};
        Cursor c = db.query(
                TABLE_NAME, allProjection, selection, selectionArgs, null, null, null);
        if (c != null && c.getCount() > 0) {
            while (c.moveToNext()) {
                bean = ${className}.cursor2Bean(c);
                break;
            }
        }
        if (c != null) {
            c.close();
        }
        db.close();
        return bean;
    }

    public List<${className}> get${className}List() {
        List<${className}> list = new ArrayList<${className}>();
        SQLiteDatabase db = mOpenHelper.getReadableDatabase();
        Cursor c = db.query(
                TABLE_NAME, allProjection, null, null, null, null, null);
        if (c != null && c.getCount() > 0) {
            ${className} bean = null;
            while (c.moveToNext()) {
                bean = ${className}.cursor2Bean(c);
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

