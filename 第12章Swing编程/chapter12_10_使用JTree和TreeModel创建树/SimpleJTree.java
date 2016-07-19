package chapter12_10_ʹ��JTree��TreeModel������;


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
public class SimpleJTree
{
	JFrame jf = new JFrame("����");
	JTree tree;
	DefaultMutableTreeNode root;
	DefaultMutableTreeNode guangdong;
	DefaultMutableTreeNode guangxi;
	DefaultMutableTreeNode foshan;
	DefaultMutableTreeNode shantou;
	DefaultMutableTreeNode guilin;
	DefaultMutableTreeNode nanning;
	public void init()
	{
		// ���δ����������нڵ�
		root = new DefaultMutableTreeNode("�й�");
		guangdong = new DefaultMutableTreeNode("�㶫");
		guangxi = new DefaultMutableTreeNode("����");
		foshan = new DefaultMutableTreeNode("��ɽ");
		shantou = new DefaultMutableTreeNode("��ͷ");
		guilin = new DefaultMutableTreeNode("����");
		nanning = new DefaultMutableTreeNode("����");
		// ͨ��add()�����������ڵ�֮��ĸ��ӹ�ϵ
		guangdong.add(foshan);
		guangdong.add(shantou);
		guangxi.add(guilin);
		guangxi.add(nanning);
		root.add(guangdong);
		root.add(guangxi);
		// �Ը��ڵ㴴����
		tree = new JTree(root);   // ��
		jf.add(new JScrollPane(tree));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleJTree().init();
	}
}
