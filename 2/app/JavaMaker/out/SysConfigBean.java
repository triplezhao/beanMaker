package com.frame.rrbang.bean;

//import
import java.util.Date;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import android.database.Cursor;
import com.frame.rrbang.db.SysConfigBeanProvider;

import android.content.ContentValues;

public class SysConfigBean implements Serializable{

	//propslist
	private String Interface;
	private String Url;
	private String Utime;
	private String Id;
	private String About;
	private String Expand;

	//set get list	
	public void setInterface(String Interface){
		this.Interface=Interface;
	}
	
	public String getInterface(){
		return this.Interface;
	}
	
	public void setUrl(String Url){
		this.Url=Url;
	}
	
	public String getUrl(){
		return this.Url;
	}
	
	public void setUtime(String Utime){
		this.Utime=Utime;
	}
	
	public String getUtime(){
		return this.Utime;
	}
	
	public void setId(String Id){
		this.Id=Id;
	}
	
	public String getId(){
		return this.Id;
	}
	
	public void setAbout(String About){
		this.About=About;
	}
	
	public String getAbout(){
		return this.About;
	}
	
	public void setExpand(String Expand){
		this.Expand=Expand;
	}
	
	public String getExpand(){
		return this.Expand;
	}
	

	//other
	//createFromCursor
    public static SysConfigBean  createFromCursor(Cursor cursor){
     if (cursor == null) return null;
        SysConfigBean bean = new SysConfigBean();
			bean.setInterface(cursor.getString(cursor.getColumnIndex(SysConfigBeanProvider.Columns.Interface)));
			bean.setUrl(cursor.getString(cursor.getColumnIndex(SysConfigBeanProvider.Columns.Url)));
			bean.setUtime(cursor.getString(cursor.getColumnIndex(SysConfigBeanProvider.Columns.Utime)));
			bean.setId(cursor.getString(cursor.getColumnIndex(SysConfigBeanProvider.Columns.Id)));
			bean.setAbout(cursor.getString(cursor.getColumnIndex(SysConfigBeanProvider.Columns.About)));
			bean.setExpand(cursor.getString(cursor.getColumnIndex(SysConfigBeanProvider.Columns.Expand)));
		return bean;
	}
	
    //createFromJSON
    public static SysConfigBean  createFromJSON(JSONObject json)throws JSONException{
     if (json == null) return null;
        SysConfigBean bean = new SysConfigBean();
			bean.setInterface(json.optString("Interface"));
			bean.setUrl(json.optString("Url"));
			bean.setUtime(json.optString("Utime"));
			bean.setId(json.optString("Id"));
			bean.setAbout(json.optString("About"));
			bean.setExpand(json.optString("Expand"));
		return bean;
	}
    //buildContentValues
    public static ContentValues buildContentValues(SysConfigBean bean) {
        ContentValues values = new ContentValues();
        values.put(SysConfigBeanProvider.Columns.Interface, bean.getInterface());
        values.put(SysConfigBeanProvider.Columns.Url, bean.getUrl());
        values.put(SysConfigBeanProvider.Columns.Utime, bean.getUtime());
        values.put(SysConfigBeanProvider.Columns.Id, bean.getId());
        values.put(SysConfigBeanProvider.Columns.About, bean.getAbout());
        values.put(SysConfigBeanProvider.Columns.Expand, bean.getExpand());
        return values;
    }

}