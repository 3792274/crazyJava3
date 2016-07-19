package chapter07_04_java8������ʱ����;

import java.util.*;
import static java.util.Calendar.*;

import java.time.Year;
/**
 * Description:
 * 1.ȫ����ͨ�õ����� ��Gregorian Calendar ������-���������������-GregorianCalendar
 * 2.Calendar��һ�������࣬���ܴ���ʵ����
 * 
 * 
 * 
 * 
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CalendarTest02
{
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		// ȡ����
		System.out.println(c.get(YEAR));
		// ȡ���·�
		System.out.println(c.get(MONTH)+1);
		// ȡ����
		System.out.println(c.get(DATE));
		// �ֱ������ꡢ�¡��ա�Сʱ�����ӡ���
		c.set(2003 , 10 , 23 , 12, 32, 23); //2003-11-23 12:32:23
		System.out.println(c.getTime());
		// ��Calendar����ǰ��1��
		c.add(YEAR , -1); //2002-11-23 12:32:23
		System.out.println(c.getTime());
		// ��Calendar����ǰ��8����
		c.roll(MONTH , -8); //2002-03-23 12:32:23
		System.out.println(c.getTime());


		Calendar cal1 = Calendar.getInstance();
		cal1.set(2003, 7, 23, 0, 0 , 0); // 2003-8-23
		cal1.add(MONTH, 6); //2003-8-23 => 2004-2-23
		System.out.println(cal1.getTime());


		Calendar cal2 = Calendar.getInstance();
		cal2.set(2003, 7, 31, 0, 0 , 0); // 2003-8-31
		// ��Ϊ��λ�����·ݸ�Ϊ2�£�2��û��31�գ��Զ����29��
		cal2.add(MONTH, 6); // 2003-8-31 => 2004-2-29
		System.out.println(cal2.getTime());


		Calendar cal3 = Calendar.getInstance();
		cal3.set(2003, 7, 23, 0, 0 , 0); //2003-8-23
		// MONTH�ֶΡ���λ������YEAR�ֶβ�������
		cal3.roll(MONTH, 6); //2003-8-23 => 2003-2-23
		System.out.println(cal3.getTime());


		Calendar cal4 = Calendar.getInstance();
		cal4.set(2003, 7, 31, 0, 0 , 0); //2003-8-31
		// MONTH�ֶΡ���λ������2��2��û��31�գ�
		// YEAR�ֶβ���ı䣬2003��2��ֻ��28��
		cal4.roll(MONTH, 6); //2003-8-31 => 2003-2-28
		System.out.println(cal4.getTime());
	}
}

