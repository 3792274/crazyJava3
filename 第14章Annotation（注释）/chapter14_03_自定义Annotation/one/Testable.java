package chapter14_03_�Զ���Annotation.one;


import java.lang.annotation.*;
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
// ʹ��JDK��Ԫ����Annotation��Retention
@Retention(RetentionPolicy.RUNTIME)
// ʹ��JDK��Ԫ����Annotation��Target
@Target(ElementType.METHOD)
// ����һ�����ע�⣬�������κγ�Ա�����������ɴ���Ԫ����
public @interface Testable
{
}
