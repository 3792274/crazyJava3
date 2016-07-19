package chapter12_11_ʹ��JTable��TableModel�������;


import java.awt.event.*;

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
public class SortTable
{
	JFrame jf = new JFrame("�ɰ�������ı��");
	// �����ά������Ϊ�������
	Object[][] tableData =
	{
		new Object[]{"������" , 29 , "Ů"},
		new Object[]{"�ո�����", 56 , "��"},
		new Object[]{"���", 35 , "��"},
		new Object[]{"Ū��", 18 , "Ů"},
		new Object[]{"��ͷ" , 2 , "��"}
	};
	// ����һά������Ϊ�б���
	Object[] columnTitle = {"����" , "����" , "�Ա�"};
	// �Զ�ά�����һά����������һ��JTable����
	JTable table = new JTable(tableData , columnTitle);
	// ��ԭ������model��װ���µ�SortableTableModel����
	SortableTableModel sorterModel = new SortableTableModel(
		table.getModel());
	public void init()
	{
		// ʹ�ð�װ��SortableTableModel������ΪJTable��model����
		table.setModel(sorterModel);
		// Ϊÿ�е���ͷ������������
		table.getTableHeader().addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent event)    // ��
			{
				//  �����������С��2��������˫����ֱ�ӷ���
				if (event.getClickCount() < 2)
				{
					return;
				}
				// �ҳ����˫���¼����ڵ�������
				int tableColumn = table.columnAtPoint(event.getPoint());
				// ��JTable�е�������ת���ɶ�ӦTableModel�е�������
				int modelColumn = table.convertColumnIndexToModel(tableColumn);
				// ����ָ���н�������
				sorterModel.sort(modelColumn);
			}
		});
		// ��JTable�������JScrollPane�У�������JScrollPane��ʾ����
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SortTable().init();
	}
}
class SortableTableModel extends AbstractTableModel
{
	private TableModel model;
	private int sortColumn;
	private Row[] rows;
	// ��һ���Ѿ�����TableModel�����װ��SortableTableModel����
	public SortableTableModel(TableModel m)
	{
		// ������װ��TableModel����
		model = m;
		rows = new Row[model.getRowCount()];
		// ��ԭTableModel�е�ÿ�м�¼������ʹ��Row���鱣������
		for (int i = 0; i < rows.length; i++)
		{
			rows[i] = new Row(i);
		}
	}
	// ʵ�ָ���ָ���н�������
	public void sort(int c)
	{
		sortColumn = c;
		java.util.Arrays.sort(rows);
		fireTableDataChanged();
	}
	// ��������������Ҫ����model�е����ݣ������漰��model������
	// �ͱ���װmodel�����е�����ת��������ʹ��rows�����������ת����
	public Object getValueAt(int r, int c)
	{
		return model.getValueAt(rows[r].index, c);
	}
	public boolean isCellEditable(int r, int c)
	{
		return model.isCellEditable(rows[r].index, c);
	}
	public void setValueAt(Object aValue, int r, int c)
	{
		model.setValueAt(aValue, rows[r].index, c);
	}
	// ���淽����ʵ�ְѸ�model�ķ���ί��Ϊԭ��װ��model��ʵ��
	public int getRowCount()
	{
		return model.getRowCount();
	}
	public int getColumnCount()
	{
		return model.getColumnCount();
	}
	public String getColumnName(int c)
	{
		return model.getColumnName(c);
	}
	public Class getColumnClass(int c)
	{
		return model.getColumnClass(c);
	}
	// ����һ��Row�࣬�������ڷ�װJTable�е�һ��
	// ʵ������������װ�����ݣ���ֻ��װ������
	private class Row implements Comparable<Row>
	{
		// ��index�����ű���װModel��ÿ�м�¼��������
		public int index;
		public Row(int index)
		{
			this.index = index;
		}
		// ʵ������֮��Ĵ�С�Ƚ�
		public int compareTo(Row other)
		{
			Object a = model.getValueAt(index, sortColumn);
			Object b = model.getValueAt(other.index, sortColumn);
			if (a instanceof Comparable)
			{
				return ((Comparable)a).compareTo(b);
			}
			else
			{
				return a.toString().compareTo(b.toString());
			}
		}
	}
}
