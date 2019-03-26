/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import Business.Food.Food;
import Business.Refrigerator.refrigerator;

/**
 *
 * @author 帅的一匹
 */
public class DeliverWorkRequest extends WorkRequest{
    private refrigerator refrigerator;
    public DeliverWorkRequest(){
        super(workType.Deliver);
    }
    public refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }
    public boolean hasRef(){
        if(this.refrigerator==null) {
            return false;
        }
        else return true;
    }
}
