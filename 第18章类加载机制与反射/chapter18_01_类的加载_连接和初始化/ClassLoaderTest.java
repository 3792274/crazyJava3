package chapter18_01_��ļ���_���Ӻͳ�ʼ��;


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
class Tester
{
	static
	{
		System.out.println("Tester��ľ�̬��ʼ����...");
	}
}
public class ClassLoaderTest
{
	public static void main(String[] args)
		throws ClassNotFoundException
	{
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		// �����������Ǽ���Tester��
		cl.loadClass("Tester");
		System.out.println("ϵͳ����Tester��");
		// �������Ż��ʼ��Tester��
		Class.forName("Tester");
	}
}

