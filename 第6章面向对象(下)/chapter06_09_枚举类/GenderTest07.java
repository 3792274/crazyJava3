package chapter06_09_枚举类;

public class GenderTest07 {
public static void main(String[] args) {
	Gender06 g  = Gender06.valueOf("FEMALE");
	g.setName("女");
	System.out.println(g+"代表： "+g.getName());
	
	//此时设置name值，将会提示参数错误
	g.setName("男");
	System.out.println(g+"代表： "+g.getName());

}
}
