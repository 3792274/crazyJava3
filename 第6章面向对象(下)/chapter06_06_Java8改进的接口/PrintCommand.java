package chapter06_06_Java8�Ľ��Ľӿ�;

/**
 * Description:����ģʽ��ʵ�ʵ����鴦������
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

public class PrintCommand implements Command
{
	
	@Override
	public void process(int[] target)
	{
		for (int tmp : target )
		{
			System.out.println("�������Ŀ�������Ԫ��:" + tmp);
		}
	}
}

