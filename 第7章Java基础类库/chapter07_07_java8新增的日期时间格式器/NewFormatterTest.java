package chapter07_07_java8����������ʱ���ʽ��;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Java8����������ʱ��API Instant�� LocalDate��LocalDateTime��LocalTime
 * 1.java.time.format:DateTimeFormatter��ʽ���ࡣ ���ڡ�ʱ�䡢�ַ����໥ת
 * 2.ֱ��ʹ�þ�̬��������DateTimeFormatter��ʽ����ISO_LOCAL_DATE��ISO_LOCAL_TIME��LOCAL_DATE_TIME�Ⱦ�̬����
 * 3.ʹ�ô���ͬ����ö��ֵ������DateTimeFormatter��ʽ����FormatStyleö���ඨ��FULL��LONG��MEDIUM��SHORT�ĸ���
 * 4.�����ַ���������������SimpleDateFormat
 * 5.DateFormat
 * 
 *
 */
public class NewFormatterTest {

	public static void main(String[] args) {
		
		
		//����6��DateTimeFormatter����
		DateTimeFormatter [] formatters = new DateTimeFormatter[]{
			//ֱ��ʹ�ó�������DateTimeFormatter��ʽ��
				DateTimeFormatter.ISO_LOCAL_DATE,
				DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_LOCAL_DATE_TIME,
				
			//ʹ�ñ��ػ��ķ�񴴽�
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM),
				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
				
			//�����ַ���������
				DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
		};
		
		
		LocalDateTime dateTime=LocalDateTime.now();
		//����ʹ�ò�ͬ�ĸ�ʽ����LocalDateTime���и�ʽ��
		for(int i=0;i<formatters.length;i++){
			//�������д���������ͬ
			System.out.println(dateTime.format(formatters[i]));
			System.out.println(formatters[i].format(dateTime));
			
			//�����Ҫ��ͳ��DateFormat���ɰ�����ת����
			Format df = formatters[i].toFormat();
		}
		
		
	}

}

















