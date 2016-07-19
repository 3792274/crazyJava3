package chapter06_06_Java8改进的接口;
/**
 * Description: 命令模式，动态生成一个代码，传入方法中。
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public interface Command
{
	// 接口里定义的process()方法用于封装“处理行为”,没有方法体，现在还不确定处理行为
	void process(int[] target);
}

