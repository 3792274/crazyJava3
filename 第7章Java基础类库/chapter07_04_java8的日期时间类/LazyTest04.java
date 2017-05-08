package chapter07_04_java8的日期时间类;

import java.util.*;
import static java.util.Calendar.*;
/**
 * Description:
 * 
 * set()方法延迟修改
 * set(f,value)方法将日历字段f更改为value,此外它还设置了一个内部成员变量，以指示日历字段f已经被更改，尽管日历字段f是立即被更改的
 * 但是calendar所代表的时间却不会立即修改，直到下次调用get()/getTime()/getTimeInMillis()/add()/roll()时才会重新计算日历时间，
 * 这被称为set()方法的延迟修改，好处是调用set好多次不必要计算太多次。
 * 
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class LazyTest04
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2003 , 7 , 31);  //2003-8-31
		
		// 将月份设为9，但9月31日不存在。
		// 如果立即修改，系统将会把cal自动调整到10月1日。
		 cal.set(MONTH , 8);
		
		// 下面代码输出10月1日,打开和不打开对下面的3号输出有影响
	    //System.out.println(cal.getTime());    //①
		
		// 设置DATE字段为5,虽然上面已经将日历设置了Month自动调整到10月1日，
		cal.set(DATE , 5);    //②
		System.out.println(cal.getTime());    //③
	}
}
