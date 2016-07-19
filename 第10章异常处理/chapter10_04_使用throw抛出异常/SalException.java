package chapter10_04_使用throw抛出异常;

/**
 * Description:链式结构异常
 */
public class SalException extends Exception
{
	public SalException(){}
	public SalException(String msg)
	{
		super(msg);
	}
	// 创建一个可以接受Throwable参数的构造器
	public SalException(Throwable t)
	{
		super(t);
	}
}

