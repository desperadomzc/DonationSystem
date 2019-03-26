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
public class Eggs extends Food {

    public Eggs(int quantity, Date ed) {
        super(FoodType.Eggs.getValue(),quantity,ed,0,60,40);
    }
    
}
