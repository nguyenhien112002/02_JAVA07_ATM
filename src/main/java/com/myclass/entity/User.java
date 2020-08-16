package com.myclass.entity;

public class User {
    private int id;
    private String name;
    private long balance;
    
    public int getId() {
        return id;
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

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public User(int id, String name, long balance) {
        super();
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
}
