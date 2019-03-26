/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<>();
    }
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise e = null;
        if(type == Enterprise.EnterpriseType.Deliever){
            e = new DelieverEnterprise(name);
        }else if(type == Enterprise.EnterpriseType.Donation){
            e = new DonationEnterprise(name);
        }else if(type == Enterprise.EnterpriseType.FoodStorage){
            e = new FoodStorageEnterprise(name);
        }else if(type == Enterprise.EnterpriseType.MashineMaintainence){
            e = new MachineMaintainenceEnterprise(name);
        }
        this.enterpriseList.add(e);
        return e;
    }
}
