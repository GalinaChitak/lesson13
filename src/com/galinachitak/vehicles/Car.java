package com.galinachitak.vehicles;

import com.galinachitak.details.Engine;
import com.galinachitak.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private int weight;
    private String driver;
    private Engine engine;


    public Car(String brand, String carClass, int weight) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
    }

    public Car() {
    }

    public String getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setDriver(Driver driver) {
        this.driver = String.valueOf(driver);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println(" Старт");
    }

    public void stop() {
        System.out.println(" Стоп");
    }

    public void turnRight() {
        System.out.println(" Поворот направо");
    }

    public void turnLeft() {
        System.out.println(" Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

}
