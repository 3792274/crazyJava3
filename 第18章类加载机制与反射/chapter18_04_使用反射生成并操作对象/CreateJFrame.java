package chapter18_04_ʹ�÷������ɲ���������;

import java.lang.reflect.*;
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
public class CreateJFrame
{
	public static void main(String[] args)
		throws Exception
	{
		// ��ȡJFrame��Ӧ��Class����
		Class<?> jframeClazz = Class.forName("javax.swing.JFrame");
		// ��ȡJFrame�д�һ���ַ��������Ĺ�����
		Constructor ctor = jframeClazz
			.getConstructor(String.class);
		// ����Constructor��newInstance������������
		Object obj = ctor.newInstance("���Դ���");
		// ���JFrame����
		System.out.println(obj);
	}
}
