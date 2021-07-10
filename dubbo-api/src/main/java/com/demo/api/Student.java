package com.demo.api;

import java.io.Serializable;

public class Student implements Serializable {

    private Integer age;
    private String id;

    public Student(Integer age, String id) {
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
