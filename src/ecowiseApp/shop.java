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
public class shop {
    private ArrayList <product> products;
    
        public shop(){
            products = new ArrayList<>();
            
            products.add(new product("Donate!", "DN001", 5.00));
            products.add(new product("Donate!", "DN002", 10.00));
            products.add(new product("Easy Time Slow Cooker", "AP001", 49.99));
            products.add(new product("Pro 4.7L Air Fryer", "AP002", 99.99));
            products.add(new product("Combination Microwave MWH 338 SX", "AP003", 329.90));
            products.add(new product("Microwave RHMD714G", "AP004", 99.99));
            products.add(new product("Enfinigy Kettle Pro", "AP005", 129.00));
            products.add(new product("VTT981 Edge 2 Slice Toaster", "AP006", 40.00));
            products.add(new product("50/50 Frost Free Frdige Freezer", "AP007", 500.00));
            products.add(new product("iQ300 Freestanding Dishwasher", "AP008", 770.00));
            products.add(new product("Sage CombiWave 3in1", "AP009", 220.00));
            products.add(new product("EK4548 Dual Airfryer", "AP010", 149.90));
            products.add(new product("Pro Combo 10in1 Airfryer", "AP011", 109.99));
            products.add(new product("Good to Go MultiCooker", "AP012", 84.00));
            products.add(new product("Wahl ZX929 Digital Slow Cooker", "AP013", 50.49));   
        }
    
        
        
}
