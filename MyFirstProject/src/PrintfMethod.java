public class PrintfMethod {
    public static void main(String[] args) {
        // printf METHOD
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your height is %.1f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old\n", name, age);

        // printf precision
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        System.out.printf("%.1f\n", price1); // Displays 1 digit after the decimal
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);
        System.out.println();

        // printf flags
        double p1 = 9000.99;
        double p2 = 100000.15;
        double p3 = -54000.01;
        double p4 = -4000.50;
        System.out.printf("%+.1f\n", p1); // Displays a + before the number
        System.out.printf("%,.2f\n", p2); // Adds a comma separating thousandth place
        System.out.printf("%(.3f\n", p3); // Adding a parenthesis encloses any negative number
        System.out.printf("% .1f\n", p4); // A space displays a minus if negative, space if positive. Helps to align negative and positive numbers.

        // [width]
        // 0 = zero padding
        // number = right justified
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n",id1); // 0001 numbers are now zero padded by 4 digits and they align vertically
        System.out.printf("%04d\n",id2); // 0023
        System.out.printf("%04d\n",id3); // 0456
        System.out.printf("%04d\n",id4); // 7890
        System.out.println();

        System.out.printf("%4d\n",id1); // Rather than zero padding, spaces are used to right justify the number up to 4 digits
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);
        System.out.println();

        System.out.printf("%-4d\n",id1); // Spaces are used to left justify the number up to 4 digits by using a negative number
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);
        System.out.println();
    }
}
