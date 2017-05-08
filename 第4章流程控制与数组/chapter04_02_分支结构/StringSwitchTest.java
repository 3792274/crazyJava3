package chapter04_02_分支结构;



/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class StringSwitchTest
{
	public static void main(String[] args)
	{
		// 声明变量season
		String season = "夏天";   //JDK7新增的方法，String,以前允许byte/short/int/char/枚举类型
		// 执行swicth分支语句
		switch (season)
		{
			case "春天":
				System.out.println("春暖花开.");
				break;
			case "夏天":
				System.out.println("夏日炎炎.");
				break;
			case "秋天":
				System.out.println("秋高气爽.");
				break;
			case "冬天":
				System.out.println("冬雪皑皑.");
				break;
			default:
				System.out.println("季节输入错误");
		}
	}
}
