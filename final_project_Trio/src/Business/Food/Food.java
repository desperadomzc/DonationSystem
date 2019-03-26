/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import Business.Enterprise.Enterprise;
import java.util.Date;
import Business.UserAccount.UserAccount;

/**
 *
 * @author 帅的一匹
 */
public abstract class Food {
    private static int count = 0;
    private String name;
    private int quantity;
    private Date expirationDate;
    private int carbonHydratePerCentage;
    private int proteinPerCentage;
    private int fatPerCentage;
    private String foodId;
    private Enterprise from;
    private UserAccount donor;
    private String description;
    private String testStatus;

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public UserAccount getDonor() {
        return donor;
    }

    public void setDonor(UserAccount donor) {
        this.donor = donor;
    }
    
    

    public Enterprise getFrom() {
        return from;
    }

    public void setFrom(Enterprise from) {
        this.from = from;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getCarbonHydratePerCentage() {
        return carbonHydratePerCentage;
    }

    public int getProteinPerCentage() {
        return proteinPerCentage;
    }

    public int getFatPerCentage() {
        return fatPerCentage;
    }

    public String getFoodId() {
        return foodId;
    }
    
    public enum FoodType{
        Beverage("Beverage"),Vegetable("Vegetable"),Meat("Meat"),Eggs("Eggs"),Snacks("Snacks"),Cereals("Cereal"),Dairy("Dairy"),Fruit("Fruit");
        
        private String value;
        private  FoodType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public Food(String name,int quantity,Date expireDate,int cp,int pp, int fp){
        this.carbonHydratePerCentage = cp;
        this.proteinPerCentage = pp;
        this.fatPerCentage = fp;
        this.name = name;
        this.expirationDate = expireDate;
        this.quantity = quantity;
        count++;
        this.foodId = name + count;
    }
    
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
