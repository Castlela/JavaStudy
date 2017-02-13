package day07.oop;

public class 学生类 {
	String name;
	int age;
	String address;
	
	void study(){
		System.out.println(name+"在学习...");
	}
	
	void sayHi(){
		System.out.println("大家好，我叫"+name+",今年"+age+",家住"+address);
	}
}
