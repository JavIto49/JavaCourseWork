public class Bee extends Insect{

    // You override a method to adjust it towards the objects specific need in which the parent class may not be suitable
    @Override
    void move(){
        System.out.println("This insect is hovering");
    }
}
