package chapter06_08_Java8������Lambda���ʽ;
/**
 * Description: Lambda���ʽ���൱��һ�������������з����������ż������塣
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CommandTest03
{
	public static void main(String[] args)
	{
		ProcessArray02 pa = new ProcessArray02();
		int[] array = {3, -4, 6, 4};
		// �������飬���崦����Ϊȡ���������ڲ���,����Ҫ������������ֵ���ͣ�ֻҪ�����������ż���������β��б���
		pa.process(array , (int[] target)->{
				int sum = 0;
				for (int tmp : target )
				{
					sum += tmp;
				}
				System.out.println("����Ԫ�ص��ܺ���:" + sum);
			});
	}
}

