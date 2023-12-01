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
public class shopCart {
    private product product;
    private int quantity;
    
    public shopCart(product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public product getProduct() {
        return product;
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
