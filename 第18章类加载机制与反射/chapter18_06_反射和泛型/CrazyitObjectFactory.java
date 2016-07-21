package chapter18_06_����ͷ���;


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
public class CrazyitObjectFactory
{
	public static Object getInstance(String clsName)
	{
		try
		{
			// ����ָ�����Ӧ��Class����
			Class cls = Class.forName(clsName);
			// ����ʹ�ø�Class������������ʵ��
			return cls.newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
