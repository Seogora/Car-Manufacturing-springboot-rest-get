/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.car.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author User
 */
@RestController 
@RequestMapping(Controller.CAR_BASE_URI)
public class Controller {
    public static final String CAR_BASE_URI = "svc/v1/car";
   
    public Car getCar(@PathVariable final int contractNumber){
    
        Car car = new Car();
        
        car.setManufacturer("Perodua");  
        car.setName("Myvi");
        
        return car;            
    }
}
