package chapter16_03_�̵߳���������;

public class InvokeRun  extends Thread{
	
	private  int i;
	
	@Override
	public void run() {
		for(;i<100;i++){
			//ֱ�ӵ���run()������Thread��this.getName()���ص��Ǹö�������
			//�����ǵ�ǰ�̵߳�����
			//ʹ��Thread.currentThread().getName()���ӻ�ȡ��ǰ�̵߳�����
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	

	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			//����Thread��currentThread()��ȡ��ǰ�߳�
			System.out.println(Thread.currentThread().getName()+" "+i);
			if(i==20){
				//ֱ�ӵ��ö����run����
				//ϵͳ��ѵ�ǰ���󵱳���ͨ���󣬲���run()����������ͨ����
				//�����������д��벢���������̣߳�����ִ������run()���������������߳�
				new InvokeRun().run();
				new InvokeRun().run();
			}
		}
	}

}
