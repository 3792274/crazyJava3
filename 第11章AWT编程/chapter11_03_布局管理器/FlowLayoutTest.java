package chapter11_03_���ֹ�����;


import java.awt.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FlowLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		// ����Frame����ʹ��FlowLayout���ֹ�����������룬ˮƽ���20����ֱ���5
		f.setLayout(new FlowLayout(FlowLayout.LEFT , 20, 5));
		// �򴰿������10����ť
		for (int i = 0; i < 10 ; i++ )
		{
			f.add(new Button("��ť" + i));
		}
		// ���ô���Ϊ��Ѵ�С
		f.pack();
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}

