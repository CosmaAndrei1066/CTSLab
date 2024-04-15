public class Laptop implements Box{
    private String name;
    private double price;

    Laptop (String name, double price){
        this.name=name;
        this.price=price;
        }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
