package com.makeman.p1;

//import
import java.util.Date;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import android.database.Cursor;
import com.makeman.p2.YourBeanProvider;
import com.makeman.p2.YourBeanProvider;

import android.content.ContentValues;

public class YourBean implements Serializable{

	//propslist
	private String endtime;
	private String scale;
	private String orderexpand;
	private String aid;
	private String type;
	private String orderaddr;
	private String ordercontacts;
	private String feedback;
	private String orderfeedback;
	private String title;
	private String order;
	private String transport;
	private String forward;
	private String expand;
	private String fbpic;
	private String begtime;
	private String top;
	private String fbpics;
	private String uname;
	private String orderctime;
	private String orderphone;
	private String fbtitle;
	private String pic;
	private String content;
	private String diploma;
	private String orderexpress;
	private String orderstateex;
	private String orderid;
	private String diplomadesc;

	//set get list	
	public void setEndtime(String endtime){
		this.endtime=endtime;
	}
	
	public String getEndtime(){
		return this.endtime;
	}
	
	public void setScale(String scale){
		this.scale=scale;
	}
	
	public String getScale(){
		return this.scale;
	}
	
	public void setOrderexpand(String orderexpand){
		this.orderexpand=orderexpand;
	}
	
	public String getOrderexpand(){
		return this.orderexpand;
	}
	
	public void setAid(String aid){
		this.aid=aid;
	}
	
