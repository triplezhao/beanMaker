package com.frame.rrbang.bean;

//import
import java.util.Date;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import android.database.Cursor;
import com.frame.rrbang.db.ActivityBeanProvider;

import android.content.ContentValues;

public class ActivityBean implements Serializable{

	//propslist
	private String OrderState;
	private String TransportUid;
	private String CharityTotal;
	private String Type;
	private String Fbpics;
	private String Order;
	private String Share;
	private String Fbpic;
	private String Forward;
	private String Diploma;
	private String Uname;
	private String Fbtitle;
	private String Pics;
	private String Feedback;
	private String Scale;
	private String Pic;
	private String Content;
	private String Desc;
	private String ActivityState;
	private String Top;
	private String Begtime;
	private String OrderId;
	private String City;
	private String Title;
	private String State;
	private String Transport;
	private String Ctime;
	private String Id;
	private String Diplomadesc;
	private String Endtime;
	private String Uid;
	private String Expand;

	//set get list	
	public void setOrderState(String OrderState){
		this.OrderState=OrderState;
	}
	
	public String getOrderState(){
		return this.OrderState;
	}
	
	public void setTransportUid(String TransportUid){
		this.TransportUid=TransportUid;
	}
	
	public String getTransportUid(){
		return this.TransportUid;
	}
	
	public void setCharityTotal(String CharityTotal){
		this.CharityTotal=CharityTotal;
	}
	
	public String getCharityTotal(){
		return this.CharityTotal;
	}
	
	public void setType(String Type){
		this.Type=Type;
	}
	
	public String getType(){
		return this.Type;
	}
	
	public void setFbpics(String Fbpics){
		this.Fbpics=Fbpics;
	}
	
	public String getFbpics(){
		return this.Fbpics;
	}
	
	public void setOrder(String Order){
		this.Order=Order;
	}
	
	public String getOrder(){
		return this.Order;
	}
	
	public void setShare(String Share){
		this.Share=Share;
	}
	
	public String getShare(){
		return this.Share;
	}
	
	public void setFbpic(String Fbpic){
		this.Fbpic=Fbpic;
	}
	
	public String getFbpic(){
		return this.Fbpic;
	}
	
	public void setForward(String Forward){
		this.Forward=Forward;
	}
	
	public String getForward(){
		return this.Forward;
	}
	
	public void setDiploma(String Diploma){
		this.Diploma=Diploma;
	}
	
	public String getDiploma(){
		return this.Diploma;
	}
	
	public void setUname(String Uname){
		this.Uname=Uname;
	}
	
	public String getUname(){
		return this.Uname;
	}
	
	public void setFbtitle(String Fbtitle){
		this.Fbtitle=Fbtitle;
	}
	
	public String getFbtitle(){
		return this.Fbtitle;
	}
	
	public void setPics(String Pics){
		this.Pics=Pics;
	}
	
	public String getPics(){
		return this.Pics;
	}
	
	public void setFeedback(String Feedback){
		this.Feedback=Feedback;
	}
	
	public String getFeedback(){
		return this.Feedback;
	}
	
	public void setScale(String Scale){
		this.Scale=Scale;
	}
	
	public String getScale(){
		return this.Scale;
	}
	
	public void setPic(String Pic){
		this.Pic=Pic;
	}
	
	public String getPic(){
		return this.Pic;
	}
	
	public void setContent(String Content){
		this.Content=Content;
	}
	
	public String getContent(){
		return this.Content;
	}
	
	public void setDesc(String Desc){
		this.Desc=Desc;
	}
	
	public String getDesc(){
		return this.Desc;
	}
	
	public void setActivityState(String ActivityState){
		this.ActivityState=ActivityState;
	}
	
	public String getActivityState(){
		return this.ActivityState;
	}
	
	public void setTop(String Top){
		this.Top=Top;
	}
	
	public String getTop(){
		return this.Top;
	}
	
