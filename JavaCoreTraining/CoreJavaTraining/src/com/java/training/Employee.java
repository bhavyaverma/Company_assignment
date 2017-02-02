package com.java.training;

/**
 * Created by bhavyaverma on 1/25/17.
 */
public class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id1, String name1, int age1)
    {
        id = id1;
        name = name1;
        age = age1;


    }

    public Employee(){

    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
