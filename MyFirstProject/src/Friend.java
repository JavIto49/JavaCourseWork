public class Friend {

    static int numOfFriends; // Rather than all friend objects having their own copy of numOfFriend, they're all going to share one
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        System.out.println("You have " + numOfFriends + " friends");
    }
}
