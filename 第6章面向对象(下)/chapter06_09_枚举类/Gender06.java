package chapter06_09_ö����;

//�Ľ���Gender�࣬��ǿ��װ
public enum Gender06{
	MALE,FEMALE;
	
	private String name;
	
	
	//�ж�ö���������õ������Ƿ�һ�¡�
	public void setName(String name){
		switch (this) {
		case MALE:
			if(name().equals("��"))
				this.name = name;
			else{
				System.out.println("��������");
				return;
			}
			
			break;
		case FEMALE:
			if(name.equals("Ů"))
				this.name = name;
			else {
				System.out.println("��������");
				return;
			}
			break;
 
		}
	}
	
	
	//�������
	public String getName() {
		return this.name;
	}
}


















