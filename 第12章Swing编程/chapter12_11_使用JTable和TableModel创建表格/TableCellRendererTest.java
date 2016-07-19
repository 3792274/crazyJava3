package chapter12_11_ʹ��JTable��TableModel�������;


import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
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
public class TableCellRendererTest
{
	JFrame jf = new JFrame("ʹ�õ�Ԫ�������");
	JTable table;
	// �����ά������Ϊ�������
	Object[][] tableData =
	{
		new Object[]{"������" , 29 , "Ů"
			, new ImageIcon("icon/3.gif") , true},
		new Object[]{"�ո�����", 56 , "��"
			, new ImageIcon("icon/1.gif") , false},
		new Object[]{"���", 35 , "��"
			, new ImageIcon("icon/4.gif") , true},
		new Object[]{"Ū��", 18 , "Ů"
			, new ImageIcon("icon/2.gif") , true},
		new Object[]{"��ͷ" , 2 , "��"
			, new ImageIcon("icon/5.gif") , false}
	};
	// ����һά������Ϊ�б���
	String[] columnTitle = {"����" , "����" , "�Ա�"
		, "��ͷ��" , "�Ƿ��й���"};
	public void init()
	{
		// �Զ�ά�����һά����������һ��ExtendedTableModel����
		ExtendedTableModel01 model = new ExtendedTableModel01(columnTitle
			, tableData);
		// ��ExtendedTableModel������JTable
		table = new JTable( model);
		table.setRowSelectionAllowed(false);
		table.setRowHeight(40);
		// ��ȡ������
		TableColumn lastColumn = table.getColumnModel().getColumn(2);
		// �Ե����в����Զ���ĵ�Ԫ�������
		lastColumn.setCellRenderer(new GenderTableCellRenderer());
		// ��JTable�������JScrollPane�У�������JScrollPane��ʾ����
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TableCellRendererTest().init();
	}
}
class ExtendedTableModel01 extends DefaultTableModel
{
	// �����ṩһ�����������ù�������ʵ��ί�и�DefaultTableModel����
	public ExtendedTableModel01(String[] columnNames , Object[][] cells)
	{
		super(cells , columnNames);
	}
	// ��дgetColumnClass����������ÿ�еĵ�һ��ֵ����������ʵ����������
	public Class getColumnClass(int c)
	{
		return getValueAt(0 , c).getClass();
	}
}
// �����Զ���ĵ�Ԫ�������
class GenderTableCellRenderer extends JPanel
	implements TableCellRenderer
{
	private String cellValue;
	// ����ͼ��Ŀ�Ⱥ͸߶�
	final int ICON_WIDTH = 23;
	final int ICON_HEIGHT = 21;
	public Component getTableCellRendererComponent(JTable table
		, Object value , boolean isSelected , boolean hasFocus
		, int row , int column)
	{
		cellValue = (String)value;
		// ����ѡ��״̬�»��Ʊ߿�
		if (hasFocus)
		{
			setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
		}
		else
		{
			setBorder(null);
		}
		return this;
	}
	// ��дpaint()������������Ƹõ�Ԫ������
	public void paint(Graphics g)
	{
		// ������ֵΪ"��"��"male"�������һ������ͼ��
		if (cellValue.equalsIgnoreCase("��")
			|| cellValue.equalsIgnoreCase("male"))
		{
			drawImage(g , new ImageIcon("icon/male.gif").getImage());
		}
		// ������ֵΪ"Ů"��"female"�������һ��Ů��ͼ��
		if (cellValue.equalsIgnoreCase("Ů")
			|| cellValue.equalsIgnoreCase("female"))
		{
			drawImage(g , new ImageIcon("icon/female.gif").getImage());
		}
	}
	// ����ͼ��ķ���
	private void drawImage(Graphics g , Image image)
	{
		g.drawImage(image, (getWidth() - ICON_WIDTH ) / 2
			, (getHeight() - ICON_HEIGHT) / 2 , null);
	}
}
