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
class DataWrap
{
	int a;
	int b;
}
public class ReferenceTransferTest
{
	public static void swap(DataWrap dw)
	{
		// �������д���ʵ��dw��a��b������Ա������ֵ������
		// ����һ����ʱ����������dw�����a��Ա������ֵ
		int tmp = dw.a;
		// ��dw�����b��Ա����ֵ����a��Ա����
		dw.a = dw.b;
		// ����ʱ����tmp��ֵ����dw�����b��Ա����
		dw.b = tmp;
		System.out.println("swap�����a��Ա������ֵ��"
			+ dw.a + "��b��Ա������ֵ��" + dw.b);
		// ��dwֱ�Ӹ�Ϊnull����������ָ���κ���Ч��ַ��
		dw = null;
	}
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("����������a��Ա������ֵ��"
			+ dw.a + "��b��Ա������ֵ��" + dw.b);
	}
}
