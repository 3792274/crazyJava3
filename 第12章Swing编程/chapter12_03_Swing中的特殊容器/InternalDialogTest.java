package chapter12_03_Swing�е���������;


import java.awt.*;
import java.awt.event.*;
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
public class InternalDialogTest
{
	private JFrame jf = new JFrame("�����ڲ��Ի���");
	private JDesktopPane desktop = new JDesktopPane();
	private JButton internalBn = new JButton("�ڲ����ڵĶԻ���");
	private JButton deskBn = new JButton("��������ĶԻ���");
	// ����һ���ڲ����ڣ��ô��ڿ��϶�����������󻯡���С�����ر�
	private JInternalFrame iframe = new JInternalFrame("�ڲ�����");
	public void init()
	{
		// ���ڲ�������������
		iframe.add(new JScrollPane(new JTextArea(8, 40)));
		desktop.setPreferredSize(new Dimension(400, 300));
		// ������������ӵ�JFrame������
		jf.add(desktop);
		// �����ڲ����ڵĴ�С��λ��
		iframe.reshape(0 , 0 , 300 , 200);
		// ��ʾ��ѡ���ڲ�����
		iframe.show();
		desktop.add(iframe);
		JPanel jp = new JPanel();
		deskBn.addActionListener(event ->
			// �����ڲ��Ի���������������Ϊ�����
			JOptionPane.showInternalMessageDialog(desktop
				, "������������ĶԻ���"));
		internalBn.addActionListener(event ->
			// �����ڲ��Ի������ڲ�������Ϊ�����
			JOptionPane.showInternalMessageDialog(iframe
				, "�����ڲ����ڵĶԻ���"));
		jp.add(deskBn);
		jp.add(internalBn);
		jf.add(jp , BorderLayout.SOUTH);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new InternalDialogTest().init();
	}
}
