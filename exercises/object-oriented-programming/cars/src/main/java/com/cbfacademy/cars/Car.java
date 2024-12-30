package com.cbfacademy.cars;

import java.util.List;

import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;

public class Car {
 
    private String make;
    private String model;
    private String colour;
    private int year;


public Car(String make, String model, String colour, int year){
    this.colour= colour;
    this.make = make;
    this.model = model;
    this.year=year;
}

    public String getMake() {
        return make;
    }// returns the car make

    public String getModel() {
        return model;
    }//returns the car model

    public int getYear() {
        return year;
    }//returns the year the car was made
    
    public String getColour(){
            return colour;
    } //returns the colour of the car

    public void setColour(String colour) {
        this.colour = colour;
    } //sets the colour of the car

   public String getDetails() {
        String details = String.format(
            "I drive %s, %s ,%s ,%s",
             this.colour,this.make,this.model,this.year
             );
             return details;
    }



}