package chapter12_01_Swing����;


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
public class AllLookAndFeel
{
	public static void main(String[] args)
	{
		System.out.println("��ǰϵͳ���õ�����LAF:");
		for (UIManager.LookAndFeelInfo info :
			UIManager.getInstalledLookAndFeels())
		{
			System.out.println(info.getName()
				+ "--->" + info);
		}
	}
}
