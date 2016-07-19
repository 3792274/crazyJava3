package chapter06_08_Java8新增的Lambda表达式;

/**
 * Description: lambda ->匿名方法   无返回值（可省略参数类型，参数） -> {方法体，返回值也可省略，方法体一条语句，大括号可省略}
 * 1.形参列表，允许省略形参类型，如果形参列表只有一个参数，甚至连形参列表的圆括号也可以省略。
 * 2.（->）英文的
 * 3.{}，如果只有一条语句，可以省略，return可以省略。
 * 
 * <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
interface Eatable {
	void taste();
}

interface Flyable {
	void fly(String weather);
}

interface Addable {
	int add(int a, int b);
}

public class LambdaQs04 {
	// 调用该方法需要Eatable对象
	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}

	// 调用该方法需要Flyable对象
	public void drive(Flyable f) {
		System.out.println("我正在驾驶：" + f);
		f.fly("【碧空如洗的晴日】");
	}

	// 调用该方法需要Addable对象
	public void test(Addable add) {
		System.out.println("5与3的和为：" + add.add(5, 3));
	}

	public static void main(String[] args) {
		LambdaQs04 lq = new LambdaQs04();
		
		// Lambda表达式的代码块只有一条语句，可以省略花括号。不带形参的匿名方法
		lq.eat( ()-> System.out.println("苹果的味道不错！"));
		
		// Lambda表达式的形参列表只有一个形参，省略圆括号
		lq.drive(weather -> {
			System.out.println("今天天气是：" + weather);
			System.out.println("直升机飞行平稳");
		});
		
		// Lambda表达式的代码块只有一条语句，省略花括号
		// 代码块中只有一条语句，即使该表达式需要返回值，也可以省略return关键字。
		lq.test((a, b) -> a + b);
	}
}
