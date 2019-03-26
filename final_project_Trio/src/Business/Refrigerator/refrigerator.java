/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Refrigerator;

import Business.Food.FoodDirectory;
import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class refrigerator {
    private String address;
    private ArrayList<drawer> drawers;
    private int refrigeratorId;
    private static int count = 1;
    private String status;
    
    public refrigerator(String address){
        this.status = "Works well";
        this.drawers = new ArrayList<>();
        for(int i=0;i<9;i++){
            this.drawers.add(new drawer(i+1));
        }
        this.refrigeratorId = count;
        this.address = address;
        count++;
    }

    public ArrayList<drawer> getDrawers() {
        return drawers;
    }

    public int getRefrigeratorId() {
        return refrigeratorId;
    }

    public String getAddress() {
        return address;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        refrigerator.count = count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return this.address;
    }
}
