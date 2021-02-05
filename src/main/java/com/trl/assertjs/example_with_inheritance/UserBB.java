package com.trl.assertjs.example_with_inheritance;

import java.util.StringJoiner;

public  class UserBB extends BaseEntity {

    private String firstName;

    private String lastName;

    private String email;

    public UserBB(String firstName, String lastName, String email) {
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
    public String toString() {
        return new StringJoiner(", ", UserBB.class.getSimpleName() + "[", "]")
                .add("createdDate=" + createdDate)
                .add("updatedDate=" + updatedDate)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .toString();
    }
}
