package chapter08_06_java8增强的Map集合;


import java.util.*;
/**
 * Description:
 * 1.EnumMap内部以数组保存，紧凑、高效
 * 2.key是自然顺序(枚举值在枚举类中定义的顺序)来维护key-value的顺序，通过keySet()/entrySet()/values()可以看到
 * 3.不允许null作为key,可以作为value,查询或删除值为null的key不会抛出异常。
 * 4.与创建普通Map区别，创建EnumMap时必须制定一个枚举类，从而将该EnumMap和指定的枚举类关联起来。
 */
enum Season
{
	SPRING,SUMMER,FALL,WINTER
}


public class EnumMapTest
{
	public static void main(String[] args)
	{
		// 创建EnumMap对象，该EnumMap的所有key都是Season枚举类的枚举值
		EnumMap enumMap = new EnumMap(Season.class);
		enumMap.put(Season.SUMMER , "夏日炎炎");
		enumMap.put(Season.SPRING , "春暖花开");
		System.out.println(enumMap);
	}
}
