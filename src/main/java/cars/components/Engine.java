package cars.components;

public class Engine {

    private int size;
    private String model;

    public Engine(int size, String model){
        this.size = size;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }


}
