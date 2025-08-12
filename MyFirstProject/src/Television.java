public class Television {

    String make;
    String screenType;
    int year;
    int size;

    Television(String make, String screenType, int year, int size) {
        this.make = make;
        this.screenType = screenType;
        this.year = year;
        this.size = size;
    }

    @Override
    public String toString() {
        return this.make + " " + this.screenType + " " + this.year + " " + this.size;
    }
}
