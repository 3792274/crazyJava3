package chapter07_02_ϵͳ���;

import java.io.*;
import java.util.*;

/**
 * Description: javaʹ��native�������� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */

/**
 * 1.java������native���εķ�����������abstract������ֻ��ǩ����û��ʵ�֣������class�ļ�<br>
 * 2.��javah �����ϲ�������class�ļ���������һ��.h�ļ�<br>
 * 3.дһ��cppʵ��native��������Ҫ�ϲ���.h�ļ� �� JDK�Դ���jni.h�ļ�<br>
 * 4.��cpp�ļ��������̬���ӿ��ļ�<br>
 * 5.��Java��ʹ��System���loadLibrary()����Runtime��loadLibrary()�������<br>
 * ��4�������Ķ�̬���ӿ��ļ���java�����оͿ��Ե������native�����ˡ�<br>
 *
 */

public class SystemTest01 {
	public static void main(String[] args) throws Exception {
		
		// ��ȡϵͳ���еĻ�������
		Map<String, String> env = System.getenv();
		for (String name : env.keySet()) {
			System.out.println(name + " ---> " + env.get(name));
		}
		
		
		// ��ȡָ������������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
	
		// ��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
		
		// ������ϵͳ���Ա��浽props.txt�ļ���
		props.store(new FileOutputStream("props.txt"), "System Properties");
		
		// ����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
	}
}
