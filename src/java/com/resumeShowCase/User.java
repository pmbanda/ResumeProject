package com.resumeShowCase;

public class User 
{
    // class fields
    String name;
    String email;
    String message;

    // class constructor
    public User(String name, String email, String message) 
    {
        this.name = name;
        this.email = email;
        this.message = message;
    }
    
    public String getName(){    return this.name; }
    public String getEmail(){    return this.email; }
    public String getMessage(){    return this.message; }
}
