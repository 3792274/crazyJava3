package chapter06_04_final���η�;



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
public class PrivateFinalMethodTest
{
	private final void test(){}
}
class Sub extends PrivateFinalMethodTest
{
	// ���淽�����彫�����������
	public void test(){}
}
