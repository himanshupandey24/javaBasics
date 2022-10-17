package org.example.oop;

public class Ford extends Vehicle{
    int fuel;
    public Ford(int fuel){
        this.fuel = fuel;
    }

    //@Override //Override is necessary so as not to overload when it has to be override
    void start(int fuel) {
        if(fuel <= 0)
            throw new IllegalStateException("Low Fuel");
        else
            super.start();
    }
}