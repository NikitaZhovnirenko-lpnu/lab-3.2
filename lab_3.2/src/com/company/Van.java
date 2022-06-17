package com.company;

import java.util.Scanner;

public class Van extends Car {
    private double cargoCapacity;

    private Scanner sc = new Scanner(System.in);

    public Van(String producer, String colour, double tankVolume, double power, double cargoCapacity) {
        super(producer, colour, tankVolume, power);
        this.cargoCapacity = cargoCapacity;
    }

    public Van(){}

    public Van(Van van){
        cargoCapacity = van.cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity() {
        do {
            System.out.print("Уведіть вантожопідйомність (більше одиниці): ");
            this.cargoCapacity = sc.nextDouble();
        }while (this.cargoCapacity <= 0);


    }

    @Override
    protected void finalize() {
        super.finalize();
        System.out.println("Van has been garbage collected.");
    }

    @Override
    public String toString() {
        return "Van{" +
                "brand='" + super.getBrand() + '\'' +
                ", colour='" + super.getColour() + '\'' +
                ", tankVolume=" + super.getTankVolume() +
                ", power=" + super.getPower() +
                ", cargoCapacity=" + cargoCapacity +
                '}';
    }
}
