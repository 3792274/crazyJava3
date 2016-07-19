package chapter12_09_ʹ��JList_JComboBox�����б��;


import java.math.BigDecimal;
import java.util.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
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
public class ListModelTest
{
	private JFrame mainWin = new JFrame("����ListModel");
	// ����NumberListModel����������һ��JList����
	private JList<BigDecimal> numScopeList = new JList<>(
		new NumberListModel(1 , 21 , 2));
	// ����NumberComboBoxModel����������JComboBox����
	private JComboBox<BigDecimal> numScopeSelector = new JComboBox<>(
		new NumberComboBoxModel(0.1 , 1.2 , 0.1));
	private JTextField showVal = new JTextField(10);
	public void init()
	{
		// JList�Ŀ��Ӹ߶ȿ�ͬʱ��ʾ4���б���
		numScopeList.setVisibleRowCount(4);
		// Ĭ��ѡ�е�����������һ���������0��
		numScopeList.setSelectionInterval(2, 4);
		// ����ÿ���б������ָ���ĸ߶ȺͿ�ȡ�
		numScopeList.setFixedCellHeight(30);
		numScopeList.setFixedCellWidth(90);
		// ΪnumScopeList��Ӽ�����
		numScopeList.addListSelectionListener(e ->
		{
			// ��ȡ�û���ѡ�е���������
			List<BigDecimal> nums = numScopeList.getSelectedValuesList();
			showVal.setText("");
			// ���û�ѡ�е�������ӵ������ı�����
			for (BigDecimal num : nums )
			{
				showVal.setText(showVal.getText()
					+ num.toString() + ", ");
			}
		});
		// �����б���Ŀ��Ӹ߶ȿ���ʾ5���б���
		numScopeSelector.setMaximumRowCount(5);
		Box box = new Box(BoxLayout.X_AXIS);
		box.add(new JScrollPane(numScopeList));
		JPanel p = new JPanel();
		p.add(numScopeSelector);
		box.add(p);
		// ΪnumScopeSelector��Ӽ�����
		numScopeSelector.addItemListener(e -> {
			// ��ȡJComboBox��ѡ�е�����
			Object num = numScopeSelector.getSelectedItem();
			showVal.setText(num.toString());
		});
		JPanel bottom = new JPanel();
		bottom.add(new JLabel("��ѡ���ֵ�ǣ�"));
		bottom.add(showVal);
		mainWin.add(box);
		mainWin.add(bottom , BorderLayout.SOUTH);
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
	}
	public static void main(String[] args)
	{
		new ListModelTest().init();
	}
}
class NumberListModel extends AbstractListModel<BigDecimal>
{
	protected BigDecimal start;
	protected BigDecimal end;
	protected BigDecimal step;
	public NumberListModel(double start
		, double end , double step)
	{
		this.start = BigDecimal.valueOf(start);
		this.end = BigDecimal.valueOf(end);
		this.step = BigDecimal.valueOf(step);
	}
	// �����б���ĸ���
	public int getSize()
	{
		return (int)Math.floor(end.subtract(start)
			.divide(step).doubleValue()) + 1;
	}
	// ����ָ�����������б���
	public BigDecimal getElementAt(int index)
	{
		return BigDecimal.valueOf(index)
			.multiply(step).add(start);
	}
}
class NumberComboBoxModel extends NumberListModel
	implements ComboBoxModel<BigDecimal>
{
	// ���ڱ����û�ѡ���������
	private int selectId = 0;
	public NumberComboBoxModel(double start
		, double end , double step)
	{
		super(start , end , step);
	}
	// ����ѡ�С�ѡ���
	public void setSelectedItem(Object anItem)
	{
		if (anItem instanceof BigDecimal)
		{
			BigDecimal target = (BigDecimal)anItem;
			// ����ѡ�е�ֵ���޸�ѡ���������
			selectId = target.subtract(super.start)
				.divide(step).intValue();
		}
	}
	// ��ȡ��ѡ�����ֵ
	public BigDecimal getSelectedItem()
	{
		// ����ѡ�����������ȡ��ѡ����
		return BigDecimal.valueOf(selectId)
			.multiply(step).add(start);
	}
}
