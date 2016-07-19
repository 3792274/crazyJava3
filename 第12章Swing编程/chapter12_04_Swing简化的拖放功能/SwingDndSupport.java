package chapter12_04_Swing�򻯵��ϷŹ���;


import java.awt.*;
import javax.swing.*;
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
public class SwingDndSupport
{
	JFrame jf = new JFrame("Swing���Ϸ�֧��");
	JTextArea srcTxt = new JTextArea(8 , 30);
	JTextField jtf = new JTextField(34);
	public void init()
	{
		srcTxt.append("Swing���Ϸ�֧��.\n");
		srcTxt.append("�����ı��������������������.\n");
		// �����ı���͵����ı�����Ϸ�֧��
		srcTxt.setDragEnabled(true);
		jtf.setDragEnabled(true);
		jf.add(new JScrollPane(srcTxt));
		jf.add(jtf , BorderLayout.SOUTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SwingDndSupport().init();
	}
}

