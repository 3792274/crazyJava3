package chapter11_03_布局管理器;

import java.awt.*;
import java.awt.event.*;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CardLayoutTest {
	Frame frame = new Frame("测试窗口");
	


	public void init() {
		
		
		String[] lableNames = { "第一张", "第二张", "第三张", "第四张", "第五张" };
		
		Panel lablePanel = new Panel();
		Panel buttonPanel = new Panel();
		
		final CardLayout cardLayout = new CardLayout();
		lablePanel.setLayout(cardLayout);
		
		
		for (int i = 0; i < lableNames.length; i++) {
			lablePanel.add(lableNames[i], new Button(lableNames[i]));
		}
		
		
		
		ActionListener listener = e -> {
			switch (e.getActionCommand()) {
			case "上一张":
				cardLayout.previous(lablePanel);
				break;
			case "下一张":
				cardLayout.next(lablePanel);
				break;
			case "第一张":
				cardLayout.first(lablePanel);
				break;
			case "最后一张":
				cardLayout.last(lablePanel);
				break;
			case "第三张":
				cardLayout.show(lablePanel, "第三张");
				break;
			}
		};
		
		// 控制显示上一张的按钮
		Button previous = new Button("上一张");
		previous.addActionListener(listener);
		// 控制显示下一张的按钮
		Button next = new Button("下一张");
		next.addActionListener(listener);
		// 控制显示第一张的按钮
		Button first = new Button("第一张");
		first.addActionListener(listener);
		// 控制显示最后一张的按钮
		Button last = new Button("最后一张");
		last.addActionListener(listener);
		// 控制根据Card名显示的按钮
		Button third = new Button("第三张");
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
