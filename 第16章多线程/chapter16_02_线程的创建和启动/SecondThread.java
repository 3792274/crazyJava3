package chapter16_02_�̵߳Ĵ���������;

public class SecondThread implements Runnable {

	private int i;
	
	//run����Ϊ�̵߳�ִ����
	@Override
	public void run() {
		for(;i<100;i++){
			//���߳�ʵ�ֽӿ�ʱ����õ�ǰ�߳�ֻ��ʹ��Thread.currentThread()
			System.out.println(Thread.currentThread().getName() + " "+i);
		}
	}
	
	public static void main(String[] args) {
			for(int i=0;i<100;i++){
				System.out.println(Thread.currentThread().getName()+" " + i);
			
				if(i ==20 ){
					SecondThread sThread= new SecondThread();
					//ͨ��new Thread(target,name)���������������߳�
					new Thread(sThread,"���߳�1").start();
					new Thread(sThread,"���߳�2").start();
				}
			}
	}

}
