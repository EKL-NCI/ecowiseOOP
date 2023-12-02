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
    private double /*yearComp,*/ gasComp, kmDriven, totalEmissions;

    public CarbonTracker(/*double yearComp,*/ double gasComp, double kmDriven, double totalEmissions, double dryer, double tv, double kettle, double waterHeater, double appliances, double washingMachine, double freezer, double mComp) {
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
    public double getYearComp() {
        return yearComp;
    }

    public void setYearComp(double yearComp) {
        this.yearComp = yearComp;
    }
    */

    public double getGasComp() {
        return gasComp;
    }

    public void setGasComp(double gasComp) {
        this.gasComp = gasComp;
    }

    public double getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(double kmDriven) {
        this.kmDriven = kmDriven;
    }

    public double getTotalEmissions() {
        return totalEmissions;
    }

    public void setTotalEmissions(double totalEmissions) {
        this.totalEmissions = totalEmissions;
    }
    
    @Override
    public double getmComp(){
        return ((super.getmComp()*12)*1)+(gasComp*2);    
    }
    
}
