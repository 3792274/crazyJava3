
package chapter07_06_国际化与格式化;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
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
public class HelloArg02
{
	public static void main(String[] args)
	{
		// 定义一个Locale变量
		Locale currentLocale = null;
	
		// 如果运行程序的指定了两个参数
		if (args.length == 2)
		{
			// 使用运行程序的两个参数构造Locale实例
			currentLocale = new Locale(args[0] , args[1]);
		}
		else
		{
			// 否则直接使用系统默认的Locale
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		// 根据Locale加载语言资源
		ResourceBundle bundle = ResourceBundle .getBundle(HelloArg02.class.getPackage().toString().substring(8)+"\\myMess" , currentLocale);
	
		// 取得已加载的语言资源文件中msg对应消息
		String msg = bundle.getString("msg");
		
		// 使用MessageFormat为带占位符的字符串传入参数
		System.out.println(MessageFormat.format(msg , "yeeku" , new Date()));
	}
}
