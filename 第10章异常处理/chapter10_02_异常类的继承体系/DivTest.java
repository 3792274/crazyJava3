package chapter10_02_�쳣��ļ̳���ϵ;
/**
 * �쳣��Ϊ��Checked���롢Runtime�쳣
 * �����Ϊ��  �쳣Exception��RuntimeException��IndexOutOfBounddsException��NullPointerException��ClassCastException����
 *                     Check:IoException��SQLException
 *        ����Error��AWTError��IoError��LinageError��TreadDeath��
 * @author Mr.TianShu
 *
 */

public class DivTest {

	public static void main(String[] args) {

		try {
			int a =Integer.parseInt(args[0]);
			int b =Integer.parseInt(args[1]);
			int c =a/b;
			System.out.println("�����������������Ľṹ�ǣ� "+c);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("����Խ�磺���г���ʱ����Ĳ�������������");
		}catch (NumberFormatException e) {
			System.out.println("���ָ�ʽ���쳣������ֻ�ܽ�����������");
		}catch (ArithmeticException e) {
			System.out.println("�����쳣");
		}catch (Exception e) {
			System.out.println("δ֪�쳣");
		}
	}

}
