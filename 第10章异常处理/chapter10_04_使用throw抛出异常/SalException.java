package chapter10_04_ʹ��throw�׳��쳣;

/**
 * Description:��ʽ�ṹ�쳣
 */
public class SalException extends Exception
{
	public SalException(){}
	public SalException(String msg)
	{
		super(msg);
	}
	// ����һ�����Խ���Throwable�����Ĺ�����
	public SalException(Throwable t)
	{
		super(t);
	}
}

