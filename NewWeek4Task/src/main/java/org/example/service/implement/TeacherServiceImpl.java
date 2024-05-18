package org.example.service.implement;

import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.CourseService;
import org.example.service.TeacherServices;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements TeacherServices {


    @Override
    public List<Teacher> readTeacherFile(String filePath)  {

        List<Teacher> listOfTeachers = new ArrayList<>();

        try {
            BufferedReader readTeacherData = new BufferedReader(new FileReader(filePath));
            String line;

            readTeacherData.readLine();

            //Looping through each line of the CSV file
            while ((line = readTeacherData.readLine()) != null) {
                String[] fields = line.split(",", -1);
                // Replacing empty fields with null
                for (int i = 0; i < fields.length; i++) {
                    if (fields[i].isEmpty()) {
                        fields[i] = null;
                    }
                }
                // Creating an object of the StudentModel class
                Teacher teacher = new Teacher();
                teacher.setTeacherId(fields[0]);
                teacher.setEmail(fields[1]);
                teacher.setFirstName(fields[2]);
                teacher.setLastName((fields[3]));

                listOfTeachers.add(teacher);
            }
            System.out.println("Read Successfully");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        //Printing to the console
        for (Teacher teachers : listOfTeachers) {
            System.out.println(teachers);
        }
        return listOfTeachers;
    }

    @Override
    public void writeTeacherFile(List<Teacher> teachers, String filePath2) {


        try{
            BufferedWriter writeTeacherData = new BufferedWriter(new FileWriter(filePath2));

            writeTeacherData.write("TeacherID, Email, FirstName, LastName \n");
            writeTeacherData.newLine();

            for (Teacher teacher: teachers){
                writeTeacherData.write(teacher.getTeacherId()+ ","+"  ");
                writeTeacherData.write(teacher.getEmail()+ ","+"  ");
                writeTeacherData.write(teacher.getFirstName()+ ","+"  ");
                writeTeacherData.write(teacher.getLastName()+ "   ");
                writeTeacherData.newLine();

            }
            System.out.println("Teacher file successfully written!!");
            writeTeacherData.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }



}
