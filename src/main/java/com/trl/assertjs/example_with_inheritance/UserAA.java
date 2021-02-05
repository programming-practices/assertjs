package com.trl.assertjs.example_with_inheritance;

import java.util.Objects;
import java.util.StringJoiner;

public  class UserAA extends BaseEntity {

    private String firstName;

    private String lastName;

    private String email;

    public UserAA(String firstName, String lastName, String email) {
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
        if (!(o instanceof UserAA)) return false;
        UserAA userAA = (UserAA) o;
        return Objects.equals(firstName, userAA.firstName) && Objects.equals(lastName, userAA.lastName) && Objects.equals(email, userAA.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserAA.class.getSimpleName() + "[", "]")
                .add("createdDate=" + createdDate)
                .add("updatedDate=" + updatedDate)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("email='" + email + "'")
                .toString();
    }

}
