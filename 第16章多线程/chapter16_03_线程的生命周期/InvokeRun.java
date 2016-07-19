package chapter16_03_线程的生命周期;

public class InvokeRun  extends Thread{
	
	private  int i;
	
	@Override
	public void run() {
		for(;i<100;i++){
			//直接调用run()方法，Thread的this.getName()返回的是该对象名字
			//而不是当前线程的名字
			//使用Thread.currentThread().getName()重视获取当前线程的名字
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	

	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			//调用Thread的currentThread()获取当前线程
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==20){
				//直接调用对象的run方法
				//系统会把当前对象当成普通对象，并把run()方法当成普通方法
				//所以下面两行代码并不会启动线程，而是执行两个run()方法，会阻塞主线程
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}
	}

}
