package chapter18_06_����ͷ���;

import java.util.*;
import javax.swing.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CrazyitObjectFactory2
{
	public static <T> T getInstance(Class<T> cls)
	{
		try
		{
			return cls.newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args)
	{
		// ��ȡʵ������������ת��
		Date d = CrazyitObjectFactory2.getInstance(Date.class);
		JFrame f = CrazyitObjectFactory2.getInstance(JFrame.class);
	}
}
