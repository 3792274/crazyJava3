package chapter14_04_编译时处理Annotation;

import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.lang.model.*;

import java.io.*;
import java.util.*;

/**
 * Description: Annotation处理类，必须要继承 AbstractProcessor 类，并重写全部方法 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@SupportedSourceVersion(SourceVersion.RELEASE_8)
// 指定可处理@Persistent、@Id、@Property三个Annotation
@SupportedAnnotationTypes({ "Persistent", "Id", "Property" })
public class HibernateAnnotationProcessor extends AbstractProcessor {
	// 循环处理每个需要处理的程序对象
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		// 定义一个文件输出流，用于生成额外的文件
		PrintStream ps = null;
		try {
			// 遍历每个被@Persistent修饰的class文件
			for (Element t : roundEnv.getElementsAnnotatedWith(Persistent.class)) {
				// 获取正在处理的类名
				Name clazzName = t.getSimpleName();
				// 获取类定义前的@Persistent Annotation
				Persistent per = t.getAnnotation(Persistent.class);
				// 创建文件输出流
				ps = new PrintStream(new FileOutputStream(clazzName + ".hbm.xml"));
				// 执行输出
				ps.println("<?xml version=\"1.0\"?>");
				ps.println("<!DOCTYPE hibernate-mapping PUBLIC");
				ps.println("	\"-//Hibernate/Hibernate " + "Mapping DTD 3.0//EN\"");
				ps.println("	\"http://www.hibernate.org/dtd/" + "hibernate-mapping-3.0.dtd\">");
				ps.println("<hibernate-mapping>");
				ps.print("	<class name=\"" + t);
				// 输出per的table()的值
				ps.println("\" table=\"" + per.table() + "\">");
				for (Element f : t.getEnclosedElements()) {
					// 只处理成员变量上的Annotation
					if (f.getKind() == ElementKind.FIELD) // ①
					{
						// 获取成员变量定义前的@Id Annotation
						Id id = f.getAnnotation(Id.class); // ②
						// 当@Id Annotation存在时输出<id.../>元素
						if (id != null) {
							ps.println("		<id name=\"" + f.getSimpleName() + "\" column=\"" + id.column() + "\" type=\"" + id.type() + "\">");
							ps.println("		<generator class=\"" + id.generator() + "\"/>");
							ps.println("		</id>");
						}
						// 获取成员变量定义前的@Property Annotation
						Property p = f.getAnnotation(Property.class); // ③
						// 当@Property Annotation存在时输出<property.../>元素
						if (p != null) {
							ps.println("		<property name=\"" + f.getSimpleName() + "\" column=\"" + p.column() + "\" type=\"" + p.type() + "\"/>");
						}
					}
				}
				ps.println("	</class>");
				ps.println("</hibernate-mapping>");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		return true;
	}
}
