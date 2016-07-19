package chapter08_06_java8��ǿ��Map����;


import java.util.*;
/**
 * Description:
 *��HashSet���ƣ�����ɱ������ΪHashMap/Hashtable��key,���ҳ����޸�����Ϊkey �Ŀɱ����
 *������Ҳ�޷�׼ȷ���ʵ�Map�б��޸Ĺ�����key
 */
public class HashMapErrorTest
{
	public static void main(String[] args)
	{
		HashMap ht = new HashMap();
	
		// �˴���A����ǰһ�������A����ͬһ����
		ht.put(new A(60000) , "���Java����");
		ht.put(new A(87563) , "������Java EE��ҵӦ��ʵս");
	
		// ���Hashtable��key Set���϶�Ӧ��Iterator������
		Iterator it = ht.keySet().iterator();
		
		// ȡ��Map�е�һ��key�����޸�����countֵ
		A first = (A)it.next();
		first.count = 87563;   // ��
		
		// ���{A@1560b=���Java����, A@1560b=������Java EE��ҵӦ��ʵս}
		System.out.println(ht);
		
		// ֻ��ɾ��û�б��޸Ĺ���key����Ӧ��key-value��
		ht.remove(new A(87563));
		System.out.println(ht);
	
		// �޷���ȡʣ�µ�value���������д��붼�����null��
		System.out.println(ht.get(new A(87563)));   // �� ���null
		System.out.println(ht.get(new A(60000)));   // �� ���null
	}
}

