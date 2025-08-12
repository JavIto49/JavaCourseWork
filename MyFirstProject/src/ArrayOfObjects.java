public class ArrayOfObjects {
    public static void main(String[] args) {

        CarTwo car1 = new CarTwo("Mustang", "Red");
        CarTwo car2 = new CarTwo("Corvette", "White");
        CarTwo car3 = new CarTwo("Bugatti", "Silver");

        CarTwo[] carsArray1 = {car1, car2, car3};

        for (CarTwo car : carsArray1) {
            car.drive();
        }

        System.out.println();

        // When creating an array of objects you can also pass in anonymous objects (before instantiating the objects first)
        CarTwo[] carsArray2 = {new CarTwo("Ford", "Black"), new CarTwo("Mazda", "Blue")};
        for (CarTwo car : carsArray2) {
            car.drive();
        }

        System.out.println();

        // Using an enhanced for loop you can also change an attribute of each object
        for (CarTwo car : carsArray2) {
            car.color = "Rainbow";
        }
        for (CarTwo car : carsArray2) {
            car.drive();
        }
    }
}
