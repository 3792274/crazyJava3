package chapter05_01_��Ͷ���;



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
public class ReturnThis
{
	public int age;
	public ReturnThis grow()
	{
		age++;
		// return this���ص��ø÷����Ķ���
		return this;
	}
	public static void main(String[] args)
	{
		ReturnThis rt = new ReturnThis();
		// ������������ͬһ������
		rt.grow()
			.grow()
			.grow();
		System.out.println("rt��age��Ա����ֵ��:" + rt.age);
	}
}

