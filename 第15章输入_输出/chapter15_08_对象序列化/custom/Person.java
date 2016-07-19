package chapter15_08_�������л�.custom;

import java.io.*;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Person implements java.io.Serializable {
	private String name;
	private int age;

	// ע��˴�û���ṩ�޲����Ĺ�����!
	public Person(String name, int age) {
		System.out.println("�в����Ĺ�����");
		this.name = name;
		this.age = age;
	}
	// ʡ��name��age��setter��getter����

	// name��setter��getter����
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	// age��setter��getter����
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	
	//�������л�д�ķ���
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		// ��nameʵ��������ֵ��ת��д���������
		out.writeObject(new StringBuffer(name).reverse());
		out.writeInt(age);
	}

	//�������л����ķ���
	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		// ����ȡ���ַ�����ת�󸳸�nameʵ������
		this.name = ((StringBuffer) in.readObject()).reverse().toString();
		this.age = in.readInt();
	}
}