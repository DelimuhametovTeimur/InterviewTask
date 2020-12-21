import java.util.Map;

public class Person {

    private String fullName;
    private Map<String, Integer> products;

    public Person(String fullName, Map<String, Integer> products) {
        this.fullName = fullName;
        this.products = products;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}
