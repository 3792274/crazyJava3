package chapter15_08_�������л�;

import java.io.*;

/**
 * Description: �����л�ʱ�����������л������class�ļ����汾һ�¡�<br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ReadObject {
	public static void main(String[] args) {
		try (
				// ����һ��ObjectInputStream������
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"))) {
			// ���������ж�ȡһ��Java���󣬲�����ǿ������ת��ΪPerson��
			Person p = (Person) ois.readObject();
			System.out.println("����Ϊ��" + p.getName() + "\n����Ϊ��" + p.getAge());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
