package chapter12_12_ʹ��JFormattedTextField��JtextPane;


import java.util.LinkedList;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.undo.*;
import javax.swing.event.*;
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
public class MonitorText
{
	JFrame mainWin = new JFrame("����Document����");
	JTextArea target = new JTextArea(4, 35);
	JTextArea msg = new JTextArea(5, 35);
	JLabel label = new JLabel("�ı�����޸���Ϣ");
	Document doc = target.getDocument();
	// ���泷��������List����
	LinkedList<UndoableEdit> undoList = new LinkedList<>();
	// ������������ٴ�
	final int UNDO_COUNT = 20;
	public void init()
	{
		msg.setEditable(false);
		// ���DocumentListener
		doc.addDocumentListener(new DocumentListener()
		{
			// ��Document�����Ի����Լ������˸ı�ʱ�����÷���
			public void changedUpdate(DocumentEvent e){}
			// ����Document�в����ı�ʱ�����÷���
			public void insertUpdate(DocumentEvent e)
			{
				int offset = e.getOffset();
				int len = e.getLength();
				// ȡ�ò����¼���λ��
				msg.append("�����ı��ĳ��ȣ�" + len + "\n");
				msg.append("�����ı�����ʼλ�ã�" + offset + "\n");
				try
				{
					msg.append("�����ı����ݣ�"
						+ doc.getText(offset, len) + "\n");
				}
				catch (BadLocationException evt)
				{
					evt.printStackTrace();
				}
			}
			// ����Document��ɾ���ı�ʱ�����÷���
			public void removeUpdate(DocumentEvent e)
			{
				int offset = e.getOffset();
				int len = e.getLength();
				// ȡ�ò����¼���λ��
				msg.append("ɾ���ı��ĳ��ȣ�" + len + "\n");
				msg.append("ɾ���ı�����ʼλ�ã�" + offset + "\n");
			}
		});
		// ��ӿɳ��������ļ�����
		doc.addUndoableEditListener(e -> {
			// ÿ�η����ɳ����������ᴥ���ô����      // ��
			UndoableEdit edit = e.getEdit();
			if (edit.canUndo() && undoList.size() < UNDO_COUNT)
			{
				// ����������װ��List��
				undoList.add(edit);
			}
			// �Ѿ��ﵽ�����������
			else if (edit.canUndo() && undoList.size() >= UNDO_COUNT)
			{
				// ������һ����������
				undoList.pop();
				// ����������װ��List��
				undoList.add(edit);
			}
		});
		// ΪCtrl+Z��Ӽ�����
		target.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e)    // ��
			{
				System.out.println(e.getKeyChar() + 0);
				// ���������Ctrl + Z��Ctrl + z
				if (e.getKeyChar() == 26)
				{
					if (undoList.size() > 0)
					{
						// �Ƴ����һ���ɳ�����������ȡ���ò���
						undoList.removeLast().undo();
					}
				}
			}
		});
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(new JScrollPane(target));
		JPanel panel = new JPanel();
		panel.add(label);
		box.add(panel);
		box.add(new JScrollPane(msg));
		mainWin.add(box);
		mainWin.pack();
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.setVisible(true);
	}
	public static void main(String[] args) throws Exception
	{
		new MonitorText().init();
	}
}
