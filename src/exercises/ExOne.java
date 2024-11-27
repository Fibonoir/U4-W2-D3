package exercises;

import classes.Product;

import java.util.List;
import java.util.stream.Collectors;

public class ExOne {
    public static List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(product -> "Books".equalsIgnoreCase(product.getCategory()))
                .filter(product -> product.getPrice() > 100)
                .collect(Collectors.toList());
    }
}
