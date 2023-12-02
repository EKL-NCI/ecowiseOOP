/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 *
 * @author Paul P
 */
public class RenewableEnergy extends Calculator{
    private double costPerHour, installCost, monthlyProduction /*,payBackPeriod*/;
    
    public RenewableEnergy(double costPerHour, double installCost, double monthlyProduction, /*double payBackPeriod,*/ double dryer, double tv, double kettle, double waterHeater, double appliances, double washingMachine, double freezer, double mComp){
        super(dryer, tv, kettle, waterHeater, appliances, washingMachine, freezer, mComp);
        this.costPerHour = costPerHour;
        this.installCost = installCost;
        this.monthlyProduction = monthlyProduction;
        //this.payBackPeriod = payBackPeriod;
        }
    
    public RenewableEnergy(){
        super();
        costPerHour = 0;
        installCost = 0; 
        monthlyProduction = 0;
        //payBackPeriod = 0;
    }

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
    
    /*
    public double getPayBackPeriod() {
        return payBackPeriod;
    }

    public void setPayBackPeriod(double payBackPeriod) {
        this.payBackPeriod = payBackPeriod;
    }
    */
    
    @Override
    public double getmComp(){
        return installCost/((super.getmComp()-monthlyProduction)*costPerHour);
    }
}
