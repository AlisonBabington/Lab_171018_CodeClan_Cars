package cars;

import cars.components.Engine;
import cars.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {
    Electric electriccar;
    Tyres tyres;
    Engine engine;

    @Before
    public void before(){
        tyres = new Tyres("Michelin");
        engine = new Engine(2, "TFSI");
        electriccar = new Electric(20000.00, "Red", engine, tyres, "E-Tron");
    }

    @Test
    public void hasPrice(){
        assertEquals(20000.00, electriccar.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Red", electriccar.getColour());
    }

    @Test
    public void hasEngineSize(){
        assertEquals(2, electriccar.getEngine().getSize());
    }

    @Test
    public void hasTyres(){
        assertEquals("Michelin", electriccar.getTyres().getBrand());
    }

    @Test
    public void hasBattery(){
        assertEquals("E-Tron", electriccar.getBattery());
    }

    @Test
    public void canTravel(){
        electriccar.depleted(10);
        assertEquals(90, electriccar.getChargeLevel());
    }

    @Test
    public void canRecharge(){
        electriccar.depleted(10);
        assertEquals(90, electriccar.getChargeLevel());
        assertEquals("Recharged", electriccar.fill());
        assertEquals(100, electriccar.getChargeLevel());
    }
}
