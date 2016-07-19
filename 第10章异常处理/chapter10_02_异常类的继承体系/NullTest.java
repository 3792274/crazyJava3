package chapter10_02_异常类的继承体系;


import java.util.*;
/**
 * Description:
 */
public class NullTest
{
	public static void main(String[] args)
	{
		Date d = null;
		try
		{
			System.out.println(d.after(new Date()));
		}
		catch (NullPointerException ne)
		{
			System.out.println("空指针异常");
		}
		catch(Exception e)
		{
			System.out.println("未知异常");
		}
	}
}
