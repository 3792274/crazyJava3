package chapter05_09_��ʼ����;



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
public class InstanceInitTest
{
	// ��ִ�г�ʼ���齫aʵ��������ֵΪ6
	{
		a = 6;
	}
	// ��ִ�н�aʵ��������ֵΪ9
	int a = 9;
	public static void main(String[] args)
	{
		// ������뽫���9��
		System.out.println(new InstanceInitTest().a);
	}
}
