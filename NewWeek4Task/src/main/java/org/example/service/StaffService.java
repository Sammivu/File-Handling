package org.example.service;

import org.example.model.*;

public interface StaffService {

    void  staffData(Staff staff);

    void addmitApplicant (Principal principal, Applicant applicant);

    void expelledStudent (Principal principal, Person person);
}
