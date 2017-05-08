package chapter06_09_枚举类;

/**
 * Description:早期自定义的枚举类。 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Season01 {
	
	// 把Season类定义成不可变的，将其成员变量也定义成final的
	private final String name;
	private final String desc;
	
	public static final Season01 SPRING = new Season01("春天", "趁春踏青");
	public static final Season01 SUMMER = new Season01("夏天", "夏日炎炎");
	public static final Season01 FALL = new Season01("秋天", "秋高气爽");
	public static final Season01 WINTER = new Season01("冬天", "围炉赏雪");

	public static Season01 getSeason(int seasonNum) {
		switch (seasonNum) {
		case 1:
			return SPRING;
		case 2:
			return SUMMER;
		case 3:
			return FALL;
		case 4:
			return WINTER;
		default:
			return null;
		}
	}

	// 将构造器定义成private访问权限
	private Season01(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	// 只为name和desc提供getter方法
	public String getName() {
		return this.name;
	}

	public String getDesc() {
		return this.desc;
	}
}
