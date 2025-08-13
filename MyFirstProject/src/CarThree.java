public class CarThree {

    String model;
    int year;
    Engine engine;

    // When constructing are Car object we will also be constructing a new Engine object
    CarThree(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The " + this.model + " has been started");
    }
}
