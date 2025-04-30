public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double fuel;
    private boolean operational;

    public Vehicle(String ma, String mo, int y, double f) {
        make = ma;
        model = mo;
        year = y;
        fuel = f;
    }

    public void fuel() {
        if (fuel > 0) {

            // isOn=false){
            // if(isOn=false);
            operational = true;

        } else {
            operational = false;
        }
    }

    public void drive() {
        if (fuel >= 10) {
            fuel -= 10;
            operational = true;
        } else {
            operational = false;
        }

    }
 public void refuel(double amount){
    fuel += amount;
    
 }
 public String toString() {
    return ("Make: " + make + ","+ " Model: " + model +  "," + " Year: " +  year + "," + " Fuel: " + fuel +",");
}
}
