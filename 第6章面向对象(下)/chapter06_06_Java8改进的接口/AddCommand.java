package chapter06_06_Java8�Ľ��Ľӿ�;


/**
 * Description:����ģʽ�����鴦���ʵ������
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class AddCommand implements Command
{
	@Override
	public void process(int[] target)
	{
		int sum = 0;
		for (int tmp : target )
		{
			sum += tmp;
		}
		System.out.println("����Ԫ�ص��ܺ���:" + sum);
	}
}

