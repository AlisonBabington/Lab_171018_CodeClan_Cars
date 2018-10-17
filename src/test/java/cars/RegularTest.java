package cars;

import cars.components.Engine;
import cars.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularTest {
    Regular regularcar;
    Tyres tyres;
    Engine engine;

    @Before
    public void before(){
        tyres = new Tyres("Michelin");
        engine = new Engine(2, "TFSI");
        regularcar = new Regular(15000.00, "Purple", engine, tyres, "Petrol");
    }

    @Test
    public void hasPrice(){
        assertEquals(15000.00, regularcar.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Purple", regularcar.getColour());
    }

    @Test
    public void hasEngineSize(){
        assertEquals(2, regularcar.getEngine().getSize());
    }

    @Test
    public void hasTyres(){
        assertEquals("Michelin", regularcar.getTyres().getBrand());
    }

    @Test
    public void canTravel(){
        regularcar.depleted(10);
        assertEquals(90, regularcar.getFuelLevel());
    }

    @Test
    public void canRefuel(){
        regularcar.depleted(10);
        assertEquals(90, regularcar.getFuelLevel());
        assertEquals("Refuelled", regularcar.fill());
        assertEquals(100, regularcar.getFuelLevel());
    }
}
