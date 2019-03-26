/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization o = null;
        if(type == Organization.Type.Delivery){
            o = new DeliveryOrganization();
            this.organizationList.add(o);
        }else if(type == Organization.Type.Donor){
            o = new DonorOrganization();
            this.organizationList.add(o);
        }else if(type == Organization.Type.Keeper){
            o = new KeeperOrganization();
            this.organizationList.add(o);
        }else if(type == Organization.Type.Lab){
            o = new LabOrganization();
            this.organizationList.add(o);
        }else if(type == Organization.Type.Homeless){
            o = new HomelessOrganization();
            this.organizationList.add(o);
        }else if(type == Organization.Type.Technician){
            o = new TechnicianOrganization();
            this.organizationList.add(o);
        }
        return o;
    }
}
