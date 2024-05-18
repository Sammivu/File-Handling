package org.example.service.implement;

import org.example.model.Applicant;
import org.example.service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {

    @Override
    public void applicantData(Applicant applicant) {
        System.out.println("Fullname: "+ applicant.getFirstName()+" "+applicant.getLastName()+"\n" +
                "Age: "+ applicant.getAge()+ "\n"+
                "Gender: "+applicant.getGender()+ "\n" +
                "Preferred Dept: "+ applicant.getPreferredDept() );
    }

}
