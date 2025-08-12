public class MethodOverriding {
    public static void main(String[] args) {

        // Method overriding = When a subclass provides its own implementation of a method that is already defined.
        // Allows for code reusability and specific implementations.

        Ant ant = new Ant();
        Bee bee = new Bee();
        Fly fly = new Fly();

        ant.move();
        bee.move();
        fly.move();
    }
}
