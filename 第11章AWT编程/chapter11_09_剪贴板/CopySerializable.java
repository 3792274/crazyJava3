package chapter11_09_������;


import java.awt.*;
import java.awt.event.*;
import java.awt.datatransfer.*;

import java.io.*;
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
class Dog implements Serializable
{
	private String name;
	private int age;

	public Dog(){}

	public Dog(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	// age��setter��getter����
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		 return this.age;
	}
	public String toString()
	{
		return "Dog [ name=" + name + " , age=" + age + " ]";
	}
}
public class CopySerializable
{
	Frame f = new Frame("���ƶ���");
	Button copy = new Button("����");
	Button paste = new Button("ճ��");
	TextField name = new TextField(15);
	TextField age = new TextField(15);
	TextArea ta = new TextArea(3 , 30);
	// ����ϵͳ������
	Clipboard clipboard = Toolkit.getDefaultToolkit()
		.getSystemClipboard();
	public void init()
	{
		Panel p = new Panel();
		p.add(new Label("����"));
		p.add(name);
		p.add(new Label("����"));
		p.add(age);
		f.add(p , BorderLayout.NORTH);
		f.add(ta);
		Panel bp = new Panel();
		copy.addActionListener(e -> copyDog());
		paste.addActionListener(e ->
		{
			try
			{
				readDog();
			}
			catch (Exception ee)
			{
				ee.printStackTrace();
			}
		});
		bp.add(copy);
		bp.add(paste);
		f.add(bp , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public void copyDog()
	{
		Dog d = new Dog(name.getText()
			, Integer.parseInt(age.getText()));
		// ��dogʵ����װ��SerialSelection����
		SerialSelection ls =new SerialSelection(d);
		// ��SerialSelection�������ϵͳ��������
		clipboard.setContents(ls , null);
	}
	public void readDog()throws Exception
	{
		DataFlavor peronFlavor = new DataFlavor(DataFlavor
			.javaSerializedObjectMimeType + ";class=Dog");
		if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor))
		{
			// ��ϵͳ�������ж�ȡ����
			Dog d = (Dog)clipboard.getData(peronFlavor);
			ta.setText(d.toString());
		}
	}
	public static void main(String[] args)
	{
		new CopySerializable().init();
	}
}
