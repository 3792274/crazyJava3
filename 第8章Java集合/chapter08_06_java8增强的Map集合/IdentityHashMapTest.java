package chapter08_06_java8��ǿ��Map����;


import java.util.*;
/**
 * Description:
 * 1.hashMap,ͨ��equal�ж�����������ͬ
 * 2.identityHashMap ͨ����ַ ==�ж�2��������ͬ��
 * 3.���߶�������ġ�
 */
public class IdentityHashMapTest
{
	public static void main(String[] args)
	{
		IdentityHashMap ihm = new IdentityHashMap();
	
		// �������д��뽫����IdentityHashMap�������������key-value��
		ihm.put(new String("����") , 89);
		ihm.put(new String("����") , 78);
	
		// �������д���ֻ����IdentityHashMap���������һ��key-value��
		ihm.put("java" , 93);
		ihm.put("java" , 98);
		System.out.println(ihm);
	}
}
