/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import Business.Food.Food;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author 帅的一匹
 */
public abstract class WorkRequest {
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String fLocation;
    private String tLocation;
    private static int count=1;
    private workType worktype;
    private int workId;
    private Food food;
    
    public enum workType{
        Deliver("DeliverWork"),Keeper("KeeperWork"),Inspector("InspectorWork"),Technician("TechnicianWork");
        
        private String value;
        
        private workType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String  toString(){
            return this.value;
        }
        
    }
    
    public WorkRequest(workType type){
        this.worktype = type;
        this.workId = count;
        this.requestDate = new Date();
        count++;
        
    }

    public workType getWorktype() {
        return worktype;
    }

    public int getWorkId() {
        return workId;
    }
    
    public String getfLocation() {
        return fLocation;
    }

    public void setfLocation(String fLocation) {
        this.fLocation = fLocation;
    }

    public String gettLocation() {
        return tLocation;
    }

    public void settLocation(String tLocation) {
        this.tLocation = tLocation;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
    
    @Override
    public String toString(){
        return String.valueOf(workId);
    }
}
