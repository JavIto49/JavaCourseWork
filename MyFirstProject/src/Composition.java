public class Composition {
    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects.
        // For example, an Engine is "part of" a car.
        // Allows complex objects to be constructed from smaller objects

        CarThree car = new CarThree("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);

        // To access the engineType you need to access the engine object to get its type
        System.out.println(car.engine.type);

        car.start();

        // If the Car object is deleted then the engine object within it is also destroyed
    }
}
