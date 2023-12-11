/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 *
 * @author Erin Lee
 */
public class product {
    protected double price;
    protected String name;
    protected String productId;
    
    public product(){
        price = 0.0;
        name = " ";
        productId = " ";
    }
    
    public product(String name, String productId, double price){
        this.price = price;
        this.name = name;
        this.productId = productId;
    }
    
    //setters and getters for product info
    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getProductId() {
        return productId;
    }
      
    
    //override toString so array information would print correctly
    @Override
    public String toString(){
        return  name + "   EUR:  " + price + " Product Code: "+ productId;
    }
    
    // get details method for remove product button 
    public String getDetail(){
        return  name + " Product Code: "+ productId;
    }
}