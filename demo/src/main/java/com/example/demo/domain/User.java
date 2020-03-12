package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String name;

    private String address;

    private Integer age;

    public User() {
    }

    public User(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
