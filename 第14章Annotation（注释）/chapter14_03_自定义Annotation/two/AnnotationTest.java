package chapter14_03_自定义Annotation.two;


import java.awt.event.*;
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
public class AnnotationTest
{
	private JFrame mainWin = new JFrame("使用注解绑定事件监听器");
	
	// 使用Annotation为ok按钮绑定事件监听器
	@ActionListenerFor(listener=OkListener.class)
	private JButton ok = new JButton("确定");
	
	// 使用Annotation为cancel按钮绑定事件监听器
	@ActionListenerFor(listener=CancelListener.class)
	private JButton cancel = new JButton("取消");
	
	public void init()
	{
		System.out.println("init()->begin");
		// 初始化界面的方法
		JPanel jp = new JPanel();
		jp.add(ok);
		jp.add(cancel);
		mainWin.add(jp);
		ActionListenerInstaller.processAnnotations(this);     // ①使用注解处理类ActionListenerinstaller将按钮绑定上动作。
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWin.pack();
		mainWin.setVisible(true);
		System.out.println("init()->Finish->Helo");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("main()");
		new AnnotationTest().init();
	}
}


// 定义ok按钮的事件监听器实现类
class OkListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "单击了确认按钮");
	}
}


// 定义cancel按钮的事件监听器实现类
class CancelListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		JOptionPane.showMessageDialog(null , "单击了取消按钮");
	}
}