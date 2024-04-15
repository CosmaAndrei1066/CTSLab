import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{

    private final List<Box> products = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        products.addAll(Arrays.asList(boxes));
    }

    public void addProduct(Box box){
        this.products.add(box);
    }

    @Override
    public double calculatePrice() {
        return products.stream().mapToDouble(Box::calculatePrice).sum();
    }

}
