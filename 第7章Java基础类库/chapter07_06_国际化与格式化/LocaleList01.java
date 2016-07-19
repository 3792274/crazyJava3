package chapter07_06_国际化与格式化;

import java.util.*;
/**
 * Description:
 * java所支持的国家和语言
 */
public class LocaleList01
{
	public static void main(String[] args)
	{
		// 返回Java所支持的全部国家和语言的数组
		Locale[] localeList = Locale.getAvailableLocales();
		// 遍历数组的每个元素，依次获取所支持的国家和语言
		for (int i = 0; i < localeList.length ; i++ )
		{
			// 输出出所支持的国家和语言
			System.out.println(localeList[i].getDisplayCountry()
				+ "=" + localeList[i].getCountry()+ " "
				+ localeList[i].getDisplayLanguage()
				+ "=" + localeList[i].getLanguage());
		}
	}
}

