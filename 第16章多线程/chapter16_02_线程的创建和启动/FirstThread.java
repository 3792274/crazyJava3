package chapter16_02_线程的创建和启动;

public class FirstThread  extends Thread{
	
	//两个线程并不能共享该变量是实例变量而不是局部变量
	private int i;
	
	
	@Override
	public void run() {
		for(;i<100;i++){
			//当线程继承Thread类时，使用this获取当前线程，getName()返回线程名字
			System.out.println(getName()+" "+i);
		}
	}
	
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			//调用Thread的静态方法currentThread()获得当前线程
			System.out.println(Thread.currentThread().getName()+" : "+i);
			if(i==20){
				//创建并启动第一个线程
				Thread thread1 = new FirstThread();
				thread1.setName("线程2");
				thread1.start();
				
				//创建并启动第二个线程
				new FirstThread().start();
				
			}
		}
	}

}
