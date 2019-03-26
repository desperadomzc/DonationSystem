/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import Business.Refrigerator.refrigerator;

/**
 *
 * @author 帅的一匹
 */
public class TechnicianWorkRequest extends WorkRequest{
    
    private refrigerator r;
    
    public TechnicianWorkRequest(){
        super(workType.Technician);
    }

    public refrigerator getR() {
        return r;
    }

    public void setR(refrigerator r) {
        this.r = r;
    }
    
}
