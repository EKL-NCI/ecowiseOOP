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
    public int quantity;
    public double totalPrice;
    
    EcowiseGUI ecowise = new EcowiseGUI();
    
    public shopCart(String name, String productId, double price, int quantity){
        super(name, productId, price);
        this.quantity = quantity;
    }
    
    public shopCart(){
        super();
        quantity = 0;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    
    // keep track of total quantity in cart
    public void incQuantity(){
        this.quantity++;
    }
    
    public void decQuantity(){
        if(this.quantity > 0){
            this.quantity--;
        }
    }
    
    // method to calculate total of cart
    public double calTotal(ArrayList <product> products){
        for(product p : products){
            totalPrice += p.getPrice();
        }
        
        return totalPrice;
    }
    
    //add + remove items from cart
    
    public void remCart(ArrayList <product> products){
       if(products.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sorry, there are no items to delete");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null, "Enter the ID you wish to delete:");

            for(product p:products){
                if(p.getProductId().equalsIgnoreCase(searchTerm)){
                    products.remove(p);
                    JOptionPane.showMessageDialog(null,p.toString()+" has been deleted.");
                }
            }
        }
    }
    
}
