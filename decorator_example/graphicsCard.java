package decorator_example;

class GraphicsCard implements ComputerComponent {
    private ComputerComponent pc;
    private double extraCost;

    public GraphicsCard(ComputerComponent pc, double extraCost) {
        this.pc = pc;
        this.extraCost = extraCost;
    }

    @Override
    public String getDescription() {
        return pc.getDescription() + ", Graphics Card";
    }

    @Override
    public double getCost() {
        return pc.getCost() + extraCost;
    }
}

public interface ComputerComponent {
    String getDescription();
    double getCost();
}
