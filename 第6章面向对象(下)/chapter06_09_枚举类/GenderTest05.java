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
public class GenderTest05
{
	public static void main(String[] args)
	{
		// ͨ��Enum��valueOf()��������ȡָ��ö�����ö��ֵ
		Gender04 g = Enum.valueOf(Gender04.class , "FEMALE");
		// ֱ��Ϊö��ֵ��nameʵ��������ֵ
		g.name = "Ů";
		// ֱ�ӷ���ö��ֵ��nameʵ������
		System.out.println(g + "����:" + g.name);
	}
}
