package chapter08_03_Set����;


import java.util.*;
/**
 * Description:
 * ��ӵ�treeSet�е�Ԫ�ر�����ͬ����
 * ����ǳ���Ա�Զ������ͣ��������Ӷ����ͬ���Զ������ͣ�������ʵ��compare�ӿ�
 *��compare����Ȼ����ݺ�����ṹ�ҵ�����Ĵ洢λ�á�
 */
public class TreeSetErrorTest2
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		// ��TreeSet�����������������
		ts.add(new String("���Java����"));
		ts.add(new Date());   // ��
	}
}
