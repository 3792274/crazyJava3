package chapter07_04_java8的日期时间类;

import java.time.*;
/**
 * Description:java8新增的java.time包
 * 1.Clock:获取指定失去的当前日期、时间。
 * 2.Duration:代表持续时间，可以方便的获取一段时间。
 * 3.Instant：代表一个具体的时刻，精确到纳秒，now()获取当前时刻，now(Clock c)clock对应时刻minusXxx() plusXxx
 * 4.LocalDate:不带失去的日期，例如2007-12-03,now()获取当前日期
 * 5.LocalTime:不带时区的时间，例如10:15:30,now()获取当前时间
 * 6.LocalDateTime:不带时区的日期时间，例如2007-01-01T10:34:34,now()获取当前日期时间。
 * 7.MonthDay:仅代表月日，例如--04-12，now()获取当前月日
 * 8.Year,仅代表年，例如2016，now()获取当前年份
 * 9.YearMonth：仅代表年月，例如2016-07.now()，获取当前年月，now(Clock c)获取clock对应的年月。minuxXxx()减去几年几月，plusXxx加上。
 * 10.ZonedDateTime:代表一个时区化的日期、时间
 * 11.ZoneId:代表一个时区。
 * 12.DayOfWeek:枚举类，定义了周日到周六的枚举值
 * 13.Month:枚举类，定义了一月到12月的枚举值
 */
public class NewDatePackageTest05
{
	public static void main(String[] args)
	{
		// -----下面是关于Clock的用法-----
		// 获取当前Clock
		Clock clock = Clock.systemUTC();
		// 通过Clock获取当前时刻
		System.out.println("当前时刻为：" + clock.instant());
		// 获取clock对应的毫秒数，与System.currentTimeMillis()输出相同
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		// -----下面是关于Duration的用法-----
		Duration d = Duration.ofSeconds(6000);
		System.out.println("6000秒相当于" + d.toMinutes() + "分");
		System.out.println("6000秒相当于" + d.toHours() + "小时");
		System.out.println("6000秒相当于" + d.toDays() + "天");
		// 在clock基础上增加6000秒，返回新的Clock
		Clock clock2 = Clock.offset(clock, d);
		// 可看到clock2与clock1相差1小时40分
		System.out.println("当前时刻加6000秒为：" +clock2.instant());
		// -----下面是关于Instant的用法-----
		// 获取当前时间
		Instant instant = Instant.now();
		System.out.println(instant);
		// instant添加6000秒（即100分钟），返回新的Instant
		Instant instant2 = instant.plusSeconds(6000);
		System.out.println(instant2);
		// 根据字符串中解析Instant对象
		Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
		System.out.println(instant3);
		// 在instant3的基础上添加5小时4分钟
		Instant instant4 = instant3.plus(Duration
			.ofHours(5).plusMinutes(4));
		System.out.println(instant4);
		// 获取instant4的5天以前的时刻
		Instant instant5 = instant4.minus(Duration.ofDays(5));
		System.out.println(instant5);
		// -----下面是关于LocalDate的用法-----
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		// 获得2014年的第146天
		localDate = LocalDate.ofYearDay(2014, 146);
		System.out.println(localDate); // 2014-05-26
		// 设置为2014年5月21日
		localDate = LocalDate.of(2014, Month.MAY, 21);
		System.out.println(localDate); // 2014-05-21
		// -----下面是关于LocalTime的用法-----
		// 获取当前时间
		LocalTime localTime = LocalTime.now();
		// 设置为22点33分
		localTime = LocalTime.of(22, 33);
		System.out.println(localTime); // 22:33
		// 返回一天中的第5503秒
		localTime = LocalTime.ofSecondOfDay(5503);
		System.out.println(localTime); // 01:31:43
		// -----下面是关于localDateTime的用法-----
		// 获取当前日期、时间
		LocalDateTime localDateTime = LocalDateTime.now();
		// 当前日期、时间加上25小时３分钟
		LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
		System.out.println("当前日期、时间的25小时3分之后：" + future);
		// 下面是关于Year、YearMonth、MonthDay的用法示例-----
		Year year = Year.now(); // 获取当前的年份
		System.out.println("当前年份：" + year); // 输出当前年份
		year = year.plusYears(5); // 当前年份再加5年
		System.out.println("当前年份再过5年：" + year);
		// 根据指定月份获取YearMonth
		YearMonth ym = year.atMonth(10);
		System.out.println("year年10月：" + ym); // 输出XXXX-10，XXXX代表当前年份
		// 当前年月再加5年，减3个月
		ym = ym.plusYears(5).minusMonths(3);
		System.out.println("year年10月再加5年、减3个月：" + ym);
		MonthDay md = MonthDay.now();
		System.out.println("当前月日：" + md); // 输出--XX-XX，代表几月几日
		// 设置为5月23日
		MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
		System.out.println("5月23日为：" + md2); // 输出--05-23
	}
}