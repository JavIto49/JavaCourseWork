public class OverloadedConstructors {
    public static void main(String[] args) {
        // Overloaded constructors = Allow a class to have multiple constructors with different parameter lists.
        // Enable objects to be initialized in various ways.

        User user1 = new User("da_emissary");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();

        User user2 = new User("merk_the_game","sunnyUp740@gmail.com");
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();

        User user3 = new User("drew476","andrewWaltz@gmail.com",27);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println();

        User user4 = new User();
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
