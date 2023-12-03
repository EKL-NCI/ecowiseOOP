/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecowiseApp;

import java.util.ArrayList;

/**
 *
 * @author erink
 */
public class customer {
    
    private String name;
    private String phoneNo;
    private String address;
    private String city;
    private String county;
    
    private String cardName;
    private String cardNo;
    private String expiry;
    private String cvv;
    
    public customer(){
        name = " ";
        phoneNo = " ";
        address = " ";
        city = " ";
        county = " ";
        
        cardName = " ";
        cardNo = " ";
        expiry = " ";
        cvv = " ";
    }
    
    public customer(String name, String phoneNo, String address, String city, String county, String cardName, String cardNo, String expiry, String cvv) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.city = city;
        this.county = county;
        
        this.cardName = cardName;
        this.cardNo = cardNo;
        this.expiry = expiry;
        this.cvv = cvv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
    
    

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    
}
