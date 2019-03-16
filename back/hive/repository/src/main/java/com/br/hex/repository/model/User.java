package com.br.hex.repository.model;

public class User {

    private int id;
    private String name;
    private String user;
    private String password;
    private String function;

    public User(int id, String name, String user, String password, String function) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.password = password;
        this.function = function;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getFunction() {
        return function;
    }

}
