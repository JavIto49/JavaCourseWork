public class BreakContinue {
    public static void main(String[] args) {
        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 1; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for(int j = 1; j <= 10; j++){
            if(j == 5){
                continue;
            }
            System.out.print(j + " ");
        }
    }
}
