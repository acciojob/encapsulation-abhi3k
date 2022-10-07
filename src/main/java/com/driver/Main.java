package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "Abhishek";
        // name is a private member hence can not be accessed
        obj.setName("Abhishek");
        System.out.println(obj.getName());
    }
}