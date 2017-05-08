package chapter07_03_常用类;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import com.sun.xml.internal.ws.api.server.ThreadLocalContainerResolver;
/**
 * Description:
 * 1.Random使用一个48位的种子，如果这个类的两个实例是同一个种子创建，对他们以同样的顺序调用方法，则他们会产生相同的数字序列。<br>
 * 2.当使用默认的种子构造Random对象时，他们属于同一个种子。
 * 
 * 
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
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
		
		System.out.println("第一个种子为50的Random对象");
		System.out.println("r1.nextBoolean():\t" + r1.nextBoolean());
		System.out.println("r1.nextInt():\t\t" + r1.nextInt(55));
		System.out.println("r1.nextDouble():\t" + r1.nextDouble());
		System.out.println("r1.nextGaussian():\t" + r1.nextGaussian());
		System.out.println("---------------------------");
		
		Random r2 = new Random(50);
		System.out.println("第二个种子为50的Random对象");
		System.out.println("r2.nextBoolean():\t" + r2.nextBoolean());
		System.out.println("r2.nextInt():\t\t" + r2.nextInt(55));
		System.out.println("r2.nextDouble():\t" + r2.nextDouble());
		System.out.println("r2.nextGaussian():\t" + r2.nextGaussian());
		System.out.println("---------------------------");
	
		Random r3 = new Random(100);
		System.out.println("种子为100的Random对象");
		System.out.println("r3.nextBoolean():\t" + r3.nextBoolean());
		System.out.println("r3.nextInt():\t\t" + r3.nextInt());
		System.out.println("r3.nextDouble():\t" + r3.nextDouble());
		System.out.println("r3.nextGaussian():\t" + r3.nextGaussian());
		
		
		//为了避免两个随机数相同，推荐使用时间作为种子
		Random r4=new Random(System.currentTimeMillis());
		
		//在多线程下使用ThreadLocalRandom,生成伪随机数
		ThreadLocalRandom r5 =  ThreadLocalRandom.current();
		int val1= r5.nextInt(4,20);
		double val2=  r5.nextDouble(2.0,10.0);
	
	}
}
