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
public class IntegerCacheTest
{
	public static void main(String[] args)
	{
		// �����µ�Integer����
		Integer in1 = new Integer(6);
		// �����µ�Integer���󣬲�����ö���
		Integer in2 = Integer.valueOf(6);
		// ֱ�Ӵӻ�����ȡ��Ineger����
		Integer in3 = Integer.valueOf(6);
		System.out.println(in1 == in2); // ���false
		System.out.println(in2 == in3); // ���true
		// ����Integerֻ����-128~127֮���ֵ��
		// ���200��Ӧ��Integer����û�б����档
		Integer in4 = Integer.valueOf(200);
		Integer in5 = Integer.valueOf(200);
		System.out.println(in4 == in5); //���false
	}
}

