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
class MyTest
{
	static
	{
		System.out.println("��̬��ʼ����...");
	}
	// ʹ��һ���ַ���ֱ����Ϊstatic final���������ֵ
	static final String compileConstant = "���Java����";
}
public class CompileConstantTest
{
	public static void main(String[] args)
	{
		// ���ʡ����MyTest�е�compileConstant�����
		System.out.println(MyTest.compileConstant);   // ��
	}
}
