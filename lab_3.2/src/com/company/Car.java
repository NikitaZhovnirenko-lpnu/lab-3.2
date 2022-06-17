package com.company;

import java.util.Scanner;

public class Car {
    private String brand;
    private String colour;
    private double tankVolume;
    private double power;

    private Scanner sc = new Scanner(System.in);

    public Car(String producer, String colour, double tankVolume, double power) {
        this.brand = producer;
        this.colour = colour;
        this.tankVolume = tankVolume;
        this.power = power;
    }

    /*public Car(String brand, String colour, double tankVolume) { КОНСТРУКТОРИ З РІЗНИМ ЧИСЛОМ ПАРАМЕТРІВ
        this.brand = brand;
        this.colour = colour;
        this.tankVolume = tankVolume;
    }

    public Car(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    public Car(String brand) {
        this.brand = brand;
    }*/

    public Car(){}
    
    public Car(Car car){
        brand = car.getBrand();
        colour = car.getColour();
        tankVolume = car.getTankVolume();
        power = car.getPower();
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBrand(Car car){
        do {
            System.out.print("Уведіть назву марки: ");
            String brand = sc.nextLine();
            if (!brand.equals(car.getBrand()) ){
                car.setBrand(brand);
                break;
            }
            else {
                System.out.println("Назва марки не повинна співпадати з існуючою назвую.");
            }
        }while (brand.equals(car.getBrand()));

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    protected void finalize(){ //деструктор
        System.out.println("object is garbage collected ");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", tankVolume=" + tankVolume +
                ", power=" + power +
                '}';
    }
}
