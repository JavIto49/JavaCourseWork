public class TernaryOperator {
    public static void main(String[] args) {
        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        // Basic approach if/else
        if(score >= 60){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

        // Ternary approach
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        // Ternary example 2
        int number = 4;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        // Ternary example 3
        int hours = 12;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

        // Ternary example 4
        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
