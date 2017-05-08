package chapter08_09_繁琐的接口Enumeration;


import java.util.*;
/**
 * Description:基本不用看，太早过时的
 */
public class EnumerationTest
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add("疯狂Java讲义");
		v.add("轻量级Java EE企业应用实战");
	
		Hashtable scores = new Hashtable();
		scores.put("语文" , 78);
		scores.put("数学" , 88);
		
		Enumeration em = v.elements();
		while (em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
	
		Enumeration keyEm = scores.keys();
		while (keyEm.hasMoreElements())
		{
			Object key = keyEm.nextElement();
			System.out.println(key + "--->"+ scores.get(key));
		}
	}
}
