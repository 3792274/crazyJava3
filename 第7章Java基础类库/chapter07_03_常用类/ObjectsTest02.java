package chapter07_03_������;

import java.util.Objects;

/**
 * Description:java7�����ķ�������ָ�밲ȫ�� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ObjectsTest02 {
	// ����һ��obj����������Ĭ��ֵ��null
	static ObjectsTest02 obj;

	public static void main(String[] args) {
		// ���һ��null�����hashCodeֵ�����0
		System.out.println(Objects.hashCode(obj));
		// ���һ��null�����toString�����null
		System.out.println(Objects.toString(obj));
		// Ҫ��obj����Ϊnull�����objΪnull�������쳣
		System.out.println(Objects.requireNonNull(obj, "obj����������null��"));
	}
}
