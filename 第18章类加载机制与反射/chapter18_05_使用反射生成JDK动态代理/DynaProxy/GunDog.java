package chapter18_05_ʹ�÷�������JDK��̬����.DynaProxy;


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
public class GunDog implements Dog
{
	// ʵ��info()������������ӡһ���ַ���
	public void info()
	{
		System.out.println("����һֻ�Թ�");
	}
	// ʵ��run()������������ӡһ���ַ���
	public void run()
	{
		System.out.println("�ұ���Ѹ��");
	}
}

