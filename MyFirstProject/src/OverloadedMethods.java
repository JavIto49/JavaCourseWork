public class OverloadedMethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name, but different parameters
        // signature = name + parameters

        System.out.println(add(45,45));
        System.out.println(add(45,45,100));

        String pizza1 = bakePizza("garlic bread");
        System.out.println(pizza1);
        String pizza2 = bakePizza("garlic bread","pimento");
        System.out.println(pizza2);
        String pizza3 = bakePizza("garlic bread","pimento","sausage");
        System.out.println(pizza3);

    }

    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }

    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " " + cheese + " pizza";
    }
    static String bakePizza(String bread, String cheese,String topping){
        return bread + " " + cheese + " " + topping + " pizza";
    }
}