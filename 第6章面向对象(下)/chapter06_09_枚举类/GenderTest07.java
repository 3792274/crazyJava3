package chapter06_09_ö����;

public class GenderTest07 {
public static void main(String[] args) {
	Gender06 g  = Gender06.valueOf("FEMALE");
	g.setName("Ů");
	System.out.println(g+"���� "+g.getName());
	
	//��ʱ����nameֵ��������ʾ��������
	g.setName("��");
	System.out.println(g+"���� "+g.getName());

}
}
