package chapter10_03_Checked�쳣��Runtime�쳣��ϵ;
import java.io.*;
/**
 * Description:
 * 1.���������׳����쳣Ҫ�ȸ����٣���Χͬ���������
 */
public class OverrideThrows
{
	public void test()throws IOException
	{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
class Sub extends OverrideThrows
{
	// ���෽�������׳��˱ȸ��෽��������쳣
	// �������淽������
//	public void test()throws Exception
//	{
//	}
}

