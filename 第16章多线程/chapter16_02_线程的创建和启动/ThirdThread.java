package chapter16_02_�̵߳Ĵ���������;

/**
 * ����ʹ���ⷽ������̣߳����ҿ����з���ֵ��
 */
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {

	public static void main(String[] args) {
		
		
		//����Callable���󣨲�֪����ʲô��fuck!��
		ThirdThread rt = new ThirdThread();
		
		
		//��ʹ��Lambda���ʽ����Callable<Integer>����,ʹ��FutureTask����װCallable����
		FutureTask< Integer> task  = new FutureTask<Integer>((Callable<Integer>)()->{
			int i = 0;
			for(;i<100;i++){
				System.out.println(Thread.currentThread().getName() +"��ѭ������i��ֵ�ǣ� "+ i);
			}
			
			//call()���������з���ֵ
			return i;
		});
		
		
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName() +"��ѭ������i��ֵ�ǣ�"+ i);
			if(i==20){
				//ʵ�ʻ�����callable�����������������߳�
				new Thread(task,"�з���ֵ���߳�-1 ").start();
			}
		}
		
		
		
		try{
			//��ȡ�̵߳ķ���ֵ
			System.out.println("���̵߳ķ���ֵ�� "+task.get()); //�÷����������̱߳�����
		}catch(Exception exception){
			exception.printStackTrace();
		}
		
		
	}	

}






























