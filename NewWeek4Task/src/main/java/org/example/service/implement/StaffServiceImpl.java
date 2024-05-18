package org.example.service.implement;

import org.example.model.*;
import org.example.service.StaffService;

public class StaffServiceImpl implements StaffService {

    @Override
    public  void staffData (Staff staff){
       System.out.println ("Fullname: "+ staff.getFirstName()+ " "+staff.getLastName() +"\n" +
                "Age: "+ staff.getAge()+ "\n"+
                "Gender: "+staff.getGender());
    }

    @Override
    public void addmitApplicant(Principal principal, Applicant applicant) {
        if (applicant.getAge()>7 && applicant.getAge()>18){
            System.out.println("Principal: "+principal.getFirstName()+" "+principal.getLastName()+","+
                    "\n"+"CONGRATULATIONS!! "+ applicant.getFirstName()+" "+applicant.getLastName());
            System.out.println("YOU HAVE BEEN ADMITTED.");
        }else {
            System.out.println("Sorry! " +applicant.getFirstName()+" "+applicant.getLastName()+ " you have not been admitted.");
        }
    }

    @Override
    public void expelledStudent(Principal principal, Person person) {

        System.out.println(person.getFirstName()+" "+person.getLastName()+", Sorry you have been expelled from the school by "
                +principal.getFirstName()+" "+principal.getLastName());
    }
}
