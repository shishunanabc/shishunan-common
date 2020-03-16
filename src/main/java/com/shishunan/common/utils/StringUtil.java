package com.shishunan.common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Random;

/**
 * 
 * @ClassName: StringUtil
 * @Description: 字符串工具类
 * @author: 
 * @date: 2020年2月27日 下午4:29:24
 */
public class StringUtil {
	/*
	 * 每读取一行，使用“|”分割成注册人表对应的属性。
	 */
	public static String getString(String str) {
		
		return null;
	}
	
	/**
	 * 校验传入的参数是否为url
	 * @param param
	 * @return
	 */
	public static boolean isHttpUrl(String param) {
		 URL url;  
		 try {  
	         url = new URL(param);
	        url.openStream();  
	         return true; //url合法
	    } catch (Exception e1) {  
	         System.out.println("连接打不开!");  
	       
	    }  
		 return false;
		
	}
	
	/*
	* 方法功能：根据正则在字符串提取一段值，用于后面在url地址里提取ID值。
	* 例如在“http://news.cnstock.com/news,yw-201908-4413224.htm”把“4413224”提取出来。
	*/
	public static String getPlaceholderValue(String src, String regex){
	
		String src1="";
		regex="^\\d{7}+\\.+[a-z]+";
		String[] split = src.split("-");
		for (String string : split) {
			if(string.matches(regex)) {
				src1=string.substring(0, 7);
			}
		}
		
		return src1;
	}
	
	/**
	 * 
	 * @Title: getValue 
	 * @Description:// 八维教育学院 经过处理后,返回 八维****
		// 截取后面需要代替的字符串，下标从start开始
	 * @param str
	 * @param start
	 * @return
	 * @return: String
	 */
	public static String getValue(String str,int start) {
		// 八维教育学院 经过处理后,返回 八维****
		// 截取后面需要代替的字符串，下标从start开始
		String s1=str.substring(2);
		System.out.println(s1);
		// 定义一个空字符串用来接收*
		String s2="";
		// 循环遍历追加*,遍历长度等于截取字符串的长度
		for (int i = 0; i < s1.length(); i++) {
			//str.replace(s1, "*");
			s2+="*";
		}
		String s0=str.substring(0,2);
		return  s0+s2;
	}
	
