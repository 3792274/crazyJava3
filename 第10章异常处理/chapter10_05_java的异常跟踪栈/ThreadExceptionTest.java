package chapter10_05_javaµÄÒì³£¸ú×ÙÕ»;



/**
 * Description:
 * <br/>ÍøÕ¾: <a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ThreadExceptionTest implements Runnable
{
	@Override
	public void run()
	{
		firstMethod();
	}
	
	public void firstMethod()
	{
		secondMethod();
	}
	
	
	public void secondMethod()
	{
		int a = 5;
		int b = 0;
		int c = a / b;
	}
	
	
	public static void main(String[] args)
	{
		new Thread(new ThreadExceptionTest()).start();
	}
}
