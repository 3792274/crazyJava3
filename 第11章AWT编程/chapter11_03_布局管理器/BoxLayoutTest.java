package chapter11_03_布局管理器;


import java.awt.*;
import javax.swing.*;
/**
 * Description:Swing提供的GridBagLayout
 */
public class BoxLayoutTest
{
	private Frame f = new Frame("测试");
	public void init()
	{
		f.setLayout(new BoxLayout(f , BoxLayout.Y_AXIS));
		// 下面按钮将会垂直排列
		f.add(new Button("第一个按钮"));
		f.add(new Button("按钮二"));
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new BoxLayoutTest().init();
	}
}
