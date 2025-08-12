public class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // Object = An entity that holds data (attributes)
        // and can perform actions (methods)
        // It is a reference data type

        Car car1 = new Car();

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println();

        car1.start();
        System.out.println(car1.isRunning);
        car1.drive();

        System.out.println();

        car1.brake();
        car1.stop();
        System.out.println(car1.isRunning);



    }
}
