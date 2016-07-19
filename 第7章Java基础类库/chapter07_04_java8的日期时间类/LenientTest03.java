package chapter07_04_java8������ʱ����;

import java.util.*;
import static java.util.Calendar.*;

/**
 * Description:
 * 
 * 1.����Calendars�ݴ���
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
public class LenientTest03
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		
		// �����YEAR�ֶμ�1��MONTH�ֶ�Ϊ1�����£�
		cal.set(MONTH , 13);   //��
		System.out.println(cal.getTime());
		
		// �ر��ݴ���
		cal.setLenient(false);
		
		// ��������ʱ�쳣
		cal.set(MONTH , 13);   //��
		System.out.println(cal.getTime());
	}
}
