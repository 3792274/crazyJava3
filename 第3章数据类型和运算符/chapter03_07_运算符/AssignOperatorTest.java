package chapter03_07_�����;

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
public class AssignOperatorTest
{
	public static void main(String[] args)
	{
		String str = "Java"; // Ϊ����str��ֵΪJava
		double pi = 3.14; // Ϊ����pi��ֵΪ3.14
		boolean visited = true; // Ϊ����visited��ֵΪtrue
		String str2 = str; // ������str��ֵ����str2
		int a;
		int b;
		int c;
		// ͨ��Ϊa, b , c��ֵ������������ֵ����7������д���ɶ��Բ
		a = b = c = 7;
		// �������������ֵ��
		System.out.println(a + "\n" + b + "\n" + c);

		double d1 = 12.34;
		double d2 = d1 + 5; // �����ʽ��ֵ����d2
		System.out.println(d2); // ���d2��ֵ�������17.34

	}
}
