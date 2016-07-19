package chapter06_06_Java8改进的接口;

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
public interface Output {
	// 接口里定义的成员变量只能是常量 ,默认为 public static final 
	int MAX_CACHE_LINE = 50;

	// 接口里定义的普通方法只能是public的抽象方法
	void out();

	void putData(String msg);

	// 在接口中定义默认方法，需要使用default修饰,默认public ,不能定义static,需要接口实现类来调用
	default void print(String... msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}

	// 在接口中定义默认方法，需要使用default修饰
	default void test() {
		System.out.println("默认的test()方法");
	}

	// 在接口中定义类方法，需要使用static修饰,不能default 来修饰，默认public ,类方法可以使用接口直接调用。
	   static String staticTest() {
		return "接口里的类方法";
	}
}
