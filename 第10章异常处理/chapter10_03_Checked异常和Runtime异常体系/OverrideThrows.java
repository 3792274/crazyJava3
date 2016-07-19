package chapter10_03_Checked异常和Runtime异常体系;
import java.io.*;
/**
 * Description:
 * 1.子类声明抛出的异常要比父类少，范围同类或者子类
 */
public class OverrideThrows
{
	public void test()throws IOException
	{
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
class Sub extends OverrideThrows
{
	// 子类方法声明抛出了比父类方法更大的异常
	// 所以下面方法出错
//	public void test()throws Exception
//	{
//	}
}

