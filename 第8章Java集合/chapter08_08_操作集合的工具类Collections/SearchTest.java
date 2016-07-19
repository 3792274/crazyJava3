package chapter08_08_�������ϵĹ�����Collections;


import java.util.*;
/**
 * Description:Collections���ҡ��滻����Ԫ�ص��෽��
 * 1.int binarySearch(List list,Object key) ʹ�ö������ط�����ָ��List���ϣ����ָ��������List�е�������List���뱣֤������״̬
 * 2.Object max/min(Collection coll)���ظ����������Ԫ�أ���Ȼ˳��
 * 3.Object max/min(Collection ,Comparator) ����Comparator˳�򣬷������Ԫ��
 * 4.void fill(List list,Object o)ʹ��ָ��Ԫ��Obj�滻ָ��List�����е�����Ԫ��
 * 5.int frequency(Collection c,Object)���ؼ�����ָ��Ԫ�س��ֵĴ���
 * 6.int indexOfSubList(List source,List target) ����list������list�����е�һ�γ��ֵ�λ������
 * 7.int lastIndexOfSubList(List source,List target)
 * 8.boolean replaceAll(List Object,Object)��һ����ֵ�滻List�������о�ֵ
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
		System.out.println(nums); // ���:[2, -5, 3, 0]
		System.out.println(Collections.max(nums)); // ������Ԫ�أ������3
		System.out.println(Collections.min(nums)); // �����СԪ�أ������-5
		Collections.replaceAll(nums , 0 , 1); // ��nums�е�0ʹ��1������
		System.out.println(nums); // ���:[2, -5, 3, 1]
		
		// �ж�-5��List�����г��ֵĴ���������1
		System.out.println(Collections.frequency(nums , -5));
		
		Collections.sort(nums); // ��nums��������
		System.out.println(nums); // ���:[-5, 1, 2, 3]
		
		//ֻ��������List���ϲſ��ö��ַ���ѯ�����3
		System.out.println(Collections.binarySearch(nums , 3));
	}
}

