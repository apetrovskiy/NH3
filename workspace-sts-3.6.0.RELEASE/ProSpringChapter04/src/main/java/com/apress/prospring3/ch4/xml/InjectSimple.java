package com.apress.prospring3.ch4.xml;

public class InjectSimple {
	private String name;
	private int age;
	private float height;
	private boolean programmer;
	private Long ageInSeconds;
	
	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name + "\n"
				+ "Age: " + age + "\n"
				+ "Age in Seconds: " + ageInSeconds + "\n"
				+ "Height: " + height + "\n"
				+ "Is Programmer?: " + programmer;
	}
}
