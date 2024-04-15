public class Order {
    public CompositeBox box;

    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }

    public void addProducts(Box box){
        this.box.addProduct(box);
    }

    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
