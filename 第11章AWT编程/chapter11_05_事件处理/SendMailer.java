package chapter11_05_事件处理;


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
public class SendMailer
{
	private Frame f = new Frame("测试");
	private TextField tf = new TextField(40);
	private Button send = new Button("发送");
	public void init()
	{
		// 使用MailerListener对象作为事件监听器
		send.addActionListener(new MailerListener(tf));
		f.add(tf);
		f.add(send , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new SendMailer().init();
	}
}
