package chapter11_03_布局管理器;


import java.awt.*;
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
public class FlowLayoutTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("测试窗口");
		// 设置Frame容器使用FlowLayout布局管理器，左对齐，水平间距20，垂直间距5
		f.setLayout(new FlowLayout(FlowLayout.LEFT , 20, 5));
		// 向窗口中添加10个按钮
		for (int i = 0; i < 10 ; i++ )
		{
			f.add(new Button("按钮" + i));
		}
		// 设置窗口为最佳大小
		f.pack();
		// 将窗口显示出来（Frame对象默认处于隐藏状态）
		f.setVisible(true);
	}
}

