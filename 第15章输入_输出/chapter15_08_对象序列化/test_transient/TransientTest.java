package chapter15_08_�������л�.test_transient;

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
public class TransientTest {
	public static void main(String[] args) {
		try (
				// ����һ��ObjectOutputStream�����
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
				// ����һ��ObjectInputStream������
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"))) {
			Person per = new Person("�����", 500);
			// ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			Person p = (Person) ois.readObject();
			System.out.println(p.getAge());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
