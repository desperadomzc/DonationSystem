/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

/**
 *
 * @author linhchen
 */
public class InspectorWorkRequest extends WorkRequest{
    
    public InspectorWorkRequest(){
        super(WorkRequest.workType.Inspector);
    }
    
}
