package cars;

import cars.components.Engine;
import cars.components.Tyres;

public abstract class Car {


    private double price;
    private String colour;
    private Engine engine;
    private Tyres tyres;

    public Car(double price, String colour, Engine engine, Tyres tyres){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyres = tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }


}
