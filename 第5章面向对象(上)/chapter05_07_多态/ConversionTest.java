package chapter05_07_��̬;



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
public class ConversionTest
{
	public static void main(String[] args)
	{
		double d = 13.4;
		long l = (long)d;
		System.out.println(l);
		int in = 5;
		// ��ͼ��һ����ֵ���͵ı���ת��Ϊboolean���ͣ��������������
		// ����ʱ�����ʾ: ����ת��������
		// boolean b = (boolean)in;
		Object obj = "Hello";
		// obj�����ı�������ΪObject��Object��String���ڼ̳й�ϵ������ǿ������ת��
		// ����obj����ʵ����������String���ͣ���������ʱҲ��ͨ��
		String objStr = (String)obj;
		System.out.println(objStr);
		// ����һ��objPri��������������ΪObject��ʵ������ΪInteger
		Object objPri = new Integer(5);
		// objPri�����ı���ʱ����ΪObject��objPri������ʱ����ΪInteger��Object��Integer���ڼ̳й�ϵ
		// ����ǿ������ת������objPri����ʵ����������Integer���ͣ�
		// ���������������ʱ����ClassCastException�쳣
		String str = (String)objPri;
	}
}

