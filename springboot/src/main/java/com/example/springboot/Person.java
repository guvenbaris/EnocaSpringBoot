package com.example.springboot;

public class Person {
    private int id;
    private String name;
    private int age;
    private double balance;

    public Person(int id,String name, int age,double balance) {
        super();
        this.id=id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
