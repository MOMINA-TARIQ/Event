/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.event;

/**
 *
 * @author Momina
 */
public abstract class Wedding {
    
    String hallName;
    double priceHall;
    double decorationPrice;
    double entryPrice;
    double danceFloorAmount;
  
    
    
    public abstract void hallBooking();
    public abstract void discount();
    public abstract void setPriceHall(double p) ;
    public abstract void setDecorationPrice(double d) ;
    public abstract void setEntryPrice(double e) ;
    public abstract void setDanceFloorAmount(double f) ;
}
     

    