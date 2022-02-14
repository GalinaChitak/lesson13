package com.galinachitak.vehicles;

import com.galinachitak.professions.Driver;

public class SportCar extends Car{
    private int speed;

    public SportCar(int speed) {
        super();
        this.speed = speed;
    }

    public SportCar(String brand, String carClass, int weight, int speed) {
        super(brand, carClass, weight);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}'+ super.toString();
    }

}
