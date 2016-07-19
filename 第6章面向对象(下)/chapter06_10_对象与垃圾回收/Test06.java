package chapter06_10_对象与垃圾回收;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Test06 {
	
	

	public static void main(String[] args) {
		
		// 创建一个字符串对象，定义字符串String str="疯狂Java讲义"，则是强引用，会放入字符串池，并不会回收。
		String str = new String("疯狂Java讲义");
		
		// 创建一个弱引用，让此弱引用引用到"疯狂Java讲义"字符串，和str一样引用到该对象，
		WeakReference wr = new WeakReference(str); // ①
		
		// 切断str引用和"疯狂Java讲义"字符串之间的引用
		str = null; // ②
		
		// 取出弱引用所引用的对象
		System.out.println(wr.get()); // ③ 弱引用会保留该字符串
		
		
		
		
		// 强制垃圾回收
		System.gc();
		System.runFinalization();
	
		
		/***
		 * 
		 * //节省内存使用引用类，由于垃圾回收不确定，使用的虚引用如果对象已经被回收，以下两种方法重新创建获取
		 * 
		 * 
		 * */
//		//1.取出弱引用所引用的对象
//		Object obj = wr.get();
//		//如果为空
//		if(obj==null){
//			//重新创建一个新的对象，再次让弱引用对象去引用他
//			 wr = new WeakReference(new String("疯狂Java讲义")); // ①
//			 //取出弱引用所引用的对象，赋值给obj,因为垃圾回收的不确定性，还可能导致obj为null,例如在此插入垃圾回收
//			 obj =null;
//			 obj=wr.get();
//			
//		}
//		
//		
		
		
//		
//		//2.与第一种方法不同，不会null
//		Object obj = wr.get();
//		if(obj == null){
//			obj= new String("疯狂Java讲义");
//			wr = new WeakReference(obj);
//		}
//		//....操作obj对象
//		//再次切断obj和对象的关联
//		obj=null;
//		
		
		
		// 再次取出弱引用所引用的对象
		System.out.println(wr.get()); // ④
	}
	
 
}
