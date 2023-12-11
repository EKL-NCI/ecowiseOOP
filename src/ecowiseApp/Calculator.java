/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 * Calculate monthly consumption of electricity
 * @author paul paus
 */

public class Calculator {
    //different modes of electricty usage in home as my data members
    private double dryer, tv, kettle, waterHeater, appliances, washingMachine, freezer, mComp;
    
    //constructors - default
    public Calculator(){
        dryer = 0;
        tv = 0;
        kettle = 0;
        waterHeater = 0;
        appliances = 0;
        washingMachine = 0;
        freezer = 0;
        mComp = 0;
        
    }
    
    //constructors - with parameter 
    public Calculator(double dryer, double tv, double kettle, double waterHeater, double appliances, double washingMachine, double freezer, double mComp){
        this.dryer = dryer;
        this.tv = tv;
        this.kettle = kettle;
        this.waterHeater = waterHeater;
        this.appliances = appliances;
        this.washingMachine = washingMachine;
        this.freezer = freezer;
        this.mComp = mComp;

    }
    
    //get methods - one for every output
    //set methods - one for every input
    
    public double getDryer() {
        return dryer;
    }
    
    public void setDryer(double dryer) {
        this.dryer = dryer;
    }

    public double getTv() {
        return tv;
    }

    public void setTv(double tv) {
        this.tv = tv;
    }

    public double getKettle() {
        return kettle;
    }
    
    public void setKettle(double kettle) {
        this.kettle = kettle;
    }

    public double getAppliances() {
        return appliances;
    }
    
    public void setAppliances(double appliances) {
        this.appliances = appliances;
    }    
    
    public double getWashingMachine() {
        return washingMachine;
    }
    
    public void setWashingMachine(double washingMachine) {
        this.washingMachine = washingMachine;
    }  

    public double getWaterHeater() {
        return waterHeater;
    }

    public void setWaterHeater(double waterHeater) {
        this.waterHeater = waterHeater;
    }
    
    public double getFreezer() {
        return freezer;
    }
    
    public void setFreezer(double freezer) {
        this.freezer = freezer;
    }
    
    
    //computing method, will become super 
    public double getmComp(){
      return (dryer + tv + kettle + waterHeater + appliances + washingMachine + freezer) * 30;
    } 
    
}
