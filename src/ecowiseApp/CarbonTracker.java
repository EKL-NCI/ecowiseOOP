/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 *
 * @author paul paus
 */
public class CarbonTracker extends Calculator{
    private double gasComp;

    public CarbonTracker(double gasComp, double dryer, double tv, double kettle, double waterHeater, double appliances, double washingMachine, double freezer, double mComp) {
        super(dryer, tv, kettle, waterHeater, appliances, washingMachine, freezer, mComp);
        this.gasComp = gasComp;
    }
    
    public CarbonTracker() {
        gasComp = 0;
    }

    public double getGasComp() {
        return gasComp;
    }

    public void setGasComp(double gasComp) {
        this.gasComp = gasComp;
    }
    
    @Override
    public double getmComp(){
        return ((super.getmComp() * 0.4) + (gasComp * 2.31));    
    }
    
}
