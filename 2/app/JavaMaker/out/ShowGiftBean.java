package com.cyou.mobileshow.bean;

//import
import java.util.Date;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import android.database.Cursor;
import com.cyou.mobileshow.db.ShowGiftBeanProvider;

import android.content.ContentValues;

public class ShowGiftBean extends BaseBean implements Serializable{

	//propslist
	private String gifIos;
	private String giftIcon;
	private String giftRule;
	private String giftType;
	private String giftPrice;
	private String giftName;
	private String giftId;
	private String gifAndroid;

	//set get list	
	public void setGifIos(String gifIos){
		this.gifIos=gifIos;
	}
	
	public String getGifIos(){
		return this.gifIos;
	}
	
	public void setGiftIcon(String giftIcon){
		this.giftIcon=giftIcon;
	}
	
	public String getGiftIcon(){
		return this.giftIcon;
	}
	
	public void setGiftRule(String giftRule){
		this.giftRule=giftRule;
	}
	
	public String getGiftRule(){
		return this.giftRule;
	}
	
	public void setGiftType(String giftType){
		this.giftType=giftType;
	}
	
	public String getGiftType(){
		return this.giftType;
	}
	
	public void setGiftPrice(String giftPrice){
		this.giftPrice=giftPrice;
	}
	
	public String getGiftPrice(){
		return this.giftPrice;
	}
	
	public void setGiftName(String giftName){
		this.giftName=giftName;
	}
	
	public String getGiftName(){
		return this.giftName;
	}
	
	public void setGiftId(String giftId){
		this.giftId=giftId;
	}
	
	public String getGiftId(){
		return this.giftId;
	}
	
	public void setGifAndroid(String gifAndroid){
		this.gifAndroid=gifAndroid;
	}
	
	public String getGifAndroid(){
		return this.gifAndroid;
	}
	

	//other
	//createFromCursor
    public static ShowGiftBean  createFromCursor(Cursor cursor){
     if (cursor == null) return null;
        ShowGiftBean bean = new ShowGiftBean();
			bean.setGifIos(cursor.getString(cursor.getColumnIndex(ShowGiftBeanProvider.Columns.gifIos)));
			bean.setGiftIcon(cursor.getString(cursor.getColumnIndex(ShowGiftBeanProvider.Columns.giftIcon)));
			bean.setGiftRule(cursor.getString(cursor.getColumnIndex(ShowGiftBeanProvider.Columns.giftRule)));
			bean.setGiftType(cursor.getString(cursor.getColumnIndex(ShowGiftBeanProvider.Columns.giftType)));
			bean.setGiftPrice(cursor.getString(cursor.getColumnIndex(ShowGiftBeanProvider.Columns.giftPrice)));
			bean.setGiftName(cursor.getString(cursor.getColumnIndex(ShowGiftBeanProvider.Columns.giftName)));
			bean.setGiftId(cursor.getString(cursor.getColumnIndex(ShowGiftBeanProvider.Columns.giftId)));
			bean.setGifAndroid(cursor.getString(cursor.getColumnIndex(ShowGiftBeanProvider.Columns.gifAndroid)));
		return bean;
	}
	
    //createFromJSON
    public static ShowGiftBean  createFromJSON(JSONObject json)throws JSONException{
     if (json == null) return null;
        ShowGiftBean bean = new ShowGiftBean();
			bean.setGifIos(json.optString("gifIos"));
			bean.setGiftIcon(json.optString("giftIcon"));
			bean.setGiftRule(json.optString("giftRule"));
			bean.setGiftType(json.optString("giftType"));
			bean.setGiftPrice(json.optString("giftPrice"));
			bean.setGiftName(json.optString("giftName"));
			bean.setGiftId(json.optString("giftId"));
			bean.setGifAndroid(json.optString("gifAndroid"));
		return bean;
	}
	
	//createFromJSONArray
    public static ArrayList<ShowGiftBean> createFromJSONArray(JSONArray jsonArray) throws JSONException {

        if (jsonArray == null) return null;

        ArrayList<ShowGiftBean> list = new ArrayList<ShowGiftBean>();

        int count = jsonArray.length();
        for (int i = 0; i < count; i++) {
            JSONObject jsonObj = jsonArray.optJSONObject(i);
            ShowGiftBean entity = ShowGiftBean.createFromJSON(jsonObj);
            list.add(entity);
        }
        return list;
    }
	
    //buildContentValues
    public static ContentValues buildContentValues(BaseBean baseBean) {
        ShowGiftBean bean = new ShowGiftBean();

        if (baseBean != null) {
            bean = (ShowGiftBean) baseBean;
        }
        ContentValues values = new ContentValues();
        values.put(ShowGiftBeanProvider.Columns.gifIos, bean.getGifIos());
        values.put(ShowGiftBeanProvider.Columns.giftIcon, bean.getGiftIcon());
        values.put(ShowGiftBeanProvider.Columns.giftRule, bean.getGiftRule());
        values.put(ShowGiftBeanProvider.Columns.giftType, bean.getGiftType());
        values.put(ShowGiftBeanProvider.Columns.giftPrice, bean.getGiftPrice());
        values.put(ShowGiftBeanProvider.Columns.giftName, bean.getGiftName());
        values.put(ShowGiftBeanProvider.Columns.giftId, bean.getGiftId());
        values.put(ShowGiftBeanProvider.Columns.gifAndroid, bean.getGifAndroid());
        return values;
    }

}