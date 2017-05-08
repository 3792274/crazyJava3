package chapter04_02_分支结构;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class IfCorrectTest2
{
	public static void main(String[] args)
	{
		int age = 45;
		if (age > 60)
		{
			System.out.println("老年人");
		}
		// 在原本的if条件中增加了else的隐含条件
		if (age > 40 && !(age >60))
		{
			System.out.println("中年人");
		}
		// 在原本的if条件中增加了else的隐含条件
		if (age > 20 && !(age > 60) && !(age > 40 && !(age >60)))
		{
			System.out.println("青年人");
		}
	}
}
