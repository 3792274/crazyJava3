package chapter07_07_java8����������ʱ���ʽ��;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter �������ڡ�ʱ���ַ���
 *
 */
public class NewFormatterParse {

	public static void main(String[] args) {
		
		//����һ�������ʽ�����ڡ�ʱ���ַ���
		String str1="2014==04==12 01ʱ06��09��";
		
		//�����ַ����������õĸ�ʽ��
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HHʱmm��ss��");
		
		//ִ�н���
		LocalDateTime dt1 = LocalDateTime.parse(str1,formatter1);
		System.out.println(dt1); //��� 2014-04-12T01:06:09
		
		
		//������ʹ����һ���ַ���
		String str2 = "2014$$$����$$$13 20 Сʱ";
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy$$$MMM$$$dd HH Сʱ");
		LocalDateTime dt2 = LocalDateTime.parse(str2,formatter2);
		System.out.println(dt2);//��� 2014-04-13T20:00

	}

}































