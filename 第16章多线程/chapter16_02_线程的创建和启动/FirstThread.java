package chapter16_02_�̵߳Ĵ���������;

public class FirstThread  extends Thread{
	
	//�����̲߳����ܹ���ñ�����ʵ�����������Ǿֲ�����
	private int i;
	
	
	@Override
	public void run() {
		for(;i<100;i++){
			//���̼̳߳�Thread��ʱ��ʹ��this��ȡ��ǰ�̣߳�getName()�����߳�����
			System.out.println(getName()+" "+i);
		}
	}
	
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			//����Thread�ľ�̬����currentThread()��õ�ǰ�߳�
			System.out.println(Thread.currentThread().getName()+" : "+i);
			if(i==20){
				//������������һ���߳�
				Thread thread1 = new FirstThread();
				thread1.setName("�߳�2");
				thread1.start();
				
				//�����������ڶ����߳�
				new FirstThread().start();
				
			}
		}
	}

}
