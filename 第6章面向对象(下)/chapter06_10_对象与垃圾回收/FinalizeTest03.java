package chapter06_10_对象与垃圾回收;

/**
 * Description:演示finalize如何的不确定行，及如何在该方法中复活自身 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FinalizeTest03 {
	
	private static FinalizeTest03 ft = null;

	public void info() {
		System.out.println("测试资源清理的finalize  info 方法");
	}

	public static void main(String[] args) throws Exception {
		
		// 创建FinalizeTest对象立即进入可恢复状态
		new FinalizeTest03();
		
		// 通知系统进行资源回收
		// System.gc(); //① 如果注释本行，虽然强制回收但没有通知，也无法回收，要回收1.通知，2强制，才能执行目标对象的finalize方法
		
		// 强制垃圾回收机制调用可恢复对象的finalize()方法
		// Runtime.getRuntime().runFinalization(); //②
		System.runFinalization(); // ③
		
		ft.info();
	}

	public void finalize() {
		// 让tf引用到试图回收的可恢复对象，即可恢复对象重新变成可达
		ft = this;
	}
}
