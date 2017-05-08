package chapter15_09_NIO;


import java.nio.charset.*;
import java.util.*;
/**
 * Description:获取JDK支持的全部字符集
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CharsetTest
{
	public static void main(String[] args)
	{
		String fileEncoding = System.getProperty("file.encoding");
		System.out.println("本地系统的文件编码格式： "+fileEncoding);
		
		// 获取Java支持的全部字符集
		SortedMap<String,Charset>  map = Charset.availableCharsets();
		for (String alias : map.keySet())
		{
			// 输出字符集的别名和对应的Charset对象
			System.out.println(alias + "----->"+ map.get(alias));
		}
	}
}
