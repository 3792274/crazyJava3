package chapter06_08_Java8������Lambda���ʽ;

import javax.swing.*;
/**
 * Description:�����෽��
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@FunctionalInterface
interface Converter{
	Integer convert(String from);
}
@FunctionalInterface
interface MyTest
{
	String test(String a , int b , int c);
}
@FunctionalInterface
interface YourTest
{
	JFrame win(String title);
}
public class MethodRefer06
{
	public static void main(String[] args)
	{
		// �������ʹ��Lambda���ʽ����Converter���������෽��
//		Converter converter1 = from -> Integer.valueOf(from);
//		// �������ô���Lambda���ʽ�������෽����
//		// ����ʽ�ӿ��б�ʵ�ַ�����ȫ�������������෽����Ϊ������
//		Converter converter1 = Integer::valueOf;
//		Integer val = converter1.convert("99");
//		System.out.println(val); // �������99



		// �������ʹ��Lambda���ʽ����Converter���� ���������ض�����ʵ���ķ�����
//		Converter converter2 = from -> "fkit.org".indexOf(from);
//		// �������ô���Lambda���ʽ�������ض������ʵ��������
//		// ����ʽ�ӿ��б�ʵ�ַ�����ȫ�����������÷�����Ϊ������
//		Converter converter2 = "fkit.org"::indexOf;
//		Integer value = converter2.convert("it");
//		System.out.println(value); // ���2



		// �������ʹ��Lambda���ʽ����MyTest��������ĳ���������ʵ������
//		MyTest mt = (a , b , c) -> a.substring(b , c);
		// �������ô���Lambda���ʽ������ĳ������ʵ��������
		// ����ʽ�ӿ��б�ʵ�ַ����ĵ�һ��������Ϊ�����ߣ�
		// ����Ĳ���ȫ�������÷�����Ϊ������
//		MyTest mt = String::substring;
//		String str = mt.test("Java I Love you" , 2 , 9);
//		System.out.println(str); // ���:va I Lo



		// �������ʹ��Lambda���ʽ����YourTest�������ù�����
//		YourTest yt = (String a) -> new JFrame(a);
		// ���������ô���Lambda���ʽ��
		// ����ʽ�ӿ��б�ʵ�ַ�����ȫ�����������ù�������Ϊ������
		YourTest yt = JFrame::new;
		JFrame jf = yt.win("�ҵĴ���");
		System.out.println(jf);
	}
}
