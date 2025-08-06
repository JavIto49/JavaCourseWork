public class VariableScope {

    static int a = 3; // CLASS variable

    public static void main(String[] args) {
        // variable scope = where a variable can be accessed

        int x = 1; // LOCAL variable
        System.out.println(x);

        doSomething(); // Print the variable within doSomething method

        System.out.println(a); // Print class variable outside of method
    }

    static void doSomething(){
        int x = 2; // LOCAL variable
        System.out.println(x);
    }

    // If the same variable name is used for both a LOCAL variable and a CLASS variable, the LOCAL variable
    // is prioritized so that value will be used instead within the method
    // CLASS variable are useful for constants and OOP
    // LOCAL is why you have to pass variables into methods because they can be out of scope of the method receiving it
}