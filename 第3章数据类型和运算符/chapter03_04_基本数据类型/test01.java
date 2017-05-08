package chapter03_04_基本数据类型;

public class test01 {

	/**
	 * 基本数据类型  
	 *       整数类型   byte    1个字节		-128(-2^7)           ~  127(2^7-1)
	 *             short   2个字节		-32768(-2^15)        ~  32767(2^15-1)			
 	 *			   int     4个字节		-2147483648(-2^31)   ~  2147483647(2^31-1)	
	 *			   long    8个字节	               (-2^63)   ~            (2^63-1)	
	 *
	 *		   字符类型   char    2个字节            Unicode  支持中文16位，16位无符号整数，0-65535
	 *
	 *       浮点类型   float   4个字节
	 *             double  8个字节
	 *       
	 *       布尔类型    boolean
	 *       
	 * 
	 * 
	 * 
	 * */
	
	
	// 下面的代码是正确的，系统会把56当做byte类型处理
	byte a = 56;

	// 下面的代码是错误的，系统不会把9999999999999当成long处理,超出int的表述范围，引起错误
	// long bigValue = 9999999999999;
	long bigValue = 9999999999999L;
	
	//Java中整数值4种表示：2进制，8进制，10进制，16进制
	
	//2进制的支持，以0b、OB 开头，java7中新引进的
	int binVal1=0b11010100;
	int binVal2=0B110101000;
	
	//8进制，0开头
	int octalValue=013;
	
	//16进制,0x,0X开头,a-f不区分大小写
	int hexValue1=0x13;
	int hexValue2=0Xaf;
	
	
	public static void main(String[] args) {
	
		//定义2个8位的二进制数
		int v1=0b11010100;
		int	v2=0B11010100;
	
		//定义一个32位二进制整数，最高位符号位
		int v3=0B10000000000000000000000000000011;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
	}
	
	
	

}
