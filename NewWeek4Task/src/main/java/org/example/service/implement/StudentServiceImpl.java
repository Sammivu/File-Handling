package org.example.service.implement;

import org.example.model.Course;
import org.example.model.Student;
import org.example.service.StudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> readStudentFile(String filePath) {

        List<Student> listOfStudents = new ArrayList<>();

        try {
            BufferedReader readStudentData = new BufferedReader(new FileReader(filePath));
            String line;

            readStudentData.readLine();

            //Looping through each line of the CSV file
            while ((line = readStudentData.readLine()) != null) {
                String[] fields = line.split(",", -1);
                // Replacing empty fields with null
                for (int i = 0; i < fields.length; i++) {
                    if (fields[i].isEmpty()) {
                        fields[i] = null;
                    }
                }
                // Creating an object of the StudentModel class
                Student student = new Student();
                student.setStudentId(Integer.parseInt(fields[0]));
                student.setFirstName(fields[1]);
                student.setLastName(fields[2]);
                student.setGradeLevel(Integer.parseInt(fields[3]));
                student.setEmail(fields[4]);
                student.setGuardianEmail1(fields[5]);
                student.setGuardianEmail2(fields[6]);
                student.setIsArchived(fields[7]);
                student.setIsDeleted(fields[8]);

                listOfStudents.add(student);
            }
            System.out.println("Read Successfully");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        //Printing to the console
        for (Student students : listOfStudents) {
            System.out.println(students);
        }
        return listOfStudents;
    }

    @Override
    public void writeStudentFile(List<Student> students, String filePath) {

        try {
            BufferedWriter writeStData = new BufferedWriter(new FileWriter(filePath));

            writeStData.write("StudentID, Email, FirstName, LastName, GradeLevel, GuardianEmail, GuardianEmail2, IsArchived, IsDeleted \n");
            writeStData.newLine();

            for (Student studentM : students) {
                writeStData.write(studentM.getStudentId() + ","+"  ");
                writeStData.write(studentM.getFirstName() + ","+"  ");
                writeStData.write(studentM.getLastName() + ","+"  ");
                writeStData.write(studentM.getGradeLevel() + ","+"  ");
                writeStData.write(studentM.getEmail() + ","+"  ");
                writeStData.write(studentM.getGuardianEmail1() + ","+"  ");
                writeStData.write(studentM.getGuardianEmail2() + ","+"  ");
                writeStData.write(studentM.getIsArchived() + ","+"  ");
                writeStData.write(studentM.getIsDeleted() + "  ");
                writeStData.newLine();
            }
            System.out.println("Successfully written to a CSV file ");
            writeStData.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
