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
public class TransferHandlerTest
{
	private JFrame jf = new JFrame("����TransferHandler");
	JColorChooser chooser = new JColorChooser();
	JTextArea txt = new JTextArea("����TransferHandler\n"
		+ "ֱ�ӽ�������ɫ�����Ըı��ı���ɫ");
	public void init()
	{
		// ������ɫѡ���������ı�����ϷŹ���
		chooser.setDragEnabled(true);
		txt.setDragEnabled(true);
		jf.add(chooser, BorderLayout.SOUTH);
		// ����ֱ�ӽ�һ��Color���������JTextArea����
		// ����������foreground����
		txt.setTransferHandler(new TransferHandler("foreground"));
		jf.add(new JScrollPane(txt));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TransferHandlerTest().init();
	}
}
