package chapter06_10_��������������;

/**
 * Description:��ʾfinalize��εĲ�ȷ���У�������ڸ÷����и������� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FinalizeTest03 {
	
	private static FinalizeTest03 ft = null;

	public void info() {
		System.out.println("������Դ�����finalize  info ����");
	}

	public static void main(String[] args) throws Exception {
		
		// ����FinalizeTest������������ɻָ�״̬
		new FinalizeTest03();
		
		// ֪ͨϵͳ������Դ����
		// System.gc(); //�� ���ע�ͱ��У���Ȼǿ�ƻ��յ�û��֪ͨ��Ҳ�޷����գ�Ҫ����1.֪ͨ��2ǿ�ƣ�����ִ��Ŀ������finalize����
		
		// ǿ���������ջ��Ƶ��ÿɻָ������finalize()����
		// Runtime.getRuntime().runFinalization(); //��
		System.runFinalization(); // ��
		
		ft.info();
	}

	public void finalize() {
		// ��tf���õ���ͼ���յĿɻָ����󣬼��ɻָ��������±�ɿɴ�
		ft = this;
	}
}
