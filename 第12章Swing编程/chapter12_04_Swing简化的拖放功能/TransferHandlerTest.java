package chapter12_04_Swing简化的拖放功能;


import java.awt.*;
import javax.swing.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class TransferHandlerTest
{
	private JFrame jf = new JFrame("测试TransferHandler");
	JColorChooser chooser = new JColorChooser();
	JTextArea txt = new JTextArea("测试TransferHandler\n"
		+ "直接将上面颜色拖入以改变文本颜色");
	public void init()
	{
		// 启动颜色选择器面板和文本域的拖放功能
		chooser.setDragEnabled(true);
		txt.setDragEnabled(true);
		jf.add(chooser, BorderLayout.SOUTH);
		// 允许直接将一个Color对象拖入该JTextArea对象
		// 并赋给它的foreground属性
		txt.setTransferHandler(new TransferHandler("foreground"));
		jf.add(new JScrollPane(txt));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new TransferHandlerTest().init();
	}
}
