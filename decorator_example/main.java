package decorator_example;

public class Main {
    public static void main (String[] args) {
        // Creating a base computer
        ComputerComponent basePC = new BasePC("550 GB", "4 GB", 1000);

        // Adding optional components using decorators
        ComputerComponent pcWithGraphicsCard = new GraphicsCard(basePC, 100);
        ComputerComponent pcWithBluetooth = new Bluetooth(pcWithGraphicsCard, 50);

        // Output description and cost
        System.out.println("Computer Description: " + pcWithBluetooth.getDescription());
        System.out.println("Computer Cost: $" + pcWithBluetooth.getCost());
    }
}
