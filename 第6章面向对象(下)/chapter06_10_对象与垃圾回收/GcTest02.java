package chapter06_10_对象与垃圾回收;


/**
 * Description:垃圾回收
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class GcTest02
{
	public static void main(String[] args)
	{
		for (int i = 0 ; i < 4; i++)
		{
			//创建4个可恢复状态的对象
			new GcTest02();
			// 下面两行代码的作用完全相同，强制系统进行垃圾回收
			// System.gc();
			Runtime.getRuntime().gc();
		}
	}
	
	/**
	 * 
	 * java -verbose:gc GcTest  可看清垃圾回收的动作
	 * 
	 * */
	
	
	//如果没有上面的通知垃圾回收，直到程序退出系统仍然不会回收该资源。GC回收垃圾前，要调用该方法
	@Override
	public void finalize()
	{
		System.out.println("系统正在清理GcTest对象的资源...");
	}
}
