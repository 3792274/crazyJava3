package com.atguigu.java8.streamAPI;
import java.util.Optional;

//ע�⣺Optional ���ܱ����л�
public class NewMan {

	private Optional<Godness> godness = Optional.empty();
	
	private Godness god;
	
	public Optional<Godness> getGod(){
		return Optional.of(god);
	}

	public NewMan() {
	}

	public NewMan(Optional<Godness> godness) {
		this.godness = godness;
	}

	public Optional<Godness> getGodness() {
		return godness;
	}

	public void setGodness(Optional<Godness> godness) {
		this.godness = godness;
	}

	@Override
	public String toString() {
		return "NewMan [godness=" + godness + "]";
	}

}
