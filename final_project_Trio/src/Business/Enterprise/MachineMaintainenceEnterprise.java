/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class MachineMaintainenceEnterprise extends Enterprise{
    public MachineMaintainenceEnterprise(String name){
        super(name,Enterprise.EnterpriseType.MashineMaintainence);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
