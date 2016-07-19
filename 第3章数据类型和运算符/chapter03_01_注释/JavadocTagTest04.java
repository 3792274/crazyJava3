package chapter03_01_注释;
/**
 * Description:
 * <br>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 * @see "参见" 用于指定交叉参考的内容
 * 
 */
public class JavadocTagTest04
{
	/**
	 * 一个得到打招呼字符串的方法。
	 * @param name 该参数指定向谁打招呼。
	 * @return 返回打招呼的字符串。
	 * @deprecated 过时的，不推荐使用的方法
	 * @see "参见" 用于指定交叉参考的内容
	 * @exception 抛出异常的类型
	 * @throws 抛出异常，和@exception 同义。
	 */
	public String hello(String name)
	{
		return name + "，你好！";
	}
}
