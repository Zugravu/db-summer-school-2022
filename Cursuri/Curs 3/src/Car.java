public class Car extends Vehicle implements Drivable, Comparable<Car>{

    private int power;
    private String brand;

    @Override
    public void start() {
        System.out.println("engine started");
    }

    @Override
    public int noOfDoors() {
        return 4;
    }

    @Override
    public void drive() {

    }

    @Override
    public int compareTo(Car o) {
        return this.power - o.power;
    }
}
