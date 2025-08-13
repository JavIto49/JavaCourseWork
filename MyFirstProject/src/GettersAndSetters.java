public class GettersAndSetters {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Sneaker sneaker = new Sneaker("Nike","Black",109.99);

        System.out.println(sneaker.getBrand() + " " + sneaker.getColor() + " " + sneaker.getPrice());

        System.out.println();

        sneaker.setBrand("Puma");
        sneaker.setColor("Blue");
        System.out.println(sneaker.getBrand() + " " + sneaker.getColor() + " " + sneaker.getPrice());

        System.out.println();

        sneaker.setBrand("");
    }
}
