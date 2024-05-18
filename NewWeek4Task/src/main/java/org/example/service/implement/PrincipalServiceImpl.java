package org.example.service.implement;

import org.example.model.Principal;
import org.example.service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public void PrincipalData(Principal principal) {
        System.out.println("Fullname: "+ principal.getFirstName()+" "+principal.getLastName()+"\n"
                + "Age: "+ principal.getAge()+ "\n"+ "Gender: "+principal.getGender());

    }
}
