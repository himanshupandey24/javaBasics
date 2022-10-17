package org.example.oop;

public class Tesla extends Vehicle{
    int charge;
    public Tesla(int charge){
        this.charge = charge;
    }

    @Override
    void start() {
        if(charge <= 0)
            throw new IllegalStateException("Low Charge");
        else
            super.start();
    }
}
