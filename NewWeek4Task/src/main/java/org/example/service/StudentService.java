package org.example.service;

import org.example.model.Course;
import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {


    List<Student> readStudentFile (String filePath);

   void writeStudentFile (List<Student>String, String filePath);

   }


