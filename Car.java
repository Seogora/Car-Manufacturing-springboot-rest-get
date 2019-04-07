/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.car.hello;

/**
 *
 * @author User
 */
public class Car {
    
    private String manufacturer;
    private String name;
    
    public String getManufacturer(){return manufacturer;}
    public void setManufacturer(){this.manufacturer = manufacturer;}
    
    public String getName(){return name;}
    public void setName(){this.name = name;}

    void setManufacturer(String perodua) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setName(String myvi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
