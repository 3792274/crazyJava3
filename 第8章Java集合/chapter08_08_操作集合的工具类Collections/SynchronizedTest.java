package chapter08_08_�������ϵĹ�����Collections;


import java.util.*;
/**
 * Description:��װ���߳�ͬ���ļ��ϡ�
 */
public class SynchronizedTest
{
	public static void main(String[] args)
	{
		// ������򴴽����ĸ��̰߳�ȫ�ļ��϶���
		Collection c = Collections .synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
	}
}
