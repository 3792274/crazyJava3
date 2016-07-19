package chapter11_03_���ֹ�����;

import java.awt.*;
import java.awt.event.*;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CardLayoutTest {
	Frame frame = new Frame("���Դ���");
	


	public void init() {
		
		
		String[] lableNames = { "��һ��", "�ڶ���", "������", "������", "������" };
		
		Panel lablePanel = new Panel();
		Panel buttonPanel = new Panel();
		
		final CardLayout cardLayout = new CardLayout();
		lablePanel.setLayout(cardLayout);
		
		
		for (int i = 0; i < lableNames.length; i++) {
			lablePanel.add(lableNames[i], new Button(lableNames[i]));
		}
		
		
		
		ActionListener listener = e -> {
			switch (e.getActionCommand()) {
			case "��һ��":
				cardLayout.previous(lablePanel);
				break;
			case "��һ��":
				cardLayout.next(lablePanel);
				break;
			case "��һ��":
				cardLayout.first(lablePanel);
				break;
			case "���һ��":
				cardLayout.last(lablePanel);
				break;
			case "������":
				cardLayout.show(lablePanel, "������");
				break;
			}
		};
		
		// ������ʾ��һ�ŵİ�ť
		Button previous = new Button("��һ��");
		previous.addActionListener(listener);
		// ������ʾ��һ�ŵİ�ť
		Button next = new Button("��һ��");
		next.addActionListener(listener);
		// ������ʾ��һ�ŵİ�ť
		Button first = new Button("��һ��");
		first.addActionListener(listener);
		// ������ʾ���һ�ŵİ�ť
		Button last = new Button("���һ��");
		last.addActionListener(listener);
		// ���Ƹ���Card����ʾ�İ�ť
		Button third = new Button("������");
		third.addActionListener(listener);
		
		buttonPanel.add(previous);
		buttonPanel.add(next);
		buttonPanel.add(first);
		buttonPanel.add(last);
		buttonPanel.add(third);
		
		
		frame.add(lablePanel);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

	
	
	public static void main(String[] args) {
		new CardLayoutTest().init();
	}
}
