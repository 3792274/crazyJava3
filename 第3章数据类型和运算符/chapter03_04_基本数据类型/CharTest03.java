package chapter03_04_������������;


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
public class CharTest03
{
	public static void main(String[] args)
	{
		// ֱ��ָ�������ַ���Ϊ�ַ�ֵ
		char aChar = 'a';
		
		// ʹ��ת���ַ�����Ϊ�ַ�ֵ
		char enterChar = '\r';
		
		// ʹ��Unicode����ֵ��ָ���ַ�ֵ
		char ch = '\u9999';
		
		// �����һ��'��'�ַ�
		System.out.println(ch);
		
		// ����һ��'��'�ַ�ֵ
		char zhong = '��';
		
		// ֱ�ӽ�һ��char��������int���ͱ���ʹ��
		int zhongValue = zhong;
		System.out.println(zhongValue);
		
		// ֱ�Ӱ�һ��0��65535��Χ�ڵ�int��������һ��char����
		char c = 97;
		System.out.println(c);
	}
}

