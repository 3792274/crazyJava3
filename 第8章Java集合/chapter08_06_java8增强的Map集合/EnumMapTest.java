package chapter08_06_java8��ǿ��Map����;


import java.util.*;
/**
 * Description:
 * 1.EnumMap�ڲ������鱣�棬���ա���Ч
 * 2.key����Ȼ˳��(ö��ֵ��ö�����ж����˳��)��ά��key-value��˳��ͨ��keySet()/entrySet()/values()���Կ���
 * 3.������null��Ϊkey,������Ϊvalue,��ѯ��ɾ��ֵΪnull��key�����׳��쳣��
 * 4.�봴����ͨMap���𣬴���EnumMapʱ�����ƶ�һ��ö���࣬�Ӷ�����EnumMap��ָ����ö�������������
 */
enum Season
{
	SPRING,SUMMER,FALL,WINTER
}


public class EnumMapTest
{
	public static void main(String[] args)
	{
		// ����EnumMap���󣬸�EnumMap������key����Seasonö�����ö��ֵ
		EnumMap enumMap = new EnumMap(Season.class);
		enumMap.put(Season.SUMMER , "��������");
		enumMap.put(Season.SPRING , "��ů����");
		System.out.println(enumMap);
	}
}
