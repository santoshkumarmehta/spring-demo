package org.example;

public class UserService {

    private String name;
    private int age;

    public UserService(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void saveUser() {
        System.out.println("User saved");
    }

    public String getName() {
        return name;
    }
}
