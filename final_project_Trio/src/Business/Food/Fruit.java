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
class Fruit extends Food {

    public Fruit(int quantity, Date ed) {
        super(FoodType.Fruit.getValue(),quantity,ed,100,0,0);
    }
    
}
