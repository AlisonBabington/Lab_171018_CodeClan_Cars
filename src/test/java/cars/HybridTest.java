package cars;

import cars.components.Engine;
import cars.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {
    Hybrid hybridcar;
    Tyres tyres;
    Engine engine;

    @Before
    public void before(){
        tyres = new Tyres("Michelin");
        engine = new Engine(2, "TFSI");
        hybridcar = new Hybrid(22000.00, "Yellow", engine, tyres, "E-Tron", "Petrol");
    }

    @Test
    public void hasPrice(){
        assertEquals(22000.00, hybridcar.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Yellow", hybridcar.getColour());
    }

    @Test
    public void hasEngineSize(){
        assertEquals(2, hybridcar.getEngine().getSize());
    }

    @Test
    public void hasTyres(){
        assertEquals("Michelin", hybridcar.getTyres().getBrand());
    }

    @Test
    public void hasBattery(){
        assertEquals("E-Tron", hybridcar.getBattery());
    }

    @Test
    public void canTravel(){
        hybridcar.depleted(10);
        assertEquals(95, hybridcar.getFuelLevel());
        assertEquals(95, hybridcar.getChargeLevel());
    }

    @Test
    public void canRefuel(){
        hybridcar.depleted(10);
        assertEquals(95, hybridcar.getFuelLevel());
        assertEquals(95, hybridcar.getChargeLevel());
        assertEquals("Refuelled and recharged", hybridcar.fill());
        assertEquals(100, hybridcar.getFuelLevel());
        assertEquals(100, hybridcar.getChargeLevel());
    }
}