package chapter09_02_���뷺��;



/**
 * Description:
 */
public class A1 extends Apple<String>
{
	// ��ȷ��д�˸���ķ���������ֵ
	// �븸��Apple<String>�ķ���ֵ��ȫ��ͬ
	public String getInfo()
	{
		return "����" + super.getInfo();
	}
	

	/*
	// ���淽���Ǵ���ģ���д���෽��ʱ����ֵ���Ͳ�һ��
	public Object getInfo()
	{
		return "����";
	}
	*/
	
}

