package chapter06_09_ö����;

//��Ƴɲ��ɱ���
public enum Gender08 {
	
	//�˴���ö��ֵ������ö�Ӧ�Ĺ�����������
 	MALE("��"),FEMALE("Ů");
	
	//�����������
//	public static final Gender08 MALE = new Gender08("��");
//	public static final Gender08 FEMALE = new Gender08("Ů");
	
	private final String name;
	
	
	
	private Gender08(String name){
		this.name = name();
	}
	
	
	public String getName() {
		return this.name;
	}

}
