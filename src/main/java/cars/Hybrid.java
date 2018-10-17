package cars;

import cars.components.Engine;
import cars.components.Tyres;

public class Hybrid extends Car implements IPower {
    private String battery;
    private int chargeLevel;
    private String fuelType;
    private int fuelLevel;

    public Hybrid(double price, String colour, Engine engine, Tyres tyres, String battery, String fuelType) {
        super(price, colour, engine, tyres);
        this.battery = battery;
        this.fuelType = fuelType;
        this.chargeLevel = 100;
        this.fuelLevel = 100;
    }

    public String getBattery() {
        return battery;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public void depleted(int distance) {
        this.fuelLevel -= distance/2;
        this.chargeLevel -= distance/2;
    }

    @Override
    public String fill() {
        this.fuelLevel = 100;
        this.chargeLevel = 100;
        return "Refuelled and recharged";
    }
}