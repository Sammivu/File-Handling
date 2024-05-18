package org.example.model;
import org.example.enums.Department;
import org.example.enums.Gender;


public class Applicant extends Person{

        Department PreferredDept;

        public Applicant(String firstName,String lastName, int age, Gender gender, Department preferredDept) {
            super(firstName,lastName, age, gender);
            PreferredDept = preferredDept;
        }

        public Department getPreferredDept() {
            return PreferredDept;
        }

        @Override
        public String toString() {
            return "Applicant{" +
                    "PreferredDept=" + PreferredDept +
                    '}';
        }
    }


