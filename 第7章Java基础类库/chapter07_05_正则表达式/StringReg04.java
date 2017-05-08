package chapter07_05_正则表达式;

import java.util.*;
/**
 * 替换。
 */
public class StringReg04
{
	public static void main(String[] args)
	{
		String[] msgs =
		{
			"Java has regular expressions in 1.4",
			"regular expressions now expressing in Java",
			"Java represses oracular expressions"
		};
		for (String msg : msgs)
		{
			System.out.println(msg.replaceFirst("re\\w*" , "哈哈:)"));
			System.out.println(Arrays.toString(msg.split(" ")));
		}
	}
}