	public void setBegtime(String Begtime){
		this.Begtime=Begtime;
	}
	
	public String getBegtime(){
		return this.Begtime;
	}
	
	public void setOrderId(String OrderId){
		this.OrderId=OrderId;
	}
	
	public String getOrderId(){
		return this.OrderId;
	}
	
	public void setCity(String City){
		this.City=City;
	}
	
	public String getCity(){
		return this.City;
	}
	
	public void setTitle(String Title){
		this.Title=Title;
	}
	
	public String getTitle(){
		return this.Title;
	}
	
	public void setState(String State){
		this.State=State;
	}
	
	public String getState(){
		return this.State;
	}
	
	public void setTransport(String Transport){
		this.Transport=Transport;
	}
	
	public String getTransport(){
		return this.Transport;
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
	
	public void setDiplomadesc(String Diplomadesc){
		this.Diplomadesc=Diplomadesc;
	}
	
	public String getDiplomadesc(){
		return this.Diplomadesc;
	}
	
	public void setEndtime(String Endtime){
		this.Endtime=Endtime;
	}
	
	public String getEndtime(){
		return this.Endtime;
	}
	
	public void setUid(String Uid){
		this.Uid=Uid;
	}
	
	public String getUid(){
		return this.Uid;
	}
	
	public void setExpand(String Expand){
		this.Expand=Expand;
	}
	
	public String getExpand(){
		return this.Expand;
	}
	

	//other
	//createFromCursor
    public static ActivityBean  createFromCursor(Cursor cursor){
     if (cursor == null) return null;
        ActivityBean bean = new ActivityBean();
			bean.setOrderState(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.OrderState)));
			bean.setTransportUid(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.TransportUid)));
			bean.setCharityTotal(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.CharityTotal)));
			bean.setType(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Type)));
			bean.setFbpics(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Fbpics)));
			bean.setOrder(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Order)));
			bean.setShare(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Share)));
			bean.setFbpic(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Fbpic)));
			bean.setForward(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Forward)));
			bean.setDiploma(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Diploma)));
			bean.setUname(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Uname)));
			bean.setFbtitle(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Fbtitle)));
			bean.setPics(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Pics)));
			bean.setFeedback(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Feedback)));
			bean.setScale(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Scale)));
			bean.setPic(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Pic)));
			bean.setContent(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Content)));
			bean.setDesc(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Desc)));
			bean.setActivityState(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.ActivityState)));
			bean.setTop(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Top)));
			bean.setBegtime(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Begtime)));
			bean.setOrderId(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.OrderId)));
			bean.setCity(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.City)));
			bean.setTitle(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Title)));
			bean.setState(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.State)));
			bean.setTransport(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Transport)));
			bean.setCtime(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Ctime)));
			bean.setId(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Id)));
			bean.setDiplomadesc(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Diplomadesc)));
			bean.setEndtime(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Endtime)));
			bean.setUid(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Uid)));
			bean.setExpand(cursor.getString(cursor.getColumnIndex(ActivityBeanProvider.Columns.Expand)));
		return bean;
	}
	
    //createFromJSON
    public static ActivityBean  createFromJSON(JSONObject json)throws JSONException{
     if (json == null) return null;
        ActivityBean bean = new ActivityBean();
			bean.setOrderState(json.optString("OrderState"));
			bean.setTransportUid(json.optString("TransportUid"));
			bean.setCharityTotal(json.optString("CharityTotal"));
			bean.setType(json.optString("Type"));
			bean.setFbpics(json.optString("Fbpics"));
			bean.setOrder(json.optString("Order"));
			bean.setShare(json.optString("Share"));
			bean.setFbpic(json.optString("Fbpic"));
			bean.setForward(json.optString("Forward"));
			bean.setDiploma(json.optString("Diploma"));
			bean.setUname(json.optString("Uname"));
			bean.setFbtitle(json.optString("Fbtitle"));
			bean.setPics(json.optString("Pics"));
			bean.setFeedback(json.optString("Feedback"));
			bean.setScale(json.optString("Scale"));
			bean.setPic(json.optString("Pic"));
			bean.setContent(json.optString("Content"));
			bean.setDesc(json.optString("Desc"));
			bean.setActivityState(json.optString("ActivityState"));
			bean.setTop(json.optString("Top"));
			bean.setBegtime(json.optString("Begtime"));
			bean.setOrderId(json.optString("OrderId"));
			bean.setCity(json.optString("City"));
			bean.setTitle(json.optString("Title"));
			bean.setState(json.optString("State"));
			bean.setTransport(json.optString("Transport"));
			bean.setCtime(json.optString("Ctime"));
			bean.setId(json.optString("Id"));
			bean.setDiplomadesc(json.optString("Diplomadesc"));
			bean.setEndtime(json.optString("Endtime"));
			bean.setUid(json.optString("Uid"));
			bean.setExpand(json.optString("Expand"));
		return bean;
	}
    //buildContentValues
    public static ContentValues buildContentValues(ActivityBean bean) {
        ContentValues values = new ContentValues();
        values.put(ActivityBeanProvider.Columns.OrderState, bean.getOrderState());
        values.put(ActivityBeanProvider.Columns.TransportUid, bean.getTransportUid());
        values.put(ActivityBeanProvider.Columns.CharityTotal, bean.getCharityTotal());
        values.put(ActivityBeanProvider.Columns.Type, bean.getType());
        values.put(ActivityBeanProvider.Columns.Fbpics, bean.getFbpics());
        values.put(ActivityBeanProvider.Columns.Order, bean.getOrder());
        values.put(ActivityBeanProvider.Columns.Share, bean.getShare());
        values.put(ActivityBeanProvider.Columns.Fbpic, bean.getFbpic());
        values.put(ActivityBeanProvider.Columns.Forward, bean.getForward());
        values.put(ActivityBeanProvider.Columns.Diploma, bean.getDiploma());
        values.put(ActivityBeanProvider.Columns.Uname, bean.getUname());
        values.put(ActivityBeanProvider.Columns.Fbtitle, bean.getFbtitle());
        values.put(ActivityBeanProvider.Columns.Pics, bean.getPics());
        values.put(ActivityBeanProvider.Columns.Feedback, bean.getFeedback());
        values.put(ActivityBeanProvider.Columns.Scale, bean.getScale());
        values.put(ActivityBeanProvider.Columns.Pic, bean.getPic());
        values.put(ActivityBeanProvider.Columns.Content, bean.getContent());
        values.put(ActivityBeanProvider.Columns.Desc, bean.getDesc());
        values.put(ActivityBeanProvider.Columns.ActivityState, bean.getActivityState());
        values.put(ActivityBeanProvider.Columns.Top, bean.getTop());
        values.put(ActivityBeanProvider.Columns.Begtime, bean.getBegtime());
        values.put(ActivityBeanProvider.Columns.OrderId, bean.getOrderId());
        values.put(ActivityBeanProvider.Columns.City, bean.getCity());
        values.put(ActivityBeanProvider.Columns.Title, bean.getTitle());
        values.put(ActivityBeanProvider.Columns.State, bean.getState());
        values.put(ActivityBeanProvider.Columns.Transport, bean.getTransport());
        values.put(ActivityBeanProvider.Columns.Ctime, bean.getCtime());
        values.put(ActivityBeanProvider.Columns.Id, bean.getId());
        values.put(ActivityBeanProvider.Columns.Diplomadesc, bean.getDiplomadesc());
        values.put(ActivityBeanProvider.Columns.Endtime, bean.getEndtime());
        values.put(ActivityBeanProvider.Columns.Uid, bean.getUid());
        values.put(ActivityBeanProvider.Columns.Expand, bean.getExpand());
        return values;
    }

}