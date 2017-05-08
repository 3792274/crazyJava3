package chapter06_09_枚举类;


/**
 * Description:枚举类定义
 * 1.可以实现多个接口，非Object,而是java.lang.Enum,
 * 2.默认非抽象的final修饰，不能派生子类
 * 3.构造器是private的
 * 4.所有实例必须放在第一行，默认添加public static final
 * 
 * 
 *  Object eeEnum02 = SeasonEnum02.FALL;
 *  
 * 
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public enum SeasonEnum02
{
	// 在第一行列出4个枚举实例
	SPRING,SUMMER,FALL,WINTER;
}
