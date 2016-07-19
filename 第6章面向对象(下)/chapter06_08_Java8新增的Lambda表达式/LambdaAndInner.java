package chapter06_08_Java8������Lambda���ʽ;

/**
 * Lambda ��  �����ڲ�������
 * 1.lambda ���ʽ�������ڲ����һ�ּ򻯣����Բ���ȡ���ڲ��������
 * 2.���ʽ�������ڲ���һ����������ֱ�ӷ��� effectively final�ľֲ����������ⲿ��ĳ�Ա����(����ʵ�������������)
 * 3.lambda���ʽ�����Ķ����������ڲ������ɵĶ���һ����������ֱ�ӵ��ôӽӿ��м̳е�Ĭ�Ϸ���
 * 
 * 
 * */

@FunctionalInterface
interface Displayable{
	//����һ�����󷽷���Ĭ�Ϸ���
	void display();
	
	default int addable(int a,int b){
		return a+b;
	}
}





public class LambdaAndInner {
	
	//�ⲿ���ʵ�������������
	private int age=12;
	private static String name ="��������������";
	
	public void test(){
		String book = "���Java����";   //�ֲ��ڲ��෽���˸÷�����������final
		Displayable dis = ()->{
			//���� effectively final �ľֲ�����
			System.out.println("book�ֲ�����Ϊ�� "+book);
			//�����ⲿ���ʵ�������������
			System.out.println("�ⲿ���ageʵ�������� "+age);
			System.out.println("�ⲿ���nameʵ�������� "+name);
		};
		
		dis.display();
		
		//����dis����ӽӿڼ̳е�add()����
		dis.addable(4, 5);
	}
	
	

	public static void main(String[] args) {
		LambdaAndInner lambdaAndInner = new LambdaAndInner();
		lambdaAndInner.test();

	}

}






























