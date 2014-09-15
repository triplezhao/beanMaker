package com1;

//这个地方可以事先定义好需要的类
import java.util.Date;

import java.io.Serializable;

public class TestBean implements Serializable{

	//属性列表
	private String jinbi;
	private String icon;
	private String masterLevel;
	private String masterId;
	private String status;
	private String fanLevel;
	private String fanOffset;
	private String nextFanLevel;
	private String masterNick;
	private String sign;
	private String receiveFlag;
	private String cover;
	private String nextMasterLevel;
	private String userId;
	private String masterNo;
	private String liveLimit;
	private String domain;
	private String userName;
	private String jindou;
	private String masterOffset;

	//set get方法列表	
	public void setJinbi(String jinbi){
		this.jinbi=jinbi;
	}
	
	public String getJinbi(){
		return this.jinbi;
	}
	
	public void setIcon(String icon){
		this.icon=icon;
	}
	
	public String getIcon(){
		return this.icon;
	}
	
	public void setMasterLevel(String masterLevel){
		this.masterLevel=masterLevel;
	}
	
	public String getMasterLevel(){
		return this.masterLevel;
	}
	
	public void setMasterId(String masterId){
		this.masterId=masterId;
	}
	
	public String getMasterId(){
		return this.masterId;
	}
	
