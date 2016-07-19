package chapter14_03_�Զ���Annotation.two;


import java.lang.annotation.*;
import java.awt.event.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionListenerFor
{
	// ����һ����Ա��������������Ԫ����
	// ��listener��Ա�������ڱ��������ʵ����
	Class<? extends ActionListener> listener();
}
