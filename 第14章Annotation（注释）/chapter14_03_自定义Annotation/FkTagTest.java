package chapter14_03_�Զ���Annotation;



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
@FkTag(age=5)
@FkTag(name="���Java" , age=9)
//@FkTags({@FkTag(age=5),
//	@FkTag(name="���Java" , age=9)})
public class FkTagTest
{
	public static void main(String[] args)
	{
		Class<FkTagTest> clazz = FkTagTest.class;
		/* ʹ��Java 8������getDeclaredAnnotationsByType()������ȡ
			����FkTagTest��Ķ��@FkTagע�� */
		FkTag[] tags = clazz.getDeclaredAnnotationsByType(FkTag.class);
		// ��������FkTagTest��Ķ��@FkTagע��
		for(FkTag tag : tags)
		{
			System.out.println(tag.name() + "-->" + tag.age());
		}
		/* ʹ�ô�ͳ��getDeclaredAnnotation()������ȡ
			����FkTagTest���@FkTagsע�� */
		FkTags container = clazz.getDeclaredAnnotation(FkTags.class);
		System.out.println(container);
	}
}
