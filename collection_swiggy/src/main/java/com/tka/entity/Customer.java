package com.tka.entity;

public class Customer {
    private int id;
    private String name;
    private long mobile;

    public Customer(int id, String name, long mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getMobile() {
        return mobile;
    }
}
