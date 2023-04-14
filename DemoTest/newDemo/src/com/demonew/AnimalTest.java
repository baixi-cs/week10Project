package com.demonew;

public class AnimalTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal a1 = new Cat();
	     a1.setName("加菲");
	        a1.setAge(2);
	        System.out.println(a1.getName()+","+a1.getAge());
	        a1.eat();
	        Jumpping j1=new Cat();
	        j1.jump();

	        System.out.println("\n");
	        //Dog
	        Animal a2=new Dog("旺仔",4);
	        System.out.println(a2.getName()+","+a2.getAge());
	        a2.eat();
	        Jumpping j2=new Dog();
	        j2.jump();

		System.out.println("hello");
	}

}
