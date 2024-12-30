package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
 
    //private List<Car> thelistofcars;
    
        public List<Car> getCars () {
          List<Car> cars = new ArrayList<>();
            Car car1 = new Car ("Volvo", "V40","blue",2012);
          Car car2 = new Car ("Porsche", "Panamera","red",2009);
            Car car3 = new Car ("Audi", "A3","grey",2018);
            cars.add(car1);
            cars.add(car2);
            cars.add(car3);
    System.out.println("My car:" + car1.getMake() + " " + car1.getModel() + "'" + car1.getColour() + " " + "Year: " + car1.getYear());
    System.out.println("My car:" + car2.getMake() + " " + car2.getModel() + "'" + car2.getColour() + " " + "Year: " + car2.getYear());
    System.out.println("My car:" + car3.getMake() + " " + car3.getModel()+ "'" + car3.getColour() + " " + "Year: " + car3.getYear());
    return cars;
    }
}




