package chapter10_04_ʹ��throw�׳��쳣;



/**
 * Description:�Զ����쳣��
 * 1.���Լ̳�Exception
 * 2.���Լ̳�RuntimeException ,����
 */
public class AuctionException extends Exception
{
	// 1.������һ�� ----�޲����Ĺ�����
	public AuctionException(){}       //��
	// 2.������һ��---��һ���ַ��������Ĺ�����
	public AuctionException(String msg)    //��
	{
		super(msg);
	}
}
