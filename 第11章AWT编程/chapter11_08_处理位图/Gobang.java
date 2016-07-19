package chapter11_08_����λͼ;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
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
public class Gobang
{
	// ��������λͼ�ֱ�������̡����ӡ�����
	BufferedImage table;
	BufferedImage black;
	BufferedImage white;
	// ������ƶ�ʱ���ѡ���
	BufferedImage selected;
	// �������̵Ĵ�С
	private static int BOARD_SIZE = 15;
	// �������̿��߶��ٸ�����
	private final int TABLE_WIDTH = 535;
	private final int TABLE_HETGHT = 536;
	// �����������������ֵ����������֮��ı��ʡ�
	private final int RATE = TABLE_WIDTH / BOARD_SIZE;
	// �����������������ֵ����������֮���ƫ�ƾࡣ
	private final int X_OFFSET = 5;
	private final int Y_OFFSET = 6;
	// ����һ����ά�������䵱����
	private String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
	// ��������Ϸ�Ĵ���
	JFrame f = new JFrame("��������Ϸ");
	// ��������Ϸ���̶�Ӧ��Canvas���
	ChessBoard chessBoard = new ChessBoard();
	// ��ǰѡ�е������
	private int selectedX = -1;
	private int selectedY = -1;
	public void init()throws Exception
	{
		table = ImageIO.read(new File("image/board.jpg"));
		black = ImageIO.read(new File("image/black.gif"));
		white = ImageIO.read(new File("image/white.gif"));
		selected = ImageIO.read(new File("image/selected.gif"));
		// ��ÿ��Ԫ�ظ�Ϊ"��"��"��"����û������
		for (int i = 0 ; i < BOARD_SIZE ; i++)
		{
			for ( int j = 0 ; j < BOARD_SIZE ; j++)
			{
				board[i][j] = "��";
			}
		}
		chessBoard.setPreferredSize(new Dimension(
			TABLE_WIDTH , TABLE_HETGHT));
		chessBoard.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				// ���û�����¼�������ת����������������ꡣ
				int xPos = (int)((e.getX() - X_OFFSET) / RATE);
				int yPos = (int)((e.getY() - Y_OFFSET ) / RATE);
				board[xPos][yPos] = "��";
				/*
				�����������������������Ϊ������������꣬����board���顣
				���漰:
				1.�������ĵ��Ѿ������ӣ������ظ����塣
				2.ÿ���������Ҫɨ��˭Ӯ��
				*/
				chessBoard.repaint();
			}
			// ������˳��������󣬸�λѡ�е�����
			public void mouseExited(MouseEvent e)
			{
				selectedX = -1;
				selectedY = -1;
				chessBoard.repaint();
			}
		});
		chessBoard.addMouseMotionListener(new MouseMotionAdapter()
		{
			// ������ƶ�ʱ���ı�ѡ�е������
			public void mouseMoved(MouseEvent e)
			{
				selectedX = (e.getX() - X_OFFSET) / RATE;
				selectedY = (e.getY() - Y_OFFSET) / RATE;
				chessBoard.repaint();
			}
		});
		f.add(chessBoard);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)throws Exception
	{
		Gobang gb = new Gobang();
		gb.init();
	}
	class ChessBoard extends JPanel
	{
		// ��дJPanel��paint������ʵ�ֻ滭
		public void paint(Graphics g)
		{
			// ����������������
			g.drawImage(table , 0 , 0 , null);
			// ����ѡ�е�ĺ��
			if (selectedX >= 0 && selectedY >= 0)
				g.drawImage(selected , selectedX * RATE + X_OFFSET ,
			selectedY * RATE + Y_OFFSET, null);
			// �������飬�������ӡ�
			for (int i = 0 ; i < BOARD_SIZE ; i++)
			{
				for ( int j = 0 ; j < BOARD_SIZE ; j++)
				{
					// ���ƺ���
					if (board[i][j].equals("��"))
					{
						g.drawImage(black , i * RATE + X_OFFSET
							, j * RATE + Y_OFFSET, null);
					}
					// ���ư���
					if (board[i][j].equals("��"))
					{
						g.drawImage(white, i * RATE  + X_OFFSET
							, j * RATE  + Y_OFFSET, null);
					}
				}
			}
		}
	}
}
