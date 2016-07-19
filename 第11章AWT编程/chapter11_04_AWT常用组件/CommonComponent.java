package chapter11_04_AWT�������;


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
public class CommonComponent
{
	Frame f = new Frame("����");
	// ����һ����ť
	Button ok = new Button("ȷ��");
	CheckboxGroup cbg = new CheckboxGroup();
	// ����һ����ѡ�򣨴���cbg�飩����ʼ���ڱ�ѡ��״̬
	Checkbox male = new Checkbox("��" , cbg , true);
	// ����һ����ѡ�򣨴���cbg�飩����ʼ����û��ѡ��״̬
	Checkbox female = new Checkbox("Ů" , cbg , false);
	// ����һ����ѡ�򣬳�ʼ����û��ѡ��״̬
	Checkbox married = new Checkbox("�Ƿ��ѻ飿" , false);
	// ����һ������ѡ���
	Choice colorChooser = new Choice();
	// ����һ���б�ѡ���
	List colorList = new List(6, true);
	// ����һ��5�С�20�еĶ����ı���
	TextArea ta = new TextArea(5, 20);
	// ����һ��50�еĵ����ı���
	TextField name = new TextField(50);
	public void init()
	{
		colorChooser.add("��ɫ");
		colorChooser.add("��ɫ");
		colorChooser.add("��ɫ");
		colorList.add("��ɫ");
		colorList.add("��ɫ");
		colorList.add("��ɫ");
		// ����һ��װ�����ı��򡢰�ť��Panel
		Panel bottom = new Panel();
		bottom.add(name);
		bottom.add(ok);
		f.add(bottom , BorderLayout.SOUTH);
		// ����һ��װ��������ѡ�������Checkbox��Panel
		Panel checkPanel = new Panel();
		checkPanel.add(colorChooser);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		// ����һ����ֱ���������Box��ʢװ�����ı���Panel
		Box topLeft = Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(checkPanel);
		// ����һ��ˮƽ���������Box��ʢװtopLeft��colorList
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
		// ��top Box������ӵ����ڵ��м�
		f.add(top);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new CommonComponent().init();
	}
}
