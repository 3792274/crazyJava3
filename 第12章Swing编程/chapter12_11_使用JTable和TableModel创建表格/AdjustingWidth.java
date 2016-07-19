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
public class AdjustingWidth
{
	JFrame jf = new JFrame("��������п�");
	JMenuBar menuBar = new JMenuBar();
	JMenu adjustModeMenu = new JMenu("������ʽ");
	JMenu selectUnitMenu = new JMenu("ѡ��Ԫ");
	JMenu selectModeMenu = new JMenu("ѡ��ʽ");
	// ����5����ѡ��ť�����Կ��Ʊ��Ŀ�ȵ�����ʽ
	JRadioButtonMenuItem[] adjustModesItem = new JRadioButtonMenuItem[5];
	// ����3����ѡ��ť�����Կ��Ʊ���ѡ��ʽ
	JRadioButtonMenuItem[] selectModesItem = new JRadioButtonMenuItem[3];
	JCheckBoxMenuItem rowsItem = new JCheckBoxMenuItem("ѡ����");
	JCheckBoxMenuItem columnsItem = new JCheckBoxMenuItem("ѡ����");
	JCheckBoxMenuItem cellsItem = new JCheckBoxMenuItem("ѡ��Ԫ��");
	ButtonGroup adjustBg = new ButtonGroup();
	ButtonGroup selectBg = new ButtonGroup();
	// ����һ��int���͵����飬���ڱ��������еĿ�ȵ�����ʽ
	int[] adjustModes = new int[]{
		JTable.AUTO_RESIZE_OFF
		, JTable.AUTO_RESIZE_NEXT_COLUMN
		, JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS
		, JTable.AUTO_RESIZE_LAST_COLUMN
		, JTable.AUTO_RESIZE_ALL_COLUMNS
	};
	int[] selectModes = new int[]{
		ListSelectionModel.MULTIPLE_INTERVAL_SELECTION
		, ListSelectionModel.SINGLE_INTERVAL_SELECTION
		, ListSelectionModel.SINGLE_SELECTION
	};
	JTable table;
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
	public void init()
	{
		// �Զ�ά�����һά����������һ��JTable����
		table = new JTable(tableData , columnTitle);
		// -----------Ϊ���ڰ�װ���ñ�������ʽ�Ĳ˵�-----------
		adjustModesItem[0] = new JRadioButtonMenuItem("ֻ�������");
		adjustModesItem[1] = new JRadioButtonMenuItem("ֻ������һ��");
		adjustModesItem[2] = new JRadioButtonMenuItem("ƽ������������");
		adjustModesItem[3] = new JRadioButtonMenuItem("ֻ�������һ��");
		adjustModesItem[4] = new JRadioButtonMenuItem("ƽ������������");
		menuBar.add(adjustModeMenu);
		for (int i = 0; i < adjustModesItem.length ; i++)
		{
			// Ĭ��ѡ�е������˵������Ӧ���Ĭ�ϵĿ�ȵ�����ʽ
			if (i == 2)
			{
				adjustModesItem[i].setSelected(true);
			}
			adjustBg.add(adjustModesItem[i]);
			adjustModeMenu.add(adjustModesItem[i]);
			final int index = i;
			// Ϊ���õ�����ʽ�Ĳ˵�����Ӽ�����
			adjustModesItem[i].addActionListener(evt ->
			{
				// �����ǰ�˵����ѡ��״̬�����ʹ�ö�Ӧ�ĵ�����ʽ
				if (adjustModesItem[index].isSelected())
				{
					table.setAutoResizeMode(adjustModes[index]);   //��
				}
			});
		}
		// -----------Ϊ���ڰ�װ���ñ��ѡ��ʽ�Ĳ˵�-----------
		selectModesItem[0] = new JRadioButtonMenuItem("������");
		selectModesItem[1] = new JRadioButtonMenuItem("������������");
		selectModesItem[2] = new JRadioButtonMenuItem("��ѡ");
		menuBar.add(selectModeMenu);
		for (int i = 0; i < selectModesItem.length ; i++)
		{
			// Ĭ��ѡ�е�һ���˵������Ӧ���Ĭ�ϵ�ѡ��ʽ
			if (i == 0)
			{
			selectModesItem[i].setSelected(true);
			}
			selectBg.add(selectModesItem[i]);
			selectModeMenu.add(selectModesItem[i]);
			final int index = i;
			// Ϊ����ѡ��ʽ�Ĳ˵�����Ӽ�����
			selectModesItem[i].addActionListener(evt -> {
				// �����ǰ�˵����ѡ��״̬�����ʹ�ö�Ӧ��ѡ��ʽs
				if (selectModesItem[index].isSelected())
				{
					table.getSelectionModel().setSelectionMode
						(selectModes[index]);     //��
				}
			});
		}
		menuBar.add(selectUnitMenu);
		// -----Ϊ���ڰ�װ���ñ��ѡ��Ԫ�Ĳ˵�-----
		rowsItem.setSelected(table.getRowSelectionAllowed());
		columnsItem.setSelected(table.getColumnSelectionAllowed());
		cellsItem.setSelected(table.getCellSelectionEnabled());
		rowsItem.addActionListener(event -> {
			table.clearSelection();
			// ����ò˵����ѡ��״̬�����ñ���ѡ��Ԫ����
			table.setRowSelectionAllowed(rowsItem.isSelected());
			// ���ѡ���С�ѡ����ͬʱ��ѡ�У���ʵ����ѡ��Ԫ��
			cellsItem.setSelected(table.getCellSelectionEnabled());
		});
		selectUnitMenu.add(rowsItem);
		columnsItem.addActionListener(event -> {
			table.clearSelection();
			// ����ò˵����ѡ��״̬�����ñ���ѡ��Ԫ����
			table.setColumnSelectionAllowed(columnsItem.isSelected());
			// ���ѡ���С�ѡ����ͬʱ��ѡ�У���ʵ����ѡ��Ԫ��
			cellsItem.setSelected(table.getCellSelectionEnabled());
		});
		selectUnitMenu.add(columnsItem);
		cellsItem.addActionListener(event -> {
			table.clearSelection();
			// ����ò˵����ѡ��״̬�����ñ���ѡ��Ԫ�ǵ�Ԫ��
			table.setCellSelectionEnabled(cellsItem.isSelected());
			// ��ѡ��ĸı��ͬʱӰ��ѡ���С�ѡ���������˵�
			rowsItem.setSelected(table.getRowSelectionAllowed());
			columnsItem.setSelected(table.getColumnSelectionAllowed());
		});
		selectUnitMenu.add(cellsItem);
		jf.setJMenuBar(menuBar);
		// �ֱ��ȡ������������У����������е���С��ȣ���ѿ�Ⱥ������
		TableColumn nameColumn = table.getColumn(columnTitle[0]);
		nameColumn.setMinWidth(40);
		TableColumn ageColumn = table.getColumn(columnTitle[1]);
		ageColumn.setPreferredWidth(50);
		TableColumn genderColumn = table.getColumn(columnTitle[2]);
		genderColumn.setMaxWidth(50);
		// ��JTable�������JScrollPane�У�������JScrollPane���ڴ�������ʾ����
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new AdjustingWidth().init();
	}
}
