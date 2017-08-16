package com.br.udemy.javamasterclass;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return this.name;
    }

    public boolean getEngine() {
        return this.engine;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public int getWheels(){
        return this.wheels;
    }

    public void startEngine() {
        System.out.println("Car -> Starting engines...");
    }

    public void accelarate() {
        System.out.println("Car -> Accelerating car...");
    }

    public void brake() {
        System.out.println("Car -> Pressing brakes...");
    }

}

class Uno extends Car {
    public Uno() {
        super(8, "Uno");
    }

    @Override
    public void accelarate() {
        System.out.println(getClass().getSimpleName() + " -> Accelerating car");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " -> Pressing brakes...");
    }
}

class Celta extends Car {
    public Celta() {
        super(6, "Celta");
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> Starting engines...");
    }
}

public class Main {

    public static void main(String[] args) {

        Uno uno = new Uno();
        uno.startEngine();
        uno.accelarate();
        uno.brake();
        Car genericCar = new Car(10, "Generic Car");
        genericCar.startEngine();
        genericCar.accelarate();
        genericCar.brake();
        Celta celta = new Celta();
        celta.startEngine();
        celta.accelarate();
        celta.brake();
    }
}
