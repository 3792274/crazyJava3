package chapter12_06_ʹ��JProgressBar_ProgressMonitor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
public class JProgressBarTest {
	JFrame frame = new JFrame("���Խ�����");
	// ����һ����ֱ������
	JProgressBar bar = new JProgressBar(JProgressBar.VERTICAL);
	JCheckBox indeterminate = new JCheckBox("��ȷ������");
	JCheckBox noBorder = new JCheckBox("�����Ʊ߿�");

	public void init() {
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(indeterminate);
		box.add(noBorder);
		frame.setLayout(new FlowLayout());
		frame.add(box);
		// �ѽ�������ӵ�JFrame������
		frame.add(bar);
		// ���ý����������ֵ����Сֵ
		bar.setMinimum(0);
		bar.setMaximum(100);
		// �����ڽ������л�����ɰٷֱ�
		bar.setStringPainted(true);
		// ���ݸ�ѡ�������Ƿ���ƽ������ı߿�
		noBorder.addActionListener(event -> bar.setBorderPainted(!noBorder.isSelected()));
		indeterminate.addActionListener(event -> {
			// ���øý������Ľ����Ƿ�ȷ��
			bar.setIndeterminate(indeterminate.isSelected());
			bar.setStringPainted(!indeterminate.isSelected());
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		// ����ѭ����ʽ�����ϸı����������ɽ���
		for (int i = 0; i <= 100; i++) {
			// �ı����������ɽ���
			bar.setValue(i);
			try {
				// ������ͣ0.1��
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new JProgressBarTest().init();
	}
}
