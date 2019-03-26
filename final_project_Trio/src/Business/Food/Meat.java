/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import java.util.Date;

/**
 *
 * @author 帅的一匹
 */
class Meat extends Food {

    public Meat(int quantity, Date ed) {
        super(FoodType.Cereals.getValue(),quantity,ed,0,70,30);
    }
    
}
