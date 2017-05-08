package chapter08_03_Set集合;


import java.util.*;
/**
 * Description:
 * 1.自然排序。
 * 1.TreeSet会调用集合元素的compareTo(Object obj)比较元素大小。
 * 2.BigDecimal/BigInteger及所有数值类型包装类，已实现
 * 3.Character 按字符的UNICODE值进行比较。
 * 4.Boolean:true 对应的包装类实例大于false对应的包装类实例
 * 5.String，按字符串中字符的UNICODE比较
 * 6.Date、Time后面的时间、日期比前面的日期时间大。
 * 7.如果把一个对象添加TreeSet,则该对象必须实现compareTo接口
 * 
 */
class Err{}
public class TreeSetErrorTest
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		// 向TreeSet集合中添加两个Err对象，由于没有实现compare接口，报错。
		ts.add(new Err());
		ts.add(new Err());  //①
	}
}
