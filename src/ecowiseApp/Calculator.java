/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 *
 * @author erink
 */
public class Calculator {
    private int dryer, tv, kettle, waterHeater, appliances, washingMachine, freezer, mComp;
    
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
    
    public Calculator(int dryer, int tv, int kettle, int waterHeater, int appliances, int washingMachine, int freezer, int mComp){
        this.dryer = dryer;
        this.tv = tv;
        this.kettle = kettle;
        this.waterHeater = waterHeater;
        this.appliances = appliances;
        this.washingMachine = washingMachine;
        this.freezer = freezer;
        this.mComp = mComp;

    }

    public int getDryer() {
        return dryer;
    }

    public void setDryer(int dryer) {
        this.dryer = dryer;
    }

    public int getTv() {
        return tv;
    }

    public void setTv(int tv) {
        this.tv = tv;
    }

    public int getKettle() {
        return kettle;
    }
    
    public void setKettle(int kettle) {
        this.kettle = kettle;
    }

    public int getAppliances() {
        return appliances;
    }
    
    public void setAppliances(int appliances) {
        this.appliances = appliances;
    }    
    
    public int getWashingMachine() {
        return washingMachine;
    }
    
    public void setWashingMachine(int washingMachine) {
        this.washingMachine = washingMachine;
    }  

    public int getWaterHeater() {
        return waterHeater;
    }

    public void setWaterHeater(int waterHeater) {
        this.waterHeater = waterHeater;
    }
    
    public int getFreezer() {
        return freezer;
    }
    
    public void setFreezer(int freezer) {
        this.freezer = freezer;
    }
    
    public int getmComp(){
      return (dryer + tv + kettle + waterHeater + appliances + washingMachine + freezer) * 30;
    }
    
    /*
    public int getmComp() {
        return mComp;
    }
    */
}
