package com.shishunan.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shishunan.common.utils.StringUtil;

public class StringUtilTest {
	@Test
	public void testUrl() {
		
		boolean b = StringUtil.isHttpUrl("https://www.baidu.com/");
		boolean b2 = StringUtil.isHttpUrl("123");
		System.out.println(b);
		System.out.println(b2);
		
	}
	
	@Test
	public void testGetValue() {
		String string = StringUtil.getValue("八维教育学院", 2);
		System.out.println(string);
	}
	
	@Test
	public void testNumber() {
		boolean b = StringUtil.isNumber("-123.123");
		System.out.println(b);
	}
	
	@Test
	public void testEmain() {
		boolean b = StringUtil.isEMail("357728899@123.com");
		System.out.println(b);
	}
	
	@Test
	public void testPhone() {
		// TODO Auto-generated method stub
		boolean b = StringUtil.isPhone("15127880257");
		System.out.println(b);
	}

	@Test
	public void testHasLength() {
		String str=" ";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str="";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(100);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 10; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
		
	}

	@Test
	public void getPlaceholderValue() {
		String src="http://news.cnstock.com/news,yw-201908-4413224.htm";
		String regex="^\\d{7}+\\.+[a-z]+$";
		String placeholderValue = StringUtil.getPlaceholderValue(src, regex);
		System.out.println(placeholderValue);
	}
}
