package chapter16_02_线程的创建和启动;

/**
 * 可以使任意方法变成线程，并且可以有返回值。
 */
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {

	public static void main(String[] args) {
		
		
		//创建Callable对象（不知道干什么用fuck!）
		ThirdThread rt = new ThirdThread();
		
		
		//先使用Lambda表达式创建Callable<Integer>对象,使用FutureTask来包装Callable对象
		FutureTask< Integer> task  = new FutureTask<Integer>((Callable<Integer>)()->{
			int i = 0;
			for(;i<100;i++){
				System.out.println(Thread.currentThread().getName() +"的循环变量i的值是： "+ i);
			}
			
			//call()方法可以有返回值
			return i;
		});
		
		
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName() +"的循环变量i的值是："+ i);
			if(i==20){
				//实质还是以callable对象来创建并启动线程
				new Thread(task,"有返回值的线程-1 ").start();
			}
		}
		
		
		
		try{
			//获取线程的返回值
			System.out.println("子线程的返回值： "+task.get()); //该方法导致主线程被阻塞
		}catch(Exception exception){
			exception.printStackTrace();
		}
		
		
	}	

}






























