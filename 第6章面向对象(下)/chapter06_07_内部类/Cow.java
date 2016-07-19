package chapter06_07_�ڲ���;

/**
 * Description:�ڲ��࣬��ţ��ţ�� <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Cow {
	private double weight;

	// �ⲿ����������صĹ�����
	public Cow() {
	}

	public Cow(double weight) {
		this.weight = weight;
	}

	// ����һ���Ǿ�̬�ڲ���
	private class CowLeg {
		// �Ǿ�̬�ڲ��������ʵ������
		private double length;
		private String color;

		// �Ǿ�̬�ڲ�����������صĹ�����
		public CowLeg() {
		}

		public CowLeg(double length, String color) {
			this.length = length;
			this.color = color;
		}

		// ����ʡ��length��color��setter��getter����
		public void setLength(double length) {
			this.length = length;
		}

		public double getLength() {
			return this.length;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getColor() {
			return this.color;
		}

		// �Ǿ�̬�ڲ����ʵ������
		public void info() {
			System.out.println("��ǰţ����ɫ�ǣ�" + color + ", �ߣ�" + length);
			// ֱ�ӷ����ⲿ���private���εĳ�Ա����
			System.out.println("��ţ��������ţ�أ�" + weight); // ��
		}
	}

	
	//�ⲿ��ķ����������ڲ���Ķ��󣬹��ⲿ����
	public void test() {
		CowLeg cl = new CowLeg(1.12, "�ڰ����");
		cl.info();
	}

	
	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
	}
}
