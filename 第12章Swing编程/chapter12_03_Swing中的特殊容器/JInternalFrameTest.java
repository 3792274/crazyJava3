package chapter12_03_Swing�е���������;


import java.beans.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
public class JInternalFrameTest
{
	final int DESKTOP_WIDTH = 480;
	final int DESKTOP_HEIGHT = 360;
	final int FRAME_DISTANCE = 30;
	JFrame jf = new JFrame("MDI����");
	// ����һ����������
	private MyJDesktopPane desktop = new MyJDesktopPane();
	// ������һ���ڲ����ڵ������
	private int nextFrameX;
	private int nextFrameY;
	// �����ڲ�����Ϊ���������1/2��С
	private int width = DESKTOP_WIDTH / 2;
	private int height = DESKTOP_HEIGHT / 2;
	// Ϊ�����ڶ��������˵�
	JMenu fileMenu = new JMenu("�ļ�");
	JMenu windowMenu = new JMenu("����");
	// ����newAction���ڴ����˵��͹��߰�ť
	Action newAction = new AbstractAction("�½�"
		, new ImageIcon("ico/new.png"))
	{
		public void actionPerformed(ActionEvent event)
		{
			// �����ڲ�����
			final JInternalFrame iframe = new JInternalFrame("���ĵ�",
				true, // �ɸı��С
				true, // �ɹر�
				true, // �����
				true); // ����С��
			iframe.add(new JScrollPane(new JTextArea(8, 40)));
			// ���ڲ�������ӵ�����������
			desktop.add(iframe);
			// �����ڲ����ڵ�ԭʼλ�ã��ڲ�����Ĭ�ϴ�С��0X0������0,0λ�ã�
			iframe.reshape(nextFrameX, nextFrameY, width, height);
			// ʹ�ô��ڿɼ���������ѡ����
			iframe.show();
			// ������һ���ڲ����ڵ�λ��
			nextFrameX += FRAME_DISTANCE;
			nextFrameY += FRAME_DISTANCE;
			if (nextFrameX + width > desktop.getWidth()) nextFrameX = 0;
			if (nextFrameY + height > desktop.getHeight()) nextFrameY = 0;
		}
	};
	// ����exitAction���ڴ����˵��͹��߰�ť
	Action exitAction = new AbstractAction("�˳�"
		, new ImageIcon("ico/exit.png"))
	{
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}
	};
	public void init()
	{
		// Ϊ���ڰ�װ�˵����͹�����
		JMenuBar menuBar = new JMenuBar();
		JToolBar toolBar = new JToolBar();
		jf.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		fileMenu.add(newAction);
		fileMenu.add(exitAction);
		toolBar.add(newAction);
		toolBar.add(exitAction);
		menuBar.add(windowMenu);
		JMenuItem nextItem = new JMenuItem("��һ��");
		nextItem.addActionListener(event -> desktop.selectNextWindow());
		windowMenu.add(nextItem);
		JMenuItem cascadeItem = new JMenuItem("����");
		cascadeItem.addActionListener(event ->
			// ������ʾ���ڣ��ڲ����ڵĴ�С���ⲿ���ڵ�0.75
			desktop.cascadeWindows(FRAME_DISTANCE , 0.75));
		windowMenu.add(cascadeItem);
		JMenuItem tileItem = new JMenuItem("ƽ��");
		// ƽ����ʾ�����ڲ�����
		tileItem.addActionListener(event -> desktop.tileWindows());
		windowMenu.add(tileItem);
		final JCheckBoxMenuItem dragOutlineItem = new
			JCheckBoxMenuItem("����ʾ�϶����ڵ�����");
		dragOutlineItem.addActionListener(event ->
			// ���ݸò˵����Ƿ�ѡ�����������������϶�ģʽ
			desktop.setDragMode(dragOutlineItem.isSelected()
				? JDesktopPane.OUTLINE_DRAG_MODE
				: JDesktopPane.LIVE_DRAG_MODE));    // ��
		windowMenu.add(dragOutlineItem);
		desktop.setPreferredSize(new Dimension(480, 360));
		// ������������ӵ�����JFrame������
		jf.add(desktop);
		jf.add(toolBar , BorderLayout.NORTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new JInternalFrameTest().init();
	}
}
class MyJDesktopPane extends JDesktopPane
{
	// �����д����Լ�����ʽ��ʾ,
	// ����offset���������ڵ�λ�ƾ���, s
	// cale���ڲ�������JDesktopPane�Ĵ�С����
	public void cascadeWindows(int offset , double scale)
	{
		// ���弶����ʾ����ʱ�ڲ����ڵĴ�С
		int width = (int)(getWidth() * scale);
		int height = (int)(getHeight() * scale);
		// ���ڱ��漶������ʱÿ�����ڵ�λ��
		int x = 0;
		int y = 0;
		for (JInternalFrame frame : getAllFrames())
		{
			try
			{
				// ȡ���ڲ����ڵ����,��С��
				frame.setMaximum(false);
				frame.setIcon(false);
				// �Ѵ������·�����ָ��λ��
				frame.reshape(x, y, width, height);
				x += offset;
				y += offset;
				// ���������������߽�
				if (x + width > getWidth()) x = 0;
				if (y + height > getHeight()) y = 0;
			}
			catch (PropertyVetoException e)
			{}
		}
	}
	// �����д�����ƽ�̷�ʽ��ʾ
	public void tileWindows()
	{
		// ͳ�����д���
		int frameCount = 0;
		for (JInternalFrame frame : getAllFrames())
		{
			frameCount++;
		}
		// ������Ҫ�����С������вſ���ƽ�����д���
		int rows = (int) Math.sqrt(frameCount);
		int cols = frameCount / rows;
		// ��Ҫ�������ӵ��������еĴ���
		int extra = frameCount % rows;
		// ����ƽ��ʱ�ڲ����ڵĴ�С
		int width = getWidth() / cols;
		int height = getHeight() / rows;
		// ���ڱ���ƽ�̴���ʱÿ�������ں��������ϵ�����
		int x = 0;
		int y = 0;
		for (JInternalFrame frame : getAllFrames())
		{
			try
			{
				// ȡ���ڲ����ڵ����,��С��
				frame.setMaximum(false);
				frame.setIcon(false);
				// �����ڷ���ָ��λ��
				frame.reshape(x * width, y * height, width, height);
				y++;
				// ÿ����һ�д���
				if (y == rows)
				{
					// ��ʼ�ŷ���һ�д���
					y = 0;
					x++;
					// ����������Ĵ�����ʣ�µ�������ȣ�
					// ����������ж���Ҫ������һ������
					if (extra == cols - x)
					{
						rows++;
						height = getHeight() / rows;
					}
				}
			}
			catch (PropertyVetoException e)
			{}
		}
	}
	// ѡ����һ����ͼ�괰��
	public void selectNextWindow()
	{
		JInternalFrame[] frames = getAllFrames();
		for (int i = 0; i < frames.length; i++)
		{
			if (frames[i].isSelected())
			{
				//  �ҳ���һ������С���Ĵ��ڣ�����ѡ������
				// ���ѡ��ʧ�ܣ����������ѡ����һ������
				int next = (i + 1) % frames.length;
				while (next != i)
				{
					// ����ô��ڲ��Ǵ�����С��״̬
					if (!frames[next].isIcon())
					{
						try
						{
							frames[next].setSelected(true);
							frames[next].toFront();
							frames[i].toBack();
							return;
						}
						catch (PropertyVetoException e)
						{}
					}
					next = (next + 1) % frames.length;
				}
			}
		}
	}
}