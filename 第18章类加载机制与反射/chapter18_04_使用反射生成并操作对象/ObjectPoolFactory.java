package chapter18_04_ʹ�÷������ɲ���������;

import java.util.*;
import java.io.*;
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
public class ObjectPoolFactory
{
	// ����һ�������,ǰ���Ƕ�������������ʵ�ʶ���
	private Map<String ,Object> objectPool = new HashMap<>();
	// ����һ����������ķ�����
	// �÷���ֻҪ����һ���ַ���������������Ը��ݸ���������Java����
	private Object createObject(String clazzName)
		throws InstantiationException
		, IllegalAccessException , ClassNotFoundException
	{
		// �����ַ�������ȡ��Ӧ��Class����
		Class<?> clazz = Class.forName(clazzName);
		// ʹ��clazz��Ӧ���Ĭ�Ϲ���������ʵ��
		return clazz.newInstance();
	}
	// �÷�������ָ���ļ�����ʼ������أ�
	// ������������ļ�����������
	public void initPool(String fileName)
		throws InstantiationException
		, IllegalAccessException ,ClassNotFoundException
	{
		try(
			FileInputStream fis = new FileInputStream(fileName))
		{
			Properties props = new Properties();
			props.load(fis);
			for (String name : props.stringPropertyNames())
			{
				// ÿȡ��һ��key-value�ԣ��͸���value����һ������
				// ����createObject()�������󣬲���������ӵ��������
				objectPool.put(name ,
					createObject(props.getProperty(name)));
			}
		}
		catch (IOException ex)
		{
			System.out.println("��ȡ" + fileName + "�쳣");
		}

	}
	public Object getObject(String name)
	{
		// ��objectPool��ȡ��ָ��name��Ӧ�Ķ���
		return objectPool.get(name);
	}

	public static void main(String[] args)
		throws Exception
	{
		ObjectPoolFactory pf = new ObjectPoolFactory();
		pf.initPool("obj.txt");
		System.out.println(pf.getObject("a"));      // ��
		System.out.println(pf.getObject("b"));      // ��
	}
}
