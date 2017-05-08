package chapter08_04_List集合;


import java.util.*;
/**
 * Description:
 * 1，ArrayList 和 Vector类封装了一个动态的、允许再分配的Object[]数组
 * 2.使用initialCapacity设置数组长度。当需要添加大量元素可使用ensureCapacity(int minCapacity)一次性增加，提高性能
 * 3.初始大小10
 * 4.ArrayList线程不安全，如需要安全，可使用Collections的工具类。
 * 5.过时栈类Stack 替换 ArrayDeque
 * 6.操作数组的工具Arrays,Arrays.ArrayList是一个固定长度的List集合，只能遍历，不能增加删除。
 */
public class FixedSizeList
{
	public static void main(String[] args)
	{
		List fixedList = Arrays.asList("疯狂Java讲义" , "轻量级Java EE企业应用实战");
		
		// 获取fixedList的实现类，将输出Arrays$ArrayList
		System.out.println(fixedList.getClass());
		
		// 使用方法引用遍历集合元素
		fixedList.forEach(System.out::println);
	
		// 试图增加、删除元素都会引发UnsupportedOperationException异常
		fixedList.add("疯狂Android讲义");
		fixedList.remove("疯狂Java讲义");
	}
}
