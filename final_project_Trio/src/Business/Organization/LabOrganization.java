/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodInspectorRole;
import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author 帅的一匹
 */
class LabOrganization extends Organization {

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodInspectorRole());
        return roles;
    }
}
