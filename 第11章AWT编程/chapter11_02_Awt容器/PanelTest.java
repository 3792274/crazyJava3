package chapter11_02_Awt����;


import java.awt.*;
/**
 * Description:
 * Panel(AWT-���󴰿ڹ��߼����������������ܶ������ڣ�����������������е�����)
 * 1.������Ϊ������ʢװ���������Ϊ��������ṩ�ռ�
 * 2.���ܵ������ڣ������������������
 * 3.Ĭ��ʹ��FlowLayout��Ϊ���ֹ�����
 */
public class PanelTest
{
	
	//ʢװһ���ı���һ����ť����ӵ�Frame������
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		// ����һ��Panel����
		Panel p = new Panel();
		// ��Panel����������������
		p.add(new TextField(20));
		p.add(new Button("������"));
		// ��Panel������ӵ�Frame������
		f.add(p);
		// ���ô��ڵĴ�С��λ��
		f.setBounds(30, 30 , 250, 120);
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}
