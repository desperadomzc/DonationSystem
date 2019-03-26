/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ManagerRole;
import Business.Role.Role;
import Business.Role.TechnicianRole;
import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class TechnicianOrganization extends Organization{
    public TechnicianOrganization(){
        super(Organization.Type.Technician.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TechnicianRole());
        return roles;
    }
}
