package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Student {

    int id;
    String name;
    double fee;

    @Autowired
    public Student(int id, String name, double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public void saveStudent() {
        System.out.println("Student saved");
    }

    public String getName() {
        return name;
    }
}
