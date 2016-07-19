package chapter12_02_Swing����������÷�;


import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
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
public class JOptionPaneTest
{
	JFrame jf = new JFrame("����JOptionPane");
	// �ֱ���6��������ڶ���Ի���ļ���ѡ��
	private ButtonPanel messagePanel;
	private ButtonPanel messageTypePanel;
	private ButtonPanel msgPanel;
	private ButtonPanel confirmPanel;
	private ButtonPanel optionsPanel;
	private ButtonPanel inputPanel;
	private String messageString = "��Ϣ������";
	private Icon messageIcon = new ImageIcon("ico/heart.png");
	private Object messageObject = new Date();
	private Component messageComponent = new JButton("�����Ϣ");
	private JButton msgBn = new JButton("��Ϣ�Ի���");
	private JButton confrimBn = new JButton("ȷ�϶Ի���");
	private JButton inputBn = new JButton("����Ի���");
	private JButton optionBn = new JButton("ѡ��Ի���");
	public void init()
	{
		JPanel top = new JPanel();
		top.setBorder(new TitledBorder(new EtchedBorder()
			, "�Ի����ͨ��ѡ��" , TitledBorder.CENTER ,TitledBorder.TOP));
		top.setLayout(new GridLayout(1 , 2));
		// ��Ϣ����Panel����Panel�е�ѡ������Ի����ͼ��
		messageTypePanel = new ButtonPanel("ѡ����Ϣ������",
		new String[]{"ERROR_MESSAGE", "INFORMATION_MESSAGE"
			, "WARNING_MESSAGE", "QUESTION_MESSAGE",	"PLAIN_MESSAGE" });
		// ��Ϣ�������͵�Panel����Panel�е�ѡ������Ի������Ϣ��������
		messagePanel = new ButtonPanel("ѡ����Ϣ���ݵ�����",
			new String[]{"�ַ�����Ϣ", "ͼ����Ϣ", "�����Ϣ"
				, "��ͨ������Ϣ" , "Object[]��Ϣ"});
		top.add(messageTypePanel);
		top.add(messagePanel);
		JPanel bottom = new JPanel();
		bottom.setBorder(new TitledBorder(new EtchedBorder()
			, "������ͬ�ĶԻ���" , TitledBorder.CENTER ,TitledBorder.TOP));
		bottom.setLayout(new GridLayout(1 , 4));
		// �������ڵ�����Ϣ�Ի����Panel
		msgPanel = new ButtonPanel("��Ϣ�Ի���", null);
		msgBn.addActionListener(new ShowAction());
		msgPanel.add(msgBn);
		// �������ڵ���ȷ�϶Ի����Panel
		confirmPanel = new ButtonPanel("ȷ�϶Ի���",
			new String[]{"DEFAULT_OPTION", "YES_NO_OPTION"
				, "YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"});
		confrimBn.addActionListener(new ShowAction());
		confirmPanel.add(confrimBn);
		// �������ڵ�������Ի����Panel
		inputPanel = new ButtonPanel("����Ի���"
			, new String[]{"�����ı���","�����б�ѡ���"});
		inputBn.addActionListener(new ShowAction());
		inputPanel.add(inputBn);
		// �������ڵ���ѡ��Ի����Panel
		optionsPanel = new ButtonPanel("ѡ��Ի���"
			, new String[]{"�ַ���ѡ��", "ͼ��ѡ��", "����ѡ��"});
		optionBn.addActionListener(new ShowAction());
		optionsPanel.add(optionBn);
		bottom.add(msgPanel);
		bottom.add(confirmPanel);
		bottom.add(inputPanel);
		bottom.add(optionsPanel);
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(top);
		box.add(bottom);
		jf.add(box);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	// �����û�ѡ�񷵻�ѡ������
	private int getOptionType()
	{
		switch(confirmPanel.getSelection())
		{
			case "DEFAULT_OPTION":
				return JOptionPane.DEFAULT_OPTION;
			case "YES_NO_OPTION":
				return JOptionPane.YES_NO_OPTION;
			case "YES_NO_CANCEL_OPTION":
				return JOptionPane.YES_NO_CANCEL_OPTION;
			default:
				return JOptionPane.OK_CANCEL_OPTION;
		}
	}
	// �����û�ѡ�񷵻���Ϣ
	private Object getMessage()
	{
		switch(messagePanel.getSelection())
		{
			case "�ַ�����Ϣ":
				return messageString;
			case "ͼ����Ϣ":
				return messageIcon;
			case "�����Ϣ":
				return messageComponent;
			case "��ͨ������Ϣ":
				return messageObject;
			default:
				return new Object[]{messageString , messageIcon
					, messageObject , messageComponent};
		}
	}
	// �����û�ѡ�񷵻���Ϣ���ͣ�����ͼ������ͼ�꣩
	private int getDialogType()
	{
		switch(messageTypePanel.getSelection())
		{
			case "ERROR_MESSAGE":
				return JOptionPane.ERROR_MESSAGE;
			case "INFORMATION_MESSAGE":
				return JOptionPane.INFORMATION_MESSAGE;
			case "WARNING_MESSAGE":
				return JOptionPane.WARNING_MESSAGE;
			case "QUESTION_MESSAGE":
				return JOptionPane.QUESTION_MESSAGE;
			default:
				return JOptionPane.PLAIN_MESSAGE;
		}
	}
	private Object[] getOptions()
	{
		switch(optionsPanel.getSelection())
		{
			case "�ַ���ѡ��":
				return new String[]{"a" , "b" , "c" , "d"};
			case "ͼ��ѡ��":
				return new Icon[]{new ImageIcon("ico/1.gif")
					, new ImageIcon("ico/2.gif")
					, new ImageIcon("ico/3.gif")
					, new ImageIcon("ico/4.gif")};
			default:
				return new Object[]{new Date() ,new Date() , new Date()};
		}
	}
	// Ϊ����ť�����¼�������
	private class ShowAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			switch(event.getActionCommand())
			{
				case "ȷ�϶Ի���":
					JOptionPane.showConfirmDialog(jf , getMessage()
						,"ȷ�϶Ի���", getOptionType(), getDialogType());
					break;
				case "����Ի���":
					if (inputPanel.getSelection().equals("�����ı���"))
					{
						JOptionPane.showInputDialog(jf, getMessage()
							, "����Ի���", getDialogType());
					}
					else
					{
						JOptionPane.showInputDialog(jf, getMessage()
							, "����Ի���", getDialogType() , null
							, new String[]{"������Java EE��ҵӦ��ʵս"
							, "���Java����"}, "���Java����");
					}
					break;
				case "��Ϣ�Ի���":
					JOptionPane.showMessageDialog(jf,getMessage()
						,"��Ϣ�Ի���", getDialogType());
					break;
				case "ѡ��Ի���":
					JOptionPane.showOptionDialog(jf , getMessage()
						, "ѡ��Ի���", getOptionType() , getDialogType()
						, null,getOptions(), "a");
					break;
			}
		}
	}
	public static void main(String[] args)
	{
		new JOptionPaneTest().init();
	}
}

// ����һ��JPanel����չ�࣬����Ķ����������������е�
// JRadioButton�ؼ�,��Panel��չ�����ָ��һ���ַ�����ΪTitledBorder
class ButtonPanel extends JPanel
{
	private ButtonGroup group;
	public ButtonPanel(String title, String[] options)
	{
		setBorder(BorderFactory.createTitledBorder(BorderFactory
			.createEtchedBorder(), title));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		group = new ButtonGroup();
		for (int i = 0; options!= null && i < options.length; i++)
		{
			JRadioButton b = new JRadioButton(options[i]);
			b.setActionCommand(options[i]);
			add(b);
			group.add(b);
			b.setSelected(i == 0);
		}
	}
	// ����һ�����������ڷ����û�ѡ���ѡ��
	public String getSelection()
	{
		return group.getSelection().getActionCommand();
	}
}
