package chapter06_10_��������������;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Test06 {
	
	

	public static void main(String[] args) {
		
		// ����һ���ַ������󣬶����ַ���String str="���Java����"������ǿ���ã�������ַ����أ���������ա�
		String str = new String("���Java����");
		
		// ����һ�������ã��ô����������õ�"���Java����"�ַ�������strһ�����õ��ö���
		WeakReference wr = new WeakReference(str); // ��
		
		// �ж�str���ú�"���Java����"�ַ���֮�������
		str = null; // ��
		
		// ȡ�������������õĶ���
		System.out.println(wr.get()); // �� �����ûᱣ�����ַ���
		
		
		
		
		// ǿ����������
		System.gc();
		System.runFinalization();
	
		
		/***
		 * 
		 * //��ʡ�ڴ�ʹ�������࣬�����������ղ�ȷ����ʹ�õ���������������Ѿ������գ��������ַ������´�����ȡ
		 * 
		 * 
		 * */
//		//1.ȡ�������������õĶ���
//		Object obj = wr.get();
//		//���Ϊ��
//		if(obj==null){
//			//���´���һ���µĶ����ٴ��������ö���ȥ������
//			 wr = new WeakReference(new String("���Java����")); // ��
//			 //ȡ�������������õĶ��󣬸�ֵ��obj,��Ϊ�������յĲ�ȷ���ԣ������ܵ���objΪnull,�����ڴ˲�����������
//			 obj =null;
//			 obj=wr.get();
//			
//		}
//		
//		
		
		
//		
//		//2.���һ�ַ�����ͬ������null
//		Object obj = wr.get();
//		if(obj == null){
//			obj= new String("���Java����");
//			wr = new WeakReference(obj);
//		}
//		//....����obj����
//		//�ٴ��ж�obj�Ͷ���Ĺ���
//		obj=null;
//		
		
		
		// �ٴ�ȡ�������������õĶ���
		System.out.println(wr.get()); // ��
	}
	
 
}
