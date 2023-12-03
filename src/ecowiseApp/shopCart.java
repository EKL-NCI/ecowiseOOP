/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

import java.util.ArrayList;
/**
 *
 * @author Erin Lee
 */
public class shopCart extends product{
    public int quantity;
    
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
    private void calTotal(){
        
    }
    
    //add + remove items from cart
    public void addCart(){
        
    }
    
    public void remCart(){
        
    }
    
}
