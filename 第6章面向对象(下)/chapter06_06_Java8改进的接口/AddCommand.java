package chapter06_06_Java8改进的接口;


/**
 * Description:命令模式，数组处理的实际命令
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
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
		System.out.println("数组元素的总和是:" + sum);
	}
}

