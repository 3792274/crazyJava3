package chapter12_09_ʹ��JList_JComboBox�����б��;


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
public class ListRenderingTest
{
	private JFrame mainWin = new JFrame("�����б�");
	private String[] friends = new String[]
	{
		"������",
		"�ո�����",
		"���",
		"Ū��",
		"��ͷ"
	};
	// ����һ��JList����
	private JList<String> friendsList = new JList<>(friends);
	public void init()
	{
		// ���ø�JListʹ��ImageCellRenderer��Ϊ�б��������
		friendsList.setCellRenderer(new ImageCellRenderer());
		mainWin.add(new JScrollPane(friendsList));
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new ListRenderingTest().init();
	}
}
class ImageCellRenderer extends JPanel
	implements ListCellRenderer<String>
{
	private ImageIcon icon;
	private String name;
	// ������Ƶ�Ԫ��ʱ�ı���ɫ
	private Color background;
	// ������Ƶ�Ԫ��ʱ��ǰ��ɫ
	private Color foreground;
	public Component getListCellRendererComponent(JList list
		, String value , int index
		, boolean isSelected , boolean cellHasFocus)
	{
		icon = new ImageIcon("ico/" + value + ".gif");
		name = value;
		background = isSelected ? list.getSelectionBackground()
			: list.getBackground();
		foreground = isSelected ? list.getSelectionForeground()
			: list.getForeground();
		// ���ظ�JPanel������Ϊ�б��������
		return this;
	}
	// ��дpaintComponent�������ı�JPanel�����
	public void paintComponent(Graphics g)
	{
		int imageWidth = icon.getImage().getWidth(null);
		int imageHeight = icon.getImage().getHeight(null);
		g.setColor(background);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(foreground);
		// ���ƺ���ͼ��
		g.drawImage(icon.getImage() , getWidth() / 2
			- imageWidth / 2 , 10 , null);
		g.setFont(new Font("SansSerif" , Font.BOLD , 18));
		// ���ƺ����û���
		g.drawString(name, getWidth() / 2
			- name.length() * 10 , imageHeight + 30 );
	}
	// ͨ���÷��������ø�ImageCellRenderer����Ѵ�С
	public Dimension getPreferredSize()
	{
		return new Dimension(60, 80);
	}
}

