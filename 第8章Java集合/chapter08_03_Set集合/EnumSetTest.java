package chapter08_03_Set����;


import java.util.*;
/**
 * Description:
 * ���ʹ��EnumSet������ö����Ķ��ö��ֵ��
 * 1.����Ԫ�ر�����ָ����ö�����͵�ö��ֵ��
 * 2.�ڲ���λ��������ʽ�洢���ǳ����ա���Ч���ڴ�С
 * 3.EnumSet���������nullԪ��
 * 4.Ӧͨ�����ṩ���෽��������EnumSet
 */
enum Season
{
	SPRING,SUMMER,FALL,WINTER
}
public class EnumSetTest
{
	public static void main(String[] args)
	{
		// ����һ��EnumSet���ϣ�����Ԫ�ؾ���Seasonö�����ȫ��ö��ֵ
		EnumSet es1 = EnumSet.allOf(Season.class);
		System.out.println(es1); // ���[SPRING,SUMMER,FALL,WINTER]
		// ����һ��EnumSet�ռ��ϣ�ָ���伯��Ԫ����Season���ö��ֵ��
		EnumSet es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2); // ���[]
		// �ֶ��������Ԫ��
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
		System.out.println(es2); // ���[SPRING,WINTER]
		// ��ָ��ö��ֵ����EnumSet����
		EnumSet es3 = EnumSet.of(Season.SUMMER , Season.WINTER);
		System.out.println(es3); // ���[SUMMER,WINTER]
		EnumSet es4 = EnumSet.range(Season.SUMMER , Season.WINTER);
		System.out.println(es4); // ���[SUMMER,FALL,WINTER]
		// �´�����EnumSet���ϵ�Ԫ�غ�es4���ϵ�Ԫ������ͬ���ͣ�
		// es5�ļ���Ԫ�� + es4����Ԫ�� = Seasonö�����ȫ��ö��ֵ
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5); // ���[SPRING]
	}
}
