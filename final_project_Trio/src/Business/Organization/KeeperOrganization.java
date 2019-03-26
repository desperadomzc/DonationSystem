/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.KeeperRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
class KeeperOrganization extends Organization {

    public KeeperOrganization() {
        super(Organization.Type.Keeper.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new KeeperRole());
        return roles;
    }
}
