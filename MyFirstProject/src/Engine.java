public class Engine {

    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("The " + type + " engine is warming up");
    }
}
