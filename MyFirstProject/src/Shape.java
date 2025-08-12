public abstract class Shape {

    // This abstract method must be implemented by its children
    abstract double area();

    // Abstract classes can also contain concrete methods which are inherited by its children
    void display(){
        System.out.println("This is a shape");
    }
}
