/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 帅的一匹
 */
public class FoodDirectory {
    private ArrayList<Food> foodlist;

    public ArrayList<Food> getFoodlist() {
        return foodlist;
    }
    
    public FoodDirectory(){
        foodlist = new ArrayList();
    }
    
    public Food createFood(Food.FoodType type,int quantity,Date ed){
        Food f = null;
        if(type==Food.FoodType.Beverage){
            f = new Beverage(quantity,ed);
        }else if(type==Food.FoodType.Cereals){
            f = new Cereals(quantity,ed);
        }else if(type==Food.FoodType.Dairy){
            f = new Dairy(quantity,ed);
        }else if(type==Food.FoodType.Eggs){
            f = new Eggs(quantity,ed);
        }else if(type==Food.FoodType.Fruit){
            f = new Fruit(quantity,ed);
        }else if(type==Food.FoodType.Meat){
            f = new Meat(quantity,ed);
        }else if(type==Food.FoodType.Snacks){
            f = new Snacks(quantity,ed);
        }else if(type==Food.FoodType.Vegetable){
            f = new Vegetable(quantity,ed);
        }
        this.foodlist.add(f);
        return f;
    }
}
