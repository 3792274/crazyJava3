package chapter12_11_ʹ��JTable��TableModel�������;


import java.io.File;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.filechooser.*;
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
public class TableCellEditorTest
{
	JFrame jf = new JFrame("ʹ�õ�Ԫ��༭��");
	JTable table;
	// �����ά������Ϊ�������
	Object[][] tableData =
	{
		new Object[]{"������" , 29 , "Ů" , new ImageIcon("icon/3.gif")
			, new ImageIcon("icon/3.gif") , true},
		new Object[]{"�ո�����", 56 , "��" , new ImageIcon("icon/1.gif")
			, new ImageIcon("icon/1.gif") , false},
		new Object[]{"���", 35 , "��" , new ImageIcon("icon/4.gif")
			, new ImageIcon("icon/4.gif") , true},
		new Object[]{"Ū��", 18 , "Ů" , new ImageIcon("icon/2.gif")
			, new ImageIcon("icon/2.gif") , true},
		new Object[]{"��ͷ" , 2 , "��" , new ImageIcon("icon/5.gif")
			, new ImageIcon("icon/5.gif") , false}
	};
	// ����һά������Ϊ�б���
	String[] columnTitle = {"����" , "����" , "�Ա�" , "��ͷ��"
		, "��ͷ��" , "�Ƿ��й���"};
	public void init()
	{
		// �Զ�ά�����һά����������һ��ExtendedTableModel����
		ExtendedTableModel model = new ExtendedTableModel(
			columnTitle , tableData);
		// ��ExtendedTableModel������JTable
		table = new JTable(model);
		table.setRowSelectionAllowed(false);
		table.setRowHeight(40);
		// Ϊ�ñ��ָ��Ĭ�ϵı༭��
		table.setDefaultEditor(ImageIcon.class, new ImageCellEditor());
		// ��ȡ������
		TableColumn lastColumn = table.getColumnModel().getColumn(4);
		// ����JComboBox���󣬲���Ӷ��ͼ���б���
		JComboBox<ImageIcon> editCombo = new JComboBox<>();
		for (int i = 1; i <= 10; i++)
		{
			editCombo.addItem(new ImageIcon("icon/" + i + ".gif"));
		}
		// ���õ�����ʹ�û���JComboBox��DefaultCellEditor
		lastColumn.setCellEditor(new DefaultCellEditor(editCombo));
		// ��JTable�������JScrollPane�У�������JScrollPane���ڴ�������ʾ����
		jf.add(new JScrollPane(table));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TableCellEditorTest().init();
	}
}
class ExtendedTableModel extends DefaultTableModel
{
	// �����ṩһ�����������ù�������ʵ��ί�и�DefaultTableModel����
	public ExtendedTableModel(String[] columnNames , Object[][] cells)
	{
		super(cells , columnNames);
	}
	// ��дgetColumnClass����������ÿ�еĵ�һ��ֵ���ظ�����ʵ����������
	public Class getColumnClass(int c)
	{
		return getValueAt(0 , c).getClass();
	}
}
// ��չDefaultCellEditor��ʵ��TableCellEditor��
class ImageCellEditor extends DefaultCellEditor
{
	// �����ļ�ѡ����
	private JFileChooser fDialog = new JFileChooser(); ;
	private JTextField field = new JTextField(15);
	private JButton button = new JButton("...");
	public ImageCellEditor()
	{
		// ��ΪDefaultCellEditorû���޲����Ĺ�����
		// ����������ʽ���ø����в����Ĺ�������
		super(new JTextField());
		initEditor();
	}
	private void initEditor()
	{
		field.setEditable(false);
		// Ϊ��ť��Ӽ����������û������ð�ťʱ��
		// ϵͳ������һ���ļ�ѡ�������û�ѡ��ͼ���ļ���
		button.addActionListener(e -> browse());
		// Ϊ�ļ�ѡ������װ�ļ�������
		fDialog.addChoosableFileFilter(new FileFilter()
		{
			public boolean accept(File f)
			{
				if (f.isDirectory())
				{
					return true;
				}
				String extension = Utils.getExtension(f);
				if (extension != null)
				{
					if (extension.equals(Utils.tiff)
						|| extension.equals(Utils.tif)
						|| extension.equals(Utils.gif)
						|| extension.equals(Utils.jpeg)
						|| extension.equals(Utils.jpg)
						|| extension.equals(Utils.png))
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				return false;
			}
			public String getDescription()
			{
				return "��Ч��ͼƬ�ļ�";
			}
		});
		fDialog.setAcceptAllFileFilterUsed(false);
	}
	// ��дTableCellEditor�ӿڵ�getTableCellEditorComponent����
	// �÷������ص�Ԫ��༭�����ñ༭����һ��JPanel��
	// ����������һ���ı����һ����ť
	public Component getTableCellEditorComponent(JTable table
		, Object value , boolean isSelected , int row , int column)  // ��
	{
		this.button.setPreferredSize(new Dimension(20, 20));
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		field.setText(value.toString());
		panel.add(this.field, BorderLayout.CENTER);
		panel.add(this.button, BorderLayout.EAST);
		return panel;
	}
	public Object getCellEditorValue()
	{
		return new ImageIcon(field.getText());
	}
	private void browse()
	{
		// ���á����ļ�ѡ����
		fDialog.setCurrentDirectory(new File("icon"));
		int result = fDialog.showOpenDialog(null);
		// ����������ļ�ѡ�����ġ�ȡ������ť
		if (result == JFileChooser.CANCEL_OPTION)
		{
			// ȡ���༭
			super.cancelCellEditing();
			return;
		}
		// ����������ļ�ѡ�����ġ�ȷ������ť
		else
		{
			// ����field������
			field.setText("icon/" + fDialog.getSelectedFile().getName());
		}
	}
}
class Utils
{
	public final static String jpeg = "jpeg";
	public final static String jpg = "jpg";
	public final static String gif = "gif";
	public final static String tiff = "tiff";
	public final static String tif = "tif";
	public final static String png = "png";
	// ��ȡ�ļ���չ���ķ���
	public static String getExtension(File f)
	{
		String ext = null;
		String s = f.getName();
		int i = s.lastIndexOf('.');
		if (i > 0 &&  i < s.length() - 1)
		{
			ext = s.substring(i + 1).toLowerCase();
		}
		return ext;
	}
}
