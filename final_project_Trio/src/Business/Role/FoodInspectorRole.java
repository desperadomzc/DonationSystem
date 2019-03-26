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
import UserInterface.EnterpriseManager.ManagerWorkAreaJPanel;
import UserInterface.FoodInspectorRole.InspectFoodJPanel;
import javax.swing.JPanel;

/**
 *
 * @author 帅的一匹
 */
public class FoodInspectorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network city,Business business) {
        return new InspectFoodJPanel(userProcessContainer,account,organization,enterprise,city,business);
    }
}
