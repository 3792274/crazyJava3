package chapter08_03_Set����;


import java.util.*;
/**
 * Description:
 * 1.��Ȼ����
 * 1.TreeSet����ü���Ԫ�ص�compareTo(Object obj)�Ƚ�Ԫ�ش�С��
 * 2.BigDecimal/BigInteger��������ֵ���Ͱ�װ�࣬��ʵ��
 * 3.Character ���ַ���UNICODEֵ���бȽϡ�
 * 4.Boolean:true ��Ӧ�İ�װ��ʵ������false��Ӧ�İ�װ��ʵ��
 * 5.String�����ַ������ַ���UNICODE�Ƚ�
 * 6.Date��Time�����ʱ�䡢���ڱ�ǰ�������ʱ���
 * 7.�����һ���������TreeSet,��ö������ʵ��compareTo�ӿ�
 * 
 */
class Err{}
public class TreeSetErrorTest
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		// ��TreeSet�������������Err��������û��ʵ��compare�ӿڣ�����
		ts.add(new Err());
		ts.add(new Err());  //��
	}
}
