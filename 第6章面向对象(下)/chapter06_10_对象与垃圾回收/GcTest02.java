package chapter06_10_��������������;


/**
 * Description:��������
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class GcTest02
{
	public static void main(String[] args)
	{
		for (int i = 0 ; i < 4; i++)
		{
			//����4���ɻָ�״̬�Ķ���
			new GcTest02();
			// �������д����������ȫ��ͬ��ǿ��ϵͳ������������
			// System.gc();
			Runtime.getRuntime().gc();
		}
	}
	
	/**
	 * 
	 * java -verbose:gc GcTest  �ɿ����������յĶ���
	 * 
	 * */
	
	
	//���û�������֪ͨ�������գ�ֱ�������˳�ϵͳ��Ȼ������ո���Դ��GC��������ǰ��Ҫ���ø÷���
	@Override
	public void finalize()
	{
		System.out.println("ϵͳ��������GcTest�������Դ...");
	}
}
