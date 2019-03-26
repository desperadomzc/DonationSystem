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
public class Dairy extends Food {

    public Dairy(int quantity, Date ed) {
        super(FoodType.Dairy.getValue(),quantity,ed,10,50,40);
    }
    
}
