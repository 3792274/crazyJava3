package chapter07_05_������ʽ;

import java.util.*;
/**
 * �滻��
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
			System.out.println(msg.replaceFirst("re\\w*" , "����:)"));
			System.out.println(Arrays.toString(msg.split(" ")));
		}
	}
}
