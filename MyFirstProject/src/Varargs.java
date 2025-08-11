public class Varargs {
    public static void main(String[] args) {

        // varargs = allow a method to accept a varying # of arguments
        // makes methods more flexible, no need for overloaded methods
        // java will pack the arguments into an array
        // ... (ellipsis)

        System.out.print(add(5,10,15,20,25,30));
        System.out.println();
        System.out.print(average(1,2,3,4,5,6,7,8,9,10));


    }
    static int add(int...numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum/numbers.length;
    }
}
