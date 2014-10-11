package com.frame.rrbang.bean;

//import
import java.util.Date;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import android.database.Cursor;
import com.frame.rrbang.db.LoadImgBeanProvider;

import android.content.ContentValues;

public class LoadImgBean implements Serializable{

	//propslist
	private String Name;
	private String Url;
	private String Order;
	private String Ctime;
	private String Id;
	private String Pic;

	//set get list	
	public void setName(String Name){
		this.Name=Name;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public void setUrl(String Url){
		this.Url=Url;
	}
	
	public String getUrl(){
		return this.Url;
	}
	
	public void setOrder(String Order){
		this.Order=Order;
	}
	
	public String getOrder(){
		return this.Order;
	}
	
	public void setCtime(String Ctime){
		this.Ctime=Ctime;
	}
	
	public String getCtime(){
		return this.Ctime;
	}
	
	public void setId(String Id){
		this.Id=Id;
	}
	
	public String getId(){
		return this.Id;
	}
	
	public void setPic(String Pic){
		this.Pic=Pic;
	}
	
	public String getPic(){
		return this.Pic;
	}
	

	//other
	//createFromCursor
    public static LoadImgBean  createFromCursor(Cursor cursor){
     if (cursor == null) return null;
        LoadImgBean bean = new LoadImgBean();
			bean.setName(cursor.getString(cursor.getColumnIndex(LoadImgBeanProvider.Columns.Name)));
			bean.setUrl(cursor.getString(cursor.getColumnIndex(LoadImgBeanProvider.Columns.Url)));
			bean.setOrder(cursor.getString(cursor.getColumnIndex(LoadImgBeanProvider.Columns.Order)));
			bean.setCtime(cursor.getString(cursor.getColumnIndex(LoadImgBeanProvider.Columns.Ctime)));
			bean.setId(cursor.getString(cursor.getColumnIndex(LoadImgBeanProvider.Columns.Id)));
			bean.setPic(cursor.getString(cursor.getColumnIndex(LoadImgBeanProvider.Columns.Pic)));
		return bean;
	}
	
    //createFromJSON
    public static LoadImgBean  createFromJSON(JSONObject json)throws JSONException{
     if (json == null) return null;
        LoadImgBean bean = new LoadImgBean();
			bean.setName(json.optString("Name"));
			bean.setUrl(json.optString("Url"));
			bean.setOrder(json.optString("Order"));
			bean.setCtime(json.optString("Ctime"));
			bean.setId(json.optString("Id"));
			bean.setPic(json.optString("Pic"));
		return bean;
	}
    //buildContentValues
    public static ContentValues buildContentValues(LoadImgBean bean) {
        ContentValues values = new ContentValues();
        values.put(LoadImgBeanProvider.Columns.Name, bean.getName());
        values.put(LoadImgBeanProvider.Columns.Url, bean.getUrl());
        values.put(LoadImgBeanProvider.Columns.Order, bean.getOrder());
        values.put(LoadImgBeanProvider.Columns.Ctime, bean.getCtime());
        values.put(LoadImgBeanProvider.Columns.Id, bean.getId());
        values.put(LoadImgBeanProvider.Columns.Pic, bean.getPic());
        return values;
    }

}