	public String getAid(){
		return this.aid;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setOrderaddr(String orderaddr){
		this.orderaddr=orderaddr;
	}
	
	public String getOrderaddr(){
		return this.orderaddr;
	}
	
	public void setOrdercontacts(String ordercontacts){
		this.ordercontacts=ordercontacts;
	}
	
	public String getOrdercontacts(){
		return this.ordercontacts;
	}
	
	public void setFeedback(String feedback){
		this.feedback=feedback;
	}
	
	public String getFeedback(){
		return this.feedback;
	}
	
	public void setOrderfeedback(String orderfeedback){
		this.orderfeedback=orderfeedback;
	}
	
	public String getOrderfeedback(){
		return this.orderfeedback;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setOrder(String order){
		this.order=order;
	}
	
	public String getOrder(){
		return this.order;
	}
	
	public void setTransport(String transport){
		this.transport=transport;
	}
	
	public String getTransport(){
		return this.transport;
	}
	
	public void setForward(String forward){
		this.forward=forward;
	}
	
	public String getForward(){
		return this.forward;
	}
	
	public void setExpand(String expand){
		this.expand=expand;
	}
	
	public String getExpand(){
		return this.expand;
	}
	
	public void setFbpic(String fbpic){
		this.fbpic=fbpic;
	}
	
	public String getFbpic(){
		return this.fbpic;
	}
	
	public void setBegtime(String begtime){
		this.begtime=begtime;
	}
	
	public String getBegtime(){
		return this.begtime;
	}
	
	public void setTop(String top){
		this.top=top;
	}
	
	public String getTop(){
		return this.top;
	}
	
	public void setFbpics(String fbpics){
		this.fbpics=fbpics;
	}
	
	public String getFbpics(){
		return this.fbpics;
	}
	
	public void setUname(String uname){
		this.uname=uname;
	}
	
	public String getUname(){
		return this.uname;
	}
	
	public void setOrderctime(String orderctime){
		this.orderctime=orderctime;
	}
	
	public String getOrderctime(){
		return this.orderctime;
	}
	
	public void setOrderphone(String orderphone){
		this.orderphone=orderphone;
	}
	
	public String getOrderphone(){
		return this.orderphone;
	}
	
	public void setFbtitle(String fbtitle){
		this.fbtitle=fbtitle;
	}
	
	public String getFbtitle(){
		return this.fbtitle;
	}
	
	public void setPic(String pic){
		this.pic=pic;
	}
	
	public String getPic(){
		return this.pic;
	}
	
	public void setContent(String content){
		this.content=content;
	}
	
	public String getContent(){
		return this.content;
	}
	
	public void setDiploma(String diploma){
		this.diploma=diploma;
	}
	
	public String getDiploma(){
		return this.diploma;
	}
	
	public void setOrderexpress(String orderexpress){
		this.orderexpress=orderexpress;
	}
	
	public String getOrderexpress(){
		return this.orderexpress;
	}
	
	public void setOrderstateex(String orderstateex){
		this.orderstateex=orderstateex;
	}
	
	public String getOrderstateex(){
		return this.orderstateex;
	}
	
	public void setOrderid(String orderid){
		this.orderid=orderid;
	}
	
	public String getOrderid(){
		return this.orderid;
	}
	
	public void setDiplomadesc(String diplomadesc){
		this.diplomadesc=diplomadesc;
	}
	
	public String getDiplomadesc(){
		return this.diplomadesc;
	}
	

	//other
	//createFromCursor
    public static YourBean  createFromCursor(Cursor cursor){
     if (cursor == null) return null;
        YourBean bean = new YourBean();
			bean.setEndtime(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.endtime)));
			bean.setScale(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.scale)));
			bean.setOrderexpand(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.orderexpand)));
			bean.setAid(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.aid)));
			bean.setType(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.type)));
			bean.setOrderaddr(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.orderaddr)));
			bean.setOrdercontacts(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.ordercontacts)));
			bean.setFeedback(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.feedback)));
			bean.setOrderfeedback(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.orderfeedback)));
			bean.setTitle(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.title)));
			bean.setOrder(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.order)));
			bean.setTransport(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.transport)));
			bean.setForward(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.forward)));
			bean.setExpand(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.expand)));
			bean.setFbpic(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.fbpic)));
			bean.setBegtime(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.begtime)));
			bean.setTop(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.top)));
			bean.setFbpics(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.fbpics)));
			bean.setUname(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.uname)));
			bean.setOrderctime(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.orderctime)));
			bean.setOrderphone(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.orderphone)));
			bean.setFbtitle(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.fbtitle)));
			bean.setPic(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.pic)));
			bean.setContent(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.content)));
			bean.setDiploma(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.diploma)));
			bean.setOrderexpress(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.orderexpress)));
			bean.setOrderstateex(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.orderstateex)));
			bean.setOrderid(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.orderid)));
			bean.setDiplomadesc(cursor.getString(cursor.getColumnIndex(YourBeanProvider.Columns.diplomadesc)));
		return bean;
	}
	
    //createFromJSON
    public static YourBean  createFromJSON(JSONObject json)throws JSONException{
     if (json == null) return null;
        YourBean bean = new YourBean();
			bean.setEndtime(json.optString("endtime"));
			bean.setScale(json.optString("scale"));
			bean.setOrderexpand(json.optString("orderexpand"));
			bean.setAid(json.optString("aid"));
			bean.setType(json.optString("type"));
			bean.setOrderaddr(json.optString("orderaddr"));
			bean.setOrdercontacts(json.optString("ordercontacts"));
			bean.setFeedback(json.optString("feedback"));
			bean.setOrderfeedback(json.optString("orderfeedback"));
			bean.setTitle(json.optString("title"));
			bean.setOrder(json.optString("order"));
			bean.setTransport(json.optString("transport"));
			bean.setForward(json.optString("forward"));
			bean.setExpand(json.optString("expand"));
			bean.setFbpic(json.optString("fbpic"));
			bean.setBegtime(json.optString("begtime"));
			bean.setTop(json.optString("top"));
			bean.setFbpics(json.optString("fbpics"));
			bean.setUname(json.optString("uname"));
			bean.setOrderctime(json.optString("orderctime"));
			bean.setOrderphone(json.optString("orderphone"));
			bean.setFbtitle(json.optString("fbtitle"));
			bean.setPic(json.optString("pic"));
			bean.setContent(json.optString("content"));
			bean.setDiploma(json.optString("diploma"));
			bean.setOrderexpress(json.optString("orderexpress"));
			bean.setOrderstateex(json.optString("orderstateex"));
			bean.setOrderid(json.optString("orderid"));
			bean.setDiplomadesc(json.optString("diplomadesc"));
		return bean;
	}
    //buildContentValues
    public static ContentValues buildContentValues(YourBean bean) {
        ContentValues values = new ContentValues();
        values.put(YourBeanProvider.Columns.endtime, bean.getEndtime());
        values.put(YourBeanProvider.Columns.scale, bean.getScale());
        values.put(YourBeanProvider.Columns.orderexpand, bean.getOrderexpand());
        values.put(YourBeanProvider.Columns.aid, bean.getAid());
        values.put(YourBeanProvider.Columns.type, bean.getType());
        values.put(YourBeanProvider.Columns.orderaddr, bean.getOrderaddr());
        values.put(YourBeanProvider.Columns.ordercontacts, bean.getOrdercontacts());
        values.put(YourBeanProvider.Columns.feedback, bean.getFeedback());
        values.put(YourBeanProvider.Columns.orderfeedback, bean.getOrderfeedback());
        values.put(YourBeanProvider.Columns.title, bean.getTitle());
        values.put(YourBeanProvider.Columns.order, bean.getOrder());
        values.put(YourBeanProvider.Columns.transport, bean.getTransport());
        values.put(YourBeanProvider.Columns.forward, bean.getForward());
        values.put(YourBeanProvider.Columns.expand, bean.getExpand());
        values.put(YourBeanProvider.Columns.fbpic, bean.getFbpic());
        values.put(YourBeanProvider.Columns.begtime, bean.getBegtime());
        values.put(YourBeanProvider.Columns.top, bean.getTop());
        values.put(YourBeanProvider.Columns.fbpics, bean.getFbpics());
        values.put(YourBeanProvider.Columns.uname, bean.getUname());
        values.put(YourBeanProvider.Columns.orderctime, bean.getOrderctime());
        values.put(YourBeanProvider.Columns.orderphone, bean.getOrderphone());
        values.put(YourBeanProvider.Columns.fbtitle, bean.getFbtitle());
        values.put(YourBeanProvider.Columns.pic, bean.getPic());
        values.put(YourBeanProvider.Columns.content, bean.getContent());
        values.put(YourBeanProvider.Columns.diploma, bean.getDiploma());
        values.put(YourBeanProvider.Columns.orderexpress, bean.getOrderexpress());
        values.put(YourBeanProvider.Columns.orderstateex, bean.getOrderstateex());
        values.put(YourBeanProvider.Columns.orderid, bean.getOrderid());
        values.put(YourBeanProvider.Columns.diplomadesc, bean.getDiplomadesc());
        return values;
    }

}