public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2000;
    double price = 50000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You started the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You shut off the engine");
    }

    void drive(){
        System.out.println("You are driving the " + model);
    }

    void brake(){
        System.out.println("You are braking the " + model);
    }

}
