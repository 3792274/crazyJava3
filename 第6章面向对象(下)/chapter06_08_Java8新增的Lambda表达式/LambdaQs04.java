package chapter06_08_Java8������Lambda���ʽ;

/**
 * Description: lambda ->��������   �޷���ֵ����ʡ�Բ������ͣ������� -> {�����壬����ֵҲ��ʡ�ԣ�������һ����䣬�����ſ�ʡ��}
 * 1.�β��б�����ʡ���β����ͣ�����β��б�ֻ��һ���������������β��б��Բ����Ҳ����ʡ�ԡ�
 * 2.��->��Ӣ�ĵ�
 * 3.{}�����ֻ��һ����䣬����ʡ�ԣ�return����ʡ�ԡ�
 * 
 * <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
interface Eatable {
	void taste();
}

interface Flyable {
	void fly(String weather);
}

interface Addable {
	int add(int a, int b);
}

public class LambdaQs04 {
	// ���ø÷�����ҪEatable����
	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}

	// ���ø÷�����ҪFlyable����
	public void drive(Flyable f) {
		System.out.println("�����ڼ�ʻ��" + f);
		f.fly("���̿���ϴ�����ա�");
	}

	// ���ø÷�����ҪAddable����
	public void test(Addable add) {
		System.out.println("5��3�ĺ�Ϊ��" + add.add(5, 3));
	}

	public static void main(String[] args) {
		LambdaQs04 lq = new LambdaQs04();
		
		// Lambda���ʽ�Ĵ����ֻ��һ����䣬����ʡ�Ի����š������βε���������
		lq.eat( ()-> System.out.println("ƻ����ζ������"));
		
		// Lambda���ʽ���β��б�ֻ��һ���βΣ�ʡ��Բ����
		lq.drive(weather -> {
			System.out.println("���������ǣ�" + weather);
			System.out.println("ֱ��������ƽ��");
		});
		
		// Lambda���ʽ�Ĵ����ֻ��һ����䣬ʡ�Ի�����
		// �������ֻ��һ����䣬��ʹ�ñ��ʽ��Ҫ����ֵ��Ҳ����ʡ��return�ؼ��֡�
		lq.test((a, b) -> a + b);
	}
}
