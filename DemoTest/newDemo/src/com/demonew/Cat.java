package com.demonew;

public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override//重写eat（）方法
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override//重写jump（）方法
    public void jump() {
        System.out.println("猫可以跳高了");
    }
    
}
