package chapter06_04_final���η�;



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
class CacheImmutale
{
	private static int MAX_SIZE = 10;
	// ʹ���������������е�ʵ��
	private static CacheImmutale[] cache
		= new CacheImmutale[MAX_SIZE];
	// ��¼����ʵ���ڻ����е�λ��,cache[pos-1]�����»����ʵ��
	private static int pos = 0;
	private final String name;
	private CacheImmutale(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public static CacheImmutale valueOf(String name)
	{
		// �����ѻ���Ķ���
		for (int i = 0 ; i < MAX_SIZE; i++)
		{
			// ���������ͬʵ����ֱ�ӷ��ظû����ʵ��
			if (cache[i] != null
				&& cache[i].getName().equals(name))
			{
				return cache[i];
			}
		}
		// ������������
		if (pos == MAX_SIZE)
		{
			// �ѻ���ĵ�һ�����󸲸ǣ����Ѹո����ɵĶ�����ڻ���ص��ʼλ�á�
			cache[0] = new CacheImmutale(name);
			// ��pos��Ϊ1
			pos = 1;
		}
		else
		{
			// ���´����Ķ��󻺴�������pos��1
			cache[pos++] = new CacheImmutale(name);
		}
		return cache[pos - 1];

	}
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == CacheImmutale.class)
		{
			CacheImmutale ci = (CacheImmutale)obj;
			return name.equals(ci.getName());
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode();
	}
}
public class CacheImmutaleTest
{
	public static void main(String[] args)
	{
		CacheImmutale c1 = CacheImmutale.valueOf("hello");
		CacheImmutale c2 = CacheImmutale.valueOf("hello");
		// ������뽫���true
		System.out.println(c1 == c2);
	}
}