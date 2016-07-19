package chapter10_05_java���쳣����ջ;

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
class SelfException extends RuntimeException {
	SelfException() {
	}

	SelfException(String msg) {
		super(msg);
	}
}

public class PrintStackTraceTest {
	public static void main(String[] args) {
		firstMethod();
	}

	public static void firstMethod() {
		secondMethod();
	}

	public static void secondMethod() {
		thirdMethod();
	}

	public static void thirdMethod() {
		throw new SelfException("�Զ����쳣��Ϣ");
	}
}
