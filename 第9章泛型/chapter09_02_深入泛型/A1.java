package chapter09_02_深入泛型;



/**
 * Description:
 */
public class A1 extends Apple<String>
{
	// 正确重写了父类的方法，返回值
	// 与父类Apple<String>的返回值完全相同
	public String getInfo()
	{
		return "子类" + super.getInfo();
	}
	

	/*
	// 下面方法是错误的，重写父类方法时返回值类型不一致
	public Object getInfo()
	{
		return "子类";
	}
	*/
	
}

