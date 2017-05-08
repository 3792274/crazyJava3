package chapter15_08_对象序列化;

import java.io.*;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class WriteObject {
	public static void main(String[] args) {
		try (
				// 创建一个ObjectOutputStream输出流
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"))
			){
			Person per = new Person("孙悟空", 500);
			// 将per对象写入输出流
			oos.writeObject(per);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
