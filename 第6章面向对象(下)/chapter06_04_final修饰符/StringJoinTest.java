package chapter06_04_final���η�;



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
public class StringJoinTest
{
	public static void main(String[] args)
	{
		String s1 = "���Java";
		// s2�������õ��ַ������Ա���ʱ��ȷ��������
		// ���s2ֱ�����ó����������е�"���Java"�ַ���
		String s2 = "���" + "Java";
		System.out.println(s1 == s2);
		// ����2���ַ���ֱ����
		String str1 = "���";     //��
		String str2 = "Java";     //��
		// ��str1��str2������������
		String s3 = str1 + str2;
		System.out.println(s1 == s3);
	}
}
