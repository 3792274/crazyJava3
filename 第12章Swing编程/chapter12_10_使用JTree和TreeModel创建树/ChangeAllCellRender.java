package chapter12_10_ʹ��JTree��TreeModel������;


import java.awt.*;
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
public class ChangeAllCellRender
{
	JFrame jf = new JFrame("�ı����нڵ�����");
	JTree tree;
	// ���弸����ʼ�ڵ�
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("�й�");
	DefaultMutableTreeNode guangdong = new DefaultMutableTreeNode("�㶫");
	DefaultMutableTreeNode guangxi = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode foshan = new DefaultMutableTreeNode("��ɽ");
	DefaultMutableTreeNode shantou = new DefaultMutableTreeNode("��ͷ");
	DefaultMutableTreeNode guilin = new DefaultMutableTreeNode("����");
	DefaultMutableTreeNode nanning = new DefaultMutableTreeNode("����");
	public void init()
	{
		// ͨ��add()�����������ڵ�֮��ĸ��ӹ�ϵ
		guangdong.add(foshan);
		guangdong.add(shantou);
		guangxi.add(guilin);
		guangxi.add(nanning);
		root.add(guangdong);
		root.add(guangxi);
		// �Ը��ڵ㴴����
		tree = new JTree(root);
		// ����һ��DefaultTreeCellRender����
		DefaultTreeCellRenderer cellRender = new DefaultTreeCellRenderer();
		// ���÷�ѡ���ڵ�ı���ɫ��
		cellRender.setBackgroundNonSelectionColor(new
			Color(220 , 220 , 220));
		// ���ýڵ���ѡ��״̬�µı�����ɫ��
		cellRender.setBackgroundSelectionColor(new Color(140 , 140, 140));
		// ����ѡ��״̬�½ڵ�ı߿���ɫ��
		cellRender.setBorderSelectionColor(Color.BLACK);
		// ���ô����۵�״̬�·�Ҷ�ӽڵ��ͼ�ꡣ
		cellRender.setClosedIcon(new ImageIcon("icon/close.gif"));
		// ���ýڵ��ı������塣
		cellRender.setFont(new Font("SansSerif" , Font.BOLD , 16));
		// ����Ҷ�ӽڵ��ͼ�ꡣ
		cellRender.setLeafIcon(new ImageIcon("icon/leaf.png"));
		// ���ô���չ��״̬�·�Ҷ�ӽڵ��ͼ�ꡣ
		cellRender.setOpenIcon(new ImageIcon("icon/open.gif"));
		// ���û��Ʒ�ѡ��״̬�½ڵ��ı�����ɫ��
		cellRender.setTextNonSelectionColor(new Color(255 , 0 , 0));
		// ���û���ѡ��״̬�½ڵ��ı�����ɫ��
		cellRender.setTextSelectionColor(new Color(0 , 0 , 255));
		tree.setCellRenderer(cellRender);
		// �����Ƿ���ʾ���ڵ�ġ�չ��/�۵���ͼ��,Ĭ����false
		tree.setShowsRootHandles(true);
		// ���ýڵ��Ƿ�ɼ�,Ĭ����true
		tree.setRootVisible(true);
		jf.add(new JScrollPane(tree));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new ChangeAllCellRender().init();
	}
}
