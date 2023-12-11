/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 * Calculates money saved from reverting into sustainable energy, extended from the main class Calculator
 * @author paul paus
 */
public class RenewableEnergy extends Calculator{
    //data variable to take in cost of electricity and mode of renewable energy system
    private double costPerHour, installCost, monthlyProduction;
    
    //constructors - default    
    public RenewableEnergy(){
        super();
        costPerHour = 0;
        installCost = 0; 
        monthlyProduction = 0;
    }

    //constructors - with parameter 
    //constructing super from Calculator   
    public RenewableEnergy(double costPerHour, double installCost, double monthlyProduction, double dryer, double tv, double kettle, double waterHeater, double appliances, double washingMachine, double freezer, double mComp){
        super(dryer, tv, kettle, waterHeater, appliances, washingMachine, freezer, mComp);
        this.costPerHour = costPerHour;
        this.installCost = installCost;
        this.monthlyProduction = monthlyProduction;
        }
    
    //get methods - one for every output
    //set methods - one for every input    
        
    public double getCostPerHour() {
        return costPerHour;
    }
    
    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }
    
    public double getInstallCost() {
        return installCost;
    }

    public void setInstallCost(double installCost) {
        this.installCost = installCost;
    }
    
    public double getMonthlyProduction() {
        return monthlyProduction;
    }

    public void setMonthlyProduction(double monthlyProduction) {
        this.monthlyProduction = monthlyProduction;
    }
    
   //computing method in order to calculate saved costs, using method from Calculator with the super    
    @Override
    public double getmComp(){
        return installCost/((monthlyProduction-super.getmComp())*costPerHour);
    }
}
