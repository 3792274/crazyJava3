package chapter10_02_�쳣��ļ̳���ϵ;


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
			System.out.println("��ָ���쳣");
		}
		catch(Exception e)
		{
			System.out.println("δ֪�쳣");
		}
	}
}
