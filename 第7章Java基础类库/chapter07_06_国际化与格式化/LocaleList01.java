package chapter07_06_���ʻ����ʽ��;

import java.util.*;
/**
 * Description:
 * java��֧�ֵĹ��Һ�����
 */
public class LocaleList01
{
	public static void main(String[] args)
	{
		// ����Java��֧�ֵ�ȫ�����Һ����Ե�����
		Locale[] localeList = Locale.getAvailableLocales();
		// ���������ÿ��Ԫ�أ����λ�ȡ��֧�ֵĹ��Һ�����
		for (int i = 0; i < localeList.length ; i++ )
		{
			// �������֧�ֵĹ��Һ�����
			System.out.println(localeList[i].getDisplayCountry()
				+ "=" + localeList[i].getCountry()+ " "
				+ localeList[i].getDisplayLanguage()
				+ "=" + localeList[i].getLanguage());
		}
	}
}

