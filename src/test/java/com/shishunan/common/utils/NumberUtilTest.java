package com.shishunan.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shishunan.common.utils.NumberUtil;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		int i=NumberUtil.getPercent(1, 3);
		System.out.println(i);
	}

}
