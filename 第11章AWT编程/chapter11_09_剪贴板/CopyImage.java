package chapter11_09_������;


import java.util.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.datatransfer.*;
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
public class CopyImage
{
	// ϵͳ������
	private Clipboard clipboard = Toolkit
		.getDefaultToolkit().getSystemClipboard();
	// ʹ��ArrayList����������ճ��������Image�������ǵ���ͼ�㴦��
	java.util.List<Image> imageList = new ArrayList<>();
	// ���������ǰ��HandDraw�����п��ƻ�ͼ�Ĵ���һ����ʡ���ⲿ�ִ��롣
	// ��ͼ���Ŀ��
	private final int AREA_WIDTH = 500;
	// ��ͼ���ĸ߶�
	private final int AREA_HEIGHT = 400;
	// �����preX��preY��������һ������϶��¼����������
	private int preX = -1;
	private int preY = -1;
	// ����һ���Ҽ��˵��������û�����ɫ
	PopupMenu pop = new PopupMenu();
	MenuItem redItem = new MenuItem("��ɫ");
	MenuItem greenItem = new MenuItem("��ɫ");
	MenuItem blueItem = new MenuItem("��ɫ");
	// ����һ��BufferedImage����
	BufferedImage image = new BufferedImage(AREA_WIDTH
		, AREA_HEIGHT , BufferedImage.TYPE_INT_RGB);
	// ��ȡimage�����Graphics
	Graphics g = image.getGraphics();
	private Frame f = new Frame("���ֻ����");
	private DrawCanvas drawArea = new DrawCanvas();
	// ���ڱ��滭����ɫ
	private Color foreColor = new Color(255, 0 ,0);
	public void init()
	{
		// �����Ҽ��˵����¼���������
		ActionListener menuListener = e ->
		{
			if (e.getActionCommand().equals("��ɫ"))
			{
				foreColor = new Color(0 , 255 , 0);
			}
			if (e.getActionCommand().equals("��ɫ"))
			{
				foreColor = new Color(255 , 0 , 0);
			}
			if (e.getActionCommand().equals("��ɫ"))
			{
				foreColor = new Color(0 , 0 , 255);
			}
		};
		// Ϊ�����˵�����¼�������
		redItem.addActionListener(menuListener);
		greenItem.addActionListener(menuListener);
		blueItem.addActionListener(menuListener);
		// ���˵�����ϳ��Ҽ��˵�
		pop.add(redItem);
		pop.add(greenItem);
		pop.add(blueItem);
		// ���Ҽ��˵���ӵ�drawArea������
		drawArea.add(pop);
		// ��image����ı���ɫ���ɰ�ɫ
		g.fillRect(0 , 0 ,AREA_WIDTH , AREA_HEIGHT);
		drawArea.setPreferredSize(new Dimension(AREA_WIDTH , AREA_HEIGHT));
		// ��������ƶ�����
		drawArea.addMouseMotionListener(new MouseMotionAdapter()
		{
			// ʵ�ְ����������϶����¼�������
			public void mouseDragged(MouseEvent e)
			{
				// ���preX��preY����0
				if (preX > 0 && preY > 0)
				{
					// ���õ�ǰ��ɫ
					g.setColor(foreColor);
					// ���ƴ���һ������϶��¼��㵽��������϶��¼�����߶�
					g.drawLine(preX , preY , e.getX() , e.getY());
				}
				// ����ǰ����¼����X��Y���걣������
				preX = e.getX();
				preY = e.getY();
				// �ػ�drawArea����
				drawArea.repaint();
			}
		});
		// ��������¼�
		drawArea.addMouseListener(new MouseAdapter()
		{
			// ʵ������ɿ����¼�������
			public void mouseReleased(MouseEvent e)
			{
				// �����Ҽ��˵�
				if (e.isPopupTrigger())
				{
					pop.show(drawArea , e.getX() , e.getY());
				}
				// �ɿ�����ʱ������һ������϶��¼���X��Y������Ϊ-1��
				preX = -1;
				preY = -1;
			}
		});
		f.add(drawArea);
		Panel p = new Panel();
		Button copy = new Button("����");
		Button paste = new Button("ճ��");
		copy.addActionListener(event ->
		{
			// ��image�����װ��ImageSelection����
			ImageSelection contents = new ImageSelection(image);
			// ��ImageSelection������������
			clipboard.setContents(contents, null);
		});
		paste.addActionListener(event ->
		{
			// ����������а���imageFlavor����
			if (clipboard.isDataFlavorAvailable(DataFlavor.imageFlavor))
			{
				try
				{
					// ȡ����������imageFlavor����,��������ӵ�List������
					imageList.add((Image)clipboard
						.getData(DataFlavor.imageFlavor));
					drawArea.repaint();
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		p.add(copy);
		p.add(paste);
		f.add(p , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new CopyImage().init();
	}
	class DrawCanvas extends Canvas
	{
		// ��дCanvas��paint������ʵ�ֻ滭
		public void paint(Graphics g)
		{
			// ��image���Ƶ��������
			g.drawImage(image , 0 , 0 , null);
			// ��List�������Image���󶼻��Ƴ�����
			for (Image img : imageList)
			{
				g.drawImage(img , 0 , 0 , null);
			}
		}
	}
}