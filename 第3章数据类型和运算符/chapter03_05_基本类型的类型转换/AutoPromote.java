package chapter03_05_�������͵�����ת��;

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
public class AutoPromote
{
	public static void main(String[] args)
	{
		// ����һ��short���ͱ���
		short sValue = 5;
		// ������뽫�������ʽ�е�sValue���Զ�������int���ͣ�
		// ���ұߵı��ʽ����Ϊint����һ��int���͸���short���͵ı�������������
		// sValue = sValue - 2;
		byte b = 40;
		char c = 'a';
		int i = 23;
		double d = .314;
		// �ұ߱��ʽ������ߵȼ�������Ϊd��double�ͣ�
		// ���ұ߱��ʽ������Ϊdouble��,�ʸ���һ��double�ͱ���
		double result = b + c + i * d;
		// �����144.222
		System.out.println(result);
		int val = 3;
		// �ұ߱��ʽ��2������������int�����ұ߱��ʽ������Ϊint
		// ��ˣ���Ȼ23/3���ܳ�������Ȼ�õ�һ��int����
		int intResult = 23 / val;
		System.out.println(intResult); // �����7
		// ����ַ���Hello!a7
		System.out.println("Hello!" + 'a' + 7);
		// ����ַ���104Hello!
		System.out.println('a' + 7 + "Hello!");
	}
}
