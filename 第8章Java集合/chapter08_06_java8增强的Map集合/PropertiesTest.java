package chapter08_06_java8��ǿ��Map����;


import java.util.*;
import java.io.*;
/**
 * Description:
 * ��Hashtable ������,�����Դ�xml�л�ȡ��
 */
public class PropertiesTest
{
	public static void main(String[] args) throws Exception
	{
		Properties props = new Properties();
		
		// ��Properties����������
		props.setProperty("username" , "yeeku");
		props.setProperty("password" , "123456");
		
		// ��Properties�е�key-value�Ա��浽a.ini�ļ���
		props.store(new FileOutputStream("��8��Java����\\chapter08_06_java8��ǿ��Map����\\a.ini"), "comment line");   //��
		
		// �½�һ��Properties����
		Properties props2 = new Properties();
		
		// ��Properties����������
		props2.setProperty("gender" , "male");
		
		// ��a.ini�ļ��е�key-value��׷�ӵ�props2��
		props2.load(new FileInputStream("��8��Java����\\chapter08_06_java8��ǿ��Map����\\a.ini") );   //��
		System.out.println(props2);
	}
}
