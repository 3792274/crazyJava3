package chapter10_02_�쳣��ļ̳���ϵ;


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
	// ����һ����ά�������䵱����
	private String[][] board;
	// �������̵Ĵ�С
	private static int BOARD_SIZE = 15;
	public void initBoard()
	{
		// ��ʼ����������
		board = new String[BOARD_SIZE][BOARD_SIZE];
		// ��ÿ��Ԫ�ظ�Ϊ"��"�������ڿ���̨��������
		for (int i = 0 ; i < BOARD_SIZE ; i++)
		{
			for ( int j = 0 ; j < BOARD_SIZE ; j++)
			{
				board[i][j] = "��";
			}
		}
	}
	// �ڿ���̨������̵ķ���
	public void printBoard()
	{
		// ��ӡÿ������Ԫ��
		for (int i = 0 ; i < BOARD_SIZE ; i++)
		{
			for ( int j = 0 ; j < BOARD_SIZE ; j++)
			{
				// ��ӡ����Ԫ�غ󲻻���
				System.out.print(board[i][j]);
			}
			// ÿ��ӡ��һ������Ԫ�غ����һ�����з�
			System.out.print("\n");
		}
	}
    public static void main(String[] args)throws Exception
    {
        Gobang gb = new Gobang();
		gb.initBoard();
		gb.printBoard();
		// �������ڻ�ȡ��������ķ���
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		String inputStr = null;
		// br.readLine()��ÿ���ڼ���������һ�����ݰ��س���
		// �û��ո���������ݽ���br��ȡ����
		while ((inputStr = br.readLine()) != null)
		{
			try
			{
				// ���û�������ַ����Զ�����Ϊ�ָ������ֽ��2���ַ���
				String[] posStrArr = inputStr.split(",");
				// ��2���ַ���ת�����û����������
				int xPos = Integer.parseInt(posStrArr[0]);
				int yPos = Integer.parseInt(posStrArr[1]);
				// �Ѷ�Ӧ������Ԫ�ظ�Ϊ"��"��
				if (!gb.board[xPos - 1][yPos - 1].equals("��"))
				{
					System.out.println("���������������������ˣ�"+ "����������");
					continue;
				}
				gb.board[xPos - 1][yPos - 1] = "��";
			}
			catch (Exception e)
			{
				System.out.println("����������겻�Ϸ������������룬"+ "��������Ӧ��x,y�ĸ�ʽ");
				continue;
			}

			gb.printBoard();
			System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ��");
		}
    }
}
