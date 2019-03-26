/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author 帅的一匹
 */
public class ConfigureASystem {
    public static Business configure(){
        Business business = Business.getinstance();
        
        
        Employee employee = business.getEmployeeDirectory().createEmployee("MainAdmin");
        UserAccount ua = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SysAdminRole());
        
        return business;
    }
}
