package org.example;


import org.example.enums.Department;
import org.example.enums.Gender;
import org.example.model.*;
import org.example.service.implement.*;

import java.util.List;

public class Main {
    public static void main(String[] args){

        Person person = new Person("Sampson", "Gbewa", 25,Gender.MALE);
        person.setFirstName("Sampson");
        person.setLastName("Gbewa");
        person.setAge(25);
        person.setGender(Gender.MALE);

        System.out.println("Applicant Data");
        ApplicantServiceImpl applicantService = new ApplicantServiceImpl();
        Applicant applicant = new Applicant("Joseph", "Philip",5, Gender.FEMALE, Department.ARTS);
        applicantService.applicantData(applicant);
        System.out.println("*************************");

        System.out.println("Principal Data");
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();
        Principal principal = new Principal("Balogun", "Clement",23, Gender.MALE);
        principalService.PrincipalData(principal);
        System.out.println("*************************");

        System.out.println("Staff Data");
        StaffServiceImpl staffService = new StaffServiceImpl();
        Staff staff = new Staff("Arinze","Ebuka" ,27, Gender.MALE);
        staffService.staffData(staff);
        System.out.println("*************************");

       System.out.println("Expelled Student");
        staffService.expelledStudent(principal,person);
        System.out.println("*************************");

        System.out.println("Admitted Student");
        staffService.addmitApplicant(principal,applicant);
        System.out.println("**********************");



        String filePath = "src/main/resources/student.csv.csv";
        String destinationPath = "src/main/resources/UpdatedStudentData.csv";

        StudentServiceImpl studentService = new StudentServiceImpl();
        List<Student> listOfStudents = studentService.readStudentFile(filePath);

        studentService.writeStudentFile(listOfStudents, destinationPath);

        System.out.println("************************************");

        String file = "src/main/resources/teacher_data.csv.csv";
        String destination = "src/main/resources/UpdatedTeacherData.csv";

        TeacherServiceImpl teacherServices = new TeacherServiceImpl();

        List<Teacher> listOfTeachers = teacherServices.readTeacherFile(file);

        teacherServices.writeTeacherFile(listOfTeachers, destination);



    }
    }