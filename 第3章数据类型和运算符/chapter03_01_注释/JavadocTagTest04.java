package chapter03_01_ע��;
/**
 * Description:
 * <br>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 * @see "�μ�" ����ָ������ο�������
 * 
 */
public class JavadocTagTest04
{
	/**
	 * һ���õ����к��ַ����ķ�����
	 * @param name �ò���ָ����˭���к���
	 * @return ���ش��к����ַ�����
	 * @deprecated ��ʱ�ģ����Ƽ�ʹ�õķ���
	 * @see "�μ�" ����ָ������ο�������
	 * @exception �׳��쳣������
	 * @throws �׳��쳣����@exception ͬ�塣
	 */
	public String hello(String name)
	{
		return name + "����ã�";
	}
}
