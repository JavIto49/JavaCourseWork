public class Sneaker {

    // Since these attributes are private, they can no longer be easily read or written over outside the Sneaker class
    // If these we public then outside the class the object's values could easily be modified to something different
    private String brand;
    private String color;
    private final double price; // Making this a final attribute prevents it from be writeable, providing more security

    Sneaker(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    String getBrand() {
        return brand;
    }
    String getColor() {
        return color;
    }
    // Additional logic can be added to GETTER methods
    String getPrice() {
        return "$" + price;
    }

    // We're going to allow the brand and color to be writeable but not the price
    void setBrand(String brand) {
        if(brand.isEmpty()){
            System.out.println("A brand must be selected");
        }
        else{
            this.brand = brand;
        }
    }
    void setColor(String color) {
        this.color = color;
    }
}
