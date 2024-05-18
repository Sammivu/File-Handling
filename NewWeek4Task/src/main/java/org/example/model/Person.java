package org.example.model;

import org.example.enums.Gender;

public class Person {
     private String firstName;
    private String lastName;
    private  int age;
    private Gender gender;

    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = this.firstName;
        this.lastName = this.lastName;
        this.age = this.age;
        this.gender = this.gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
