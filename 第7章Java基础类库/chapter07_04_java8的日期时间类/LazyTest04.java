package chapter07_04_java8������ʱ����;

import java.util.*;
import static java.util.Calendar.*;
/**
 * Description:
 * 
 * set()�����ӳ��޸�
 * set(f,value)�����������ֶ�f����Ϊvalue,��������������һ���ڲ���Ա��������ָʾ�����ֶ�f�Ѿ������ģ����������ֶ�f�����������ĵ�
 * ����calendar�������ʱ��ȴ���������޸ģ�ֱ���´ε���get()/getTime()/getTimeInMillis()/add()/roll()ʱ�Ż����¼�������ʱ�䣬
 * �ⱻ��Ϊset()�������ӳ��޸ģ��ô��ǵ���set�ö�β���Ҫ����̫��Ρ�
 * 
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class LazyTest04
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(2003 , 7 , 31);  //2003-8-31
		
		// ���·���Ϊ9����9��31�ղ����ڡ�
		// ��������޸ģ�ϵͳ�����cal�Զ�������10��1�ա�
		 cal.set(MONTH , 8);
		
		// ����������10��1��,�򿪺Ͳ��򿪶������3�������Ӱ��
	    //System.out.println(cal.getTime());    //��
		
		// ����DATE�ֶ�Ϊ5,��Ȼ�����Ѿ�������������Month�Զ�������10��1�գ�
		cal.set(DATE , 5);    //��
		System.out.println(cal.getTime());    //��
	}
}
