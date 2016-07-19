package chapter06_04_final修饰符;

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
public class FinalMethodTest
{
	public final void test(){}
}
class Sub02 extends FinalMethodTest
{
	// 下面方法定义将出现编译错误，不能重写final方法
//	public void test(){}
}

