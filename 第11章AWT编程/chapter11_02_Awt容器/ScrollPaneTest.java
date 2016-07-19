package chapter11_02_Awt容器;


import java.awt.*;
/**
 * Description:ScrollPane，不能单独存在，必须添加到其他容器中
 * 1.当组件占用空间过大，自动产生滚动条，可以通过制定特定构造参数来制定默认具有滚动条
 * 2.不能单独存在，必须放置其他容器中
 * 3.默认使用BorderLayout作为布局管理器，通常不允许改变ScrollPane布局管理器
 * 
 */
public class ScrollPaneTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("测试窗口");
		// 创建一个ScrollPane容器，指定总是具有滚动条
		ScrollPane sp = new ScrollPane( ScrollPane.SCROLLBARS_ALWAYS);
		
		// 向ScrollPane容器中添加两个组件，BorderLayout导致只有一个组件被显示出来。
		sp.add(new TextField(20));
		sp.add(new Button("单击我"));
		
		// 将ScrollPane容器添加到Frame对象中
		f.add(sp);
		
		// 设置窗口的大小、位置
		f.setBounds(30, 30 , 250, 120);
		
		// 将窗口显示出来（Frame对象默认处于隐藏状态）
		f.setVisible(true);
	}
}

