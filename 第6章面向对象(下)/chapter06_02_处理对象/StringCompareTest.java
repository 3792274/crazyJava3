package chapter06_02_�������;

/**
 * Description:�����ع����ַ�������ֱ���������Ρ�
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class StringCompareTest
{
	public static void main(String[] args)
	{
		// s1ֱ�����ó������е�"���Java"
		String s1 = "���Java";
		String s2 = "���";
		String s3 = "Java";
		
		// s4������ַ���ֵ�����ڱ���ʱ��ȷ������
		// s4ֱ�����ó������е�"���Java"
		String s4 = "���" + "Java";
		
		// s5������ַ���ֵ�����ڱ���ʱ��ȷ������
		// s5ֱ�����ó������е�"���Java"
		String s5 = "��" + "��" + "Java";
		
		// s6������ַ���ֵ�����ڱ���ʱ��ȷ��������
		// �������ó������е��ַ���
		String s6 = s2 + s3;
		
		// ʹ��new���ù��������ᴴ��һ���µ�String����
		// s7���ö��ڴ����´�����String����
		String s7 = new String("���Java");
		
		System.out.println(s1 == s4); // ���true
		System.out.println(s1 == s5); // ���true
		System.out.println(s1 == s6); // ���false
		System.out.println(s1 == s7); // ���false
	}
}
