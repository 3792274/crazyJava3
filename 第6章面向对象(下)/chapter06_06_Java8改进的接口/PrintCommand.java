package chapter06_06_Java8改进的接口;

/**
 * Description:命令模式，实际的数组处理命令
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
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
			System.out.println("迭代输出目标数组的元素:" + tmp);
		}
	}
}

