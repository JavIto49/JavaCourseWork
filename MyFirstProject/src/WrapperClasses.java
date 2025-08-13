public class WrapperClasses {
    public static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean) to be used as objects. "Wrap them in an object"
        // Generally, don't wrap primitives unless you need an object.
        // Allows use of Collection Framework and static Utility Methods.

        // These are all objects with primitives as arguments being passed into them using a wrapper class
        // This technique is called Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Similar to how String objects are created: String name = "Jared";

        // Unboxing: Convert a wrapper class back to its primitive, by unwrapping it
        int x = a;
        double y = b;

        // Wrapper classes have useful utility methods that are static
        // In this case were are converting primitive data types into Strings through their wrapper class
        String alpha = Integer.toString(101);
        String bravo = Double.toString(4.20);
        String charlie = Character.toString('@');
        String delta = Boolean.toString(false);

        String z = alpha + " " + bravo + " " + charlie + " " + delta;

        System.out.println(z);

        // Now to convert a string into a primitive data type the following can be done with wrapper classes
        int e = Integer.parseInt("505");
        double f = Double.parseDouble("1.99");
        char g = "Burrito".charAt(0); // Character doesn't have a parse method, so it's unrelated to wrapper classes, instead this approach can be done
        boolean h = Boolean.parseBoolean("true");

        // String w = e + f + g + h; this cannot be done as you are trying to concatenate different data types into a string

        // Other useful utility methods within wrapper classes
        char letter = 'b';
        System.out.println(Character.isLetter(letter)); // Using the Character wrapper class, you can see if a letter is actually a letter returning a boolean.
        System.out.println(Character.isUpperCase(letter)); // Check to see if a letter is upper case, returning a boolean

        // These Character wrapper class methods are good for verifying user input, like a username or password
    }
}
