/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Food.FoodDirectory;
import Business.Role.Role;
import Business.Workqueue.Workqueue;
import com.sun.corba.se.spi.orbutil.threadpool.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class FoodStorageEnterprise extends Enterprise{
    private FoodDirectory foodlist;
    private Workqueue workqueue;
    
    public FoodStorageEnterprise(String name){
        super(name,EnterpriseType.FoodStorage);
        foodlist=new FoodDirectory();
        workqueue=new Workqueue();
    }
     public FoodDirectory getFoodlist() {
        return foodlist;
    }

    public void setFoodlist(FoodDirectory foodlist) {
        this.foodlist = foodlist;
    }
    
    public Workqueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(Workqueue workqueue) {
        this.workqueue = workqueue;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
