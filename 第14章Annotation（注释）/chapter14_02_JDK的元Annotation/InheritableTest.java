package chapter14_02_JDK��ԪAnnotation;



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
// ʹ��@Inheritable���ε�Base��
@Inheritable
class Base
{
}
// TestInheritable��ֻ�Ǽ̳���Base�࣬
// ��δֱ��ʹ��@Inheritable Annotiation����
public class InheritableTest extends Base
{
	public static void main(String[] args)
	{
		// ��ӡTestInheritable���Ƿ����@Inheritable����
		System.out.println(InheritableTest.class
			.isAnnotationPresent(Inheritable.class));
	}
}

