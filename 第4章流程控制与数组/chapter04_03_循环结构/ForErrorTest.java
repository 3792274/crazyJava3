package chapter04_03_ѭ���ṹ;

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
public class ForErrorTest
{
	public static void main(String[] args)
	{
		// ѭ���ĳ�ʼ������,ѭ��������ѭ��������䶼������һ��
		for (int count = 0 ; count < 10 ; count++)
		{
			System.out.println(count);
			// �ٴ��޸���ѭ������,�����������㲻��count <10;���Ի�һֱ����
			count *= 0.1;
		}
		System.out.println("ѭ������!");
	}
}