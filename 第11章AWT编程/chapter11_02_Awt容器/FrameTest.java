package chapter11_02_Awt����;

import java.awt.*;
/**
 * Description:
 * 1.Object
 *   	Component(��ͨ���)
 *   				Button
 *   				TextField
 *   				List
 *   				Container	
 *   						Window
 *   								Frame(��������)
 *   								Dialog(�����Ի���)
 *   						Panel(AWT-���󴰿ڹ��߼����������������ܶ������ڣ�����������������е�����)
 *   								Applet
 *   						ScrollPane(���ӹ�����)
 *   			
 *  	 MenuComponent(�˵����)
 *  				MenuBar
 *  				MenuItem
 *  						Menu
 */
public class FrameTest
{
	public static void main(String[] args)
	{
		//Ĭ��ʹ��BorderLayout��Ϊ���ֹ�����
		Frame f = new Frame("���Դ���");
		// ���ô��ڵĴ�С��λ��
		f.setBounds(30, 30 , 250, 200);
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
	}
}
