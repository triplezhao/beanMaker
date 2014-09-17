package com.freemake.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.w3c.dom.Text;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class MakeMan {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println(System.getProperty("user.dir")+"============");

        try {
            // 设置5个参数
            // com1 com2 testbean ./in/user.json json
            // 模拟数据源
            String beanPackageName = "com.makeman.p1";
            String providerPackageName = "com.makeman.p2";
            String beanClassName = "YourBean";
            String beanPro[] = new String[] { "name", "sex", "age" };
            // end 不同文件需要改变的参数
            String beanProFile = "./in/test.json";
            
            for (int i = 0; i < args.length; i++) {
                switch (i) {
                case 0:
                    beanPackageName = args[i];
                    break;
                case 1:
                    providerPackageName = args[i];
                    break;
                case 2:
                    beanClassName = args[i];
                case 3:
                    beanProFile = args[i];
                    break;
                }
            }
                if (new File(beanProFile).exists()) {
                    String filetype = beanProFile.substring(beanProFile.lastIndexOf(".")+1,beanProFile.length());
                    // 尝试读取json里面的配置参数
                    if (filetype.equals("json")) {
                        
                        String json=FileUtil.readFileByLines(beanProFile);
                        JSONObject parseObject = JSON.parseObject(json);
//                        if(parseObject.getString("package1")!=""){
//                            beanPackageName = parseObject.getString("package1");
//                            providerPackageName = parseObject.getString("package2");
//                            beanClassName = parseObject.getString("class"); 
//                        }
                        
//                        JSONObject propsObject = parseObject.getJSONObject("props");
                        Set<String> keySet = parseObject.keySet();
                        beanPro = keySet.toArray(new String[0]);
//                        beanPro = keySet.toArray(new String[]);
                    }
                    // 尝试读取txt里面的配置参数
                    else if(filetype.equals("txt")){
                        String json=FileUtil.readFileByLines(beanProFile);
                        beanPro = json.split(",");
                    }

                }

            Configuration cfg = new Configuration();
            MakeMan.class.getPackage();
            cfg.setClassForTemplateLoading(MakeMan.class,
                    "/com/freemake/tpl");// 指定模板所在的classpath目录
            cfg.setSharedVariable("upperFC", new UpperFirstCharacter());// 添加一个"宏"共享变量用来将属性名首字母大写
            Template beant = cfg.getTemplate("javabean.tpl");
            Template providert = cfg.getTemplate("ContentProvider.tpl");

           
            
            // end 不同文件需要改变的参数
            makeJavafile(beanPackageName,providerPackageName, beanClassName, beanPro, "./out/"
                    + beanClassName + ".java", beant);
            makeJavafile(providerPackageName,providerPackageName, beanClassName, beanPro, "./out/"
                    + beanClassName + "Provider.java", providert);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void makeJavafile(String pname, String providerpname,String classname,
            String[] props, String file, Template tpl) {
        // 一个java文件的内容map
        Map data = new HashMap();
        // 包名
        data.put("package", pname);
        data.put("providerpackage", providerpname);
        // 类名
        data.put("className", classname);

        List pros = new ArrayList(); // 属性集合
        for (int i = 0; i < props.length; i++) {
            Map pro_1 = new HashMap();
            pro_1.put("proType", "String");
            pro_1.put("proName", props[i]);
            pros.add(pro_1);
        }
        data.put("properties", pros);

        FileOutputStream fos;
        try {
            // java文件的生成目录
            fos = new FileOutputStream(new File(file));
            // 生成javabean文件
            tpl.process(data, new OutputStreamWriter(fos, "utf-8"));
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TemplateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
