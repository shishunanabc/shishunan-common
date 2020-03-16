package com.shishunan.common.utils;
/**
 * 
 * @ClassName: StreamUtil 
 * @Description: ������
 * @author: ʦ����
 * @date: 2020��2��28�� ����11:41:49
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	//读取文件内容放入集合
	public static List<String> read(InputStream InputStream) throws Exception{
		List<String> list=new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(InputStream));
		String line="";
		while((line=reader.readLine())!=null) {
			list.add(line);
		}
		return list;	
	}
	
	public static List<String> read(String filePath) throws Exception{
		FileInputStream inputStream = new FileInputStream(filePath);
		return read(inputStream);
	}
	
	public static List<String> read(File file) throws Exception{
		FileInputStream inputStream = new FileInputStream(file);
		return read(inputStream);
		
	}
}
