// Base class vehicle
//
// David John
// March 2021


import java.util.Calendar;

public class Vehicle {

    public static enum Venum  {car, truck, motorcycle, vehicle};
    private static int CurrentYear = Calendar.getInstance().get(Calendar.YEAR);

    private String Vtag;            // tag number
    private String Vvin;            // vehicle identification number
    private double Vpurchaseprice;  // vehicle purchase price
    private int  Vpurchaseyear;     // vehicle purchase year



    // Vehicle constructor
    public Vehicle(String Xtag, String Xvin, double Xpprice, int Xpyear){

    }


    // get tag
    public String getTag(){
        return this.Vtag;
    }

    // get type of vehicle
    public Venum getType(){
        return Venum.vehicle;
    }

    // basic vehicle tax based on purchase price, depreciated over 10 years
    public double getTax(){
    }

    // overrides Object method
    public String toString(){ return "???" ;}
}
