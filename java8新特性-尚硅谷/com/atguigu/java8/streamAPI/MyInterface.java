package com.atguigu.java8.streamAPI;

public interface MyInterface {
	
	default String getName(){
		return "�ǺǺ�";
	}
	
	public static void show(){
		System.out.println("�ӿ��еľ�̬����");
	}

}