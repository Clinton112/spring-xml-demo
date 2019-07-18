package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor
{

    private String name;
    private String gender;
    private int age;
    @Value( "Harry")
    public void setName(String name) {
        this.name = name;
    }
    @Value( "M")
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Value("21")
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}