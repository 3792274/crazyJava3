package chapter08_08_操作集合的工具类Collections;


import java.util.*;
/**
 * Description:Collections查找、替换集合元素的类方法
 * 1.int binarySearch(List list,Object key) 使用二分搜素法搜索指定List集合，获得指定对象在List中的索引，List必须保证是有序状态
 * 2.Object max/min(Collection coll)返回给定集合最大元素，自然顺序
 * 3.Object max/min(Collection ,Comparator) 根据Comparator顺序，返回最大元素
 * 4.void fill(List list,Object o)使用指定元素Obj替换指定List集合中的所有元素
 * 5.int frequency(Collection c,Object)返回集合中指定元素出现的次数
 * 6.int indexOfSubList(List source,List target) 返回list对象在list对象中第一次出现的位置索引
 * 7.int lastIndexOfSubList(List source,List target)
 * 8.boolean replaceAll(List Object,Object)用一个新值替换List对象所有旧值
 */
public class SearchTest
{
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums); // 输出:[2, -5, 3, 0]
		System.out.println(Collections.max(nums)); // 输出最大元素，将输出3
		System.out.println(Collections.min(nums)); // 输出最小元素，将输出-5
		Collections.replaceAll(nums , 0 , 1); // 将nums中的0使用1来代替
		System.out.println(nums); // 输出:[2, -5, 3, 1]
		
		// 判断-5在List集合中出现的次数，返回1
		System.out.println(Collections.frequency(nums , -5));
		
		Collections.sort(nums); // 对nums集合排序
		System.out.println(nums); // 输出:[-5, 1, 2, 3]
		
		//只有排序后的List集合才可用二分法查询，输出3
		System.out.println(Collections.binarySearch(nums , 3));
	}
}

