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
public class Recursive
{
	public static int fn(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else if (n == 1)
		{
			return 4;
		}
		else
		{
			// �����е������������Ƿ����ݹ�
			return 2 * fn(n - 1) + fn(n - 2);
		}
	}
	public static void main(String[] args)
	{
		// ���fn(10)�Ľ��
		System.out.println(fn(10));
	}
}

