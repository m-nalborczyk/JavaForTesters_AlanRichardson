package com.javafortesters.domainentities;

public class User {

    private String username;
    private String password;

    public User () { //default constructor setting default values for username and password
        this ("username", "password");
        /* above better of the same as below:
        username = "username";
        password = "password";
         */
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
