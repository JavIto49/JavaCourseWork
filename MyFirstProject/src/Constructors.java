public class Constructors {
    public static void main(String[] args) {
     // constructor = A special method to initialize objects
     // You can pass arguments to a constructor and set up initial values

        Student student1 = new Student("Spongebob", 30, 3.5);
        Student student2 = new Student("Patrick", 30, 1.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();
        student1.study();
    }
}