package com.trl.assertjs.example_without_inheritance;

import java.util.Objects;
import java.util.StringJoiner;

public class UserA {
    
    private String firstName;
    
    private String lastName;
    
    private String email;

    public UserA(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserA)) return false;
        UserA userA = (UserA) o;
        return Objects.equals(firstName, userA.firstName) && Objects.equals(lastName, userA.lastName) && Objects.equals(email, userA.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }

}
