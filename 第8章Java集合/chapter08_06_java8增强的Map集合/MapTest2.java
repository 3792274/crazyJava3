package chapter08_06_java8增强的Map集合;


import java.util.*;
/**
 * Description:
 * java8中新增的对Map操作的方法
 */
public class MapTest2
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		
		// 成对放入多个key-value对
		map.put("疯狂Java讲义" , 109);
		map.put("疯狂iOS讲义" , 99);
		map.put("疯狂Ajax讲义" , 79);
	
		// 尝试替换key为"疯狂XML讲义"的value，由于原Map中没有对应的key，
		// 因此对Map没有改变，不会添加新的key-value对
		map.replace("疯狂XML讲义" , 66);
		System.out.println(map);
		
		// 使用原value与参数计算出来的结果覆盖原有的value
		map.merge("疯狂iOS讲义" , 10 ,
			(oldVal , param) -> (Integer)oldVal + (Integer)param);
		System.out.println(map); // "疯狂iOS讲义"的value增大了10
	
		// 当key为"Java"对应的value为null（或不存在时），使用计算的结果作为新value
		map.computeIfAbsent("Java" , (key)->((String)key).length());
		System.out.println(map); // map中添加了 Java=4 这组key-value对
	
		// 当key为"Java"对应的value存在时，使用计算的结果作为新value
		map.computeIfPresent("Java",
			(key , value) -> (Integer)value * (Integer)value);
		System.out.println(map); // map中 Java=4 变成 Java=16
	}
}
