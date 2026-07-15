package org.example;

public class UserService {

    String name;
    int age;

    public UserService(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void save() {
        System.out.println("User saved");
    }
}
