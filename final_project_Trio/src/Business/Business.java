/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import java.util.ArrayList;


/**
 *
 * @author 帅的一匹
 */
public class Business extends Organization{
    private static Business business;
    private ArrayList<Network> networkList;
    
    public static Business getinstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
   
    /**
     *
     * @return
     */
    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SysAdminRole()); 
        return getSupportedRole();
    }
    
    
    private Business(){
        super(null);
        this.networkList = new ArrayList<Network>();
    }

    public static Business getBusiness() {
        return business;
    }

    public static void setBusiness(Business business) {
        Business.business = business;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }

    
}
