public abstract class Vehicle implements Comparable<Vehicle> {
    private String color;
    private boolean functional;

    public Vehicle(String color, boolean functional) {
        this.color = color;
        this.functional = functional;
    }

    public Vehicle() {
        this.color = "";
        this.functional = false;
    }

    @Override
    public int compareTo(Vehicle vehicle){
        int i = this.color.equals(vehicle.color) ? 1 : 0;
        return i;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }

    public String getColor() {
        return color;
    }

    public boolean isFunctional() {
        return functional;
    }

    abstract void display();
}


class Bus extends Vehicle{
    int noPassengers;
    int ticketPrice;

    public Bus(String color, boolean functional, int noPassengers, int ticketPrice) {
        super(color, functional);
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    public Bus(int noPassengers, int ticketPrice) {
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    @Override
    void display() {

    }
}


class Taxi extends Vehicle{
    int noPassengers;
    int ticketPrice;

    public Taxi(String color, boolean functional, int noPassengers, int ticketPrice) {
        super(color, functional);
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    public Taxi(int noPassengers, int ticketPrice) {
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    @Override
    void display() {

    }
}