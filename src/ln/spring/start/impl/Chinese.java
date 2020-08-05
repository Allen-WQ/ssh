package ln.spring.start.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ln.spring.start.inter.Dog;
import ln.spring.start.inter.Person;

public class Chinese implements Person{

	private String name;
	private Dog dog;
	
	public Chinese() {}
	
	public Chinese(Dog dog) {
		this.dog=dog;
		
	}
	
	public Chinese(String name,Dog dog) {
		this.name=name;
		this.dog=dog;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@Override
	public void playDog() {
		System.out.println(getName()+"µÄ¹·½ÐÁË");
	}
}
