package org.example.service;


import org.example.model.Teacher;

import java.util.List;

public interface  TeacherServices {

    List<Teacher> readTeacherFile (String filePath);

    void writeTeacherFile (List<Teacher>String, String filePath);
}
