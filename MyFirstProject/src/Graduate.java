public class Graduate extends Person{

    double gpa;

    // The parent constructor must be passed its requirements to create the object.
    // By using "super" you pass the arguments to the parent constructor 'Person' class
    // instead of within this constructor for the 'Graduate' class
    Graduate(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}
