package chapter07_02_系统相关;

import java.io.*;
import java.util.*;

/**
 * Description: java使用native方法步骤 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

/**
 * 1.java中声明native修饰的方法，类似于abstract方法，只有签名，没有实现，编译成class文件<br>
 * 2.用javah 编译上步生产的class文件，将产生一个.h文件<br>
 * 3.写一个cpp实现native方法，需要上步的.h文件 及 JDK自带的jni.h文件<br>
 * 4.将cpp文件编译出动态链接库文件<br>
 * 5.在Java中使用System类的loadLibrary()或者Runtime的loadLibrary()加载类库<br>
 * 第4步产生的动态链接库文件，java程序中就可以调用这个native方法了。<br>
 *
 */

public class SystemTest01 {
	public static void main(String[] args) throws Exception {
		
		// 获取系统所有的环境变量
		Map<String, String> env = System.getenv();
		for (String name : env.keySet()) {
			System.out.println(name + " ---> " + env.get(name));
		}
		
		
		// 获取指定环境变量的值
		System.out.println(System.getenv("JAVA_HOME"));
	
		// 获取所有的系统属性
		Properties props = System.getProperties();
		
		// 将所有系统属性保存到props.txt文件中
		props.store(new FileOutputStream("props.txt"), "System Properties");
		
		// 输出特定的系统属性
		System.out.println(System.getProperty("os.name"));
	}
}
