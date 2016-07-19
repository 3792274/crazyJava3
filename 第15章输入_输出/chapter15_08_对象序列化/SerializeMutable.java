package chapter15_08_�������л�;

import java.io.*;

/**
 * Description:���л��Ժ󽫲��ٸ��¶������л����ö����ֵ�޸ĺ������л�Ҳ���ᱣ���޸ĺ��ֵ�� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class SerializeMutable {
	public static void main(String[] args) {

		try (
				// ����һ��ObjectOutputStream������
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
				// ����һ��ObjectInputStream������
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mutable.txt"))) {
			Person per = new Person("�����", 500);
			// ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			// �ı�per�����nameʵ������
			per.setName("��˽�");
			// ϵͳֻ��������л���ţ����Ըı���name���ᱻ���л�
			oos.writeObject(per);
			Person p1 = (Person) ois.readObject(); // ��
			Person p2 = (Person) ois.readObject(); // ��
			// �������true���������л���p1����p2
			System.out.println(p1 == p2);
			// ������Ȼ�������"�����"�����ı���ʵ������û�б����л�
			System.out.println(p2.getName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}