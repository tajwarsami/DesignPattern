package decorator_example;

public class BasePC implements ComputerComponent {

    private String hdd;
    private String ram;
    private double baseCost;

    public BasePC(String hdd, String ram, double baseCost){
        this.hdd = hdd;
        this.ram = ram;
        this.baseCost = baseCost;
    }

    @Override
    public String getDescription() {
        return "HDD: " + hdd + " RAM: " + ram;
    }

    @Override
    public double getCost() {
        return baseCost;
    }
}
