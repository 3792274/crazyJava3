package chapter09_04_���ͷ���;



/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

class MyClass<E>
{
	public <T> MyClass(T t)
	{
		System.out.println("t������ֵΪ��" + t);
	}
}



public class GenericDiamondTest
{
	public static void main(String[] args)
	{
		// MyClass�������е�E�β���String���͡�
		// ���͹�������������T�β���Integer����
		MyClass<String> mc1 = new MyClass<>(5);
	
		
		// ��ʽָ�����͹�������������T�β���Integer���ͣ�
		MyClass<String> mc2 = new <Integer> MyClass<String>(5);
		
		
		// MyClass�������е�E�β���String���͡�
		// �����ʽָ�����͹�������������T�β���Integer����
		// ��ʱ�Ͳ���ʹ��"����"�﷨����������Ǵ�ġ�
//		MyClass<String> mc3 = new <Integer> MyClass<>(5);
	}
}
