package chapter08_08_操作集合的工具类Collections;


import java.util.*;
/**
 * Description:
 * 对集合元素进行排序、查询、修改
 * 将集合对象设置为不可变、
 * 对集合对象实现同步控制等方法
 * 
 * 
 * 1.void reverse(List) 翻转指定List集合中元素的顺序
 * 2.void shuffle(List) 对List进行随机排序(洗牌)
 * 3.void sort(List)    按自然升序排序
 * 4.void sort(List,Comparator) 根据comparator产生的顺序对List集合元素进行排序
 * 5.void swap(List,int i,int j ) 将集合中的元素i,j处元素，进行交换。
 * 6.void rotate(List,int distance)当distance为正数时，将list集合的后distance个元素整体移到前面；当为负数整体移到后面，不能改变集合长度。
 */
public class SortTest
{
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
	
		System.out.println(nums); // 输出:[2, -5, 3, 0]
		
		Collections.reverse(nums); // 将List集合元素的次序反转
		System.out.println(nums); // 输出:[0, 3, -5, 2]
	
		Collections.sort(nums); // 将List集合元素的按自然顺序排序
		System.out.println(nums); // 输出:[-5, 0, 2, 3]
		
		Collections.shuffle(nums); // 将List集合元素的按随机顺序排序
		System.out.println(nums); // 每次输出的次序不固定
	}
}
