package chapter07_07_java8新增的日期时间格式器;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter 解析日期、时间字符串
 *
 */
public class NewFormatterParse {

	public static void main(String[] args) {
		
		//定义一个任意格式的日期、时间字符串
		String str1="2014==04==12 01时06分09秒";
		
		//根据字符串解析所用的格式器
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
		
		//执行解析
		LocalDateTime dt1 = LocalDateTime.parse(str1,formatter1);
		System.out.println(dt1); //输出 2014-04-12T01:06:09
		
		
		//下面在使用另一个字符串
		String str2 = "2014$$$四月$$$13 20 小时";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy$$$MMM$$$dd HH 小时");
		LocalDateTime dt2 = LocalDateTime.parse(str2,formatter2);
		System.out.println(dt2);//输出 2014-04-13T20:00

	}

}































