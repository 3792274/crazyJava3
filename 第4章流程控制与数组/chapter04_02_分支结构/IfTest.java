package chapter04_02_��֧�ṹ;

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
public class IfTest
{
	public static void main(String[] args)
	{
		int age = 30;
		if (age > 20)
		// ֻ�е�age > 20ʱ�����滨����������������Ż�ִ��
		// �������������������һ�����壬Ҫôһ��ִ�У�Ҫôһ�𲻻�ִ��
		{
			System.out.println("�����Ѿ�����20����");
			System.out.println("20�����ϵ���Ӧ��ѧ��е�����...");
		}

		// �������a ����Ϊ�丳ֵ
		int a = 5;
		if (a > 4)
			// ���a>4��ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			System.out.println("a����4");
		else
			// ����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			System.out.println("a������4");

		// �������b ����Ϊ�丳ֵ
		int b = 5;
		if (b > 4)
			// ���b>4��ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			System.out.println("b����4");
		else
			// ����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			b--;
			// �������������ԣ����Ѿ�����������ִ�����һ���֣�����ܻ�ִ�С�
			System.out.println("b������4");

		// �������c ����Ϊ�丳ֵ
		int c = 5;
		if (c > 4)
		// ���b>4��ִ�������ִ���壬��ֻ��c--;һ�д���Ϊ������
			c--;
			// ������һ����ͨ���룬������������
			System.out.println("c����4");
		// �˴���else��û��if��䣬��˱������
//		else
		// ����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
			System.out.println("c������4");

	}
}
