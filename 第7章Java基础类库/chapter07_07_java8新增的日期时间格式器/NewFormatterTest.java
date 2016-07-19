package chapter07_07_java8新增的日期时间格式器;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Java8新增的日期时间API Instant、 LocalDate、LocalDateTime、LocalTime
 * 1.java.time.format:DateTimeFormatter格式器类。 日期、时间、字符串相互转
 * 2.直接使用静态常量创建DateTimeFormatter格式器。ISO_LOCAL_DATE、ISO_LOCAL_TIME、LOCAL_DATE_TIME等静态常量
 * 3.使用代表不同风格的枚举值来创建DateTimeFormatter格式器。FormatStyle枚举类定义FULL、LONG、MEDIUM、SHORT四个。
 * 4.根据字符串来创建，类似SimpleDateFormat
 * 5.DateFormat
 * 
 *
 */
public class NewFormatterTest {

	public static void main(String[] args) {
		
		
		//创建6个DateTimeFormatter对象
		DateTimeFormatter [] formatters = new DateTimeFormatter[]{
			//直接使用常量创建DateTimeFormatter格式器
				DateTimeFormatter.ISO_LOCAL_DATE,
				DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_LOCAL_DATE_TIME,
				
			//使用本地化的风格创建
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM),
				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
				
			//根据字符串来创建
				DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
		};
		
		
		LocalDateTime dateTime=LocalDateTime.now();
		//依次使用不同的格式器对LocalDateTime进行格式化
		for(int i=0;i<formatters.length;i++){
			//下面两行代码作用相同
			System.out.println(dateTime.format(formatters[i]));
			System.out.println(formatters[i].format(dateTime));
			
			//如果需要传统的DateFormat，可按如下转换。
			Format df = formatters[i].toFormat();
		}
		
		
	}

}

















