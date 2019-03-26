/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Food.FoodDirectory;
import Business.Refrigerator.refriDirectory;
import Business.Report.Report;
import Business.Workqueue.Workqueue;
import java.util.ArrayList;

/**
 *
 * @author 帅的一匹
 */
public class Network {
    private String name;
    private Workqueue workqueue;
    
    private EnterpriseDirectory enterpriseDir;
    private FoodDirectory foodDir;
    private refriDirectory refriDir;
    private ArrayList<Report> reportList;
    
    public Network(){
        enterpriseDir = new EnterpriseDirectory();
        foodDir = new FoodDirectory();
        workqueue = new Workqueue();
        refriDir = new refriDirectory();
        reportList = new ArrayList<>();
    }

    public Workqueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(Workqueue workqueue) {
        this.workqueue = workqueue;
    }

    public ArrayList<Report> getReportList() {
        return reportList;
    }

    public FoodDirectory getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(FoodDirectory foodDir) {
        this.foodDir = foodDir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDir() {
        return enterpriseDir;
    }

    public void setEnterpriseDir(EnterpriseDirectory enterpriseDir) {
        this.enterpriseDir = enterpriseDir;
    }

    public refriDirectory getRefriDir() {
        return refriDir;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
