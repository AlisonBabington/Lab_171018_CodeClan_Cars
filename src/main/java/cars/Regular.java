package cars;

import cars.components.Engine;
import cars.components.Tyres;

public class Regular extends Car implements IPower {
    private String fuelType;
    private int fuelLevel;

    public Regular(double price, String colour, Engine engine, Tyres tyres, String fuelType) {
        super(price, colour, engine, tyres);
        this.fuelType = fuelType;
        this.fuelLevel = 100;
    }


    @Override
    public void depleted(int distance) {
        this.fuelLevel -= distance;
    }

    @Override
    public String fill() {
        this.fuelLevel = 100;
        return "Refuelled";
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}
