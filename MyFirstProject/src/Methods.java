import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called ()
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your new age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //Consumes the next line "return key"

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        happyBirthdayMethod(age,name);

        scanner.close();
        System.out.println();

        System.out.println(square(3));
        System.out.println(cube(2));
        System.out.println(getFullName("Joseph","Villalobos"));

        int ageCheckTest = 11;
        if(ageCheck(ageCheckTest)){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a minor");
        }
    }

    static void happyBirthdayMethod(int age, String name){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Happy Birthday to " + name + "!\n");
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}