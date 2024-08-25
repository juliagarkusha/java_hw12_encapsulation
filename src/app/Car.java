package app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car has started successfully.");
    }

    private void startElectricity() {
        System.out.println("Electricity system is starting...");
    }

    private void startCommand() {
        System.out.println("Command system is starting...");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system is starting...");
    }
}
