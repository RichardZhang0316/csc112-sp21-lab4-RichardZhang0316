// Car class which inherits (extends) the Vehicle class
//
//  David John
//  March 2021
//
// Cars have additional information:
//      model name
//      window tint
//      number of doors

public class Car extends Vehicle {

    private String CmodelName;      // vehicle model
    private boolean Cwindowtint;    // tinted windows
    private int Cnumdoors;          // number of doors


    // Car constructor
    public Car(String Xtag, String Xvin, double Xpprice, int Xpyear, String XmodelName,
               boolean Xwt, int Xnd){


    }

    // overrides Vehicle method
    public Venum getType(){
        return Venum.car;
    }

    // overrides Vehicle method
    public double getTax(){
        return 0.00;
    }

    // overrides Vehicle method
    public String toString(){
        return "???";
    }
}
