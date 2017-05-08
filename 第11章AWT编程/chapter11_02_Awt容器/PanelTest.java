package chapter11_02_Awt容器;


import java.awt.*;
/**
 * Description:
 * Panel(AWT-抽象窗口工具集，典型容器，不能独立存在，必须放在其他容器中的容器)
 * 1.可以作为容器来盛装其他组件，为放置组件提供空间
 * 2.不能单独存在，必须放置其他容器中
 * 3.默认使用FlowLayout作为布局管理器
 */
public class PanelTest
{
	
	//盛装一个文本框，一个按钮，添加到Frame对象中
	public static void main(String[] args)
	{
		Frame f = new Frame("测试窗口");
		// 创建一个Panel容器
		Panel p = new Panel();
		// 向Panel容器中添加两个组件
		p.add(new TextField(20));
		p.add(new Button("单击我"));
		// 将Panel容器添加到Frame窗口中
		f.add(p);
		// 设置窗口的大小、位置
		f.setBounds(30, 30 , 250, 120);
		// 将窗口显示出来（Frame对象默认处于隐藏状态）
		f.setVisible(true);
	}
}
