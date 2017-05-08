package chapter06_09_枚举类;

//改进的Gender类，增强封装
public enum Gender06{
	MALE,FEMALE;
	
	private String name;
	
	
	//判断枚举类型设置的名字是否一致。
	public void setName(String name){
		switch (this) {
		case MALE:
			if(name().equals("男"))
				this.name = name;
			else{
				System.out.println("参数错误");
				return;
			}
			
			break;
		case FEMALE:
			if(name.equals("女"))
				this.name = name;
			else {
				System.out.println("参数错误");
				return;
			}
			break;
 
		}
	}
	
	
	//获得名字
	public String getName() {
		return this.name;
	}
}


















