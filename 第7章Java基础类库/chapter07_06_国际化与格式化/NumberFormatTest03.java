package chapter07_06_���ʻ����ʽ��;

import java.util.*;
import java.text.*;
/**
 * Description:ʾ��NumberFormat�����ָ�ʽ����ʹ�á�
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class NumberFormatTest03
{
	public static void main(String[] args)
	{
		// ��Ҫ����ʽ��������
		double db = 1234000.567;
		
		// �����ĸ�Locale���ֱ�����й����ձ����¹�������
		Locale[] locales = {Locale.CHINA, Locale.JAPAN, Locale.GERMAN,  Locale.US};
		NumberFormat[] nf = new NumberFormat[12];
		
		
		// Ϊ�����ĸ�Locale����12��NumberFormat����
		// ÿ��Locale�ֱ���ͨ����ֵ��ʽ�����ٷֱȸ�ʽ�������Ҹ�ʽ��
		for (int i = 0 ; i < locales.length ; i++)
		{
			nf[i * 3] = NumberFormat.getNumberInstance(locales[i]);
			nf[i * 3 + 1] = NumberFormat.getPercentInstance(locales[i]);
			nf[i * 3 + 2] = NumberFormat.getCurrencyInstance(locales[i]);
		}
		
		for (int i = 0 ; i < locales.length ; i++)
		{
			String tip = (i == 0) ? ("----�й��ĸ�ʽ----") : (i == 1) ? ("----�ձ��ĸ�ʽ----") : ( i == 2) ? ("----�¹��ĸ�ʽ----") :("----�����ĸ�ʽ----");
			
			System.out.println(tip);
			System.out.println("ͨ����ֵ��ʽ��" + nf[i * 3].format(db));
			System.out.println("�ٷֱ���ֵ��ʽ��" + nf[i * 3 + 1].format(db));
			System.out.println("������ֵ��ʽ��" + nf[i * 3 + 2].format(db));
		}
	}
}

