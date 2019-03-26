/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Refrigerator;

import Business.Food.FoodDirectory;

/**
 *
 * @author 帅的一匹
 */
public class drawer {
    private FoodDirectory foodList;
    private int drawerId;
    
    public drawer(int id){
        this.foodList = new FoodDirectory();
        this.drawerId = id;
    }

    public FoodDirectory getFoodList() {
        return foodList;
    }

    public void setFoodList(FoodDirectory foodList) {
        this.foodList = foodList;
    }

    public int getDrawerId() {
        return drawerId;
    }
    
    @Override
    public String toString(){
        return String.valueOf(drawerId);
    }
}
