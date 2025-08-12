public class Static {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class rather than to any specific object
        // Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Clark");
        Friend friend2 = new Friend("Diana");
        Friend friend3 = new Friend("Barry");
        Friend friend4 = new Friend("Hal");
        Friend friend5 = new Friend("J'onn");

        // When accessing a static variable or static method it's best to do it through the class itself
        System.out.println(Friend.numOfFriends);

        // Calling static method from Friend class
        Friend.showFriends();

        // Static members are also seen/used within the Math class, there is no need to create a Math object
        System.out.println(Math.round(281.79));
    }
}
