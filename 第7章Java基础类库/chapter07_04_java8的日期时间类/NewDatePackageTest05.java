package chapter07_04_java8������ʱ����;

import java.time.*;
/**
 * Description:java8������java.time��
 * 1.Clock:��ȡָ��ʧȥ�ĵ�ǰ���ڡ�ʱ�䡣
 * 2.Duration:�������ʱ�䣬���Է���Ļ�ȡһ��ʱ�䡣
 * 3.Instant������һ�������ʱ�̣���ȷ�����룬now()��ȡ��ǰʱ�̣�now(Clock c)clock��Ӧʱ��minusXxx() plusXxx
 * 4.LocalDate:����ʧȥ�����ڣ�����2007-12-03,now()��ȡ��ǰ����
 * 5.LocalTime:����ʱ����ʱ�䣬����10:15:30,now()��ȡ��ǰʱ��
 * 6.LocalDateTime:����ʱ��������ʱ�䣬����2007-01-01T10:34:34,now()��ȡ��ǰ����ʱ�䡣
 * 7.MonthDay:���������գ�����--04-12��now()��ȡ��ǰ����
 * 8.Year,�������꣬����2016��now()��ȡ��ǰ���
 * 9.YearMonth�����������£�����2016-07.now()����ȡ��ǰ���£�now(Clock c)��ȡclock��Ӧ�����¡�minuxXxx()��ȥ���꼸�£�plusXxx���ϡ�
 * 10.ZonedDateTime:����һ��ʱ���������ڡ�ʱ��
 * 11.ZoneId:����һ��ʱ����
 * 12.DayOfWeek:ö���࣬���������յ�������ö��ֵ
 * 13.Month:ö���࣬������һ�µ�12�µ�ö��ֵ
 */
public class NewDatePackageTest05
{
	public static void main(String[] args)
	{
		// -----�����ǹ���Clock���÷�-----
		// ��ȡ��ǰClock
		Clock clock = Clock.systemUTC();
		// ͨ��Clock��ȡ��ǰʱ��
		System.out.println("��ǰʱ��Ϊ��" + clock.instant());
		// ��ȡclock��Ӧ�ĺ���������System.currentTimeMillis()�����ͬ
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		// -----�����ǹ���Duration���÷�-----
		Duration d = Duration.ofSeconds(6000);
		System.out.println("6000���൱��" + d.toMinutes() + "��");
		System.out.println("6000���൱��" + d.toHours() + "Сʱ");
		System.out.println("6000���൱��" + d.toDays() + "��");
		// ��clock����������6000�룬�����µ�Clock
		Clock clock2 = Clock.offset(clock, d);
		// �ɿ���clock2��clock1���1Сʱ40��
		System.out.println("��ǰʱ�̼�6000��Ϊ��" +clock2.instant());
		// -----�����ǹ���Instant���÷�-----
		// ��ȡ��ǰʱ��
		Instant instant = Instant.now();
		System.out.println(instant);
		// instant���6000�루��100���ӣ��������µ�Instant
		Instant instant2 = instant.plusSeconds(6000);
		System.out.println(instant2);
		// �����ַ����н���Instant����
		Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
		System.out.println(instant3);
		// ��instant3�Ļ��������5Сʱ4����
		Instant instant4 = instant3.plus(Duration
			.ofHours(5).plusMinutes(4));
		System.out.println(instant4);
		// ��ȡinstant4��5����ǰ��ʱ��
		Instant instant5 = instant4.minus(Duration.ofDays(5));
		System.out.println(instant5);
		// -----�����ǹ���LocalDate���÷�-----
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		// ���2014��ĵ�146��
		localDate = LocalDate.ofYearDay(2014, 146);
		System.out.println(localDate); // 2014-05-26
		// ����Ϊ2014��5��21��
		localDate = LocalDate.of(2014, Month.MAY, 21);
		System.out.println(localDate); // 2014-05-21
		// -----�����ǹ���LocalTime���÷�-----
		// ��ȡ��ǰʱ��
		LocalTime localTime = LocalTime.now();
		// ����Ϊ22��33��
		localTime = LocalTime.of(22, 33);
		System.out.println(localTime); // 22:33
		// ����һ���еĵ�5503��
		localTime = LocalTime.ofSecondOfDay(5503);
		System.out.println(localTime); // 01:31:43
		// -----�����ǹ���localDateTime���÷�-----
		// ��ȡ��ǰ���ڡ�ʱ��
		LocalDateTime localDateTime = LocalDateTime.now();
		// ��ǰ���ڡ�ʱ�����25Сʱ������
		LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
		System.out.println("��ǰ���ڡ�ʱ���25Сʱ3��֮��" + future);
		// �����ǹ���Year��YearMonth��MonthDay���÷�ʾ��-----
		Year year = Year.now(); // ��ȡ��ǰ�����
		System.out.println("��ǰ��ݣ�" + year); // �����ǰ���
		year = year.plusYears(5); // ��ǰ����ټ�5��
		System.out.println("��ǰ����ٹ�5�꣺" + year);
		// ����ָ���·ݻ�ȡYearMonth
		YearMonth ym = year.atMonth(10);
		System.out.println("year��10�£�" + ym); // ���XXXX-10��XXXX����ǰ���
		// ��ǰ�����ټ�5�꣬��3����
		ym = ym.plusYears(5).minusMonths(3);
		System.out.println("year��10���ټ�5�ꡢ��3���£�" + ym);
		MonthDay md = MonthDay.now();
		System.out.println("��ǰ���գ�" + md); // ���--XX-XX�������¼���
		// ����Ϊ5��23��
		MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
		System.out.println("5��23��Ϊ��" + md2); // ���--05-23
	}
}