public class TwoDArrays {
    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        // Useful for storing a matrix of data

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"carrot","celery","lettuce"},
                                {"chicken","pork","beef"}};

        for(String[] foods: groceries) {
            for(String food: foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Changing an element in a 2D array [row][column]
        groceries[0][1] = "pineapple";
        groceries[1][2] = "onion";
        for(String[] foods: groceries) {
            for(String food: foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println();

        char[][] telephone = {  {'1','2','3'},
                                {'4','5','6'},
                                {'7','8','9'},
                                {'*','0','#'}};

        for(char[] row : telephone) {
            for(char number: row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}