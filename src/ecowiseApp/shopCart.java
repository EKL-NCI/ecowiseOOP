/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Erin Lee
 */
public class shopCart extends product{
    public double totalPrice;
    
    //instance of GUI
    EcowiseGUI ecowise = new EcowiseGUI();
    
    public shopCart(String name, String productId, double price, double totalPrice){
        super(name, productId, price);
        this.totalPrice = totalPrice;
    }
    
    public shopCart(){
        super();
        totalPrice = 0;
    }

    public void setTotalPrice(int quantity) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
    
    // method to calculate total of cart
    public double calTotal(ArrayList <product> products){
        for(product p : products){
            totalPrice += p.getPrice();
        }
        
        return totalPrice;
    }   
}
