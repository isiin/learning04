package com.example.demo.entity;

public class Account {
    private Long id;
    private String name;
    private String email;
    
    public Account(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
   
    @Override
    public String toString() {
        return String.format("id:%d, name:%s, email:%s", id, name, email);
    }
}
