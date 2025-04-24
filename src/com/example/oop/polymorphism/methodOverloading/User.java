package com.example.oop.polymorphism.methodOverloading;

public class User {
    String email;
    String password;

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public int changePassword(){
        this.password = "newPassword";
        return 0;
    }

    public void changePassword(int a){
        this.password = "a";
    }
//    public int changePassword(int xyz){
//        this.password = "password";
//    }

}
