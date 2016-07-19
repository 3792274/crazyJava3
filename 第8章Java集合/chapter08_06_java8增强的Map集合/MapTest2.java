package chapter08_06_java8��ǿ��Map����;


import java.util.*;
/**
 * Description:
 * java8�������Ķ�Map�����ķ���
 */
public class MapTest2
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		
		// �ɶԷ�����key-value��
		map.put("���Java����" , 109);
		map.put("���iOS����" , 99);
		map.put("���Ajax����" , 79);
	
		// �����滻keyΪ"���XML����"��value������ԭMap��û�ж�Ӧ��key��
		// ��˶�Mapû�иı䣬��������µ�key-value��
		map.replace("���XML����" , 66);
		System.out.println(map);
		
		// ʹ��ԭvalue�������������Ľ������ԭ�е�value
		map.merge("���iOS����" , 10 ,
			(oldVal , param) -> (Integer)oldVal + (Integer)param);
		System.out.println(map); // "���iOS����"��value������10
	
		// ��keyΪ"Java"��Ӧ��valueΪnull���򲻴���ʱ����ʹ�ü���Ľ����Ϊ��value
		map.computeIfAbsent("Java" , (key)->((String)key).length());
		System.out.println(map); // map������� Java=4 ����key-value��
	
		// ��keyΪ"Java"��Ӧ��value����ʱ��ʹ�ü���Ľ����Ϊ��value
		map.computeIfPresent("Java",
			(key , value) -> (Integer)value * (Integer)value);
		System.out.println(map); // map�� Java=4 ��� Java=16
	}
}
