package chapter03_05_基本类型的类型转换;

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
public class RandomStr
{
	
	//生成验证码的例子
	public static void main(String[] args)
	{
		// 定义一个空字符串
		String result = "";
		// 进行6次循环
		for(int i = 0 ; i < 6 ; i ++)
		{
			// 生成一个97～122的int型的整数
			int intVal = (int)(Math.random() * 26 + 97);
			// 将intValue强制转换为char后连接到result后面
			result = result + (char)intVal;
		}
		// 输出随机字符串
		System.out.println(result);
	}
}
