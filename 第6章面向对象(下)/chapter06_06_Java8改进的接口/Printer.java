package chapter06_06_Java8改进的接口;

/**
 * Description:接口的实现 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
// 定义一个Product接口
interface Product {
	int getProduceTime();
}

// 让Printer类实现Output和Product接口
public class Printer implements Output, Product {
	private String[] printData = new String[MAX_CACHE_LINE];

	// 用以记录当前需打印的作业数
	private int dataNum = 0;

	@Override  //因为接口的方法public ，子类实现接口的方法只能使用public 修饰，大于等于接口的声明的类型。
	public void out() {
		// 只要还有作业，继续打印
		while (dataNum > 0) {
			System.out.println("打印机打印：" + printData[0]);
			// 把作业队列整体前移一位，并将剩下的作业数减1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override
	public void putData(String msg) {
		if (dataNum >= MAX_CACHE_LINE) {
			System.out.println("输出队列已满，添加失败");
		} else {
			// 把打印数据添加到队列里，已保存数据的数量加1。
			printData[dataNum++] = msg;
		}
	}

	@Override
	public int getProduceTime() {
		return 45;
	}

	public static void main(String[] args) {
		// 创建一个Printer对象，当成Output使用
		Output o = new Printer();
		o.putData("轻量级Java EE企业应用实战");
		o.putData("疯狂Java讲义");
		o.out();
		
		o.putData("疯狂Android讲义");
		o.putData("疯狂Ajax讲义");
		o.out();
		
		// 调用Output接口中定义的默认方法
		o.print("孙悟空", "猪八戒", "白骨精");
		o.test();
		
		// 创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		
		// 所有接口类型的引用变量都可直接赋给Object类型的变量
		Object obj = p;
	}
}
