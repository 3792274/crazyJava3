package chapter06_06_Java8改进的接口;
/**
 * Description:命令模式
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

//数组的处理类，该类不知道将如何处理数组，提供一个命令
public class ProcessArray
{
	public void process(int[] target , Command cmd)
	{
		cmd.process(target);
	}
}
