package chapter10_03_Checked�쳣��Runtime�쳣��ϵ;


import java.io.*;
/**
 * Description:
 */
public class ThrowsTest2
{
	public static void main(String[] args) throws Exception
	{
		// ��Ϊtest()���������׳�IOException�쳣��
		// ���Ե��ø÷����Ĵ���Ҫô����try...catch���У�
		// Ҫô������һ����throws�����׳��ķ����С�
		test();
	}
	public static void test()throws IOException
	{
		// ��ΪFileInputStream�Ĺ����������׳�IOException�쳣��
		// ���Ե���FileInputStream�Ĵ���Ҫô����try...catch���У�
		// Ҫô������һ����throws�����׳��ķ����С�
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
