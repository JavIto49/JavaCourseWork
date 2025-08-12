public class ToStringMethod {
    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        // Used to return a string representation of an object.
        // By default, it returns a hash code as a unique identifier.
        // It can be overridden to provide meaningful details.

        Television television = new Television("Samsung","LED",2020,55);

        // Outputs a hashcode which is a unique identifier for the object
        // The objects memory address is calculated and converted to hashcode
        System.out.println(television);
        System.out.println();

        // Normally when printing objects' details, you'd do so like this:
        System.out.println(television.make + " " + television.screenType);
        System.out.println();

        // With method overriding, you display the details needed exactly how you want them,
        // so now with the overridden toString method printing out the object's details actually works
        System.out.println(television);
        System.out.println();

        Television television2 = new Television("Sony","OLED",2025,75);
        System.out.println(television2);

    }
}