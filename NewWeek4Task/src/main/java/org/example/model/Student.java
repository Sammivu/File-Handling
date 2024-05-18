package org.example.model;

import org.example.enums.Gender;

public class Student{

    private  int studentId;
    private  String firstName;
    private  String lastName;
    private  int gradeLevel;
    private  String email ;
    private  String guardianEmail1;
    private  String guardianEmail2;
    private  String isArchived;
    private  String isDeleted ;


    public Student(int studentId, String firstName, String lastName, int gradeLevel, String email,
                   String guardianEmail1, String guardianEmail2, String isArchived, String isDeleted) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.email = email;
        this.guardianEmail1 = guardianEmail1;
        this.guardianEmail2 = guardianEmail2;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGuardianEmail1() {
        return guardianEmail1;
    }

    public void setGuardianEmail1(String guardianEmail1) {
        this.guardianEmail1 = guardianEmail1;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        this.guardianEmail2 = guardianEmail2;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(String isArchived) {
        this.isArchived = isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +"  "+
                ", firstName=" + firstName + '\'' +"  "+
                ", lastName=" + lastName + '\'' +"  "+
                ", gradeLevel=" + gradeLevel +"  "+
                ", email=" + email + '\'' +"  "+
                ", guardianEmail1=" + guardianEmail1 + '\'' +"  "+
                ", guardianEmail2=" + guardianEmail2 + '\'' +"  "+
                ", isArchived=" + isArchived + '\'' +"  "+
                ", isDeleted=" + isDeleted + '\'' +"  "+
                '}';
    }
}
