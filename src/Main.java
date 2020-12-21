import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String [] args) {

        List<Person> persons = new ArrayList<>();

        Map<String, Integer> map1 = new LinkedHashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();
        Map<String, Integer> map3 = new LinkedHashMap<>();
        map1.put("Mouse", 10);
        map1.put("KeyBoard", 5);
        map1.put("Monitor", 2);

        map2.put("Mouse", 20);
        map2.put("KeyBoard", 5);

        map3.put("Mouse", 5);
        map3.put("KeyBoard", 10);
        map3.put("Monitor", 4);

        Person person1 = new Person("Ana", map1);
        Person person2 = new Person("Alex", map2);
        Person person3 = new Person("John", map3);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        for(Map.Entry<String, Integer> result : countEachProductByName(persons).entrySet()) {
            System.out.println("Product name: " + result.getKey() + " - " + result.getValue() + " units.");
        }
    }

    public static Map<String, Integer> countEachProductByName(List<Person> persons) {

        Map<String, Integer> countedProducts = new LinkedHashMap<>();

        for(Person person : persons) {
            for(Map.Entry<String, Integer> product : person.getProducts().entrySet()) {
                if(countedProducts.containsKey(product.getKey())) {
                    countedProducts.put(product.getKey(), countedProducts.get(product.getKey()) + product.getValue());
                } else {
                    countedProducts.put(product.getKey(), product.getValue());
                }
            }
        }
        return countedProducts;
    }
}
