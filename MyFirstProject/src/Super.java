public class Super {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        // Used in constructors and method overriding
        // Calls the parent constructor to initialize attributes

        Person person = new Person("Bruce","Wayne");
        person.showName();

        Graduate graduate = new Graduate("Albert","Einstein",4.0);
        graduate.showName();
        graduate.showGPA();

        Employee employee = new Employee("Mark","Cuban",1000000000);
        employee.showSalary();
    }
}