	public void setStatus(String status){
		this.status=status;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public void setFanLevel(String fanLevel){
		this.fanLevel=fanLevel;
	}
	
	public String getFanLevel(){
		return this.fanLevel;
	}
	
	public void setFanOffset(String fanOffset){
		this.fanOffset=fanOffset;
	}
	
	public String getFanOffset(){
		return this.fanOffset;
	}
	
	public void setNextFanLevel(String nextFanLevel){
		this.nextFanLevel=nextFanLevel;
	}
	
	public String getNextFanLevel(){
		return this.nextFanLevel;
	}
	
	public void setMasterNick(String masterNick){
		this.masterNick=masterNick;
	}
	
	public String getMasterNick(){
		return this.masterNick;
	}
	
	public void setSign(String sign){
		this.sign=sign;
	}
	
	public String getSign(){
		return this.sign;
	}
	
	public void setReceiveFlag(String receiveFlag){
		this.receiveFlag=receiveFlag;
	}
	
	public String getReceiveFlag(){
		return this.receiveFlag;
	}
	
	public void setCover(String cover){
		this.cover=cover;
	}
	
	public String getCover(){
		return this.cover;
	}
	
	public void setNextMasterLevel(String nextMasterLevel){
		this.nextMasterLevel=nextMasterLevel;
	}
	
	public String getNextMasterLevel(){
		return this.nextMasterLevel;
	}
	
	public void setUserId(String userId){
		this.userId=userId;
	}
	
	public String getUserId(){
		return this.userId;
	}
	
	public void setMasterNo(String masterNo){
		this.masterNo=masterNo;
	}
	
	public String getMasterNo(){
		return this.masterNo;
	}
	
	public void setLiveLimit(String liveLimit){
		this.liveLimit=liveLimit;
	}
	
	public String getLiveLimit(){
		return this.liveLimit;
	}
	
	public void setDomain(String domain){
		this.domain=domain;
	}
	
	public String getDomain(){
		return this.domain;
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setJindou(String jindou){
		this.jindou=jindou;
	}
	
	public String getJindou(){
		return this.jindou;
	}
	
	public void setMasterOffset(String masterOffset){
		this.masterOffset=masterOffset;
	}
	
	public String getMasterOffset(){
		return this.masterOffset;
	}
	

	//其他方法
	//读库解析
    public static TestBean  createFromCursor(Cursor cursor){
     if (cursor == null) return null;
        TestBean bean = new TestBean();
			bean.setJinbi(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.jinbi)));
			bean.setIcon(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.icon)));
			bean.setMasterLevel(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.masterLevel)));
			bean.setMasterId(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.masterId)));
			bean.setStatus(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.status)));
			bean.setFanLevel(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.fanLevel)));
			bean.setFanOffset(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.fanOffset)));
			bean.setNextFanLevel(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.nextFanLevel)));
			bean.setMasterNick(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.masterNick)));
			bean.setSign(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.sign)));
			bean.setReceiveFlag(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.receiveFlag)));
			bean.setCover(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.cover)));
			bean.setNextMasterLevel(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.nextMasterLevel)));
			bean.setUserId(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.userId)));
			bean.setMasterNo(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.masterNo)));
			bean.setLiveLimit(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.liveLimit)));
			bean.setDomain(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.domain)));
			bean.setUserName(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.userName)));
			bean.setJindou(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.jindou)));
			bean.setMasterOffset(cursor.getString(cursor.getColumnIndex(TestBeanProvider.Columns.masterOffset)));
		return bean;
	}
	
    //json解析
    public static TestBean  createFromJSON(JSONObject json)throws JSONException{
     if (cursor == null) return null;
        TestBean bean = new TestBean();
			bean.setJinbi(json.optString("jinbi"));
			bean.setIcon(json.optString("icon"));
			bean.setMasterLevel(json.optString("masterLevel"));
			bean.setMasterId(json.optString("masterId"));
			bean.setStatus(json.optString("status"));
			bean.setFanLevel(json.optString("fanLevel"));
			bean.setFanOffset(json.optString("fanOffset"));
			bean.setNextFanLevel(json.optString("nextFanLevel"));
			bean.setMasterNick(json.optString("masterNick"));
			bean.setSign(json.optString("sign"));
			bean.setReceiveFlag(json.optString("receiveFlag"));
			bean.setCover(json.optString("cover"));
			bean.setNextMasterLevel(json.optString("nextMasterLevel"));
			bean.setUserId(json.optString("userId"));
			bean.setMasterNo(json.optString("masterNo"));
			bean.setLiveLimit(json.optString("liveLimit"));
			bean.setDomain(json.optString("domain"));
			bean.setUserName(json.optString("userName"));
			bean.setJindou(json.optString("jindou"));
			bean.setMasterOffset(json.optString("masterOffset"));
		return bean;
	}
    //入库
    public static ContentValues buildContentValues(TestBean bean) {
        ContentValues values = new ContentValues();
        values.put(TestBeanProvider.Columns.jinbi, bean.getJinbi());
        values.put(TestBeanProvider.Columns.icon, bean.getIcon());
        values.put(TestBeanProvider.Columns.masterLevel, bean.getMasterLevel());
        values.put(TestBeanProvider.Columns.masterId, bean.getMasterId());
        values.put(TestBeanProvider.Columns.status, bean.getStatus());
        values.put(TestBeanProvider.Columns.fanLevel, bean.getFanLevel());
        values.put(TestBeanProvider.Columns.fanOffset, bean.getFanOffset());
        values.put(TestBeanProvider.Columns.nextFanLevel, bean.getNextFanLevel());
        values.put(TestBeanProvider.Columns.masterNick, bean.getMasterNick());
        values.put(TestBeanProvider.Columns.sign, bean.getSign());
        values.put(TestBeanProvider.Columns.receiveFlag, bean.getReceiveFlag());
        values.put(TestBeanProvider.Columns.cover, bean.getCover());
        values.put(TestBeanProvider.Columns.nextMasterLevel, bean.getNextMasterLevel());
        values.put(TestBeanProvider.Columns.userId, bean.getUserId());
        values.put(TestBeanProvider.Columns.masterNo, bean.getMasterNo());
        values.put(TestBeanProvider.Columns.liveLimit, bean.getLiveLimit());
        values.put(TestBeanProvider.Columns.domain, bean.getDomain());
        values.put(TestBeanProvider.Columns.userName, bean.getUserName());
        values.put(TestBeanProvider.Columns.jindou, bean.getJindou());
        values.put(TestBeanProvider.Columns.masterOffset, bean.getMasterOffset());
        return values;
    }

}