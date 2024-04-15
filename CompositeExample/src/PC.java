public class PC implements Box{
    private String name;
    private double price;

    PC (String name, double price){
        this.name=name;
        this.price=price;
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }
}
