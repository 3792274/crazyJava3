package chapter15_08_对象序列化;

import java.io.*;

/**
 * Description: 反序列化时，必须有序列化对象的class文件，版本一致。<br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
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
				// 创建一个ObjectInputStream输入流
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"))) {
			// 从输入流中读取一个Java对象，并将其强制类型转换为Person类
			Person p = (Person) ois.readObject();
			System.out.println("名字为：" + p.getName() + "\n年龄为：" + p.getAge());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
