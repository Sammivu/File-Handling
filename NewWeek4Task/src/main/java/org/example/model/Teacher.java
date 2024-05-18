package org.example.model;

import org.example.enums.Gender;

public class Teacher {
    private String teacherId;
    private String email;
    private String  firstName;
    private String lastName;

    public Teacher(String teacherId, String email, String firstName, String lastName) {
        this.teacherId = teacherId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Teacher() {
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + '\'' +"  "+
                ", email=" + email + '\'' +"  "+
                ", firstName=" + firstName + '\'' +"  "+
                ", lastName=" + lastName + '\'' +"  "+
                '}';
    }
}
