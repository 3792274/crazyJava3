package chapter05_02_�������;



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
public class Varargs
{
	// �������βθ����ɱ�ķ���
	public static void test(int a , String... books)
	{
		// books���������鴦��
		for (String tmp : books)
		{
			System.out.println(tmp);
		}
		// �����������a��ֵ
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		// ����test����
		test(5 , "���Java����" , "������Java EE��ҵӦ��ʵս");
	}
}

