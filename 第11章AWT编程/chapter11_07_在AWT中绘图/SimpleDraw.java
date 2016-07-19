package chapter11_07_��AWT�л�ͼ;


import java.awt.*;
import java.awt.event.*;
import java.util.*;
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
public class SimpleDraw
{
	private final String RECT_SHAPE = "rect";
	private final String OVAL_SHAPE = "oval";
	private Frame f = new Frame("�򵥻�ͼ");
	private Button rect = new Button("���ƾ���");
	private Button oval = new Button("����Բ��");
	private MyCanvas drawArea = new MyCanvas();
	// ���ڱ�����Ҫ����ʲôͼ�εı���
	private String shape = "";
	public void init()
	{
		Panel p = new Panel();
		rect.addActionListener(e ->
		{
			// ����shape����ΪRECT_SHAPE
			shape = RECT_SHAPE;
			// �ػ�MyCanvas���󣬼���������repaint()����
			drawArea.repaint();
		});
		oval.addActionListener(e ->
		{
			// ����shape����ΪOVAL_SHAPE
			shape = OVAL_SHAPE;
			// �ػ�MyCanvas���󣬼���������repaint()����
			drawArea.repaint();
		});
		p.add(rect);
		p.add(oval);
		drawArea.setPreferredSize(new Dimension(250 , 180));
		f.add(drawArea);
		f.add(p , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SimpleDraw().init();
	}
	class MyCanvas extends Canvas
	{
		// ��дCanvas��paint������ʵ�ֻ滭
		public void paint(Graphics g)
		{
			Random rand = new Random();
			if (shape.equals(RECT_SHAPE))
			{
				// ���û�����ɫ
				g.setColor(new Color(220, 100, 80));
				// ����ػ���һ�����ο�
				g.drawRect( rand.nextInt(200)
					, rand.nextInt(120) , 40 , 60);
			}
			if (shape.equals(OVAL_SHAPE))
			{
				// ���û�����ɫ
				g.setColor(new Color(80, 100, 200));
				// ��������һ��ʵ��Բ��
				g.fillOval( rand.nextInt(200)
					, rand.nextInt(120) , 50 , 40);
			}
		}
	}
}
