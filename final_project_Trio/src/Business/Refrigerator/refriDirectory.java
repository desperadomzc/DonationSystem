/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Refrigerator;

import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class refriDirectory {
    private ArrayList<refrigerator> refrilist;
    
    public refriDirectory(){
        this.refrilist = new ArrayList<>();
    }

    public ArrayList<refrigerator> getRefrilist() {
        return refrilist;
    }

    
    public refrigerator createNewRefrigerator(String address){
        refrigerator r = new refrigerator(address);
        this.refrilist.add(r);
        return r;
    }
}
