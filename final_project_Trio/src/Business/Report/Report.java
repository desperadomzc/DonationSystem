/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Report;

import Business.Food.Food;
import Business.Refrigerator.refrigerator;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author 帅的一匹
 */
public class Report {
    private Food food;
    private Date takenDate;
    private UserAccount user;
    private refrigerator refrigerator;

    public Report(){
        takenDate = new Date();
    }

    public refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }
    
    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Date getTakenDate() {
        return takenDate;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }
    
    @Override
    public String toString(){
        return this.takenDate.toString();
    }
}
