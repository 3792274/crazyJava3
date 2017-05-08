package chapter08_06_java8增强的Map集合;


import java.util.*;
/**
 * Description:
 * 1.hashMap,通过equal判断两个对象相同
 * 2.identityHashMap 通过地址 ==判断2个对象相同。
 * 3.两者都是无序的。
 */
public class IdentityHashMapTest
{
	public static void main(String[] args)
	{
		IdentityHashMap ihm = new IdentityHashMap();
	
		// 下面两行代码将会向IdentityHashMap对象中添加两个key-value对
		ihm.put(new String("语文") , 89);
		ihm.put(new String("语文") , 78);
	
		// 下面两行代码只会向IdentityHashMap对象中添加一个key-value对
		ihm.put("java" , 93);
		ihm.put("java" , 98);
		System.out.println(ihm);
	}
}
