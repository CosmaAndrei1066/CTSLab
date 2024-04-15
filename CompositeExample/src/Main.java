//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setupOrder(
                new CompositeBox(
                        new PC("PC1", 5000)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Laptop("Laptop1", 3000),
                                new Laptop("Laptop2", 4000)
                        ),
                        new PC("PC2", 4000),
                        new PC("PC3", 5000)
                )
        );

        System.out.println(order.calculateOrderPrice());
        Box newLaptop = new Laptop("Laptop3",3500);

        order.addProducts(newLaptop);
        System.out.println(order.calculateOrderPrice());
    }
}