	// 判断一个字符串是否是数字 考虑整数 负数 小数
	public static boolean isNumber(String src) {
		
		String reg="^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}

	// 判断是否邮箱,所有格式的邮箱
	public static boolean isEMail(String src) {
		// 定义规则 num2222@126.com
		String reg="\\w+\\@\\w+\\.\\w+";
		return src.matches(reg);
	}
	
	// 判断是否是中国的手机号
	public static boolean isPhone(String src) {
		// 定义规则
		String reg="^1[3|4|5|7|8]\\d{9}$";
		
		return src.matches(reg);
	}
	
	
	// 方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
	
		return null!=src && src.length() >0;
	}
	// 方法2：判断源字符串 如果包含空格也算没值ֵ
	public static boolean hasText(String src){
	
		return null!=src && src.trim().length() >0;
	}
	// 随机产生一个中文简体汉字
	public static String randomChineseString() {
		String str=null;
		int highPos,lowPos;
		Random random=new Random();
		highPos=(176+Math.abs(random.nextInt(40)));// 区码，0xA0打头，从第16区开始，即0xB0=11*16=176,16~55一级汉字，56~87二级汉字
		random=new Random();
		lowPos=161+Math.abs(random.nextInt(95));// 位码，0xA0打头，范围第1~94列
		byte[] bArr=new byte[2];
		
		bArr[0]=(new Integer(highPos)).byteValue();
		bArr[1]=(new Integer(lowPos)).byteValue();
		try {
			str=new String(bArr,"GB2312");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	// 方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”(5分)
	public static String randomChineseString(int length){
		// 定义一个空字符串用来存储汉字
		String str="";
		// 循环追加随机汉字到字符串上
		for (int i = 0; i < length; i++) {
			// 调用随机产生中文汉字方法依次追加到字符串上去
			str+=randomChineseString();
		}
		// 返回生成的字符串
		return str;
	}
	// 方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
	public static String generateChineseName(){
		// 定义一个字符串数组存百家姓
		String[] str= { "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "楮", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤",
				"许", "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "章",
				"云", "苏", "潘", "葛", "奚", "范", "彭", "郎", "鲁", "韦", "昌", "马", "苗", "凤", "花", "方", "俞", "任", "袁", "柳", "酆",
				"鲍", "史", "唐", "费", "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷", "罗", "毕", "郝", "邬", "安", "常", "乐", "于",
				"时", "傅", "皮", "卞", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄", "和", "穆", "萧", "尹", "姚", "邵", "湛",
				"汪", "祁", "毛", "禹", "狄", "米", "贝", "明", "臧", "计", "伏", "成", "戴", "谈", "宋", "茅", "庞", "熊", "纪", "舒", "屈",
				"项", "祝", "董", "梁", "杜", "阮", "蓝", "闽", "席", "季", "麻", "强", "贾", "路", "娄", "危", "江", "童", "颜", "郭", "梅",
				"盛", "林", "刁", "锺", "徐", "丘", "骆", "高", "夏", "蔡", "田", "樊", "胡", "凌", "霍", "虞", "万", "支", "柯", "昝", "管",
				"卢", "莫", "经", "房", "裘", "缪", "干", "解", "应", "宗", "丁", "宣", "贲", "邓", "郁", "单", "杭", "洪", "包", "诸", "左",
				"石", "崔", "吉", "钮", "龚", "程", "嵇", "邢", "滑", "裴", "陆", "荣", "翁", "荀", "羊", "於", "惠", "甄", "麹", "家", "封",
				"芮", "羿", "储", "靳", "汲", "邴", "糜", "松", "井", "段", "富", "巫", "乌", "焦", "巴", "弓", "牧", "隗", "山", "谷", "车",
				"侯", "宓", "蓬", "全", "郗", "班", "仰", "秋", "仲", "伊", "宫", "宁", "仇", "栾", "暴", "甘", "斜", "厉", "戎", "祖", "武",
				"符", "刘", "景", "詹", "束", "龙", "叶", "幸", "司", "韶", "郜", "黎", "蓟", "薄", "印", "宿", "白", "怀", "蒲", "邰", "从",
				"鄂", "索", "咸", "籍", "赖", "卓", "蔺", "屠", "蒙", "池", "乔", "阴", "郁", "胥", "能", "苍", "双", "闻", "莘", "党", "翟",
				"谭", "贡", "劳", "逄", "姬", "申", "扶", "堵", "冉", "宰", "郦", "雍", "郤", "璩", "桑", "桂", "濮", "牛", "寿", "通", "边",
				"扈", "燕", "冀", "郏", "浦", "尚", "农", "温", "别", "庄", "晏", "柴", "瞿", "阎", "充", "慕", "连", "茹", "习", "宦", "艾",
				"鱼", "容", "向", "古", "易", "慎", "戈", "廖", "庾", "终", "暨", "居", "衡", "步", "都", "耿", "满", "弘", "匡", "国", "文",
				"寇", "广", "禄", "阙", "东", "欧", "殳", "沃", "利", "蔚", "越", "夔", "隆", "师", "巩", "厍", "聂", "晁", "勾", "敖", "融",
				"冷", "訾", "辛", "阚", "那", "简", "饶", "空", "曾", "毋", "沙", "乜", "养", "鞠", "须", "丰", "巢", "关", "蒯", "相", "查",
				"后", "荆", "红", "游", "竺", "权", "逑", "盖", "益", "桓", "公", "晋", "楚", "阎", "法", "汝", "鄢", "涂", "钦", "岳", "帅",
				"缑", "亢", "况", "后", "有", "琴", "商", "牟", "佘", "佴", "伯", "赏", "墨", "哈", "谯", "笪", "年", "爱", "阳", "佟",
				"万俟", "司马", "上官", "欧阳", "夏侯", "诸葛", "闻人", "东方", "赫连", "皇甫", "尉迟", "公羊", "澹台", "公冶", "宗政", "濮阳", "淳于",
				"单于", "太叔", "申屠", "公孙", "仲孙", "轩辕", "令狐", "锺离", "宇文", "长孙", "慕容", "鲜于", "闾丘", "司徒", "司空", "丌官", "司寇",
				"仉", "督", "子车", "颛孙", "端木", "巫马", "公西", "漆雕", "乐正", "壤驷", "公良", "拓拔", "夹谷", "宰父", "谷梁", "段干", "百里",
				"东郭", "南门", "呼延", "归", "海", "羊舌", "微生", "梁丘", "左丘", "东门", "西门", "南宫"};
		// 随机从字符串数组中获取一个姓，根据下标来获取
		String name1=str[RandomUtil.random(0, str.length-1)];
		// 随机生成名，通过调用方法3来生成
		String name2=randomChineseString(RandomUtil.random(1, 2));
		// 生成的名字 返回所生成的名字
		return name1+name2;
	}
}
