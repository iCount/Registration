package com.xzy;

// Пользователь
public class User {
    int id;
    String password;

    @Override
    public boolean equals(Object obj) {
        User u = (User) obj;
        return this.id == u.id;
    }

    public User(int id, String password) {
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{Аккаунт:" + id + "Пароль:" + password + "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}