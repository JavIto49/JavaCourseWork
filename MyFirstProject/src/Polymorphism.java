public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism = "POLY" = "MANY"
        // "MORPH" = "SHAPE"
        // Objects can identify as other objects.
        // Objects can be treated as objects of a common superclass.

        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();
        Boat boat = new Boat();

        motorcycle.go();
        bus.go();
        boat.go();

        System.out.println();

        // Array of different types of objects
        Vehicle[] vehicles = {motorcycle,bus,boat};

        // Loop through an array and call each different type of objects corresponding method
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

        // Polymorphism can also be achieved through interfaces not just abstract classes
    }
}