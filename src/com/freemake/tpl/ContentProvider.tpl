package ${providerpackage};

import android.content.UriMatcher;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * create by freemaker
 */
public class ${className}Provider extends BaseProvider {
    public static final String AUTHORITY = "${providerpackage}.${className}Provider";
    public static final String TABLE_PATH = "${className}TB";
    public static final Uri CONTENT_URI = Uri.withAppendedPath(Uri.parse("content://" + AUTHORITY), TABLE_PATH);
    
    public static class Columns implements BaseColumns{
		<#list properties as pro>
			public static final ${pro.proType} ${pro.proName} = "${pro.proName}";
		</#list>
    }
    
    /**
     * Use this static method to create the table
     * It will be called by {@link DatabaseHelper} during first launch time to create DB.
     * @param db
     */
    public static void createTable(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_PATH + "(" + Columns._ID + " integer primary key autoincrement, "
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

