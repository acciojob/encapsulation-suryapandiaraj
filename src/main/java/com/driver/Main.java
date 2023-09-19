package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj=new RWOnly();
//        obj.name="Surya";   //private variable cannot be accessed in another class
        obj.setName("Surya");
        System.out.print(obj.getName());
    }
}
