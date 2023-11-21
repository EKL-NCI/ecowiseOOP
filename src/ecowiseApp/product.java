/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

/**
 *
 * @author erink
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
        
    @Override
    public String toString(){
        return "Product{" + "price=" + price + ", name=" + name + ", productId=" + productId + '}';
    }
}
