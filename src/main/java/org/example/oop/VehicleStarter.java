package org.example.oop;

import java.nio.file.spi.FileSystemProvider;

public class VehicleStarter {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        Ford ford = new Ford(10);
        ford.start(20);
        Tesla tesla = new Tesla(20);
        tesla.start();

    }
}
