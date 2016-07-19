package chapter14_03_�Զ���Annotation;


import java.util.*;
import java.io.*;
import javax.swing.*;
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
// ����һ���򵥵�Type Annotation�������κγ�Ա����
@Target(ElementType.TYPE_USE)
@interface NotNull{}
// ������ʱʹ��Type Annotation
@NotNull
public class TypeAnnotationTest
	implements @NotNull /* implementsʱʹ��Type Annotation */ Serializable
{
	// �����β���ʹ��Type Annotation
	public static void main(@NotNull String[] args)
		// throwsʱʹ��Type Annotation
		throws @NotNull FileNotFoundException
	{
		Object obj = "fkjava.org";
		// ǿ������ת��ʱʹ��Type Annotation
		String str = (@NotNull String)obj;
		// ��������ʱʹ��Type Annotation
		Object win = new @NotNull JFrame("������");
	}
	// ������ʹ��Type Annotation
	public void foo(List<@NotNull String> info){}
}