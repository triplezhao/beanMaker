package ${package};

//import
import java.util.Date;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import android.database.Cursor;
import ${providerpackage}.${className}Provider;

import android.content.ContentValues;

public class ${className} extends BaseBean implements Serializable{

	//propslist
<#list properties as pro>
	private ${pro.proType} ${pro.proName};
</#list>

	//set get list	
<#list properties as pro>
	public void set<@upperFC>${pro.proName}</@upperFC>(${pro.proType} ${pro.proName}){
		this.${pro.proName}=${pro.proName};
	}
	
	public ${pro.proType} get<@upperFC>${pro.proName}</@upperFC>(){
		return this.${pro.proName};
	}
	
</#list>

	//other
	//createFromCursor
    public static ${className}  createFromCursor(Cursor cursor){
     if (cursor == null) return null;
        ${className} bean = new ${className}();
        <#list properties as pro>
			bean.set<@upperFC>${pro.proName}</@upperFC>(cursor.getString(cursor.getColumnIndex(${className}Provider.Columns.${pro.proName})));
		</#list>
		return bean;
	}
	
    //createFromJSON
    public static ${className}  createFromJSON(JSONObject json)throws JSONException{
     if (json == null) return null;
        ${className} bean = new ${className}();
        <#list properties as pro>
			bean.set<@upperFC>${pro.proName}</@upperFC>(json.optString("${pro.proName}"));
		</#list>
		return bean;
	}
	
	//createFromJSONArray
    public static ArrayList<${className}> createFromJSONArray(JSONArray jsonArray) throws JSONException {

        if (jsonArray == null) return null;

        ArrayList<${className}> list = new ArrayList<${className}>();

        int count = jsonArray.length();
        for (int i = 0; i < count; i++) {
            JSONObject jsonObj = jsonArray.optJSONObject(i);
            ${className} entity = ${className}.createFromJSON(jsonObj);
            list.add(entity);
        }
        return list;
    }
	
    //buildContentValues
    public static ContentValues buildContentValues(BaseBean baseBean) {
        ${className} bean = new ${className}();

        if (baseBean != null) {
            bean = (${className}) baseBean;
        }
        ContentValues values = new ContentValues();
        <#list properties as pro>
        values.put(${className}Provider.Columns.${pro.proName}, bean.get<@upperFC>${pro.proName}</@upperFC>());
        </#list>
        return values;
    }

}