package chapter08_06_java8增强的Map集合;


import java.util.*;
/**
 * Description:
 * 双向列表，可以记住添加顺序，是有序的
 */
public class LinkedHashMapTest
{
	public static void main(String[] args)
	{
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("语文" , 80);
		scores.put("英文" , 82);
		scores.put("数学" , 76);
	
		// 调用forEach方法遍历scores里的所有key-value对
		scores.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
}
