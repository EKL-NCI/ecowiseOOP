/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 *
 * @author Paul P
 */
public class CarbonTracker extends Calculator{
    private int /*yearComp,*/ gasComp, kmDriven, totalEmissions;

    public CarbonTracker(/*int yearComp,*/ int gasComp, int kmDriven, int totalEmissions, int dryer, int tv, int kettle, int waterHeater, int appliances, int washingMachine, int freezer, int mComp) {
        super(dryer, tv, kettle, waterHeater, appliances, washingMachine, freezer, mComp);      
        //this.yearComp = yearComp;
        this.gasComp = gasComp;
        this.kmDriven = kmDriven;
        this.totalEmissions = totalEmissions;
    }
    
    public CarbonTracker() {
        //yearComp = 0;
        gasComp = 0;
        kmDriven = 0;
        totalEmissions = 0;
    }
    
    /*
    public int getYearComp() {
        return yearComp;
    }

    public void setYearComp(int yearComp) {
        this.yearComp = yearComp;
    }
    */

    public int getGasComp() {
        return gasComp;
    }

    public void setGasComp(int gasComp) {
        this.gasComp = gasComp;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

    public int getTotalEmissions() {
        return totalEmissions;
    }

    public void setTotalEmissions(int totalEmissions) {
        this.totalEmissions = totalEmissions;
    }
    
    @Override
    public int getmComp(){
        return ((super.getmComp()*12)*1)+(gasComp*2);    
    }
    
}
