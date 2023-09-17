package com.driver;

public class Main {
      RWOnly obj=new RWOnly();
//        obj.name = "Surya";         //private variable cannot be accessed in another class
        obj.setName("Surya");
        System.out.print(obj.getName());
}
