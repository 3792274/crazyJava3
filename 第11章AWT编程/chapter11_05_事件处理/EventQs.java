package chapter11_05_�¼�����;


import java.awt.*;
import java.awt.event.*;
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
public class EventQs
{
	private Frame f = new Frame("�����¼�");
	private Button ok = new Button("ȷ��");
	private TextField tf = new TextField(30);
	public void init()
	{
		// ע���¼�������
		ok.addActionListener(new OkListener());   //��
		f.add(tf);
		f.add(ok , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	// �����¼���������
	class OkListener implements ActionListener   //��
	{
		// ���涨��ķ��������¼���������������Ӧ�ض����¼�
		public void actionPerformed(ActionEvent e)      //��
		{
			System.out.println("�û�������ok��ť");
			tf.setText("Hello World");
		}
	}
	public static void main(String[] args)
	{
		new EventQs().init();
	}
}
