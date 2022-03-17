package com.andrewrpatterson.converterinjecgtionbug.entity;

public class MyNewClass {
    private int id;
    private String name;

    public MyNewClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
