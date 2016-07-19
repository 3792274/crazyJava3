package chapter08_03_Set����;


import java.util.*;
/**
 * Description:
 * �����treeSet�����һ���ɱ����󣬲��Һ���ĳ����޸��˸ÿɱ�����ʵ��������������������������Ĵ�С˳��
 * �����ı䣬��treeSet�����ٴε������ǵ�˳���������ܵ���treeSet�б��������������ͨ��compareTo�����Ƚ�
 * ����ֵ0
 */

class RR implements Comparable
{
	int count;
	public RR(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "RR[count:" + count + "]";
	}
	// ��дequals����������count���ж��Ƿ����
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == R.class)
		{
			RR r = (RR)obj;
			return r.count == this.count;
		}
		return false;
	}
	// ��дcompareTo����������count���Ƚϴ�С
	public int compareTo(Object obj)
	{
		RR r = (RR)obj;
		return count > r.count ? 1 :
			count < r.count ? -1 : 0;
	}
}
public class TreeSetTest3
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(new RR(5));
		ts.add(new RR(-3));
		ts.add(new RR(9));
		ts.add(new RR(-2));
		// ��ӡTreeSet���ϣ�����Ԫ�����������е�
		System.out.println(ts);    // ��
		// ȡ����һ��Ԫ��
		RR first = (RR)ts.first();
		// �Ե�һ��Ԫ�ص�count��ֵ
		first.count = 20;
		// ȡ�����һ��Ԫ��
		RR last = (RR)ts.last();
		// �����һ��Ԫ�ص�count��ֵ����ڶ���Ԫ�ص�count��ͬ
		last.count = -2;
		// �ٴ����������TreeSet���Ԫ�ش�������״̬�������ظ�Ԫ��
		System.out.println(ts);   // ��
		// ɾ��ʵ���������ı��Ԫ�أ�ɾ��ʧ��
		System.out.println(ts.remove(new RR(-2)));   // ��
		System.out.println(ts);
		// ɾ��ʵ������û�б��ı��Ԫ�أ�ɾ���ɹ���ִ�к�treeSet���Ԫ�ؽ������������������򣩣��������Ϳ���ɾ��Ԫ����
		System.out.println(ts.remove(new RR(5)));    // ��
		System.out.println(ts);
	}
}
