package chapter12_10_ʹ��JTree��TreeModel������;


import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
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
public class EditJTree
{
	JFrame jf;
	JTree tree;
	// ����JTree�����Ӧ��model
	DefaultTreeModel model;
	// ���弸����ʼ�ڵ�
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("�й�");
	DefaultMutableTreeNode guangdong = new DefaultMutableTreeNode("�㶫");
	DefaultMutableTreeNode guangxi = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode foshan = new DefaultMutableTreeNode("��ɽ");
	DefaultMutableTreeNode shantou = new DefaultMutableTreeNode("��ͷ");
	DefaultMutableTreeNode guilin = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode nanning = new DefaultMutableTreeNode("����");
	// ������Ҫ���϶���TreePath
	TreePath movePath;
	JButton addSiblingButton = new JButton("����ֵܽڵ�");
	JButton addChildButton = new JButton("����ӽڵ�");
	JButton deleteButton = new JButton("ɾ���ڵ�");
	JButton editButton = new JButton("�༭��ǰ�ڵ�");
	public void init()
	{
		guangdong.add(foshan);
		guangdong.add(shantou);
		guangxi.add(guilin);
		guangxi.add(nanning);
		root.add(guangdong);
		root.add(guangxi);
		jf = new JFrame("�ɱ༭�ڵ����");
		tree = new JTree(root);
		// ��ȡJTree��Ӧ��TreeModel����
		model = (DefaultTreeModel)tree.getModel();
		// ����JTree�ɱ༭
		tree.setEditable(true);
		MouseListener ml = new MouseAdapter()
		{
			// �������ʱ��ñ��϶��Ľڵ�
			public void mousePressed(MouseEvent e)
			{
				// �����ҪΨһȷ��ĳ���ڵ㣬����ͨ��TreePath����ȡ��
				TreePath tp = tree.getPathForLocation(
					e.getX() , e.getY());
				if (tp != null)
				{
					movePath = tp;
				}
			}
			// ����ɿ�ʱ�����Ҫ�ϵ��ĸ����ڵ�
			public void mouseReleased(MouseEvent e)
			{
				// ��������ɿ�ʱ��TreePath����ȡTreePath
				TreePath tp = tree.getPathForLocation(
					e.getX(), e.getY());
				if (tp != null && movePath != null)
				{
					// ��ֹ���ӽڵ��϶�
					if (movePath.isDescendant(tp) && movePath != tp)
					{
						JOptionPane.showMessageDialog(jf,
							"Ŀ��ڵ��Ǳ��ƶ��ڵ���ӽڵ㣬�޷��ƶ���",
							"�Ƿ�����", JOptionPane.ERROR_MESSAGE );
						return;
					}
					// �Ȳ������ӽڵ��ƶ���������갴�¡��ɿ��Ĳ���ͬһ���ڵ�
					else if (movePath != tp)
					{
						// add�����Ƚ��ýڵ��ԭ������ɾ��������ӵ��¸��ڵ���
						((DefaultMutableTreeNode)tp.getLastPathComponent())
							.add((DefaultMutableTreeNode)movePath
							.getLastPathComponent());
						movePath = null;
						tree.updateUI();
					}
				}
			}
		};
		// ΪJTree�����������
		tree.addMouseListener(ml);
		JPanel panel = new JPanel();
		// ʵ������ֵܽڵ�ļ�����
		addSiblingButton.addActionListener(event -> {
			// ��ȡѡ�нڵ�
			DefaultMutableTreeNode selectedNode	= (DefaultMutableTreeNode)
				tree.getLastSelectedPathComponent();
			// ����ڵ�Ϊ�գ�ֱ�ӷ���
			if (selectedNode == null) return;
			// ��ȡ��ѡ�нڵ�ĸ��ڵ�
			DefaultMutableTreeNode parent = (DefaultMutableTreeNode)
				selectedNode.getParent();
			// ������ڵ�Ϊ�գ�ֱ�ӷ���
			if (parent == null) return;
			// ����һ���½ڵ�
			DefaultMutableTreeNode newNode = new
				DefaultMutableTreeNode("�½ڵ�");
			// ��ȡѡ�нڵ��ѡ������
			int selectedIndex = parent.getIndex(selectedNode);
			// ��ѡ��λ�ò����½ڵ�
			model.insertNodeInto(newNode, parent, selectedIndex + 1);
			// --------�������ʵ����ʾ�½ڵ㣨�Զ�չ�����ڵ㣩-------
			// ��ȡ�Ӹ��ڵ㵽�½ڵ�����нڵ�
			TreeNode[] nodes = model.getPathToRoot(newNode);
			// ʹ��ָ���Ľڵ�����������TreePath
			TreePath path = new TreePath(nodes);
			// ��ʾָ��TreePath
			tree.scrollPathToVisible(path);
		});
		panel.add(addSiblingButton);
		// ʵ������ӽڵ�ļ�����
		addChildButton.addActionListener(event -> {
			// ��ȡѡ�нڵ�
			DefaultMutableTreeNode selectedNode	= (DefaultMutableTreeNode)
				tree.getLastSelectedPathComponent();
			// ����ڵ�Ϊ�գ�ֱ�ӷ���
			if (selectedNode == null) return;
			// ����һ���½ڵ�
			DefaultMutableTreeNode newNode = new
				DefaultMutableTreeNode("�½ڵ�");
			// ͨ��model������½ڵ㣬������ͨ������JTree��updateUI����
			// model.insertNodeInto(newNode, selectedNode
			// 	, selectedNode.getChildCount());
			// ͨ���ڵ�����½ڵ㣬����Ҫ����tree��updateUI����
			selectedNode.add(newNode);
			// --------�������ʵ����ʾ�½ڵ㣨�Զ�չ�����ڵ㣩-------
			TreeNode[] nodes = model.getPathToRoot(newNode);
			TreePath path = new TreePath(nodes);
			tree.scrollPathToVisible(path);
			tree.updateUI();
		});
		panel.add(addChildButton);
		// ʵ��ɾ���ڵ�ļ�����
		deleteButton.addActionListener(event ->	{
			DefaultMutableTreeNode selectedNode	= (DefaultMutableTreeNode)
				tree.getLastSelectedPathComponent();
			if (selectedNode != null && selectedNode.getParent() != null)
			{
				// ɾ��ָ���ڵ�
				model.removeNodeFromParent(selectedNode);
			}
		});
		panel.add(deleteButton);
		// ʵ�ֱ༭�ڵ�ļ�����
		editButton.addActionListener(event -> {
			TreePath selectedPath = tree.getSelectionPath();
			if (selectedPath != null)
			{
				// �༭ѡ�нڵ�
				tree.startEditingAtPath(selectedPath);
			}
		});
		panel.add(editButton);
		jf.add(new JScrollPane(tree));
		jf.add(panel , BorderLayout.SOUTH);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new EditJTree().init();
	}
}
