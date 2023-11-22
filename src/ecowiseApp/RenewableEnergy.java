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
    private int costPerHour, installCost, monthlyProduction /*,payBackPeriod*/;
    
    public RenewableEnergy(int costPerHour, int installCost, int monthlyProduction, /*int payBackPeriod,*/ int dryer, int tv, int kettle, int waterHeater, int appliances, int washingMachine, int freezer, int mComp){
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

    public int getCostPerHour() {
        return costPerHour;
    }
    
    public void setCostPerHour(int costPerHour) {
        this.costPerHour = costPerHour;
    }
    
    public int getInstallCost() {
        return installCost;
    }

    public void setInstallCost(int installCost) {
        this.installCost = installCost;
    }
    
    public int getMonthlyProduction() {
        return monthlyProduction;
    }

    public void setMonthlyProduction(int monthlyProduction) {
        this.monthlyProduction = monthlyProduction;
    }
    
    /*
    public int getPayBackPeriod() {
        return payBackPeriod;
    }

    public void setPayBackPeriod(int payBackPeriod) {
        this.payBackPeriod = payBackPeriod;
    }
    */
    
    @Override
    public int getmComp(){
        return installCost/((super.getmComp()-monthlyProduction)*costPerHour);
    }
}
