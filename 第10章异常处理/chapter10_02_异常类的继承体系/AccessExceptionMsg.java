package chapter10_02_�쳣��ļ̳���ϵ;


import java.io.*;
/**
 * Description:�����쳣��Ϣ
 * 1.getMessage():�����쳣��ϸ��Ϣ�ַ���
 * 2.printStackTrace():����ջ��Ϣ�����Ļ
 * 3.printStackTrace(PrintStream s) ���쳣����ջ��Ϣ�����ָ�������
 * 4.getStackTrace():�����쳣�ĸ���ջ��Ϣ��
 * 
 */
public class AccessExceptionMsg
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("��10���쳣����\\chapter10_02_�쳣��ļ̳���ϵ\\b.txt");
		}
		catch (IOException ioe)
		{
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}
}
