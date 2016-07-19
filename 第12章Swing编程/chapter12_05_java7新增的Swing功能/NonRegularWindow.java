package chapter12_05_java7������Swing����;


import java.io.*;

import java.awt.*;
import javax.imageio.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
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
public class NonRegularWindow extends JFrame
	implements ActionListener
{
	// ����3������
	JFrame transWin = new JFrame("͸������");
	JFrame gradientWin = new JFrame("����͸������");
	JFrame bgWin = new JFrame("����ͼƬ����");
	JFrame shapeWin = new JFrame("��Բ����");
	public NonRegularWindow()
	{
		super("�����򴰿ڲ���");
		setLayout(new FlowLayout());
		JButton transBn = new JButton("͸������");
		JButton gradientBn = new JButton("����͸������");
		JButton bgBn = new JButton("����ͼƬ����");
		JButton shapeBn = new JButton("��Բ����");
		// Ϊ3����ť����¼�������
		transBn.addActionListener(this);
		gradientBn.addActionListener(this);
		bgBn.addActionListener(this);
		shapeBn.addActionListener(this);
		add(transBn);
		add(gradientBn);
		add(bgBn);
		add(shapeBn);
		//-------����͸������-------
		transWin.setLayout(new GridBagLayout());
		transWin.setSize(300,200);
		transWin.add(new JButton("͸��������ļ򵥰�ť"));
		// ����͸����Ϊ0.65f��͸����Ϊ1ʱ��ȫ��͸����
		transWin.setOpacity(0.65f);
		//-------���ý���͸���Ĵ���-------
		gradientWin.setBackground(new Color(0,0,0,0));
		gradientWin.setSize(new Dimension(300,200));
		// ʹ��һ��JPanel������Ϊ����͸���ı���
		JPanel panel = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				if (g instanceof Graphics2D)
				{
					final int R = 240;
					final int G = 240;
					final int B = 240;
					// ����һ�����仭��
					Paint p = new GradientPaint(0.0f, 0.0f
						, new Color(R, G, B, 0)
						, 0.0f, getHeight()
						, new Color(R, G, B, 255) , true);
					Graphics2D g2d = (Graphics2D)g;
					g2d.setPaint(p);
					g2d.fillRect(0, 0, getWidth(), getHeight());
				}
			}
		};
		// ʹ��JPanel������ΪJFrame��contentPane
		gradientWin.setContentPane(panel);
		panel.setLayout(new GridBagLayout());
		gradientWin.add(new JButton("����͸��������ļ򵥰�ť"));
		//-------�����б���ͼƬ�Ĵ���-------
		bgWin.setBackground(new Color(0,0,0,0));
		bgWin.setSize(new Dimension(300,200));
		// ʹ��һ��JPanel������Ϊ����ͼƬ
		JPanel bgPanel = new JPanel()
		{
			protected void paintComponent(Graphics g)
			{
				try
				{
					Image bg = ImageIO.read(new File("images/java.png"));
					// ����һ��ͼƬ��Ϊ����
					g.drawImage(bg , 0 , 0 , getWidth() , getHeight() ,  null);
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			}
		};
		// ʹ��JPanel������ΪJFrame��contentPane
		bgWin.setContentPane(bgPanel);
		bgPanel.setLayout(new GridBagLayout());
		bgWin.add(new JButton("�б���ͼƬ������ļ򵥰�ť"));
		//-------������Բ�δ���-------
		shapeWin.setLayout(new GridBagLayout());
		shapeWin.setUndecorated(true);
		shapeWin.setOpacity(0.7f);
		// ͨ��ΪshapeWin��Ӽ����������ô��ڵ���״��
		// ��shapeWin���ڵĴ�С���ı�ʱ������̬���øô��ڵ���״
		shapeWin.addComponentListener(new ComponentAdapter()
		{
			// �����ڴ�С���ı�ʱ����Բ�Ĵ�СҲ����Ӧ�ظı�
			public void componentResized(ComponentEvent e)
			{
				// ���ô��ڵ���״
				shapeWin.setShape(new Ellipse2D.Double(0 , 0
					, shapeWin.getWidth() , shapeWin.getHeight()));  // ��
			}
		});
		shapeWin.setSize(300,200);
		shapeWin.add(new JButton("��Բ�δ�����ļ򵥰�ť"));
		//-------����������Ĵ���-------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	public void actionPerformed(ActionEvent event)
	{
		switch(event.getActionCommand())
		{
			case "͸������":
				transWin.setVisible(true);
				break;
			case "����͸������":
				gradientWin.setVisible(true);
				break;
			case "����ͼƬ����":
				bgWin.setVisible(true);
				break;
			case "��Բ����":
				shapeWin.setVisible(true);
				break;
		}
	}
	public static void main(String[] args)
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		new NonRegularWindow();
	}
}
