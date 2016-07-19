package chapter08_02_Collection��Iterator�ӿ�;

import java.util.stream.*;
/**
 * Description:Java8������Stream��������
 * Stream��IntStream��LongStream��DoubleStream ����ʽAPI,������֧�ִ��кͲ��оۼ�������Ԫ�ء�
 * Stream.Builder��IntStream.Builder��LongStream.Builder��DoubleStream.Builder.
 * 
 */
public class IntStreamTest9
{
	public static void main(String[] args)
	{
		IntStream is = IntStream.builder()
			.add(20)
			.add(13)
			.add(-2)
			.add(18)
			.build();
		
		// ������þۼ������Ĵ���ÿ��ֻ��ִ��һ��
		System.out.println("is����Ԫ�ص����ֵ��" + is.max().getAsInt());
		System.out.println("is����Ԫ�ص���Сֵ��" + is.min().getAsInt());
		System.out.println("is����Ԫ�ص��ܺͣ�" + is.sum());
		System.out.println("is����Ԫ�ص�������" + is.count());
		System.out.println("is����Ԫ�ص�ƽ��ֵ��" + is.average());
		System.out.println("is����Ԫ�ص�ƽ���Ƿ񶼴���20:" + is.allMatch(ele -> ele * ele > 20));
		System.out.println("is�Ƿ�����κ�Ԫ�ص�ƽ������20:" + is.anyMatch(ele -> ele * ele > 20));
		
		// ��isӳ���һ����Stream����Stream��ÿ��Ԫ����ԭStreamԪ�ص�2��+1
		IntStream newIs = is.map(ele -> ele * 2 + 1);
	
		// ʹ�÷������õķ�ʽ����������Ԫ��
		newIs.forEach(System.out::println); // ���41 27 -3 37
	}
}
