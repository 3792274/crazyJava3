package chapter06_06_Java8�Ľ��Ľӿ�;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

public class OutputFieldTest
{
	public static void main(String[] args)
	{
		// ������һ�����е�Output�ӿڵ�MAX_CACHE_LINE
		System.out.println(Output.MAX_CACHE_LINE);
		
		// ������佫����"Ϊfinal������ֵ"�ı����쳣
		// lee.Output.MAX_CACHE_LINE = 20;
		
		// ʹ�ýӿ��������෽��
		System.out.println(Output.staticTest());
	}
}
