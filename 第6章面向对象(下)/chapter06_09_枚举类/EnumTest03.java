package chapter06_09_ö����;


/**
 * Description:ö����ʹ��
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class EnumTest03
{
	public void judge(SeasonEnum02 s)
	{
		// switch�����ı��ʽ������ö��ֵ
		switch (s)
		{
			case SPRING:
				System.out.println("��ů����������̤��");
				break;
			case SUMMER:
				System.out.println("�������ף��ʺ���Ӿ");
				break;
			case FALL:
				System.out.println("�����ˬ��������ʱ");
				break;
			case WINTER:
				System.out.println("����ѩƮ��Χ¯��ѩ");
				break;
		}
	}
	public static void main(String[] args)
	{
		// ö����Ĭ����һ��values���������ظ�ö���������ʵ��
		for (SeasonEnum02 s : SeasonEnum02.values())
		{
			System.out.print(s+",");
		}
		// ʹ��ö��ʵ��ʱ����ͨ��EnumClass.variable��ʽ������
		new EnumTest03().judge(SeasonEnum02.SPRING);
	}
}
