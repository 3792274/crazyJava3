package chapter15_05_重定向标准输入输出;


import java.util.*;
import java.io.*;
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
public class RedirectIn
{
	public static void main(String[] args)
	{
		try(
			FileInputStream fis = new FileInputStream("E:/电影/【震撼视频】美国最新“网络战揭秘”史诗纪录片（独家字幕） .mp4"))
		{
			// 将标准输入重定向到fis输入流
			System.setIn(fis);
			// 使用System.in创建Scanner对象，用于获取标准输入
			Scanner sc = new Scanner(System.in);
			// 增加下面一行将只把回车作为分隔符
			sc.useDelimiter("/n");
			// 判断是否还有下一个输入项
			while(sc.hasNext())
			{
				// 输出输入项
				System.out.println("键盘输入的内容是：" + sc.next());
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

