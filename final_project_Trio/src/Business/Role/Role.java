/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author 帅的一匹
 */
public abstract class Role {
    public enum RoleType{
        Keeper("Keeper Role"),Donor("Donor Role"),FoodInspector("Food Inspector Role"),
        Homeless("Homeless Role"),Deliver("Deliver Role"),Admin("Admin Role"),Technician("Technician Role");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            Network city,
            Business business);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
