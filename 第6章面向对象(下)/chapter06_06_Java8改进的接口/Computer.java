package chapter06_06_Java8�Ľ��Ľӿ�;
 
/**
 * Description:�򵥹���ģʽ
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

//computer����ȫ��print�����
public class Computer
{
	//���һ��out������á�����ӿڱ��
	private Output out;
	
	public Computer(Output out)
	{
		this.out = out;
	}
	
	// ����һ��ģ���ȡ�ַ�������ķ���
	public void keyIn(String msg)
	{
		out.putData(msg);
	}
	// ����һ��ģ���ӡ�ķ���
	public void print()
	{
		out.out();
	}
}
