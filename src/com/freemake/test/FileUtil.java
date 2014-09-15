package com.freemake.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public static String  readFileByLines(String fileName) {
        File file = new File(fileName);
        StringBuffer sb = new StringBuffer();
        BufferedReader reader = null;
        String tempString = null;
        try {
            
            reader = new BufferedReader(new FileReader(file));
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
//                System.out.println("line " + line + ": " + tempString);
                sb.append(tempString);
                line++;
            }
            reader.close();
           
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return sb.toString();
    }
}
