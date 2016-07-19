package chapter07_03_������;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import com.sun.xml.internal.ws.api.server.ThreadLocalContainerResolver;
/**
 * Description:
 * 1.Randomʹ��һ��48λ�����ӣ��������������ʵ����ͬһ�����Ӵ�������������ͬ����˳����÷����������ǻ������ͬ���������С�<br>
 * 2.��ʹ��Ĭ�ϵ����ӹ���Random����ʱ����������ͬһ�����ӡ�
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
public class SeedTest06
{
	public static void main(String[] args)
	{
		Random r1 = new Random(50);
		
		System.out.println("��һ������Ϊ50��Random����");
		System.out.println("r1.nextBoolean():\t" + r1.nextBoolean());
		System.out.println("r1.nextInt():\t\t" + r1.nextInt(55));
		System.out.println("r1.nextDouble():\t" + r1.nextDouble());
		System.out.println("r1.nextGaussian():\t" + r1.nextGaussian());
		System.out.println("---------------------------");
		
		Random r2 = new Random(50);
		System.out.println("�ڶ�������Ϊ50��Random����");
		System.out.println("r2.nextBoolean():\t" + r2.nextBoolean());
		System.out.println("r2.nextInt():\t\t" + r2.nextInt(55));
		System.out.println("r2.nextDouble():\t" + r2.nextDouble());
		System.out.println("r2.nextGaussian():\t" + r2.nextGaussian());
		System.out.println("---------------------------");
	
		Random r3 = new Random(100);
		System.out.println("����Ϊ100��Random����");
		System.out.println("r3.nextBoolean():\t" + r3.nextBoolean());
		System.out.println("r3.nextInt():\t\t" + r3.nextInt());
		System.out.println("r3.nextDouble():\t" + r3.nextDouble());
		System.out.println("r3.nextGaussian():\t" + r3.nextGaussian());
		
		
		//Ϊ�˱��������������ͬ���Ƽ�ʹ��ʱ����Ϊ����
		Random r4=new Random(System.currentTimeMillis());
		
		//�ڶ��߳���ʹ��ThreadLocalRandom,����α�����
		ThreadLocalRandom r5 =  ThreadLocalRandom.current();
		int val1= r5.nextInt(4,20);
		double val2=  r5.nextDouble(2.0,10.0);
	
	}
}
