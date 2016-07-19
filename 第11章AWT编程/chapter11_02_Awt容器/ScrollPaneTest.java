package chapter11_02_Awt����;


import java.awt.*;
/**
 * Description:ScrollPane�����ܵ������ڣ�������ӵ�����������
 * 1.�����ռ�ÿռ�����Զ�����������������ͨ���ƶ��ض�����������ƶ�Ĭ�Ͼ��й�����
 * 2.���ܵ������ڣ������������������
 * 3.Ĭ��ʹ��BorderLayout��Ϊ���ֹ�������ͨ��������ı�ScrollPane���ֹ�����
 * 
 */
public class ScrollPaneTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		// ����һ��ScrollPane������ָ�����Ǿ��й�����
		ScrollPane sp = new ScrollPane( ScrollPane.SCROLLBARS_ALWAYS);
		
		// ��ScrollPane������������������BorderLayout����ֻ��һ���������ʾ������
		sp.add(new TextField(20));
		sp.add(new Button("������"));
		
		// ��ScrollPane������ӵ�Frame������
		f.add(sp);
		
		// ���ô��ڵĴ�С��λ��
		f.setBounds(30, 30 , 250, 120);
		
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}

