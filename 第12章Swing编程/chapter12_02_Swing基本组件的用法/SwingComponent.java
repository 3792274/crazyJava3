package chapter12_02_Swing����������÷�;


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
public class SwingComponent
{
	JFrame f = new JFrame("����");
	// ����һ����ť,��Ϊָ֮��ͼ��
	Icon okIcon = new ImageIcon("ico/ok.png");
	JButton ok = new JButton("ȷ��" , okIcon);
	// ����һ����ѡ��ť����ʼ����ѡ��״̬
	JRadioButton male = new JRadioButton("��" , true);
	// ����һ����ѡ��ť����ʼ����û��ѡ��״̬
	JRadioButton female = new JRadioButton("Ů" , false);
	// ����һ��ButtonGroup�����ڽ���������JRadioButton�����һ��
	ButtonGroup bg = new ButtonGroup();
	// ����һ����ѡ�򣬳�ʼ����û��ѡ��״̬��
	JCheckBox married = new JCheckBox("�Ƿ��ѻ飿" , false);
	String[] colors = new String[]{"��ɫ" , "��ɫ"  , "��ɫ"};
	// ����һ������ѡ���
	JComboBox<String> colorChooser = new JComboBox<>(colors);
	// ����һ���б�ѡ���
	JList<String> colorList = new JList<>(colors);
	// ����һ��8�С�20�еĶ����ı���
	JTextArea ta = new JTextArea(8, 20);
	// ����һ��40�еĵ����ı���
	JTextField name = new JTextField(40);
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("�ļ�");
	JMenu edit = new JMenu("�༭");
	// �������½����˵����Ϊָ֮��ͼ��
	Icon newIcon = new ImageIcon("ico/new.png");
	JMenuItem newItem = new JMenuItem("�½�" , newIcon);
	// ���������桱�˵����Ϊָ֮��ͼ��
	Icon saveIcon = new ImageIcon("ico/save.png");
	JMenuItem saveItem = new JMenuItem("����" , saveIcon);
	// �������˳����˵����Ϊָ֮��ͼ��
	Icon exitIcon = new ImageIcon("ico/exit.png");
	JMenuItem exitItem = new JMenuItem("�˳�" , exitIcon);
	JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("�Զ�����");
	// ���������ơ��˵����Ϊָ֮��ͼ��
	JMenuItem copyItem = new JMenuItem("����"
		, new ImageIcon("ico/copy.png"));
	// ������ճ�����˵����Ϊָ֮��ͼ��
	JMenuItem pasteItem = new JMenuItem("ճ��"
		, new ImageIcon("ico/paste.png"));
	JMenu format = new JMenu("��ʽ");
	JMenuItem commentItem = new JMenuItem("ע��");
	JMenuItem cancelItem = new JMenuItem("ȡ��ע��");
	// ����һ���Ҽ��˵��������ó�����
	JPopupMenu pop = new JPopupMenu();
	// ��������������˵����ButtonGroup
	ButtonGroup flavorGroup = new ButtonGroup();
	// ���������ѡ��ť�������趨�������۷��
	JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal���" , true);
	JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus���");
	JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows���");
	JRadioButtonMenuItem classicItem = new JRadioButtonMenuItem("Windows������");
	JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif���");
	// -----------------����ִ�н����ʼ����init����---------------------
	public void init()
	{
		// ����һ��װ�����ı��򡢰�ť��JPanel
		JPanel bottom = new JPanel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom , BorderLayout.SOUTH);
		// ����һ��װ��������ѡ�������JCheckBox��JPanel
		JPanel checkPanel = new JPanel();
		checkPanel.add(colorChooser);
		bg.add(male);
		bg.add(female);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		// ����һ����ֱ���������Box��ʢװ�����ı���JPanel
		Box topLeft = Box.createVerticalBox();
		// ʹ��JScrollPane��Ϊ��ͨ�����JViewPort
		JScrollPane taJsp = new JScrollPane(ta);     //��
		topLeft.add(taJsp);
		topLeft.add(checkPanel);
		// ����һ��ˮƽ���������Box��ʢװtopLeft��colorList
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
		// ��top Box������ӵ����ڵ��м�
		f.add(top);
		// -----------���濪ʼ��ϲ˵�����Ϊ�˵���Ӽ�����----------
		// ΪnewItem���ÿ�ݼ������ÿ�ݼ�ʱҪʹ�ô�д��ĸ
		newItem.setAccelerator(KeyStroke.getKeyStroke('N'
			, InputEvent.CTRL_MASK));    //��
		newItem.addActionListener(e -> ta.append("�û������ˡ��½����˵�\n"));
		// Ϊfile�˵���Ӳ˵���
		file.add(newItem);
		file.add(saveItem);
		file.add(exitItem);
		// Ϊedit�˵���Ӳ˵���
		edit.add(autoWrap);
		// ʹ��addSeparator��������Ӳ˵��ָ���
		edit.addSeparator();
		edit.add(copyItem);
		edit.add(pasteItem);
		// ΪcommentItem��������ʾ��Ϣ
		commentItem.setToolTipText("���������ע��������");
		// Ϊformat�˵���Ӳ˵���
		format.add(commentItem);
		format.add(cancelItem);
		// ʹ�����new JMenuItem("-")�ķ�ʽ������Ӳ˵��ָ���
		edit.add(new JMenuItem("-"));
		// ��format�˵���ϵ�edit�˵��У��Ӷ��γɶ����˵�
		edit.add(format);
		// ��file��edit�˵���ӵ�mb�˵�����
		mb.add(file);
		mb.add(edit);
		// Ϊf�������ò˵���
		f.setJMenuBar(mb);
		// -----------���濪ʼ����Ҽ��˵�������װ�Ҽ��˵�----------
		flavorGroup.add(metalItem);
		flavorGroup.add(nimbusItem);
		flavorGroup.add(windowsItem);
		flavorGroup.add(classicItem);
		flavorGroup.add(motifItem);
		pop.add(metalItem);
		pop.add(nimbusItem);
		pop.add(windowsItem);
		pop.add(classicItem);
		pop.add(motifItem);
		// Ϊ5�����˵������¼�������
		ActionListener flavorListener = e -> {
			try
			{
				switch(e.getActionCommand())
				{
					case "Metal���":
						changeFlavor(1);
						break;
					case "Nimbus���":
						changeFlavor(2);
						break;
					case "Windows���":
						changeFlavor(3);
						break;
					case "Windows������":
						changeFlavor(4);
						break;
					case "Motif���":
						changeFlavor(5);
						break;
				}
			}
			catch (Exception ee)
			{
				ee.printStackTrace();
			}
		};
		// Ϊ������˵�������¼�������
		metalItem.addActionListener(flavorListener);
		nimbusItem.addActionListener(flavorListener);
		windowsItem.addActionListener(flavorListener);
		classicItem.addActionListener(flavorListener);
		motifItem.addActionListener(flavorListener);
		// ���ø÷������������Ҽ��˵�������ʹ���¼�����
		ta.setComponentPopupMenu(pop);     //��
		// ���ùرմ���ʱ���˳�����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}
	// ����һ�����������ڸı������
	private void changeFlavor(int flavor)throws Exception
	{
		switch (flavor)
		{
			// ����Metal���
			case 1:
				UIManager.setLookAndFeel(
				"javax.swing.plaf.metal.MetalLookAndFeel");
				break;
			// ����Nimbus���
			case 2:
				UIManager.setLookAndFeel(
				"javax.swing.plaf.nimbus.NimbusLookAndFeel");
				break;
			// ����Windows���
			case 3:
				UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				break;
			// ����Windows������
			case 4:
				UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
				break;
			// ����Motif���
			case 5:
				UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				break;
		}
		// ����f�����ڶ��������Լ��ڲ����������UI
		SwingUtilities.updateComponentTreeUI(f.getContentPane());  //��
		// ����mb�˵����Լ��ڲ����������UI
		SwingUtilities.updateComponentTreeUI(mb);
		// ����pop�Ҽ��˵��Լ��ڲ����������UI
		SwingUtilities.updateComponentTreeUI(pop);
	}
	public static void main(String[] args)
	{
		// ����Swing����ʹ��Java���
		//JFrame.setDefaultLookAndFeelDecorated(true);   //��
		new SwingComponent().init();
	}
}

