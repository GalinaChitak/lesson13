package com.galinachitak.vehicles;

public class Lorry extends Car{
    public int carrying;

    public Lorry(String brand, String carClass, int weight, int carrying) {
        super(brand, carClass, weight);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}'+super.toString();
    }

}
