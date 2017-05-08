package chapter16_02_线程的创建和启动;

public class SecondThread implements Runnable {

	private int i;
	
	//run方法为线程的执行体
	@Override
	public void run() {
		for(;i<100;i++){
			//当线程实现接口时，获得当前线程只能使用Thread.currentThread()
			System.out.println(Thread.currentThread().getName() + " "+i);
		}
	}
	
	public static void main(String[] args) {
			for(int i=0;i<100;i++){
				System.out.println(Thread.currentThread().getName()+" " + i);
			
				if(i ==20 ){
					SecondThread sThread= new SecondThread();
					//通过new Thread(target,name)方法创建并启动线程
					new Thread(sThread,"新线程1").start();
					new Thread(sThread,"新线程2").start();
				}
			}
	}

}
