package chapter11_03_���ֹ�����;

import java.awt.*;
import static java.awt.BorderLayout.*;
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
public class BorderLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		// ����Frame����ʹ��BorderLayout���ֹ�����
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("��") , SOUTH);
		f.add(new Button("��") , NORTH);
		// Ĭ����ӵ��м�
		f.add(new Button("��"));
		f.add(new Button("��") , EAST);
		f.add(new Button("��") , WEST);
		// ���ô���Ϊ��Ѵ�С
		f.pack();
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}

