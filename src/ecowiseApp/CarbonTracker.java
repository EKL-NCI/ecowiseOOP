/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 * Calculate carbon foot print, extended from the main class Calculator
 * @author paul paus
 */
public class CarbonTracker extends Calculator{
    //data variable to take in gas consumption
    private double gasComp;

    //constructors - default  
    public CarbonTracker() {
        gasComp = 0;
    }
    
    //constructors - with parameter     
    //constructing super from Calculator      
    public CarbonTracker(double gasComp, double dryer, double tv, double kettle, double waterHeater, double appliances, double washingMachine, double freezer, double mComp) {
        super(dryer, tv, kettle, waterHeater, appliances, washingMachine, freezer, mComp);
        this.gasComp = gasComp;
    }

    //get methods - one for every output
    //set methods - one for every input    
    
    public double getGasComp() {
        return gasComp;
    }

    public void setGasComp(double gasComp) {
        this.gasComp = gasComp;
    }
    
    //computing method in order to calculate carbon footprint, using same method from Calculator with the super
    @Override
    public double getmComp(){
        return ((super.getmComp() * 0.4) + (gasComp * 2.31));    
    }
    
}
