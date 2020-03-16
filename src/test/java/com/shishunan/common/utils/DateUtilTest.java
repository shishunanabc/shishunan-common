package com.shishunan.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.shishunan.common.utils.DateUtil;

public class DateUtilTest {
	//��ĩ��
	@Test
	public void testEndMonth() {
		// TODO Auto-generated method stub
		Date date=DateUtil.getEndMonth(new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	
	//�³���
	@Test
	public void testInitMont() {
		// TODO Auto-generated method stub
		Date date = DateUtil.getInitMonth(new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	@Test
	public void testRandomDate() {
		Calendar instance=Calendar.getInstance();
		instance.set(2010, 0, 1);
		Date date=DateUtil.randomDate(instance.getTime(), new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format=df.format(date);
		System.out.println(format);
	}

}
