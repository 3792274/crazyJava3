package chapter10_02_异常类的继承体系;
/**
 * 异常分为：Checked编译、Runtime异常
 * 问题分为：  异常Exception：RuntimeException（IndexOutOfBounddsException、NullPointerException、ClassCastException）、
 *                     Check:IoException、SQLException
 *        错误Error：AWTError、IoError、LinageError、TreadDeath、
 * @author Mr.TianShu
 *
 */

public class DivTest {

	public static void main(String[] args) {

		try {
			int a =Integer.parseInt(args[0]);
			int b =Integer.parseInt(args[1]);
			int c =a/b;
			System.out.println("您输入的两个数相除的结构是： "+c);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("数组越界：运行程序时输入的参数个数不够。");
		}catch (NumberFormatException e) {
			System.out.println("数字格式化异常：程序只能接受整数参数");
		}catch (ArithmeticException e) {
			System.out.println("算数异常");
		}catch (Exception e) {
			System.out.println("未知异常");
		}
	}

}
