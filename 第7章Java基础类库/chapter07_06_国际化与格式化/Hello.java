package chapter07_06_���ʻ����ʽ��;


import java.util.*;
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
public class Hello
{
	public static void main(String[] args)
	{
		// ȡ��ϵͳĬ�ϵĹ���/���Ի���
		Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
		// ����ָ������/���Ի���������Դ�ļ�
		ResourceBundle bundle = ResourceBundle.getBundle(Hello.class.getPackage().toString().substring(8)+"\\mess", myLocale);
		// ��ӡ����Դ�ļ���ȡ�õ���Ϣ
		System.out.println(bundle.getString("hello"));
	}
}
