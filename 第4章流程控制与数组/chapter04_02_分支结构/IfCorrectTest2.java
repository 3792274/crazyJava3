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
public class IfCorrectTest2
{
	public static void main(String[] args)
	{
		int age = 45;
		if (age > 60)
		{
			System.out.println("������");
		}
		// ��ԭ����if������������else����������
		if (age > 40 && !(age >60))
		{
			System.out.println("������");
		}
		// ��ԭ����if������������else����������
		if (age > 20 && !(age > 60) && !(age > 40 && !(age >60)))
		{
			System.out.println("������");
		}
	}
}
