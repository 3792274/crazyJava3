package chapter12_11_ʹ��JTable��TableModel�������;


import java.sql.*;
import java.io.*;
import java.util.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
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
public class TableModelTest
{
	JFrame jf = new JFrame("���ݱ������");
	private JScrollPane scrollPane;
	private ResultSetTableModel model;
	// ����װ�����ݱ��JComboBox
	private JComboBox<String> tableNames = new JComboBox<>();
	private JTextArea changeMsg = new JTextArea(4, 80);
	private ResultSet rs;
	private Connection conn;
	private Statement stmt;
	public void init()
	{
		// ΪJComboBox����¼������������û�ѡ��ĳ�����ݱ�ʱ�������÷���
		tableNames.addActionListener(event -> {
			try
			{
				// ���װ��JTable��JScrollPane��Ϊ��
				if (scrollPane != null)
				{
					// ����������ɾ�����
					jf.remove(scrollPane);
				}
				// ��JComboBox��ȡ���û���ͼ��������ݱ�ı���
				String tableName = (String) tableNames.getSelectedItem();
				// ����������Ϊ�գ���رս����
				if (rs != null)
				{
					rs.close();
				}
				String query = "select * from " + tableName;
				// ��ѯ�û�ѡ������ݱ�
				rs = stmt.executeQuery(query);
				// ʹ�ò�ѯ����ResultSet����TableModel����
				model = new ResultSetTableModel(rs);
				// ΪTableModel��Ӽ������������û����޸�
				model.addTableModelListener(evt -> {
					int row = evt.getFirstRow();
					int column = evt.getColumn();
					changeMsg.append("�޸ĵ���:" + column
						+ ",�޸ĵ���:" + row + "�޸ĺ��ֵ:"
						+ model.getValueAt(row , column));
				});
				// ʹ��TableModel����JTable��������Ӧ�����ӵ�������
				JTable table = new JTable(model);
				scrollPane = new JScrollPane(table);
				jf.add(scrollPane, BorderLayout.CENTER);
				jf.validate();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		});
		JPanel p = new JPanel();
		p.add(tableNames);
		jf.add(p, BorderLayout.NORTH);
		jf.add(new JScrollPane(changeMsg), BorderLayout.SOUTH);
		try
		{
			// ��ȡ���ݿ�����
			conn = getConnection();
			// ��ȡ���ݿ��MetaData����
			DatabaseMetaData meta = conn.getMetaData();
			// ����Statement
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE
				, ResultSet.CONCUR_UPDATABLE);
			// ��ѯ��ǰ���ݿ��ȫ�����ݱ�
			ResultSet tables = meta.getTables(null, null, null
				, new String[] { "TABLE" });
			// ��ȫ�����ݱ���ӵ�JComboBox��
			while (tables.next())
			{
				tableNames.addItem(tables.getString(3));
			}
			tables.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		jf.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{
				try
				{
					if (conn != null) conn.close();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		});
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	private static Connection getConnection()
		throws SQLException, IOException , ClassNotFoundException
	{
		// ͨ������conn.ini�ļ�����ȡ���ݿ����ӵ���ϸ��Ϣ
		Properties props = new Properties();
		FileInputStream in = new FileInputStream("conn.ini");
		props.load(in);
		in.close();
		String drivers = props.getProperty("jdbc.drivers");
		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");
		// �������ݿ�����
		Class.forName(drivers);
		// ȡ�����ݿ�����
		return DriverManager.getConnection(url, username, password);
	}
	public static void main(String[] args)
	{
		new TableModelTest().init();
	}
}
// ��չAbstractTableModel�����ڽ�һ��ResultSet��װ��TableModel
class ResultSetTableModel extends AbstractTableModel   // ��
{
	private ResultSet rs;
	private ResultSetMetaData rsmd;
	// ����������ʼ��rs��rsmd��������
	public ResultSetTableModel(ResultSet aResultSet)
	{
		rs = aResultSet;
		try
		{
			rsmd = rs.getMetaData();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	// ��дgetColumnName����������Ϊ��TableModel��������
	public String getColumnName(int c)
	{
		try
		{
			return rsmd.getColumnName(c + 1);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return "";
		}
	}
	// ��дgetColumnCount�������������ø�TableModel������
	public int getColumnCount()
	{
		try
		{
			return rsmd.getColumnCount();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			return 0;
		}
	}
	// ��дgetValueAt�������������ø�TableModelָ����Ԫ���ֵ
	public Object getValueAt(int r, int c)
	{
		try
		{
			rs.absolute(r + 1);
			return rs.getObject(c + 1);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	// ��дgetColumnCount�������������ø�TableModel������
	public int getRowCount()
	{
		try
		{
			rs.last();
			return rs.getRow();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return 0;
		}
	}
	// ��дisCellEditable����true����ÿ����Ԫ��ɱ༭
	public boolean isCellEditable(int rowIndex, int columnIndex)
	{
		return true;
	}
	// ��дsetValueAt()���������û��༭��Ԫ��ʱ�����ᴥ���÷���
	public void setValueAt(Object aValue , int row,int column)
	{
		try
		{
			// �������λ����Ӧ������
			rs.absolute(row + 1);
			// �޸ĵ�Ԫ����Ӧ��ֵ
			rs.updateObject(column + 1 , aValue);
			// �ύ�޸�
			rs.updateRow();
			// ������Ԫ����޸��¼�
			fireTableCellUpdated(row, column);
		}
		catch (SQLException evt)
		{
			evt.printStackTrace();
		}
	}
}

