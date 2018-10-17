package cars;

import cars.components.Engine;
import cars.components.Tyres;

public class Electric extends Car implements IPower {
    private String battery;
    private int chargeLevel;

    public Electric(double price, String colour, Engine engine, Tyres tyres, String battery) {
        super(price, colour, engine, tyres);
        this.battery = battery;
        this.chargeLevel = 100;
    }

    public String getBattery() {
        return battery;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    @Override
    public void depleted(int distance) {
        this.chargeLevel -= distance;
    }

    @Override
    public String fill() {
        this.chargeLevel = 100;
        return "Recharged";
    }
}
