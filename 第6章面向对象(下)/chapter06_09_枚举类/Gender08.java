package chapter06_09_枚举类;

//设计成不可变类
public enum Gender08 {
	
	//此处的枚举值必须调用对应的构造器来创建
 	MALE("男"),FEMALE("女");
	
	//可以如下理解
//	public static final Gender08 MALE = new Gender08("男");
//	public static final Gender08 FEMALE = new Gender08("女");
	
	private final String name;
	
	
	
	private Gender08(String name){
		this.name = name();
	}
	
	
	public String getName() {
		return this.name;
	}

}
