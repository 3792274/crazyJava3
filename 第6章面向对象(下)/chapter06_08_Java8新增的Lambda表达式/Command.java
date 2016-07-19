package chapter06_08_Java8新增的Lambda表达式;


/**
 * Description:lambda 表达式 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public interface Command {
	// 接口里定义的process()方法用于封装“处理行为”
	void process(int[] target);
}
