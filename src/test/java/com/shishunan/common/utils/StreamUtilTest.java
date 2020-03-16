package com.shishunan.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;

import com.shishunan.common.utils.StreamUtil;

public class StreamUtilTest {

	@Test
	public void testRead() throws Exception {
		List<String> list=StreamUtil.read(new File("d:\\users.txt"));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
