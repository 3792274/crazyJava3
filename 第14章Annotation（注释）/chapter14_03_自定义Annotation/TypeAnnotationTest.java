package chapter14_03_自定义Annotation;


import java.util.*;
import java.io.*;
import javax.swing.*;
import java.lang.annotation.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
// 定义一个简单的Type Annotation，不带任何成员变量
@Target(ElementType.TYPE_USE)
@interface NotNull{}
// 定义类时使用Type Annotation
@NotNull
public class TypeAnnotationTest
	implements @NotNull /* implements时使用Type Annotation */ Serializable
{
	// 方法形参中使用Type Annotation
	public static void main(@NotNull String[] args)
		// throws时使用Type Annotation
		throws @NotNull FileNotFoundException
	{
		Object obj = "fkjava.org";
		// 强制类型转换时使用Type Annotation
		String str = (@NotNull String)obj;
		// 创建对象时使用Type Annotation
		Object win = new @NotNull JFrame("疯狂软件");
	}
	// 泛型中使用Type Annotation
	public void foo(List<@NotNull String> info){}
}