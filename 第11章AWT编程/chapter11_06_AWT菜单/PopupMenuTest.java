package chapter11_06_AWT菜单;


import java.awt.*;
import java.awt.event.*;
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
public class PopupMenuTest
{
	private TextArea ta = new TextArea(4 , 30);
	private Frame f = new Frame("测试");
	PopupMenu pop = new PopupMenu();
	CheckboxMenuItem autoWrap =
		new CheckboxMenuItem("自动换行");
	MenuItem copyItem = new MenuItem("复制");
	MenuItem pasteItem = new MenuItem("粘贴");
	Menu format = new Menu("格式");
	// 创建commentItem菜单项，指定使用 Ctrl+Shift+/ 快捷键
	MenuItem commentItem = new MenuItem("注释" ,
		new MenuShortcut(KeyEvent.VK_SLASH , true));
	MenuItem cancelItem = new MenuItem("取消注释");
	public void init()
	{
		// 以Lambda表达式创建菜单事件监听器
		ActionListener menuListener = e ->
		{
			String cmd = e.getActionCommand();
			ta.append("单击“" + cmd + "”菜单" + "\n");
			if (cmd.equals("退出"))
			{
				System.exit(0);
			}
		};
		// 为commentItem菜单项添加了事件监听器。
		commentItem.addActionListener(menuListener);
		// 为pop菜单添加菜单项
		pop.add(autoWrap);
		// 使用addSeparator方法来添加菜单分隔线
		pop.addSeparator();
		pop.add(copyItem);
		pop.add(pasteItem);
		// 为format菜单添加菜单项
		format.add(commentItem);
		format.add(cancelItem);
		// 使用添加new MenuItem("-")的方式添加菜单分隔线
		pop.add(new MenuItem("-"));
		// 将format菜单组合到pop菜单中，从而形成二级菜单
		pop.add(format);
		final Panel p = new Panel();
		p.setPreferredSize(new Dimension(300, 160));
		// 向p窗口中添加PopupMenu对象
		p.add(pop);
		// 添加鼠标事件监听器
		p.addMouseListener(new MouseAdapter()
		{
			public void mouseReleased(MouseEvent e)
			{
				// 如果释放的是鼠标右键
				if (e.isPopupTrigger())
				{
					pop.show(p , e.getX() , e.getY());
				}
			}
		});
		f.add(p);
		f.add(ta , BorderLayout.NORTH);
		// 以匿名内部类的形式来创建事件监听器对象
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new PopupMenuTest().init();
	}
}
