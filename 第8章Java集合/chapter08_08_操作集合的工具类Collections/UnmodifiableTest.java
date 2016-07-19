package chapter08_08_�������ϵĹ�����Collections;


import java.util.*;
/**
 * Description:���ò��ɱ伯��
 * ����������ԭ�м��϶��󣬷���ֵ�Ǹü��ϵġ�ֻ�����汾��
 * 
 */
public class UnmodifiableTest
{
	public static void main(String[] args)
	{
		// ����һ���յġ����ɸı��List����
		List unmodifiableList = Collections.emptyList();
		
		// ����һ��ֻ��һ��Ԫ�أ��Ҳ��ɸı��Set����
		Set unmodifiableSet = Collections.singleton("���Java����");
		
		// ����һ����ͨMap����
		Map scores = new HashMap();
		scores.put("����" , 80);
		scores.put("Java" , 82);
	
		// ������ͨMap�����Ӧ�Ĳ��ɱ�汾
		Map unmodifiableMap = Collections.unmodifiableMap(scores);
		
		// ��������һ�д��붼������UnsupportedOperationException�쳣
		unmodifiableList.add("����Ԫ��");   //��
		unmodifiableSet.add("����Ԫ��");    //��
		unmodifiableMap.put("����" , 90);   //��
	}
}

