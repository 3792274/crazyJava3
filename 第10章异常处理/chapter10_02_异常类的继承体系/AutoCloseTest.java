package chapter10_02_�쳣��ļ̳���ϵ;

import java.io.*;

/**
 * Description:java7�������Զ��ر���Դ��
 * 1.Ҫ�Զ��رյ���Щ��Դ����ʵ��AutoCloseable��Closeable�ӿڣ�ʵ���������ӿڱ���ʵ��close()������
 * 2.Closeable��AutoCloseable���ӽӿڣ��׳�IOException
 * 3.AutoCloseable���׳�Exception
 * 4.java7��д�˴󲿷ֵ���Դ��Ҫ�رյ��ࡣҲ����catch finally�ȡ�
 * 
 */
public class AutoCloseTest {
	public static void main(String[] args) throws IOException {
		try (
				// ��������ʼ�������ɹرյ���Դ
				// try�����Զ��ر���������Դ��
				BufferedReader br = new BufferedReader(new FileReader("��10���쳣����\\chapter10_02_�쳣��ļ̳���ϵ\\A0utoCloseTest.java")); 
				PrintStream ps = new PrintStream(new FileOutputStream("��10���쳣����\\chapter10_02_�쳣��ļ̳���ϵ\\a.txt"))) {
			// ʹ��������Դ
			System.out.println(br.readLine());
			ps.println("ׯ�������Ժ���");
		} 
	}
	
	
	
}
