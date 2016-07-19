package chapter14_03_自定义Annotation.one;



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
public class RunTests
{
	public static void main(String[] args)
		throws Exception
	{
		// 处理MyTest类
		ProcessorTest.process("chapter14_03_自定义Annotation.one.MyTest");
	}
}

