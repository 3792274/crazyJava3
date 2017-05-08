package chapter11_02_Awt容器;

import java.awt.*;
/**
 * Description:
 * 1.Object
 *   	Component(普通组件)
 *   				Button
 *   				TextField
 *   				List
 *   				Container	
 *   						Window
 *   								Frame(创建窗口)
 *   								Dialog(创建对话框)
 *   						Panel(AWT-抽象窗口工具集，典型容器，不能独立存在，必须放在其他容器中的容器)
 *   								Applet
 *   						ScrollPane(增加滚动条)
 *   			
 *  	 MenuComponent(菜单组件)
 *  				MenuBar
 *  				MenuItem
 *  						Menu
 */
public class FrameTest
{
	public static void main(String[] args)
	{
		//默认使用BorderLayout作为布局管理器
		Frame f = new Frame("测试窗口");
		// 设置窗口的大小、位置
		f.setBounds(30, 30 , 250, 200);
		// 将窗口显示出来（Frame对象默认处于隐藏状态）
		f.setVisible(true);
	}
}
