package chapter10_04_使用throw抛出异常;



/**
 * Description:自定义异常类
 * 1.可以继承Exception
 * 2.可以继承RuntimeException ,更简单
 */
public class AuctionException extends Exception
{
	// 1.必须有一个 ----无参数的构造器
	public AuctionException(){}       //①
	// 2.必须有一个---带一个字符串参数的构造器
	public AuctionException(String msg)    //②
	{
		super(msg);
	}
}
