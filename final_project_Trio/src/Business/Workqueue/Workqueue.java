/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class Workqueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public Workqueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
}
