package chapter12_03_Swing�е���������;


import java.awt.*;
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
public class JLayeredPaneTest
{
	JFrame jf = new JFrame("����JLayeredPane");
	JLayeredPane layeredPane = new JLayeredPane();
	public void init()
	{
		// ��layeredPane�����3�����
		layeredPane.add(new ContentPanel(10 , 20 , "���Java����"
			, "ico/java.png"), JLayeredPane.MODAL_LAYER);
		layeredPane.add(new ContentPanel(100 , 60 , "���Android����"
			, "ico/android.png"), JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(new ContentPanel(190 , 100
			, "������Java EE��ҵӦ��ʵս", "ico/ee.png"), 4);
		layeredPane.setPreferredSize(new Dimension(400, 300));
		layeredPane.setVisible(true);
		jf.add(layeredPane);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new JLayeredPaneTest().init();
	}
}
// ��չ��JPanel�࣬����ֱ�Ӵ���һ������ָ��λ�ã�
// ����ָ�����⡢����ָ��ͼ���JPanel����
class ContentPanel extends JPanel
{
	public ContentPanel(int xPos , int yPos
		, String title , String ico)
	{
		setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(), title));
		JLabel label = new JLabel(new ImageIcon(ico));
		add(label);
		setBounds(xPos , yPos , 160, 220);    // ��
	}
}

